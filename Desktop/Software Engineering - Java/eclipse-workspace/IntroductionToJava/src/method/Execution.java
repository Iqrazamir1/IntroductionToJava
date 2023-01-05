package method;

public class Execution {
	public static void main(String[] args) {
		
		Television tele = new Television();
		
		tele.brand = "Samsung";
		tele.price = 1200;
		tele.screenSize = 55;
		tele.turnOn();

		int channel = tele.switchToChannel();
		System.out.println(channel); // This is the first way of printing
		
		System.out.println(tele.switchToChannel()); // This is the second way of printing
		
		double discount = tele.getDiscount();
		System.out.println(discount); // Output is fixed discount
		
		double blackFriday = tele.discountOnBlackFriday(30);
		System.out.println(blackFriday); // Output is inputting discount
		
		double totelDisocunt = tele.discountWithCityBank(30, 25);
		System.out.println(totelDisocunt); 
		
	}
}
