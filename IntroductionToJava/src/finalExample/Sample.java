package finalExample;

public class Sample {
	
	static final int big = 555; // Value can't be changed 
	
	final int x = 100; // Example one of declaration
	
	final int y; // Example two of declaration (constructor)
	
	public Sample() {
		this.y = 333;
	}
	public Sample(int temporary) {
		this.y = temporary;
	}
	public Sample(int a, int b) {
		a++;
		this.y = b;
	}

}
