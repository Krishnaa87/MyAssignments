package week3.day2;

public class Amazon extends CanaraBank{

	

	

	@Override
	public void recordPaymentDetails() {
		// TODO Auto-generated method stub
		
		System.out.println("recordPaymentDetails");
		
		
		
	}
	
	public void cashOnDelivery()
	{
		System.out.println("cashOnDelivery");
	}
	

	
	
	public static void main(String[] args) {
		
		Amazon ref1 = new Amazon();
		
		
		ref1.cardPayments();
	
		ref1.recordPaymentDetails();
		ref1.upiPayments();
		ref1.internetBanking();
		
		ref1.cashOnDelivery();
		
	}
	
}
