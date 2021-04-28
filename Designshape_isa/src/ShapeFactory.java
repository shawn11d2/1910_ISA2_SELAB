
public class ShapeFactory {
public Shape getInstance(shapeType type) {
		
		Shape shape = null;
			
		switch(type) 
		{		
			case RECTANGLE:
				shape = new Rectangle(15,6);
				break;
				
			case TRIANGLE:
				shape = new Triangle(5,7);
				break;
				
			case CIRCLE:
				shape = new Circle(14);
				break;
				
		}
		
		return shape;
	}	
}
