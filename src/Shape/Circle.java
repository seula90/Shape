package Shape;

public class Circle extends Shape implements Drawable{
	int radius;
	final double pi = 3.14;
	
	public void draw(){
		System.out.println("원을 그렸습니다.");
	}
	
	@Override
	public double calculateArea() {
		double area = radius*radius*pi; 
		
		return area;
	}
	
}



