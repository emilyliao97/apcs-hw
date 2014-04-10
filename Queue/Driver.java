public class Driver {

    public static void main( String[] args ) {
	MyQueue q = new MyQueue();
	String s;
	System.out.println(q);	
	q.enqueue("first");
	System.out.println(q);
	q.enqueue("second");
	System.out.println(q);
	q.enqueue("third");
	System.out.println(q);
	s = q.dequeue();
	System.out.println(s);
	s = q.dequeue();
	System.out.println(s);
    }

}