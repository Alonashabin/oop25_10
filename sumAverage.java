package oop25_10;
import java.util.Scanner;
public class sumAverage {
	    public static void main(String[] args) {
	    	 Scanner scanner = new Scanner(System.in);
	         System.out.print("Enter the number of elements: ");
	         int n = scanner.nextInt();
	         int[] arr = new int[n];
	         int sum = 0;
	         System.out.println("Enter " + n + " numbers:");
	         for (int i = 0; i < n; i++) {
	             arr[i] = scanner.nextInt();
	             sum += arr[i];
	         }
	         double average = (double) sum / n;
	         System.out.println("Sum of the elements: " + sum);
	         System.out.println("Average of the elements: " + average);
	 }
}

