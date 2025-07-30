package oop25_10;
import java.util.Scanner;
public class sortedArray {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter " + n + " numbers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	        }
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - 1; j++) {
	                if (arr[j] > arr[j + 1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	        System.out.print("Sorted array in ascending order: ");
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        
	    }
	}

}
