package Lab4Revison;

public class Box {
	
double width;
double height;
double length;

public Box () { // constructor with some values that will be used in main (can also be changed by creating new obj in ()
	width = 10;
	height = 10;
	length = 5;
}


public Box(double width, double height, double length) { //can make as much constr as want, but never the same ones
	super();
	this.width = width;
	this.height = height;
	this.length = length;
}

public double compute () {
	return width * height * length;
}











} //end class
