import java.io.*;
import java.util.*;

public class RoadTest {

    long start;
    long time;

    public long tree() {
	start = System.currentTimeMillis();
	TreeMap branch = new TreeMap();
	branch.put("a", 1);
	branch.put("b", 2);
	branch.put("c", 3);

	time = System.currentTimeMillis();
	time -= start;
	return time;
    }

    public long hash() {
	start = System.currentTimeMillis();

	HashMap hashbrown = new HashMap();
	hashbrown.put("a", 1);
	hashbrown.put("b", 2);
	hashbrown.put("c", 3);

	time = System.currentTimeMillis();
	time-= start;
	return time;
    }

    public static void main (String[] args) {
	RoadTest r = new RoadTest();
	System.out.println(r.tree());
	System.out.println(r.hash());
    }

}
