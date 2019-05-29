package day44_encapsulation;

public class WhatsApp {

	
	private String toNumber;
	private String message;
	private boolean delivered;
	
	
	public WhatsApp() {
		
		System.out.println("No-Args constructor");
	}
	
	public WhatsApp(String toNumber, String message) {
		this();// this have to be always up;
		System.out.println("2 Args constructors");
		this.toNumber=toNumber;
		this.message=message;
		
	}
	
	public WhatsApp(String toNumber) {
		this(toNumber,"[]");
		System.out.println("1 arg constructor");
		
		}

	@Override
	public String toString() {
		return "WhatsApp [toNumber=" + toNumber + ", message=" + message + ", delivered=" + delivered + "]";
	}

	/**
	 * @return the toNumber
	 */
	public String getToNumber() {
		return toNumber;
	}

	/**
	 * @param toNumber the toNumber to set
	 */
	public void setToNumber(String toNumber) {
		this.toNumber = toNumber;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the delivered
	 */
	public boolean isDelivered() {
		return delivered;
	}

	/**
	 * @param delivered the delivered to set
	 */
	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}
	
	
}
