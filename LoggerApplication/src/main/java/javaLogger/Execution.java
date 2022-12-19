package javaLogger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Execution {
	public static void main(String[] args) {

		LoggerException logObj = new LoggerException();
		
		Logger log = Logger.getLogger("");
		
		try {
			logObj.divideByZero();
		} catch (Exception e) {
			log.log(Level.WARNING,"Div by zero");
		}
		
		try {
			logObj.arrayBound();
		} catch (Exception e) {
			log.log(Level.INFO,"Array index out of bound");
		}
		
		try {
			logObj.fileNotFound();
		} catch (Exception e) {
			log.log(Level.SEVERE,"File not found");
		}

	}
}
