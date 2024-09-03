/*Consider a “Binary to Decimal” Number conversion system which only accepts binary number as Input. 
If user provides a decimal number a custom Exception “WrongNumberFormat” exception will be thrown. 
Otherwise, it will convert into decimal and print into the screen.  
 */

import java.util.Scanner;
class WrongNumberFormat extends Exception {
    public WrongNumberFormat(String message) {
        super(message);    }  }
public class BinaryToDecimalConverter {
    public static int binaryToDecimal(String binary) throws WrongNumberFormat {
        if (!binary.matches("[01]+")) {
            throw new WrongNumberFormat("Error: Input is not a valid binary number.");   }
        return Integer.parseInt(binary, 2);    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
System.out.print("Enter a binary number: ");
            String binaryInput = scanner.nextLine();
            int decimalOutput = binaryToDecimal(binaryInput);
System.out.println("Decimal equivalent: " + decimalOutput);
        } catch (WrongNumberFormat e) {
System.out.println(e.getMessage());
        } finally {
scanner.close();  }    }  }







