/*Write a program that outputs the name of the capital of the country entered at the command line. 
The program should throw a “NoMatchFoundException” when it fails to print the capital of the country entered at the command line. 
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);    }  }
public class CapitalFinder {
    private static final Map<String, String>countryCapitals;
    static {
countryCapitals = new HashMap<>();
countryCapitals.put("United States", "Washington, D.C.");
countryCapitals.put("Germany", "Berlin");
countryCapitals.put("France", "Paris");
countryCapitals.put("Japan", "Tokyo");
countryCapitals.put("United Kingdom", "London");
countryCapitals.put("India", "New Delhi");    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.println("Enter the name of the country:");
        String country = scanner.nextLine();
        try {
            String capital = findCapital(country);
System.out.println("The capital of " + country + " is " + capital + ".");
        } catch (NoMatchFoundException e) {
System.out.println(e.getMessage());        }    }
    public static String findCapital(String country) throws NoMatchFoundException {
        String capital = countryCapitals.get(country);
        if (capital == null) {
            throw new NoMatchFoundException("No match found for the country: " + country);     }
        return capital;    }  }



