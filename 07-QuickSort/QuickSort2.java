// my partition algorithm works perfectly -- why isn't the sorting working and always returning that it's out of bounds? I'm so frustrated!

public class QuickSort2 {

    public int partition( int[] a, int L, int R ) {
	int wall = 0; 
	int p = (int) ( Math.random() * R );
	//System.out.println("Partition at: " + p);
	int temp1 = a[R];
	a[R] = a[p]; 
	a[p] = temp1;
	for ( int i = 0; i < R; i++ ) {
	    if ( a[i] < a[R] ) {
		int temp2 = a[wall];
		a[wall] = a[i];
		a[i] = temp2;
		wall++;
	    }
	}
	int temp3 = a[R];
	a[R] = a[wall];
	a[wall] = temp3;
	//System.out.println(printArray(a));
	return wall;
    }

    public int[] qSort( int[] A, int lo, int hi ) {
	if (A.length <= 1) {
	    return A;
	}
	else {
	    partition(A, lo, hi);
	    int k = partition(A, lo, hi);
	    while ( k-1 > 0 && k+1 < A.length ) {
		qSort(A, lo, k - 1);
		qSort(A, k + 1, hi);
	    }
	    return A;
	}
    }

    public String printArray(int[] z) {
	String retStr = "[  ";
	for ( int i = 0; i < z.length; i++ )
	    retStr += z[i] + "  ";
	retStr += "]";
	return retStr;
    }

    public static void main (String[] args) {
	QuickSort2 qs = new QuickSort2();
	int[] newb = new int[11];
	for (int i = 0; i < newb.length; i++) {
	    newb[i] = (int) ( Math.random() * 20 );
	}
	System.out.println(qs.printArray(newb));
	System.out.println(qs.partition(newb, 0, newb.length - 1));
	System.out.println(qs.printArray(qs.qSort(newb, 0, newb.length - 1)));
    }

}
