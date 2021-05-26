package com.rectangle;

public class TestRect {

	public static void main(String[] args) {
		Rectangle rect=new Rectangle();
		System.out.println("Area of rect 1-->"+rect.getArea());
		
		Rectangle rect2=new Rectangle(5,4);
		System.out.println("Area of rect 2-->"+rect2.getArea());
		
		Rectangle rect3=new Rectangle(6,7);
		System.out.println("Area of rect 3-->"+rect3.getArea());
		
		Rectangle rect4=new Rectangle(8,9);
		System.out.println("Area of rect 4-->"+rect4.getArea());
		
		Rectangle rect5=new Rectangle(10,12);
		System.out.println("Area of rect 5-->"+rect5.getArea());
	}
}
