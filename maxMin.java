package oop25_10;
import java.util.Scanner;
public class maxMin {
	    public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();
	        if (n <= 0) {
	            System.out.println("Array size must be greater than 0.");
	            return;
	        }

	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " numbers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        int max = arr[0];
	        int min = arr[0];
	        for (int i = 1; i < n; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }
	        System.out.println("Maximum value in the array: " + max);
	        System.out.println("Minimum value in the array: " + min);
	}

}
