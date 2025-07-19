package oop25_10;
import java.util.Scanner;
public class month {
	    public static void main(String[] args) {
	        Scanner day = new Scanner(System.in);
	        System.out.println("Enter the month:");
	        String month = day.nextLine();
	        month = month.toLowerCase(); 
	        if (month.equals("february")) {
	            System.out.println("The month has 28 or 29 days (depending on leap year).");
	        }

	        if (month.equals("january") || month.equals("march") || month.equals("may") ||
	            month.equals("july") || month.equals("august") || month.equals("october") || 
	            month.equals("december")) {
	            System.out.println("The month has 31 days.");
	        }

	        if (month.equals("april") || month.equals("june") || 
	            month.equals("september") || month.equals("november")) {
	            System.out.println("The month has 30 days.");
	        }
	    }
	}
