package 이지한과제;

public class ShapeTest {
 private static Shape arrayOfShapes[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub

init();
allarea();
	}
public static void init() {
	arrayOfShapes = new Shape[3];
    arrayOfShapes[0]= new Triangle();
    arrayOfShapes[1]= new Rectangle();
    arrayOfShapes[2]= new Circle();
}
public static void allarea() {
	for (int i =0; i<arrayOfShapes.length; i++) {
		arrayOfShapes[i].area();
	}
}
}