package oop25_10;
import java.util.Vector;
import java.util.*;
public class vectorStringSearch {
public static void main(String[] arg) {
	Vector<String> search=new Vector<>();
	Scanner sc=new Scanner(System.in);	
	search.add("pen");
	search.add("notebook");
	search.add("eraser");
	search.add("marker");
	System.out.println("enter the item to be search");	
	String item=sc.nextLine();
	 if (search.contains(item)) {
         System.out.println(item + " is found in the list.");
     } else {
         System.out.println(item + " is NOT found in the list.");
     }
}
}


