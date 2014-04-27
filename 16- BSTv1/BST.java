public class BST {

    private Node root;

    public BST() {
	root = null;
    }

    public void insert(int x) {
	Node p = root;
	Node q = root;
	Node ins = new Node(x);
	if ( p == null ) 
	    p = ins;
	else {
	    while ( p!= null && p.getData() != x ) {
		q = p;
		if ( p.getData() > x )
		    p = p.getLeft();
		else
		    p = p.getRight();
	    }
	    if ( q.getData() > x ) 
		q.setLeft( ins );
	    else 
		q.setRight( ins );
	}
    }


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

    public Node search2(Node c, int x) {
	if ( c == null || c.getData() == x ) 
	    return c;
	else if ( c.getData() > x ) 
	    return search2( c.getLeft(), x );
	else 
	    return search2( c.getRight(), x );
    }

}
