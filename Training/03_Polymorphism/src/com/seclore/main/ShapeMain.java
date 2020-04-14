package com.seclore.main;

import java.util.Scanner;

import com.seclore.factory.ShapeFactory;
import com.seclore.pojo.Shape;

public class ShapeMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ShapeFactory factory;
		int choice;
		
		System.out.println("Select a Shape : ");
		System.out.println("1. Circle");
		System.out.println("2. Line");
		System.out.println("3. Star");
		choice = scanner.nextInt();
		
		factory = new ShapeFactory();
		Shape shape = factory.drawShape(choice);
		
		shape.draw();
		scanner.close();
		}
}
