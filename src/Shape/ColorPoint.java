package Shape;

public class ColorPoint extends Point{
	private String color;
	public ColorPoint(int x, int y) {
		super(x, y);
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void draw() {
		System.out.println("좌표 [x= "+getX()+", y= "+getY()+"]에 "+color+" 점을 그렸습니다.");
	}
	public void Visible(boolean visible){
		if (visible == true){
			draw();
		}
		else {
			System.out.println("좌표 [x= "+getX()+", y= "+getY()+"]에 "+color+" 점을 지웠습니다.");
		}
	}
}
