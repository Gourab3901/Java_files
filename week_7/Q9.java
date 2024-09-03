/*Create two user-defined exceptions named “TooHot” and “TooCold” to check the temperature (in Celsius) given by 
the user passed through the command line is too hot or too cold. 
• If temperature > 35, throw exception “TooHot”. 
• If temperature <5, throw exception “TooCold”. 
• Otherwise, print “Normal” and convert it to Farenheit.  
 */
import java.util.Scanner;
class TooHot extends Exception {
    public TooHot(String message) {
        super(message);    }  }
class TooCold extends Exception {
    public TooCold(String message) {
        super(message);  }  }
public class Q9{
    public static void checkTemperature(int temperature) throws TooHot, TooCold {
        if (temperature > 35) {
            throw new TooHot("Temperature " + temperature + "C is too hot.");
        } else if (temperature < 5) {
            throw new TooCold("Temperature " + temperature + "C is too cold.");
        } else {
System.out.println("Temperature " + temperature + "C is normal.");
System.out.println("In Fahrenheit: " + celsiusToFahrenheit(temperature));   }   }
    public static double celsiusToFahrenheit(int temperatureCelsius) {
        return (temperatureCelsius * 9.0/5) + 32;   }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
System.out.println("Enter the temperature in Celsius: ");
            int temperature = scanner.nextInt();
checkTemperature(temperature);
        } catch (TooHot e) {
System.out.println(e.getMessage());
        } catch (TooCold e) {
System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
System.out.println("Please enter a valid integer temperature.");
        } finally {
scanner.close();  }    }  }







