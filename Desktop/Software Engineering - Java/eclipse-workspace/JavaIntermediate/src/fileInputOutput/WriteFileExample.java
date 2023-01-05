package fileInputOutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteFileExample {
	public static void main(String[] args) {
		
		try {
			Writer write = new FileWriter("D:\\Iqra.txt");
			String content = "Welcome to the world of Java, I will take you through your coding journey!";
			write.write(content);
			write.close();
			System.out.println("File written successfully");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
