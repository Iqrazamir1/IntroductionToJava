package enumExample;

public class Execution {
	public static void main(String[] args) {
		
		Colours myColor = Colours.RED;
		System.out.println(myColor);
		
		MessageStatus myMessage = MessageStatus.DELETED;
		System.out.println(myMessage.getMessage());
		
		OrderStatus myStatus = OrderStatus.DELIVERED;
		System.out.println(myStatus.getStatus());

	}
}
