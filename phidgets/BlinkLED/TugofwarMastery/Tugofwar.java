package TugofwarMastery;
import com.phidget22.*;

public class Tugofwar {
    public static void main(String[] args) throws Exception {

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

        redButton.open(500);
        redLED.open(500);
        greenButton.open(500);
        greenLED.open(500);

        int redCount = 0;
        int greenCount = 0;

        boolean lastRed = false;
        boolean lastGreen = false;

        while (redCount < 10 && greenCount < 10) {

            boolean redState = redButton.getState();
            boolean greenState = greenButton.getState();

            if (redState && !lastRed) {
                redCount++;
            }

            if (greenState && !lastGreen) {
                greenCount++;
            }

            lastRed = redState;
            lastGreen = greenState;

            Thread.sleep(20);
        }

        redLED.setState(true);
        greenLED.setState(true);
        Thread.sleep(300);
        redLED.setState(false);
        greenLED.setState(false);
        Thread.sleep(300);

        if (redCount == 10) {
            for (int i = 0; i < 5; i++) {
                redLED.setState(true);
                Thread.sleep(300);
                redLED.setState(false);
                Thread.sleep(300);
            }
        } else {
            for (int i = 0; i < 5; i++) {
                greenLED.setState(true);
                Thread.sleep(300);
                greenLED.setState(false);
                Thread.sleep(300);
            }
        }

        redButton.close();
        greenButton.close();
        redLED.close();
        greenLED.close();
    }
}


