package calculator;

public class Execution {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		int add = cal.add(10,5);
		System.out.println(add);
		
		int subtract = cal.subtract(10,5);
		System.out.println(subtract);
		
		int divide = cal.divide(10,5);
		System.out.println(divide);
		
		int multiply = cal.multiply(10,5);
		System.out.println(multiply);

	}
}