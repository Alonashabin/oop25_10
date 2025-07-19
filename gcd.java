package oop25_10;
import java.util.Scanner;
public class gcd {
	    public static void main(String[] args) {
	        Scanner num = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        int a = num.nextInt();
	        System.out.print("Enter second number: ");
	        int b = num.nextInt();
	        while (a != b) {
	            if (a > b) {
	                a = a - b;
	            } else {
	                b = b - a;
	            }
	        }
	        System.out.println("GCD is: " + a);
	    }
	}


