public class Triangle extends Shape{
	private double side1;
	private double side2;
	private double side3;
	
		public Triangle(String name, double A, double B, double C){
			super(name);
			side1 = A;
			side2 = B;
			side3 = C;
			
			
		}
	
			public double perimeter(){
				
				return side1+side2+side3; 
				
				
			}
	
	
			public double area(){
				 double S;
				S = (side1+side2+side3)/2;
				//S = perimeter() /2;
				//side1+side2>side3 && side2+side3>side1 && side3+side1>side2;
				return Math.sqrt(S*(S-side1)*(S-side2)*(S-side3));
			}
			
			public String toString(){
					return super.toString();
				
			}
	
}