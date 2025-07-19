package oop25_10;
import java.util.Scanner;
public class largestNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("enter the first number");
		num1=sc.nextInt();
		System.out.println("enter the second number");
		num2=sc.nextInt();
		if(num1>num2) {
			System.out.println("I AM "+num1+" THE BIGGER NUMBER");
		}
			else {
				System.out.println("I AM "+num2+" THE BIGGER NUMBER");
			}
		}
	}


