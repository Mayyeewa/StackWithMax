import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;


class Bracket {
    Bracket(char type, int position) {
        this.type = type;
        this.position = position;
    }

    boolean Match(char c) {
        if (this.type == '[' && c == ']')
            return true;
        if (this.type == '{' && c == '}')
            return true;
        if (this.type == '(' && c == ')')
            return true;
        return false;
    }

    char type;
    int position;
}

class check_brackets {
    public static void main(String[] args) throws IOException {
        InputStreamReader input_stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input_stream);
        String text = reader.readLine();
        Stack<Character> opening_brackets_stack = new Stack<Character>();
   
        for (int position = 0; position < text.length(); ++position) {
            char next = text.charAt(position);
 
        if (next == '(' || next == '[' || next == '{') {
        	opening_brackets_stack.push(next);
		}

		if (next == ')' || next == ']' || next == '}') {
		
			//Checks to see if an element is on top of stack and returns the element
			char type = opening_brackets_stack.peek();
		
			//Create a new Bracket object to track the element bracket and position
			Bracket bracket = new Bracket(type, position);
		
			//If the element in bracket matches the element in next pop it off the stack
			if (bracket.Match(next)) {
				opening_brackets_stack.pop();

			} else {

				break;
			}

		}

	}
	System.out.println(text);
	if (opening_brackets_stack.isEmpty()) {
		System.out.println("Success");
	} else {
		int position=0;
		for(int j = 0; j < position; j++) {
			System.out.print(" ");				
		}
		//Creates a pointer to indicate the mismatched position
		System.out.print("^\n");		
		System.out.println("mismatch @ " + (position + 1));
	}

}

}
