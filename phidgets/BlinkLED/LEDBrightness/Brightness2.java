package LEDBrightness;
import com.phidget22.*;

public class Brightness2 {

    public static void main(String[] args) throws Exception {

        DigitalOutput redLED = new DigitalOutput();

        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);

        redLED.open(1000);

        for(double l = 0.0; l <= 1.0; l += 0.05){
            redLED.setDutyCycle(l);
            Thread.sleep(100);
        }

        for(double d = 1.0; d >= 0.0; d -= 0.05){
            redLED.setDutyCycle(d);
            Thread.sleep(100);
        }

        redLED.setDutyCycle(0.0);
    }
}
