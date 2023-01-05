package fileInputOutput;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {
	public static void main(String[] args) {

		try {
			Reader read = new FileReader("D:\\Iqra.txt");
			int data = read.read();
			
			while (data != -1) {
				System.out.print((char)data);
				data = read.read();
			}
			/* Loops through all the characters until it reaches 
			 * end of file
			 * */
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
