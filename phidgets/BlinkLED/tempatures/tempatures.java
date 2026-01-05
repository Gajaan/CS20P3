package tempatures;
import com.phidget22.*;

public class tempatures {
    public static void main(String[] args) throws Exception{

        TemperatureSensor temperatureSensor = new TemperatureSensor();
        temperatureSensor.open(1000);

        while (true) {
            double c = temperatureSensor.getTemperature();
            double f = c * 1.8 + 32;
            System.out.println("Temperature: " + f + " °F");
            Thread.sleep(150);
        }
    }
}