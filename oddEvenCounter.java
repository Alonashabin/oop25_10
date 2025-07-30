package oop25_10;
import java.util.Scanner;
public class oddEvenCounter {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();
	        int[] arr = new int[n];
	        int evenCount = 0, oddCount = 0;
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextInt();
	            if (arr[i] % 2 == 0) {
	                evenCount++;
	            } else {
	                oddCount++;
	            }
	        }
	        System.out.println("Number of even elements: " + evenCount);
	        System.out.println("Number of odd elements: " + oddCount);
	    }
	}

