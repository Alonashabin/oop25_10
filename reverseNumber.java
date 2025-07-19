package oop25_10;
import java.util.Scanner;
public class reverseNumber {
public static void main(String[] args){
	Scanner rev=new Scanner(System.in);
	System.out.println("enter the number");
	int num =rev.nextInt();
	int i;
	int temp=0;
	for(i=num;i!=0;i=i/10) {
	int digit=i%10;
	temp= temp*10+digit;
	}
	System.out.println("the reverse of the number is"+ temp);
}
}
