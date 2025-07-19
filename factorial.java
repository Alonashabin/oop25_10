package oop25_10;
import java.util.Scanner;
public class factorial {
	public static void main(String[] arg){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int fact=1;
		int i=1;
	while(i<=num) {
		fact*=i;
		i++;
	}
	System.out.println("factorial of the"+num+"is:"+ fact);
		
	}

}
