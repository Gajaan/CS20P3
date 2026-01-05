package tempatures;
import com.phidget22.*;

public class Temperatures3 {

    public static void main(String[] args) throws Exception {

        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        while(true){
        	double humidity = humiditySensor.getHumidity();
            double temp = temperatureSensor.getTemperature();

            if(temp >= 21){
                System.out.println("Humidity: " + humidity + " %RH, Temperature: " + temp + " °C");
            } else {
                System.out.println("Temperature is low, Humidty: " + humidity);
            }

            Thread.sleep(150);
        }
    }
}
