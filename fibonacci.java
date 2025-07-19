package oop25_10;
import java.util.Scanner;
public class fibonacci {
public static void main(String[] arg) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number ");
  int num=sc.nextInt();
  int a=0;
  int b=1;
  int count=0;
  System.out.println("the fibonacci sequence up to "+num);
  while(count<num) {
	  System.out.println(a+" ");
	  int c=a+b;
	  a=b;
	  b=c;
	  count++;
  }
}
}
