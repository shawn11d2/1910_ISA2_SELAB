
public class Rectangle implements Shape {
	private double length;
	private double breath;
	
	public Rectangle(){				
		this.length = 0;
		this.breath = 0;
	}
	
	public Rectangle(double length,double breath) {				
		this.length = length;
		this.breath = breath;
	}
	
	public void display() {										
	      System.out.println("Calculating Area of Rectangle....");
	}

	public double calculateArea() {								
		return this.length*this.breath;
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreath() {
		return breath;
	}

	public void setBreath(double breath) {
		this.breath = breath;
	}
}
