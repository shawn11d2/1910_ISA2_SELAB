import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner shp = new Scanner(System.in);
		ShapeFactory shapefactory = new ShapeFactory();
		
		System.out.println(" Choose any one option of shape to calculate area ");
        System.out.println("1. Circle");
        System.out.println("2. Triangle ");
        System.out.println("3. Rectangle");
        System.out.println("4. Exit ");
        System.out.println("--------------------------------------");
        int choice = shp.nextInt();
		
        switch(choice) 
        {    
        	
        	case 1:
        		Shape circle = shapefactory.getInstance(shapeType.CIRCLE);
        		circle.display();
        		System.out.println("Area of Circle is "+circle.calculateArea());
        		break;
        		
        		
        	case 2:
        		Shape triangle = shapefactory.getInstance(shapeType.TRIANGLE);
        		triangle.display();
        		System.out.println("Area of Triangle is "+triangle.calculateArea());
        		
        		break;
        			
        	case 3:
        		Shape rectangle = shapefactory.getInstance(shapeType.RECTANGLE);
        		rectangle.display();
        		System.out.println("Area of Rectangle is "+rectangle.calculateArea());
        	
        		break;
        		
        	case 4:
        		break;
        	
        	default:
        		System.out.println("Invalid Option");
        		break;
        }  

	}

}
