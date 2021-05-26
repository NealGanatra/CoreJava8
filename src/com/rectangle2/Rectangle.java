package com.rectangle2;

public class Rectangle {
private double length=1.0;
private double breadth=1.0;


public double getLength() {
	return length;
}

public void setLength(double length) {
	if(length>0.0 && length<20.0)
	this.length = length;
}

public double getBreadth() {
		return breadth;
}

public void setBreadth(double breadth) {
	if(breadth>0.0 && breadth<20.0)
	this.breadth = breadth;
}

public Rectangle() {
	super();
	// TODO Auto-generated constructor stub
}



public Rectangle(double length, double breadth) {
	super();
	this.length = length;
	this.breadth = breadth;
}

public double getArea() {
	if(this.length==0 || this.breadth==0) {
		return 0;
	}
	else if(this.length>0.0 && this.length<20.0 && this.breadth>0.0 && this.breadth<20.0)
		return this.length*this.breadth;
	else 
		return 0.0;
}

public double getPerimeter() {
	return 2*(this.length+this.breadth);
}


}
