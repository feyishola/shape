public class TestShape{
	public static void main(String[]args){
		Shape shape[] = new Shape[4];
		shape[0] = new Circle("Circle", 7.1);
		shape[1] = new Ellipse("Ellipse",7.0,9,5);
		shape[2] = new Triangle("Triangle", 3, 4, 5);
		shape[3] = new EquilateralTriangle("EquilateralTriangle", 5);
		for(int i=0; i<shape.length; i++){
			System.out.println(shape[i]);
		}
		
		
		
	}
	
	
	
}