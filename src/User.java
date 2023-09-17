
public class User {
	
	private IPayment payment;
	
	public User(IPayment payment) {
		
		this.payment = payment;
		
	}
	
	public void pay() {
		
		payment.pay();
		
		System.out.println("payment succed");
		
	}

}
