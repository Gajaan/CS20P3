package usebuttonsandLEDS;
import com.phidget22.*;

public class clickbuttons2 {
	 public static void main(String[] args) throws Exception{

	        //Create 
	        DigitalInput redButton = new DigitalInput();
	        DigitalOutput redLED = new DigitalOutput();
	        DigitalInput greenButton = new DigitalInput();
	        DigitalOutput greenLED = new DigitalOutput();

	        //Address 
	        redButton.setHubPort(0);
	        redButton.setIsHubPortDevice(true);
	        redLED.setHubPort(1);
	        redLED.setIsHubPortDevice(true);
	        greenButton.setHubPort(5);
	        greenButton.setIsHubPortDevice(true);
	        greenLED.setHubPort(4);
	        greenLED.setIsHubPortDevice(true);

	        //Open 
	        redButton.open(1000);
	        redLED.open();
	        greenButton.open(1000);
	        greenLED.open(1000);
	        
	        while(true){
	            redLED.setState(!redButton.getState());
	            greenLED.setState(!greenButton.getState());
	            Thread.sleep(150);
	        
	            Thread.sleep(150);
	        }
	 }
}
	

