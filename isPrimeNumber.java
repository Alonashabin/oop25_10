package oop25_10;
import java.util.Scanner;
public class isPrimeNumber {
public static void main(String[] args) {
	Scanner prime=new Scanner(System.in);
	System.out.println("enter the number");
	int n=prime.nextInt();
	if (n <= 1) {
        System.out.println(n + " is not a prime number.");
    } else {
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}

}
