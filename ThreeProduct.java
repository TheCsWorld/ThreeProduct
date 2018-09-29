
import java.util.Scanner;

//calculates and prints the product of three integers.
public class ThreeProduct {

	public static void main(String[] args) {
		int firstNumber =0;
		int secondNumber=0;
		int thirdNumber=0;
		int product = 0;
		System.out.println("Enter a number: ");
		Scanner inputScanner = new Scanner(System.in);
		inputScanner.useDelimiter(", ");                             
		firstNumber = inputScanner.nextInt();
		System.out.println("Enter another number: ");
		secondNumber = inputScanner.nextInt();
		System.out.println("Enter a third number: ");
		thirdNumber = inputScanner.nextInt();
		inputScanner.close();
		product = firstNumber * secondNumber * thirdNumber;
		
		System.out.println("The product of " + firstNumber + ", " + secondNumber+ ", " + thirdNumber + " is " + product);
	;
		
	}

}
