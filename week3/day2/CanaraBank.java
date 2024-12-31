package week3.day2;

public abstract class CanaraBank implements Payments {

	@Override
	public void cashOnDelivery() {
		System.out.println("Cash on Delivery");
		
	}

	@Override
	public void upiPayments() {
	System.out.println("UPI payments");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("card payment");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("Net banking");
		
	}
	
public void recordPaymentDetails() {
	System.out.println("Record payment details");
}
}
