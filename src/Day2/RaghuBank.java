package Day2;

public class RaghuBank implements Bank{

	public static void main(String[] args) {
		
		RaghuBank rb=new RaghuBank();
		rb.loans();
		rb.savings();
		rb.credit();
		rb.demat();
		
		Bank b=new RaghuBank();
		b.loans();
		b.savings();
		b.credit();
		//b.demat();
		
		
	}


	@Override
	public void loans() {
	System.out.println("Loans");
		
	}

	@Override
	public void credit() {
	System.out.println("Credit");	
	}


	@Override
	public void savings() {
	System.out.println("Savings");
		
	}
	
	public void demat() {
		System.out.println("Demat");
	}
	
	
	

}
