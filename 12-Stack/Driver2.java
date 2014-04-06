public class Driver2 {

    public static void main(String[] args) {
	MyStack2 pancakes = new MyStack2();
	System.out.println("Empty?: " + pancakes.isEmpty());
	pancakes.push("one");
	pancakes.push("two");
	pancakes.push("three");
	System.out.println(pancakes);
	System.out.println("Empty?: " + pancakes.isEmpty());
	System.out.println(pancakes.peek());
	System.out.println(pancakes.pop());
	System.out.println(pancakes.pop());
	System.out.println(pancakes.pop());
	//System.out.println(pancakes.pop());

    }

}
