package mainpack;

import java.util.Enumeration;
import java.util.Properties;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  char c[] = {'J', 'a', 'v', 'a'};
		    String s1 = new String(c);
		    String s2 = new String(s1); 

		    System.out.println(s1);
		    System.out.println(s2);
		    
		    Properties sysProperties = System.getProperties();
		    
		    Enumeration keys = sysProperties.keys();
		    String key;
		    
		    while (keys.hasMoreElements()) {
				key = (String) keys.nextElement();
				System.out.println(key+" : 	"+sysProperties.get(key));
			}
		    
	}

}
