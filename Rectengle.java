package areaCalculate;

public class Rectengle extends Shape{
	public void setLength(double length){
		this.length = length;
	}
	
	public void setWidth(double width){
		this.width = width;
	}
	
	public void setIsRect(){
		this.isRect = true;
	}
	
	public double getLength(){
		return this.length;
	}
	
	public double getWidth(){
		return this.width;
	}
	
	public boolean getIsRect(){
		return this.isRect;
	}
}
