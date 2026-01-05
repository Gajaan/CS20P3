package HotorcoldMastery;
import com.phidget22.*;

public class HotorCold {

    public static void main(String[] args) throws Exception {

        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();

        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        humiditySensor.open(1000);
        temperatureSensor.open(1000);
        redLED.open(1000);
        greenLED.open(1000);

        while(true){

            double temp = temperatureSensor.getTemperature();

            System.out.println("Temperature: " + temp + " °C");

            if (temp >= 20 && temp <= 24) {
                greenLED.setState(true);
                redLED.setState(false);
            } else {
                greenLED.setState(false);
                redLED.setState(true);
            }
        }
    }
}
