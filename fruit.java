package oop25_10;
import java.util.Vector;
public class fruit {
public static void main(String[] arg) {
	Vector<String> fruits=new Vector<>();
	fruits.add("mango");
	fruits.add("orange");
	fruits.add("apple");
	fruits.add("grapes");
	fruits.add("banana");
	 for (String fruit : fruits) {
         System.out.println(fruit);
	}
		
}
}
