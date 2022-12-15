import java.util.LinkedList;
public class TestLinkedList {
	public static void linkedListMethod() {
		LinkedList ll = new LinkedList();
			ll.add(10);
			ll.add("abc");
			ll.add('a');
			ll.add(10.5);
			ll.add(100000000l);
			ll.add(5.4f);
			ll.add(null);
			ll.add(10);
			System.out.println("Size of Linked List"+ll.size());
			System.out.println("Linked List : "+ll);
			System.out.println("Get First Element : "+ll.getFirst());
			ll.add(101);
			System.out.println("Get Last Element : "+ll.getLast());
			System.out.println("Remove First Element : "+ll.removeFirst());
			System.out.println("Remove Last Element : "+ll.removeLast());
			System.out.println("Linked List : "+ll);
			ll.addFirst("Hello");
			ll.addLast(111);
			System.out.println("Linked List : "+ll);
			System.out.println("Retrieves First Element : "+ll.peek());
			System.out.println("Retrieves First Element : "+ll.element());
			System.out.println("Retrieves and remove First Element : "+ll.poll());
			System.out.println("Linked List : "+ll);
			System.out.println("Add Last Element : "+ll.offer(123));
			System.out.println("Add First Element : "+ll.offerFirst(456));
			System.out.println("Add Last Element : "+ll.offerLast(789));
			System.out.println("Linked :List : 	"+ll);
			System.out.println("Retrieves First Element : "+ll.peekFirst());
			System.out.println("Retrieves Last Element : "+ll.peekLast());
			System.out.println("Linked List : "+ll);
			System.out.println("Retrieves and Remove First Element : "+ll.pollFirst());
			System.out.println("Retrieves and Remove Last Element : "+ll.pollLast());
			System.out.println("Linked List : "+ll);
			ll.push("Hello");
			System.out.println("Linked List : "+ll);
			System.out.println("Delete Element From First : "+ll.pop());
			System.out.println("Linked List : "+ll);
			System.out.println("Remove Element : "+ll.removeFirstOccurrence(111));
			System.out.println("Remove Element : "+ll.removeLastOccurrence('a'));
			System.out.println("Linked List : "+ll);
	}
	public static void main(String[] args) {
		linkedListMethod();
	}
}