package inheritance;

public class ABDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		int result  = b.getA();
		
		System.out.println("result = " + result);
		
		B2 b2 = new B2();
		int result2 = b2.getA();
		
		System.out.println("result2 = " + result2);
	}

}
