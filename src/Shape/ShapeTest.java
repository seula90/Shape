package Shape;

public class ShapeTest {
	public static void main(String[] args) {

		Rect rect = new Rect();
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		rect.draw();
		circle.draw();
		triangle.draw();

		Drawable drawable = new Point(10, 20);
		drawable.draw();

		Point Colorpoint = new ColorPoint(20, 30);
		Colorpoint.setColor("red");

		Colorpoint.draw();

		// calculate area

		rect.setWidth(10);
		rect.setHeight(10);

		circle.setRadius(10);

		triangle.setWidth(10);
		triangle.setHeight(10);

		System.out.println(rect.calculateArea());
		System.out.println(circle.calculateArea());
		System.out.println(triangle.calculateArea());

	}
}
