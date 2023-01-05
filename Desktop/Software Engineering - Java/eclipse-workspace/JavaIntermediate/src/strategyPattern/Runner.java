package strategyPattern;

public class Runner {
	public static void main(String[] args) {
		
		StrategySwapper context = new StrategySwapper();
		
		context.setStrategy(new BluetoothStrategy());
		context.connect("Iqra's phone");
		
		context.setStrategy(new AuxStrategy());
		context.connect("Ibrahim's phone");
		
		context.setStrategy(new HdmiStrategy());
		context.connect("Hamza's phone");
		
	}
}
