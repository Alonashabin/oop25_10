package oop25_10;
class Cuboid {
	double length;
	double breadth;
	double height;
void setDimension(double l, double b, double h) {
	length =l;
	breadth =b;
	height = h;
}
	public double calculateVolume() {
		double volume = height*length*breadth;
		return volume;
	}
	public double calculateSurfaceArea() {
       return 2 * (length * breadth + height * breadth + length * height);
   }

}

