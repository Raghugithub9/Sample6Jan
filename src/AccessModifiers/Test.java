package AccessModifiers;

public class Test {

	public static void main(String[] args) {
		PrivateExample pe=new PrivateExample();
		//pe.add();

		DefaultExample de=new DefaultExample();
		de.defaultTest();
		
		ProtectedExample pe1=new ProtectedExample();
		pe1.print();
		
	}

}
