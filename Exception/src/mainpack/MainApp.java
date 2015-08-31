package mainpack;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("sapin.txt");
			out = new FileOutputStream("sapout.txt");
			int c;
			while ((c = in.read())!= -1) {
				out.write(c);
			}
		} 
		finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
		
		
		try (
			FileInputStream inp = new FileInputStream("sin.txt");
			FileOutputStream outp = new FileOutputStream("sout.txt");
			) {
			int c;
			while ((c = in.read())!= -1) {
				out.write(c);
			}
			
		}
	
		 
		/*try{
		 
			int sum=0;
			for (String arg : args) {
				sum+=Integer.parseInt(arg);
			}
			System.out.println("Sum= "+sum);
		}
		catch (NumberFormatException nfe){
			System.err.println("One of the command-line arguments is not an integer.");
		}*/
		
			
			
	}
	
}

