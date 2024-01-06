package Day2;

import AccessModifiers.DefaultExample;
import AccessModifiers.ProtectedExample;

public class TestBanks extends HdfcBank{

	public static void main(String[] args) throws Throwable {
		
		TestBanks tb=new TestBanks();
		TestBanks tb1=new TestBanks();
		tb.loans();
		
		tb.credit();
		tb.savings();
		
		DefaultExample de=new DefaultExample();
		//de.defaultTest();
		
		ProtectedExample pe=new ProtectedExample();
		
		

	}

	@Override
	public void loans() {
	System.out.println("Loans");
		
	}

	
	public void credit() {
	System.out.println("Credit");
		
	}
	

	public void credit(int a) {
	System.out.println("Credit");
		
	}
	
	public void credit(int a,int b) {
		System.out.println("Credit");
			
		}

	

}
