public class Driver {

    public static void main ( String[] args ) {
	
	BST tree = new BST();

	tree.insert(8);
	tree.insert(3);
	tree.insert(12);
	tree.insert(9);
	tree.insert(15);

	tree.print(tree.getRoot());
    }

}