package annotationsExample;

public class Calculator {
	
	public static boolean findAverageMarks(int x, int y, int z) {
		if(((x + y + z) / 3 ) > 70) {
			return true;
		} else
			return false;
	}

}