package apacheLogger;

import java.io.FileReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Execution {
	public static void main(String[] args) {
		
		Logger LOGGER = LogManager.getLogger();
		
		LOGGER.info("This is information message");
		LOGGER.warn("This is warning message");
		LOGGER.fatal("This is fatal message");
		
		try {
			int z = 10 / 0;
			FileReader reader = new FileReader("Iqra.txt");
		} catch(Exception e) {
			LOGGER.error(e.getMessage());
			LOGGER.catching(e);
			LOGGER.debug(e.getMessage());
		}

	}
}
