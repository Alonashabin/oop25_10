package oop25_10;
import java.util.Vector;
public class vectorAdd {
public static void main(String[] args) {
	Vector<String>mammals=new Vector<>();
	mammals.add("dog");
	mammals.add("Horse");
	mammals.add(2,"cat");
	System.out.println("vector "+mammals);
	Vector<String> animals=new Vector<>();
	animals.add("crocdile");
	animals.addAll(mammals);
	System.out.println("new vector:"+animals);
}
}
