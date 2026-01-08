package Events;
import com.phidget22.*;

public class ButtonsandLEDS {

    static int redCount = 0;
    static int greenCount = 0;
    static boolean gameOver = false;

    public static void main(String[] args) throws Exception {

        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();

        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);

        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);

        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                if(e.getState() && !gameOver) {
                    redCount++;
                    System.out.println("Red: " + redCount);
                    if(redCount == 10) {
                        gameOver = true;
                        System.out.println("Red Wins!");
                    }
                }
            }
        });

        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
            public void onStateChange(DigitalInputStateChangeEvent e) {
                if(e.getState() && !gameOver) {
                    greenCount++;
                    System.out.println("Green: " + greenCount);
                    if(greenCount == 10) {
                        gameOver = true;
                        System.out.println("Green Wins!");
                    }
                }
            }
        });

        redLED.open(1000);
        greenLED.open(1000);
        redButton.open(1000);
        greenButton.open(1000);

        while(true) {

            if(gameOver) {
                redLED.setState(true);
                greenLED.setState(true);
            }

            Thread.sleep(100);
        }
    }
}
