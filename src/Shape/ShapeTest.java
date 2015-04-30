package Shape;

public class ShapeTest {
	public static void main(String[] args) {
		
		//오버라이딩 테스트
		//Shape rect = new Rect();
		//Shape circle = new Circle();

		//rect.draw();
		//circle.draw();
		
		//인터페이스 테스트
		//Drawable drawable = new Point(10,20);
		//drawable.draw();
		
		//instanceof 테스트
		Circle c = new Circle();
		
		System.out.println(c instanceof Circle);
		System.out.println(c instanceof Shape);
		System.out.println(c instanceof Drawable);
		//System.out.println(c instanceof Rect);   //컴파일 에러
		Shape s = c ;
		System.out.println(s instanceof Rect);   //이렇게 하면 가능
		                                         //그러나 결과는 false
		
	}
}


