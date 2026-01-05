package usebuttonsandLEDS;
import com.phidget22.*;

public class clickbuttons {
    public static void main(String[] args) throws Exception{

        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);

        boolean lastRed = false;
        boolean lastGreen = false;
        int totalPresses = 0;

        while(true){

            boolean redState = redButton.getState();
            boolean greenState = greenButton.getState();

            redLED.setState(redState);
            greenLED.setState(greenState);

            if(redState && !lastRed){
                totalPresses++;
                System.out.println("Total presses: " + totalPresses);
            }

            if(greenState && !lastGreen){
                totalPresses++;
                System.out.println("Total presses: " + totalPresses);
            }

            lastRed = redState;
            lastGreen = greenState;

            Thread.sleep(150);
        }
    }
}
