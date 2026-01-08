package Events;
import com.phidget22.*;
public class Dataintervals {
	 public static void main(String[] args) throws Exception {

	     
	        TemperatureSensor temperatureSensor = new TemperatureSensor();

	         
	        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener() {
	            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) {
	                System.out.println("Temperature: " + e.getTemperature());
	            }
	        });

	       
	        temperatureSensor.open(5000);

	        
	        temperatureSensor.setDataInterval(60000);

	        
	        while (true) {
	            Thread.sleep(150);
	        }
	    }
	}
	 
