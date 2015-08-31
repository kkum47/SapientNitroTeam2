package wordcount;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordCount {
	public static int words = 0,lines = 0,chars = 0;
	
	public static void wc(InputStreamReader isr) throws IOException {
		int c = 0;
		boolean lastWhite = true;
		String whitesSpace = "\t\n\r";
		
		while((c = isr.read())!= -1){
			chars++; //Count characters
			
			if(c == '\n'){
				lines++;	//Count lines
			}
			// count Words by detecting the start of words
			int index = whitesSpace.indexOf(c);
			if (index == -1) {
				if (lastWhite == true) {
					++words;
				}
				lastWhite = false;
			} else {
				lastWhite = true;
			}
		}
		if (chars != 0) {
			++lines;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr;
		try {
			if (args.length == 0) {
				//We're working with stdin
				wc(new InputStreamReader(System.in));
			} else {
				//We're working with a list of files
				for (int i = 0; i < args.length; i++) {
					fr = new FileReader(args [i]);
					wc(fr);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
