import java.io.*;
import java.util.*;

public class Question {

  public static void main(String[] args) {
  
    Question q1 = new Question();
    
    File text;
    Scanner s = new Scanner(text);
    
    int lineNumber = 1;
    
    while(scnr.hasNextLine()){
      String line = scnr.nextLine();
      System.out.println("line " + lineNumber + " :" + line);
      lineNumber++;
    }       
      
    
    PrintWriter out=null;
	  try {
	    out = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));
	  } 
	  catch (Exception e){};
    out.print ("HELLO");
	  out.println (" World!");
	  out.close ();

  }

}
