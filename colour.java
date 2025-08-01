package oop25_10;
import java.util.Vector;
public class colour {
public static void main(String[] arg) {
	Vector<String> colour =new Vector<>();
	colour.add("red");
	colour.add("green");
	colour.add("blue");
	colour.add("yellow");
	System.out.println("the colour before remove are: ");
        System.out.println(colour);
	System.out.println("the colour after remove are: ");
	String element=colour.remove(1);
	        System.out.println(colour);
	}
}

