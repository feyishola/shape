public abstract class Shape{
	private String name;
		public Shape(String name){
			this.name=name;

		
		}
	
	protected abstract double perimeter();
	protected abstract double area();
	public String toString(){
		return "name:" +name+" perimeter:"+perimeter()+" area:"+area();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}