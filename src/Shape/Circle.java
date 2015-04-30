package Shape;

public class Circle extends Shape implements Drawable{
	private int radius;
	final double pi = 3.14;
			
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void draw(){
		System.out.println("원을 그렸습니다.");
	}
	@Override
	public double calculateArea() {
		double area = radius*radius*pi; 
		
		return area;
	}
	@Override
	public void Visible(boolean visible){
		if (visible == true){
			draw();
		}
		else {
			System.out.println("원을 지웠습니다.");
		}
	}
}



