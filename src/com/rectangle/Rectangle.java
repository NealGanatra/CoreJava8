package com.rectangle;

public class Rectangle {
private int length=0;
private int breadth=0;
public int getLength() {
	return length;
}
public void setLength(int length) {
	this.length = length;
}
public int getBreadth() {
	return breadth;
}
public void setBreadth(int breadth) {
	this.breadth = breadth;
}
public Rectangle(int length, int breadth) {
	super();
	this.length = length;
	this.breadth = breadth;
}
public Rectangle() {
	super();
	// TODO Auto-generated constructor stub
}

public int getArea() {
	if(this.length==0 || this.breadth==0) {
		return 0;
	}
	else
		return this.length*this.breadth;
}



}
