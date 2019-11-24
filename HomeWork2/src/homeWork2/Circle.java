package homeWork2;

public class Circle extends Shape {
	private Point a;
	private Point b;
	
	public Circle() {
		super();
	}
	
	public Circle(Point a, Point b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "Circle [a=" + a + ", b=" + b + "]";
	}
	
	@Override
	public double getPerimetr() {
		return (2.0 * Math.PI * Point.distanceBetweenPoints(a, b));
	}
	
	@Override
	public double getArea() {
		return (Math.PI * (Point.distanceBetweenPoints(a, b) * 2.0));
	}
}
