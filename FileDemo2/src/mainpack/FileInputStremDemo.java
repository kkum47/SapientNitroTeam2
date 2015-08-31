package mainpack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStremDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*int size;
		InputStream f = new FileInputStream("FileInputStreamDemo.java");
		System.out.println("total Available Bytes: "+(size=f.available()));
		int n= size/40;
		System.out.println("First "+n+" Bytes of the file one read() at a time");
		for (int i = 0; i < n; i++) {
			System.out.println(f.read());
		}
		System.out.println("Still Available: "+f.available());
		System.out.println("reading the next "+n+"withb one read read(b[])");*/
		String source = "Now is the time for all good men\n"+
		"to come to the aid of their country and pay their due taxes.";
		byte buf[] = source.getBytes(source);
		OutputStream f0 = new FileOutputStream("file1.txt");
		for (int i = 0; i < buf.length; i+=2) {
			f0.write(buf[i]);
		}
		f0.close();
		OutputStream f1 = new FileOutputStream("file2.txt");
		f1.write(buf);
		f1.close();
		
		
	}

}
