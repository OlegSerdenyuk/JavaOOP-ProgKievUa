package task1;

public class Main {
	
	/*
	 * ������� ����� �Cat� (� �������� ������� ����� ����� ��������� �������). 
	 * �������� ��� ���������� � ��������. ������� ��������� ����������� �������� ����� ������. 
	 * ������������ ��� �������.
	 */

	public static void main(String[] args) {
		Cat cat = new Cat("Vaska", "Sphinx", "Grey", 3, 5.5);
		System.out.println("My cat is name " + cat.getName() + "." + "\n" + "This breed is " + cat.getBreed() + "." + "\n" + "Color is " + cat.getColor() + "." + "\n" + "His age - " + cat.getAge() + " years old." + "\n" + "And his weight - " + cat.getWeight() + " kilograms.");
	}
}
