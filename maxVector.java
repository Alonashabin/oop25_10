package oop25_10;
import java.util.Vector;
public class maxVector {
public static void main(String[] arg) {
	Vector<Integer> max=new Vector<>();
	max.add(25);
	max.add(60);
	max.add(15);
	max.add(80);
	max.add(40);
	System.out.println("the number in the vectors are: "+max);
	int maximum = max.get(0);
		for(int num:max) {
			if(num>maximum) {
				maximum=num;
			}
		}
		System.out.println("the maximum number of the vector: "+maximum);
}
}
