package task1;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileOperation {
	private FileOperation() {

	}
	
	public static void copyFile(File in, File out) throws IOException {
		try (InputStream is = new FileInputStream(in);
				OutputStream os = new FileOutputStream(out)) {
					copyStream(is, os);
				} catch (IOException e) {
					throw e;
				}
	}

	public static void copyStream(InputStream in, OutputStream out) throws IOException {
		if (in == null || out == null) {
			throw new IllegalArgumentException("Wrong! Null value. Try again!");
		}
		byte[] buffer = new byte[10 * 1024 * 1024];
		int byteRead = 0;
		for(; (byteRead = in.read(buffer)) > 0 ;) {
			out.write(buffer, 0, byteRead);
		}
	}
}