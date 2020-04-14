package com.seclore.factory;

import com.seclore.pojo.Circle;
import com.seclore.pojo.Shape;
import com.seclore.pojo.Star;
import com.seclore.pojo.Line;

public class ShapeFactory {

	public Shape drawShape (int choice) {
		if(choice == 1) 
			return new Circle();
		if(choice == 2)
			return new Line();
		if(choice == 3)
			return new Star();
		return null;
		
	}
}