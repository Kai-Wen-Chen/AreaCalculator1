package areaCalculate;

public class Circle extends Shape{
	public void setRad(double rad){
		this.rad = rad;
	}
	
	public void setIsRect(){
		this.isRect = false;
	}
	
	public double getRad(){
		return this.rad;
	}
	
	public boolean getIsRect(){
		return this.isRect;
	}
}
