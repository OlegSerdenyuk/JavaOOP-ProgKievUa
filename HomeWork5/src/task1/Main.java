package task1;

import java.io.File;
import java.io.IOException;

public class Main {
	
	/*
	 * �������� ���������, ������� ��������� ����� � ������� ������������ ����������� 
	 * (��������, ������ doc) �� �������� ��������� � ������� ��������.
	 */

	public static void main(String[] args) {
		File in = new File("C:\\Users\\Snicks\\Desktop\\ProgKievUa JavaStart\\Eclipse\\JavaOOP\\HomeWork5\\1.txt");
		File out = new File("copy_2.doc");
		try {
			FileOperation.copyFile(in, out);
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
