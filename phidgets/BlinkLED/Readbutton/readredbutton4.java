package Readbutton;
import com.phidget22.*;

public class readredbutton4 {
     
    public static void main(String[] args) throws Exception{
        
        
        DigitalInput redButton = new DigitalInput();

         
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);

         
        redButton.open(1000);

        
        while(true){
            System.out.println("Button State: " + redButton.getState());
            Thread.sleep(5000);
        }
    }
}