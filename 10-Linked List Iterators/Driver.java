public class Driver {

    public static void main( String[] args ) {
	MyLinkedList L = new MyLinkedList();
	L.add("one");
	L.add("two");
	L.add("three");
	System.out.println(L);
	Iterator<String> it = L.iterator();
	while (it.hasNext()) 
	    System.out.println(it.next());
    }

}
