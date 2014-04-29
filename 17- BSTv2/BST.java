public class BST {

    private Node root;
    private Node dummy;

    public BST() {
	root = null;
	dummy.setData( Integer.MIN_VALUE );
	dummy.setRight(root);
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

    public void delete(Node e) {
	Node current = root;
	Node parent = dummy;
	while ( current.getData() != e.getData() ) {
	    parent = current;
	    if ( current.getData() > e.getData() ) 
		current = current.getLeft();
	    else 
		current = current.getRight();
	}
	if ( current.getLeft() == null && current.getRight() == null ) 
	    dLeaf( parent, current );
	else if ( current.getLeft() == null || current.getRight() == null ) 
	    dOneChild( parent, current );
	else 
	    dTwoChild( current );
    }

    public void dLeaf(Node d, Node e) {
	if ( d.getLeft().getData() == e.getData() ) 
	    d.setLeft(null);
	else
	    d.setRight(null);
    }

    public void dOneChild(Node d, Node e) {
	if ( e.getLeft() != null && e.getLeft().getData() < d.getData() ) 
	    d.setLeft( e.getLeft() );
	else if ( e.getLeft() != null && e.getLeft().getData() > d.getData() ) 
	    d.setRight( e.getLeft() );
	else if ( e.getRight() != null && e.getRight().getData() < d.getData() )
	    d.setLeft( e.getRight() );
	else
	    d.setRight( e.getRight() );
    }

    public void dTwoChild(Node e) {
	Node current = e.getLeft();
	Node cp = e;
	while ( current.getRight() != null ) {
	    cp = current;
	    current = current.getRight();
	}
	e = cp;
	delete(cp);
    }



}
