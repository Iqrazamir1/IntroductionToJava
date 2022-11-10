package methodOverLoading;

public class Sample {
	/* Method over-loading is when you have more than one method with the same 
	 * name but differ in the following:
	 * 
	 * 1. Number of arguments
	 * 2. Data of arguments
	 * 3. Order of arguments
	 */
	
	public void sum(int x, int y) {} // Number of arguments
	public void sum(float x, float y) {}
	public void sum(int x, float y) {} // Data of arguments
	public void sum(float x, int y) {}
	public void sum(double x, double y, double z) {} // Order of arguments
	public void sum(int x, int y, int z) {}
	
}
