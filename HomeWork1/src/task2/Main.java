package task2;

public class Main {
	
	/*
	 * Описать класс «Triangle». В качестве свойств возьмите длины сторон треугольника. 
	 * Реализуйте метод, который будет возвращать площадь этого треугольника. 
	 * Создайте несколько объектов этого класса и протестируйте их.
	 */

	public static void main(String[] args) {
		Triangle tr = new Triangle(1.5, 2.0, 2.5);
		System.out.println("Area of triangle is: " + tr.areaTriangle() + ".");
		System.out.println(tr);
	}
}
