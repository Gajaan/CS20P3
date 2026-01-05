package tempatures;
import com.phidget22.*;

public class Temperatures2 {

    public static void main(String[] args) throws Exception {

        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        while(true){

            double humidity = humiditySensor.getHumidity();
            double temp = temperatureSensor.getTemperature();

            if(humidity >= 30){
                System.out.println("Humidity: " + humidity + " %RH, Temperature: " + temp + " °C");
            } else {
                System.out.println("Humidity is low, Temperature: " + temp + " °C");
            }

            Thread.sleep(150);
        }
    }
}
