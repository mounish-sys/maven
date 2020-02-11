interface pay{
	public void dopayment(double amount);
}
public class Payment{
	public static void main(String args[]) {
		pay p;
		p=new CreditCardPayment();
		p.dopayment(234.5);
		p=new DebitCardPayment();
		p.dopayment(333.7);
	}
}
class CreditCardPayment implements pay{
	public void dopayment(double amount){
	System.out.println("credit amount"+amount);
	}
	}
	class DebitCardPayment implements pay{
		public void dopayment(double amount){
		System.out.println("debit amount"+amount);
		}
}
	