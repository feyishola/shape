public class Ellipse extends Circle{
	private double a;
	private double b;
		public Ellipse(String name, double r, double a, double b){
			super(name, r);
			this.a = a;
			this.b = b;
		}
	
			public double perimeter(){
				double p;
				if(a==b && b==radius){
						p = super.perimeter();
						//return p; u can return individually like dis
				}else{
					//return Math.PI*(Math.sqrt(2*(Math.pow(a,2)+(Math.pow(b,2))- (Math.pow((a-b),2)/2);
					p = Math.PI*Math.sqrt(2*(a*a+b*b)- Math.pow(a-b,2)/2);
					//return p; and individually like dis
				}
				return p; //but more sensible to return just once outside ur if statements
		
					//return Math.PI*Math.sqrt(2*(a*a+b*b)- Math.pow(a-b,2)/2);
			}
			
			public double area(){
				
				return Math.PI*a*b;
			}
	
	
			public String toString(){
				return super.toString();
			}
	
	
	
	
	
	
}