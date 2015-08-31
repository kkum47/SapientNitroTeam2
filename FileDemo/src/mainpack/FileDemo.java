package mainpack;

import java.io.File;

public class FileDemo {
	static void p(String s){
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f1 = new File("D:/sapient");
		p("File Name: "+f1.getName());
		p("Path: "+f1.getPath());
		p("Abs Path: "+f1.getAbsolutePath());
		p("Parent: "+f1.getParent());
		p(f1.exists()?"exists":"does not exist");
		p(f1.canWrite()?"is writable":"is not writable");
		p(f1.canRead()?"is readable":"is not readable");
		p("is "+(f1.isDirectory()?" ":"not a directory"));
		p(f1.isFile()?"is normal file":"might be a named pipe");
		p(f1.isAbsolute()?"is absolute":"is not absolute");
		p("file last modified : "+f1.lastModified());
		p("file size : "+f1.getTotalSpace()+" Bytes");
		
		String dirname = "D:/";
		File f2 = new File(dirname);
		
		if (f2.isDirectory()) {
			System.out.println("Directory of "+dirname);
			String s[] = f2.list();
			for (int i = 0; i < s.length; i++) {
				File f = new File(dirname+"/"+s[i]);
				if (f.isDirectory()) {
					System.out.println(s[i]+" is a directory");
				} else {
					System.out.println(s[i]+" is a file");
				}
			}
		} else {
			System.out.println(dirname+" is not a directory");
		}
		
		
	}

}
