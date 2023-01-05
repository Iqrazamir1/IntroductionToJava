package unit;

public class Calculator {
	
	public static int findBig(int x, int y) {
		if(x > y)
			return x;
		else
			return y;
	}
	
	public static int findSmall(int x, int y) {
		if(x > y)
			return x;
		else
			return y;
	}
	
	public static int findBiggest(int x, int y, int z) {
		if(x > y && x > z)
			return x;
		else if(y > x && y > z)
			return y;
		else
			return z;
	}
	
	// Finding the largest number in an array 
	public static int findMax(int[] array) {
		int max = 0;
		for(int i = 0; i < array.length; i++) {
			if(max < array[i])
				max = array[i];
		}
		return max;
	}
	
}
