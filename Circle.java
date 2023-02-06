public class Circle extends Shape{
	protected double radius;
		public Circle(String name, double r){
			super(name);
			radius =r;
			
		}
	
	
	protected double perimeter(){
			return 2*Math.PI*radius;
		
	}
	
	
	protected double area(){
			return Math.PI * Math.pow(radius,2);
		
	}
	
	
	public String toString(){
		return super.toString();
	}
	
	public double getradius(){
		return radius;
	}
	
	
	
}