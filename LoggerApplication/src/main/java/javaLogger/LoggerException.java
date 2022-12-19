package javaLogger;

import java.io.FileReader;

public class LoggerException {
	int info;
	
	public void divideByZero() {
		System.out.println(10 / 0);
	}
	
	public void arrayBound() {
		int[] x = new int[5];
		System.out.println(x[6]);
	}
	
	public void fileNotFound() throws Exception {
		FileReader file = new FileReader("Iqra.txt");
	}

}
