package arraylist2;

import java.util.ArrayList;
import java.util.Iterator;

public class NewStyle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // Now, list holds references of type String. 
	    ArrayList<String> list = new ArrayList<String>(); 
	 
	    list.add("one"); 
	    list.add("two"); 
	    list.add("three"); 
	    list.add("four"); 
	 
	    // Notice that Iterator is also generic. 
	    Iterator<String> itr = list.iterator(); 
	 
	    while(itr.hasNext()) { 
	      String str =(String) itr.next(); 
	 
	      System.out.println(str + " is " + str.length() + " chars long."); 
	    } 
	}

}
class OldStyle {  
	  public static void main(String args[]) { 
	    ArrayList list = new ArrayList(); 
	 
	    // These lines store strings, but any type of object 
	    // can be stored.  In old-style code, there is no  
	    // convenient way restrict the type of objects stored 
	    // in a collection 
	    list.add("one"); 
	    list.add("two"); 
	    list.add(3); 
	    list.add("four"); 
	 
	    Iterator itr = list.iterator(); 
	    while(itr.hasNext()) { 
	 
	      // To retrieve an element, an explicit type cast is needed 
	      // because the collection stores only Object. 
	      String str = itr.next(); // explicit cast needed here. 
	    }
	  }
}