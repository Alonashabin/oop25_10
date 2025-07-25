package oop25_10;
import java.util.Scanner;
public class calculator {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter first number: ");
	        double num1 = scanner.nextDouble();
	        System.out.print("Enter operator (+, -, *, /): ");
	        char operator = scanner.next().charAt(0);
	        System.out.print("Enter second number: ");
	        double num2 = scanner.nextDouble();
	        double result;
	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                System.out.println("Result: " + result);
	                break;
	            case '-':
	                result = num1 - num2;
	                System.out.println("Result: " + result);
	                break;
	            case '*':
	                result = num1 * num2;
	                System.out.println("Result: " + result);
	                break;
	            case '/':
	                if (num2 == 0) {
	                    System.out.println("Error: Division by zero is undefined.");
	                } else {
	                    result = num1 / num2;
	                    System.out.println("Result: " + result);
	                }
	                break;
	            default:
	                System.out.println("Invalid operator.");
	        }
	    }
	}

