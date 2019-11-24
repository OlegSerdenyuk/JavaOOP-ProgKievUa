package homeWork10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
	
	/*
	 * 1. Написать программу - переводчик, которая будет переводить текст в файле English.in, 
	 * написанный на английском языке, на украинский язык, согласно заранее составленному словарю.
	 * Результат сохранить в файл Ukrainian.out. 
	 * 2. Сделать ф-ю ручного наполнения словаря и возможность его сохранения на диск.
	 */
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		File f = new File("translator");
		f.mkdir();
		File ef = new File("translator/English.in");
		File uf = new File("translator/Ukrainian.out");
		File df = new File("translator/dictionary");
		try {
			ef.createNewFile();
			uf.createNewFile();
			df.createNewFile();
		} catch (IOException e) {
			System.out.println("Sorry there was an error: " + e);
		}
		
		String text = "Hello Java World! ! !";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(ef))) {
				bw.write(text);
		} catch (IOException e) {
			System.out.println("Sorry there was an error: " + e);
		}
		System.out.println(text);
		
		Dictionary d = new Dictionary();
		d.addWord("hello", "привіт");
		d.addWord("world", "світ");
		d.saveDictionary("translator/dictionary");
		
		Dictionary d2 = Dictionary.loadDictionary("translator/dictionary");
		System.out.println(d2);
		
		Translator tr = new Translator(d2);
		tr.translate("translator/English.in", "translator/Ukrainian.out");
		String result = "";
		try (BufferedReader br = new BufferedReader(new FileReader("translator/Ukrainian.out"))) {
			for (String a = ""; (a = br.readLine()) != null; ) {
				result += a;
			}
		} catch (IOException e) {
			System.out.println("Sorry there was an error: " + e);
		}
		System.out.println(result);
	}
}
