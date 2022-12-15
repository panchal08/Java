import java.util.Stack;
public class TestStack {
	public static void stackMethod() {
		Stack s = new Stack();
			s.push(10);
			s.push(20);
			s.push(10);
			s.push('A');
			s.push('B');
			s.push('C');
			System.out.println("Stack : "+s);
			System.out.println("Retrieves top of Stack : "+s.peek());
			System.out.println("Stack is empty : "+s.empty());
			System.out.println("Search Element : "+s.search(10));
			System.out.println("Retrieves and Remove top of Stack : "+s.pop());
			System.out.println("Stack : "+s);
	}
	public static void main(String[] args) {
		stackMethod();
	}
}