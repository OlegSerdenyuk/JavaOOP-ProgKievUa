package task2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileOperation {
	public static String readFromFile(File file) {
		String text = "";
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			for (; (text = br.readLine()) != null ;) {
				sb.append(text);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		return sb.toString();
	}
}
