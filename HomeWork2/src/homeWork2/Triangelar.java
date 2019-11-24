package homeWork2;

public class Triangelar extends Shape {
	private Point a;
	private Point b;
	private Point c;
	
	public Triangelar() {
		super();
	}
	
	public Triangelar(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
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

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Triangelar [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	@Override
	public double getPerimetr() {
		return (Point.distanceBetweenPoints(a, b) + Point.distanceBetweenPoints(b, c) + Point.distanceBetweenPoints(c, a));
	}
	
	@Override
	public double getArea() {
		double e = this.getPerimetr()/2.0;
		return (Math.sqrt(e * (e - Point.distanceBetweenPoints(a, b)) * (e - Point.distanceBetweenPoints(b, c)) * (e - Point.distanceBetweenPoints(c, a))));
	}
}
