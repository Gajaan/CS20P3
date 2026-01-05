package phidgets;
import com.phidget22.*;

public class Redlight2 {
  
 public static void main(String[] args) throws Exception{

     
 DigitalOutput redLED = new DigitalOutput();

     
  redLED.setHubPort(1);
  redLED.setIsHubPortDevice(true);

      
   redLED.open(1000);

     
    while(true){
    redLED.setState(true);
    Thread.sleep(2000);
    redLED.setState(false);
    Thread.sleep(1000);
      }
  }
}
