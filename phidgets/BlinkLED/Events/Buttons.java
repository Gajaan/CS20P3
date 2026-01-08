             package Events;
import com.phidget22.*;

public class Buttons {
	  public static void main(String[] args) throws Exception {
		//Create
	        DigitalInput redButton = new DigitalInput();
	        DigitalInput greenbutton = new DigitalInput();
	        //Address
	        redButton.setIsHubPortDevice(true);
	        redButton.setHubPort(0);
	        greenbutton.setIsHubPortDevice(true);
	        greenbutton.setHubPort(5);
	        //Event 
	        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
	            public void onStateChange(DigitalInputStateChangeEvent e) {
	                System.out.println("State: " + e.getState());
	            }
	        });
	        
	        greenbutton.addStateChangeListener(new DigitalInputStateChangeListener() {
	            public void onStateChange(DigitalInputStateChangeEvent e) {
	                System.out.println("State: " + e.getState());
	            }
	        });
	        

	        //Open
	        redButton.open(1000);
	        greenbutton.open(1000);
	        //Keep program running
	        while (true) {
	            Thread.sleep(1000);
	        }
	        
	        
}
}