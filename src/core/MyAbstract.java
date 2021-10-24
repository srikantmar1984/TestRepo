package core;

public class MyAbstract implements MyInterface {
	public void lic() {
		System.out.println("You should buy LIC");
	}
	
	public void Gi() {
		System.out.println("You should buy GI");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAbstract obj = new MyAbstract();
		Bank s = new Finance();
		s.pl();
		s.hl();
		obj.lic();
		obj.Gi();
	}

}

abstract class Bank{
	abstract void pl();
	
	abstract void hl();
}
class Finance extends Bank {
	void pl(){
		System.out.println("You can get Personal Loan");
	}
	void hl(){
		System.out.println("You can get Home Loan");
	}
}