package com.book;

import java.util.Scanner;

public class TestBook {

	
	static Book[] books=new Book[10];
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int m=0;
		String title;
		double price;
		Book book;
		int k=0;
		while(m!=-1) {
			System.out.println("Enter title and price for book");
			title=sc.nextLine();
			price=Double.parseDouble(sc.nextLine());
			book=new Book(title,price);
			
			books=createBooks(book,k);
			k++;
			System.out.println("Press -1 to break else 0 to continue");
			m=Integer.parseInt(sc.nextLine());
		}
		
		showBooks(books);
	}
	
	
	public static Book[] createBooks(Book book,int k) {

		
		books[k]=book;
		return books;
	}
	
	public static void showBooks(Book[] books) {
		System.out.println("Title"+"\tPrice\n");
		for(Book bk:books) {
			System.out.println(bk);
		}
	}
}
