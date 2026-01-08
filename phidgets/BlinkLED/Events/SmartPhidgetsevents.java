package Events;
          
import com.phidget22.*;

public class SmartPhidgetsevents {

    public static void main(String[] args) throws Exception {
        
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

     
        humiditySensor.addHumidityChangeListener(new HumiditySensorHumidityChangeListener() {
            public void onHumidityChange(HumiditySensorHumidityChangeEvent e) {
                System.out.println("Humidity: " + e.getHumidity() + "%RH");
            }
        });
        
        
        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
                System.out.println("Temperature: " + e.getTemperature() + "°C");
            }
        });

     
        humiditySensor.open(1000);
        temperatureSensor.open(1000);

        
        while (true) {
            Thread.sleep(150);
        }
    }
}
  