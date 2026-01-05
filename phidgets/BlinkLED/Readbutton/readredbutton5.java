package Readbutton;
import com.phidget22.*;

public class readredbutton5 {
     
    public static void main(String[] args) throws Exception{
        
        
        DigitalInput greenButton = new DigitalInput();

         
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);

         
        greenButton.open(1000);

        
        while(true){
            System.out.println("Button State: " + greenButton.getState());
            Thread.sleep(150);
        }
    }
}