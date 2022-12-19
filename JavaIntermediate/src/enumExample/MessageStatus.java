package enumExample;

public enum MessageStatus {
	SENT("Single tick"),
	DELIVERED("Double tick"),
	READ("Double blue tick"),
	DELETED("This message has been deleted");
		
	String description;
		
	private MessageStatus(String message) {
		description = message;
	}
	
	public String getMessage() {
		return description;
	}
	
}
