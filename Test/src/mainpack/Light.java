package mainpack;

import java.util.logging.Level;


/**
 * 
 * @author kkum47
 *
 */
public final class Light {
  
	private Light(){
		
	}
	/**
	 * 
	 * @param args
	 */
   public static void main(final String args) {
    int lightspeed;
	long days;
	long seconds; 
	long distance;

	// approximate speed of light in miles per second
    lightspeed = 186000;

    days = 1000; // specify number of days here

	seconds = days * 24 * 60 * 60; // convert to seconds

	distance = lightspeed * seconds; // compute distance
	    
	if (log.isLoggable(Level.FINE)) {
 	    log.fine("In " + days);
 	    log.fine(" days light will travel about ");
 	    log.fine(distance + " miles.");
	}
   }
}
