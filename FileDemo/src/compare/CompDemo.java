package compare;

import java.util.NavigableMap;
import java.util.TreeSet;

class Compare implements <String> {  
	  public int compare(String a, String b) {  
	    String aStr, bStr;  
	  
	    aStr = a;  
	    bStr = b;  
	  
	    // Reverse the comparison. 
	    return bStr.compareTo(aStr);  
	  }  
	  
	}  

public class CompDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Create a tree set. 
	    TreeSet<String> ts = new TreeSet<String>(new Compare());  
	      
	    // Add elements to the tree set. 
	    ts.add("C");  
	    ts.add("A");  
	    ts.add("B");  
	    ts.add("E");  
	    ts.add("F");  
	    ts.add("D");  
	  
	    // Display the elements. 
	    for(String element : ts) 
	      System.out.print(element + " ");  
	 
	    System.out.println();  

	}

}
