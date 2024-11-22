import java.util.Scanner;

class Shape {
	//data members
	protected String color;
	//constructors
	Shape() { color = "red"; }
	Shape(String col) { color = col; }
	//public methods
	String getColor() { return color; }
	void setColor(String col) { color = col; }
	
	double getArea() { return 0; }
	}

class Circle extends Shape {
	//data members
	protected float radius;
	//constructors
	Circle() {
		super();
		radius = 1;
		}
	Circle(float r) {
		super();
		radius = r;
		}
	Circle(float r, String col) {
		super(col);
		radius = r;
		}
	//public methods
	float getRadius() { return radius; }
	void setRadius(float r) { radius = r; }
	double getArea() {
		return 3.14*radius*radius;
		}
	double getPerimeter() {
		return 2*3.14*radius;
		}
	}
	
class Rectangle extends Shape {
	//data members
	protected float width;
	protected float length;
	//constructors
	Rectangle() { 
		super();
		width = 1; 
		length = 1;
		}
	Rectangle(float w, float l) {
		super();
		width = w;
		length = l;
		}
	Rectangle(float w, float l, String col) {
		super(col);
		width = w;
		length = l;
		}
	//public methods
	float getWidth() { return width; }
	void setWidth(float w) { width = w; }
	float getLength() { return length; }
	void setLength(float l) { length = l; }
	double getArea() {
		return length*width;
		}
	double getPerimeter() {
		return 2*(length+width);
		}
	}
	
class Square extends Rectangle {
	//constructors
	Square() {
		super();
		}
	Square(float side) {
		super(side,side);
		}
	Square(float side, String col) {
		super(side,side,col);
		}
	//public methods
	float getSide() { return length; }
	void setSide(float side) {
		length = side;
		width = side;
		}
	}

class TestShape {
	public static void main (String a[]) {
		Scanner sc = new Scanner(System.in);
		
		//Shape shapes[] = new Shape[3];
		Shape shapes[] = new Shape[3];
		shapes[0] = new Circle();
		shapes[1] = new Rectangle();
		shapes[2] = new Square();
		
		System.out.println(shapes[0].getArea());
		
		/*Shape shp[] = new Shape[3];
		shapes[0] = new Circle[3]
		shapes[1] = new Rectangle[3];
		shapes[2] = new Square[3];*/
	
		/*Circle c1 = new Circle();
		Circle c2 = new Circle(2);
		Circle c3 = new Circle(3,"blue");
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(5,7);
		Rectangle r3 = new Rectangle(8,3,"yellow");
		
		Square s1 = new Square();
		Square s2 = new Square(4);
		Square s3 = new Square(2,"purple");
		
		//displaying values
		System.out.println("CIRCLES");
		System.out.println("Color: "+c1.getColor()+", Radius: "+c1.getRadius());
		System.out.println("Color: "+c2.getColor()+", Radius: "+c2.getRadius());
		System.out.println("Color: "+c3.getColor()+", Radius: "+c3.getRadius());
		
		System.out.println("RECTANGLES");
		System.out.println("Color: "+r1.getColor()+", Width: "+r1.getWidth()+", Length: "+r1.getLength());
		System.out.println("Color: "+r2.getColor()+", Width: "+r2.getWidth()+", Length: "+r2.getLength());
		System.out.println("Color: "+r3.getColor()+", Width: "+r3.getWidth()+", Length: "+r3.getLength());
		
		System.out.println("SQUARES");
		System.out.println("Color: "+s1.getColor()+", Side: "+s1.getSide());
		System.out.println("Color: "+s2.getColor()+", Side: "+s2.getSide());
		System.out.println("Color: "+s3.getColor()+", Side: "+s3.getSide());
		
		//finding area and perimeter
		System.out.println("CIRCLES");
		System.out.println("Area: "+c1.getArea()+", Perimeter: "+c1.getPerimeter());
		System.out.println("Area: "+c2.getArea()+", Perimeter: "+c2.getPerimeter());
		System.out.println("Area: "+c3.getArea()+", Perimeter: "+c3.getPerimeter());
		
		System.out.println("RECTANGLES");
		System.out.println("Area: "+r1.getArea()+", Perimeter: "+r1.getPerimeter());
		System.out.println("Area: "+r2.getArea()+", Perimeter: "+r2.getPerimeter());
		System.out.println("Area: "+r3.getArea()+", Perimeter: "+r3.getPerimeter());
		
		System.out.println("SQUARES");
		System.out.println("Area: "+s1.getArea()+", Perimeter: "+s1.getPerimeter());
		System.out.println("Area: "+s2.getArea()+", Perimeter: "+s2.getPerimeter());
		System.out.println("Area: "+s3.getArea()+", Perimeter: "+s3.getPerimeter());
		
		//getting new values from the user
		System.out.println("\nEnter new values: ");
		System.out.print("Enter new color: ");
		String col = sc.next();
		System.out.print("Enter new radius: ");
		float rad = sc.nextFloat();
		System.out.print("Enter new width: ");
		float wid = sc.nextFloat();
		System.out.print("Enter new length: ");
		float len = sc.nextFloat();
		
		//setting new values for objects
			//circles
		c1.setColor(col); c1.setRadius(rad);
		c2.setColor(col); c2.setRadius(rad);
		c3.setColor(col); c3.setRadius(rad);
		
			//rectangles
		r1.setColor(col); r1.setWidth(wid); r1.setLength(len);
		r2.setColor(col); r2.setWidth(wid); r2.setLength(len);
		r3.setColor(col); r3.setWidth(wid); r3.setLength(len);
		
			//squares
		s1.setColor(col); s1.setSide(len);
		s2.setColor(col); s2.setSide(len);
		s3.setColor(col); s3.setSide(len);
		
		//displaying new values
		System.out.println("\nNew values:");
		System.out.println("CIRCLES");
		System.out.println("Color: "+c1.getColor()+", Radius: "+c1.getRadius());
		System.out.println("Color: "+c2.getColor()+", Radius: "+c2.getRadius());
		System.out.println("Color: "+c3.getColor()+", Radius: "+c3.getRadius());
		
		System.out.println("RECTANGLES");
		System.out.println("Color: "+r1.getColor()+", Width: "+r1.getWidth()+", Length: "+r1.getLength());
		System.out.println("Color: "+r2.getColor()+", Width: "+r2.getWidth()+", Length: "+r2.getLength());
		System.out.println("Color: "+r3.getColor()+", Width: "+r3.getWidth()+", Length: "+r3.getLength());
		
		System.out.println("SQUARES");
		System.out.println("Color: "+s1.getColor()+", Side: "+s1.getSide());
		System.out.println("Color: "+s2.getColor()+", Side: "+s2.getSide());
		System.out.println("Color: "+s3.getColor()+", Side: "+s3.getSide());*/
		}
	}
