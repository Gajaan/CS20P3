package Readbutton;
import com.phidget22.*;

public class readredbutton6 {

    public static void main(String[] args) throws Exception {

        DigitalInput redButton = new DigitalInput();

        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redButton.open(1000);

        boolean lastState = false;

        while (true) {
            boolean currentState = redButton.getState();

            if (currentState && !lastState) {
                System.out.println("button state: true");
            }

            lastState = currentState;
            Thread.sleep(150);
        }
    }
}
