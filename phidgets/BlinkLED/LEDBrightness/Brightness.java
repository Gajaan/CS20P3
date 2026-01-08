package LEDBrightness;
import com.phidget22.*;

public class Brightness {

    public static void main(String[] args) throws Exception {

        DigitalOutput redLED = new DigitalOutput();

        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        redLED.open(1000);

        
        redLED.setDutyCycle(1.0);
        Thread.sleep(1000);
        redLED.setDutyCycle(0.0);
    }
}
