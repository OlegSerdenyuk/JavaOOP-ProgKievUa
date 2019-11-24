package homeWork10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class Dictionary {
	private HashMap<String, String> map = new HashMap<>();

	public Dictionary() {
		super();
	}

	public HashMap<String, String> getMap() {
		return map;
	}

	public void setMap(HashMap<String, String> map) {
		this.map = map;
	}
	
	public void addWord(String ew, String uw) {
		
	}
	
	public void addWord() {
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			try {
				System.out.println("Input a word in English and press 'Enter': ");
				String ew = rd.readLine();
				System.out.println("Input the translation of the word into Ukrainian and press 'Enter': ");
				String uw = rd.readLine();
				map.put(ew.toLowerCase(), uw.toLowerCase());
				System.out.println("Do you want to enter another word? (yes/no): ");
				String result = rd.readLine();
					if (!result.equals("yes")) {
						break;
					}
			} catch (IOException e) {
				System.out.println("Sorry there was an error: " + e);
			}
		}
	}
	
	public void saveDictionary(String s) throws FileNotFoundException, IOException {
		if (s == null) {
			throw new IllegalArgumentException("Sorry there was an error!");
		}
		File f = new File(s);
		if (!f.exists() || f.isFile()) {
			throw new IllegalArgumentException("Sorry there was an error!");
		}
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(f))) {
			os.writeObject(this);
		} catch (IOException e) {
			System.out.println("Sorry there was an error: " + e);
		}
	}
	
	public static Dictionary loadDictionary(String s) throws ClassNotFoundException {
		if (s == null) {
			throw new IllegalArgumentException("Sorry there was an error!");
		}
		File f = new File(s);
		if (!f.exists() || f.isFile()) {
			throw new IllegalArgumentException("Sorry there was an error!");
		}
		Dictionary result = new Dictionary();
		try (ObjectInputStream is = new ObjectInputStream(new FileInputStream(f))) {
			result = (Dictionary)is.readObject();
		} catch (IOException e) {
			System.out.println("Sorry there was an error: " + e);
		}
		return result;
	}

	@Override
	public String toString() {
		return "Dictionary [map=" + map + ", getMap()=" + getMap() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
