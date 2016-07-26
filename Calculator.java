package areaCalculate;

import java.util.ArrayList;
import java.util.List;
import java.math.*;

public class Calculator {
	public static void main(String args[]){
		List<Shape> shapeList = new ArrayList<Shape>();
		Rectengle rect1 = new Rectengle();
		Circle cir1 = new Circle();
		
		rect1.setLength(2);
		rect1.setWidth(2);
		rect1.setIsRect();
		
		cir1.setRad(4);
		cir1.setIsRect();
		
		shapeList.add(rect1);
		shapeList.add(cir1);
		
		for (Shape s : shapeList){
			if (s.IsRect() == true) {
				System.out.println("矩形");
				Rectengle r = (Rectengle) s;
				double area = r.getLength() * r.getWidth();
				System.out.println("面積 = " + area);
			}
			else if(s.IsRect() == false){
				System.out.println("圓形");
				Circle c = (Circle) s;
				double area = Math.PI * c.getRad() * c.getRad();
				System.out.println("面積= " + area);
			}
		}
	}
}
