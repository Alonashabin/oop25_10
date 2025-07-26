package oop25_10;
import java.util.Scanner;
public class palidrome {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int original = scanner.nextInt();
	        int number = original;
	        int reversed = 0;
	        while (number != 0) {
	            int digit = number % 10;
	            reversed = reversed * 10 + digit;
	            number /= 10;
	        }
	        if (original == reversed) {
	            System.out.println(original + " is a palindrome.");
	        } else {
	            System.out.println(original + " is not a palindrome.");
	        }
	    }
	}
