package homeWork2;

public class Main {
	
	/*
	 * 1. �������� ����������� ����� Shape, � ������� ���� ��� ����������� ������ double getPerimetr() � 
	 * double getArea().
	 * 2. �������� ����� Point, � ������� ���� ��� �������� double x double y. 
	 * 3. �������� ������, ������� ���������, ��� �������, ��� �������������� ������ 
	 * (��� ������ ���� ����������� Shape). ��� ���� ��� � �������� ������� ������ ��������� ������ Point.
	 */

	public static void main(String[] args) {
		Shape triangelar = new Triangelar(new Point(1,1), new Point(2,2), new Point(3,3));
		System.out.println(triangelar);
		System.out.println("Perimetr of a triangle is: " + triangelar.getPerimetr());
		System.out.println("Area of a triangle is: " + triangelar.getArea());
		System.out.println();
		
		Shape circle = new Circle(new Point(1,1), new Point(2,2));
		System.out.println(circle);
		System.out.println("Perimetr of a circle is: " + circle.getPerimetr());
		System.out.println("Area of a circle is: " + circle.getArea());
	}
}
