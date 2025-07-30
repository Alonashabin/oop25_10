package oop25_10;
import java.util.Scanner;
public class searchInArray {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " numbers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        System.out.print("Enter the number to search: ");
	        int target = scanner.nextInt();
	        boolean found = false;
	        for (int i = 0; i < n; i++) {
	            if (arr[i] == target) {
	                System.out.println("Number found at position: " + (i + 1));
	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("Number not found in the array.");
	        }
	}

}
