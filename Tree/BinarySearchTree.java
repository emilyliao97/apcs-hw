public class BinarySearchTree {

    private Node root;

    public Node search(int x) {
	Node p = root;
	while ( p != null && p.getData() != x ) {
	    if ( p.getData() > x ) 
		p = p.getLeft();
	    else 
		p = p.getRight();
	}
	return p;
    }

    public void insert(int x) {
	Node p = root;
	Node q;
	while ( p != null && p.getData() != x ) {
	    q = p;
	    if (p.getData() > x)
		p = p.getLeft();
	    else 
		p = p.getRight();
	}
	if ( q.getData() > x ) 
	    q.setLeft( new Node(x) );
	else
	    q.setRight( new Node(x) );
    }

}