package lambdaExpression;

public class Execution {
	public static void main(String[] args) {
		
		/* Example of anonymous class 
		 * */
		
		Greeting greet = new Greeting() {
			
			public void greet() {
				System.out.println("Hello world");
			}
			
			public void welcome() {
				System.out.println("Welcome");
			}
			
			public void goodbye() {
				System.out.println("Goodbye");
			}
			
			public void bye() {
				System.out.println("Bye");
			}
		};
		
		greet.greet();
		greet.welcome();
		greet.goodbye();
		greet.bye();
		
		/* Lambda Expression
		 * 
		 * 1. Lambda with argument and no return type (GreetingWithName)
		 * 2. Lambda with argument and with return type (GreetingWithReturn)
		 * */
		
		GreetingWithName greetWithName = (x) -> {System.out.println("Hello " + x);};
		greetWithName.greet("Iqra");
		
		GreetingWithReturn greetWithReturn = (x) -> { return "Hello " + x;};
		System.out.println(greetWithReturn.greet("Hanan"));
		
	}
}
