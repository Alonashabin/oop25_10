package oop25_10;
import java.util.Scanner;
public class reverseOrder {
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
     System.out.print("Enter the number of elements: ");
     int n = scanner.nextInt();
     int[] arr = new int[n];
     System.out.println("Enter " + n + " numbers:");
     for (int i = 0; i < n; i++) {
         arr[i] = scanner.nextInt();
     }
     System.out.print("Array in original order: ");
     for (int i = 0; i < n; i++) {
         System.out.print(arr[i] + " ");
     }
     System.out.print("\nArray in reverse order: ");
     for (int i = n - 1; i >= 0; i--) {
         System.out.print(arr[i] + " ");
     }
}
}