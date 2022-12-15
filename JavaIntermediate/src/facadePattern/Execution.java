package facadePattern;

public class Execution {
	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
		shapeMaker.drawCircle();
	}
}
