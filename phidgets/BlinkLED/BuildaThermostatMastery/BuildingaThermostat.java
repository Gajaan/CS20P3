package BuildaThermostatMastery;
import com.phidget22.*;

public class BuildingaThermostat {

    public static void main(String[] args) throws Exception {

        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

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
        temperatureSensor.open(500);

        double setTemp = 21;

        boolean lastRed = false;
        boolean lastGreen = false;

        long lastPrint = System.currentTimeMillis();

        while (true) {

            boolean redPressed = redButton.getState();
            boolean greenPressed = greenButton.getState();

            if (redPressed && !lastRed) {
                setTemp--;
            }

            if (greenPressed && !lastGreen) {
                setTemp++;
            }

            lastRed = redPressed;
            lastGreen = greenPressed;

            double currentTemp = temperatureSensor.getTemperature();

            if (Math.abs(currentTemp - setTemp) <= 2) {
                greenLED.setState(true);
                redLED.setState(false);
            } else {
                greenLED.setState(false);
                redLED.setState(true);
            }

            if (System.currentTimeMillis() - lastPrint >= 10000) {
                System.out.println("Current Temp: " + currentTemp + " C");
                System.out.println("Set Temp: " + setTemp + " C");
                lastPrint = System.currentTimeMillis();
            }

            Thread.sleep(50);
        }
    }
}
