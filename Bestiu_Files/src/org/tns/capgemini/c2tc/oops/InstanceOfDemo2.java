package org.tns.capgemini.c2tc.oops;

class PaymentMethod{
	void makePayment(){
		System.out.println("Processing Payment");	
	}
}
class Creditcard extends PaymentMethod{
	void swipecard() {
		System.out.println("Swiping credit card");
	}
}
class Paypal extends PaymentMethod{
	void logintopaypal() {
		System.out.println("Logging into Paypal");
	}
}
public class InstanceOfDemo2 {

	public static void main(String[] args) {
		PaymentMethod payment=new PaymentMethod();
		payment=new Paypal();
		if(payment instanceof Creditcard) {
			Creditcard cc=(Creditcard) payment;
			cc.swipecard();
		}
		else if(payment instanceof Paypal) {
			Paypal cc=(Paypal) payment;
			cc.logintopaypal();
		}
	}
}