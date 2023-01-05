package singletonDesignPattern;

public class Execution {
	public static void main(String[] args) {
		
		System.out.println(Sample.getObjectOfSample());
		
		Sample.getObjectOfSample().helloMethod(); 
	
		Sample.getObjectOfSample().hiMethod();

	}
}
