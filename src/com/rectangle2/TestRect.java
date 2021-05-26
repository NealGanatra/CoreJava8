package com.rectangle2;

class Rectangle2 {
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

public Rectangle2() {
	super();
	// TODO Auto-generated constructor stub
}



public Rectangle2(double length, double breadth) {
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


public class TestRect {

	public static void main(String[] args) {
		Rectangle rect=new Rectangle();
		System.out.println("Area of rect 1-->"+rect.getArea());
		
		Rectangle2 rect2=new Rectangle2();
		rect2.setBreadth(5);
		rect2.setLength(4);
		System.out.println("Area of rect 2-->"+rect2.getArea());
		System.out.println("Perimeter of rect 2-->"+rect2.getPerimeter());
		
		Rectangle2 rect3=new Rectangle2();
		rect3.setBreadth(0.0);
		rect3.setLength(6.0);
		System.out.println("Area of rect 3-->"+rect3.getArea());
		System.out.println("Perimeter of rect 3-->"+rect3.getPerimeter());
		
		Rectangle2 rect4=new Rectangle2(0.0,0.0);
		System.out.println("Area of rect 4-->"+rect4.getArea());
		
		Rectangle2 rect5=new Rectangle2(21,12);
		System.out.println("Area of rect 5-->"+rect5.getArea());
	}
}
