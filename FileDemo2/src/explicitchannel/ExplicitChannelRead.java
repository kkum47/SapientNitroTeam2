package explicitchannel;

public class ExplicitChannelRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fIn; 
	    ClassName fChan; 
	    long fSize; 
	    ByteBuffer mBuf; 
	 
	    try { 
	      // First, open an file for input. 
	      fIn = new FileInputStream("test.txt"); 
	 
	      // Next, obtain a channel to that file. 
	      fChan = fIn.methodName(); 
	 
	      // Now, get the file's size. 
	      fSize = fChan.methodName(); 
	 
	      // Allocate a buffer of the necessary size. 
	      mBuf = ByteBuffer.methodName((int)fSize); 
	 
	      // Read the file into the buffer. 
	      fChan.methodName(mBuf); 
	       
	      // Rewind the buffer so that it can be read. 
	      mBuf.methodName(); 
	 
	      // Read bytes from the buffer. 
	      for(int i=0; i < fSize; i++) 
	        System.out.print((char)mBuf.methodName()); 
	 
	      System.out.println(); 
	 
	      fChan.methodName(); // close channel 
	      fIn.methodName();   // close file 
	    } catch (IOException exc) { 
	      System.out.println(exc); 
	      System.exit(1); 
	    } 

	}

}
