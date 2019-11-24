package com.gmail.so;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class Task1 {
	
	/*
	 * Проверить доступность сайтов указанных в отдельном файле.
	 */
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		checkSiteAvailability("C:\\Users\\Snicks\\Desktop\\ProgKievUa JavaStart\\Eclipse\\JavaOOP\\HomeWork11\\1.txt");
	}
	
	public static void checkSiteAvailability(String file) throws FileNotFoundException, IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String s = "";
			if (s != null) {
				s = br.readLine();
				URL url = new URL(s);
				HttpURLConnection con = (HttpURLConnection) url.openConnection();
				System.out.println(s + " -> " + con.getResponseMessage());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
