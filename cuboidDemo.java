package oop25_10;
import java.util.Scanner;
public class cuboidDemo {
	public static void main(String[] args)
	{
				System.out.println("Please enter the length,breadth,height of the cuboid:");
				Scanner sc = new Scanner(System.in);
				double length = sc.nextDouble();
				double breadth= sc.nextDouble();
				double height = sc.nextDouble();
				Cuboid mybox = new Cuboid();
				mybox.setDimension(length,breadth,height);
				double volume =mybox.calculateVolume();
				System.out.println("Volume of the cuboid with dimensions: "+length+"* "
				+breadth+" *"+height+" is :"+volume);
				double surfaceArea = mybox.calculateSurfaceArea();
		        System.out.println("Surface Area of the box is: " + surfaceArea);
			}
	}

