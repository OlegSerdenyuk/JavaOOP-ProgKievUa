package task2;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
	
	/*
	 * Напишите программу, которая примет на вход два текстовых файла, а вернет один. 
	 * Содержимым этого файла должны быть слова, которые одновременно есть и в первом и во втором файле.
	 */
	
	public static void main(String[] args) {
			File fileOne = new File("C:\\Users\\Snicks\\Desktop\\ProgKievUa JavaStart\\Eclipse\\JavaOOP\\HomeWork5\\fileOne.txt");
			File fileTwo = new File("C:\\Users\\\\Snicks\\Desktop\\ProgKievUa JavaStart\\Eclipse\\JavaOOP\\HomeWork5\\fileTwo.txt");
			File fileThree = new File("C:\\Users\\Snicks\\Desktop\\ProgKievUa JavaStart\\Eclipse\\JavaOOP\\HomeWork5\\fileThree.txt");
			String result = "";
			String text = FileOperation.readFromFile(fileOne);
			String[] textOne = text.split("( |\n)");
			text = FileOperation.readFromFile(fileTwo);
			String[] textTwo = text.split("( |\n)");
			for (int i = 0; i < textOne.length; i++) {
				for (int j = 0; j < textTwo.length; j++) {
					if (textTwo[j].compareToIgnoreCase(textOne[i]) == 0) {
						result += textOne[i] + System.lineSeparator();
						try (PrintWriter pw = new PrintWriter(fileThree)) {
							pw.println(result);
						} catch (IOException e) {
							System.out.println(e);
						}
					}
				}
			}

	}
}