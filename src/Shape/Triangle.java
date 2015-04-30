package Shape;

public class Triangle extends Shape implements Drawable {
	int height;
	int width;

	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void draw() {
		System.out.println("삼각형을 그렸습니다.");
	}
	public double calculateArea() {
		double area = height * width * 0.5;
		return area;
	}

	@Override
	public void Visible(boolean visible){
		if (visible == true){
			draw();
		}
		else {
			System.out.println("삼각형을 지웠습니다.");
		}
	}
}
