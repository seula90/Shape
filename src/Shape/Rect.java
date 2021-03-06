package Shape;

public class Rect extends Shape implements Drawable{
	private int height;
	private int width;
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
	public void draw(){
		System.out.println("사각형을 그렸습니다.");
	}

	@Override
	public double calculateArea() {
		int area = width*height;
		return area;
	}

	@Override
	public void Visible(boolean visible){
		if (visible == true){
			draw();
		}
		else {
			System.out.println("사각형을 지웠습니다.");
		}
	}
}



