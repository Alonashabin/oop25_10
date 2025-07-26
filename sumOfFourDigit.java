package oop25_10;
import java.util.Scanner;
public class sumOfFourDigit {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a four-digit number: ");
	        int number = scanner.nextInt();
	        int sum = 0;
	        while (number != 0) {
	            int digit = number % 10; 
	            sum += digit;            
	            number /= 10;           
	        }

	        System.out.println("Sum of digits = " + sum);
	    }
	}


