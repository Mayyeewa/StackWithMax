import java.util.*;
import java.io.*;

public class StackWithMax {
	int stack[] = new int[5];
	int top = 0;
	
	
	public void push(int data) {
		stack[top] = data;
		top++;
	}
	public void show() {
		for (int i : stack) {
			System.out.println();
		}
		
	}
	public void pop() {
		int data;
	
	}
	
    	    
    class FastScanner {
        StringTokenizer tok = new StringTokenizer("");
        BufferedReader in;

        FastScanner() {
            in = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (!tok.hasMoreElements())
                tok = new StringTokenizer(in.readLine());
            return tok.nextToken();
        }
        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }
    

    public void solve() throws IOException {
        FastScanner scanner = new FastScanner();
        int queries = scanner.nextInt();
        Stack<Integer> stack = new Stack<Integer>();

    
    	  
        
        
        for (int qi = 0; qi < queries; ++qi) {
            String operation = scanner.next();
            if ("push".equals(operation)) {
                int value = scanner.nextInt();
                stack.push(value);
            } else if ("pop".equals(operation)) {
                stack.pop();
            } else if ("max".equals(operation)) {
                System.out.println(Collections.max(stack));
            }
        }
    }

 
	
		
	private boolean isEmpty() {
			return false;
		}

	static public void main(String[] args) throws IOException {
		StackWithMax s = new StackWithMax(); 
	    s.push(20); 
	    s.push(10); 
	    s.push(40); 
	    s.push(50); 
	    
	    s.show();
		
    }
	
	
	
}
