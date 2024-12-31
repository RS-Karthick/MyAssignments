package week3.day2;

public class Amazon extends CanaraBank {
	public static void main(String[] args) {
		Amazon az = new Amazon();
		az.cashOnDelivery();
		az.upiPayments();
		az.cardPayments();
		az.internetBanking();
		az.recordPaymentDetails();
	}

}
