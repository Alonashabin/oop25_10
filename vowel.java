package oop25_10;
import java.util.Scanner;
public class vowel{
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a single letter: ");
	        char ch = scanner.next().toLowerCase().charAt(0);
	        if (!Character.isLetter(ch)) {
	            System.out.println("Invalid input. Please enter a letter.");
	            return;
	        }

	        switch (ch) {
	            case 'a':
	            case 'e':
	            case 'i':
	            case 'o':
	            case 'u':
	                System.out.println(ch + " is a vowel.");
	                break;
	            default:
	                System.out.println(ch + " is a consonant.");
	        }
	    }
	}

