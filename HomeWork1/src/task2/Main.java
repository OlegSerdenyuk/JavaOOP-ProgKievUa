package task2;

public class Main {
	
	/*
	 * ������� ����� �Triangle�. � �������� ������� �������� ����� ������ ������������. 
	 * ���������� �����, ������� ����� ���������� ������� ����� ������������. 
	 * �������� ��������� �������� ����� ������ � ������������� ��.
	 */

	public static void main(String[] args) {
		Triangle tr = new Triangle(1.5, 2.0, 2.5);
		System.out.println("Area of triangle is: " + tr.areaTriangle() + ".");
		System.out.println(tr);
	}
}
