public class Driver {

    public static void main(String[] args) {
	MyStack pancakes = new MyStack();
	System.out.println("Empty?: " + pancakes.isEmpty());
	pancakes.push("one");
	pancakes.push("two");
	pancakes.push("three");
	System.out.println(pancakes);
	System.out.println("Empty?: " + pancakes.isEmpty());
	/*System.out.println(pancakes.pop());
	System.out.println(pancakes.pop());
	System.out.println(pancakes.pop());
	System.out.println(pancakes.pop());*/

    }

}