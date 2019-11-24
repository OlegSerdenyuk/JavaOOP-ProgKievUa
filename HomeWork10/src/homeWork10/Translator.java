package homeWork10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class Translator {
	private Dictionary dictionary;

	public Translator() {
		super();
	}

	public Translator(Dictionary dictionary) {
		super();
		this.dictionary = dictionary;
	}

	public Dictionary getDictionary() {
		return dictionary;
	}

	public void setDictionary(Dictionary dictionary) {
		this.dictionary = dictionary;
	}
	
	public void translate (String fileAdressFrom, String fileAdressTo) throws FileNotFoundException, IOException {
		if (fileAdressFrom == null || fileAdressTo == null) {
			throw new IllegalArgumentException("Sorry there was an error!"); 
		}
		File fileFrom = new File(fileAdressFrom);
		if (!fileFrom.exists() || !fileFrom.isFile()) {
			throw new IllegalArgumentException("Sorry there was an error!");
		}
		File fileTo = new File(fileAdressTo);
		if (!fileTo.exists() || !fileTo.isFile()) {
			throw new IllegalArgumentException("Sorry there was an error!");
		}
		String text = "";
		try (BufferedReader br = new BufferedReader(new FileReader(fileFrom))) {
			for (String a = ""; (a = br.readLine()) != null; ) {
				text += a + "\n";
			}
		} catch (IOException e) {
			System.out.println("Sorry there was an error: " + e);
		}
		
		String[] textArr = text.split(",. {}[]()!?&+-/*@");
		String result = "";
		for (String s : textArr) {
			String translate = dictionary.getMap().get(s);
			if (translate != null) {
				result += translate + " ";
			} else {
				translate = dictionary.getMap().get(s.toLowerCase());
				if (translate != null) {
					result += translate.substring(0, 1).toUpperCase() + translate.substring(1) + " ";
				} else {
					result += s + " ";
				}
			}
		}
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileAdressTo))) {
			bw.write(result);
		} catch (IOException e) {
			System.out.println("Sorry there was an error: " + e);
		}
	}
}