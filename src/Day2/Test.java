package Day2;

import AccessModifiers.PrivateExample;

public class Test {

	public static void main(String[] args) {
	
//Call static fucntions
print();
Test.print();
Test.print();
Test.print();
Test.print();

PrivateExample pe1=new PrivateExample();
//pe1.add();

		Test t1=new Test();
		Test t2=new Test();
		
		
		t1.print();
		t2.add();
	
		//new Test(); - Object
		//t - object reference
		
	}
	
public static void print() {
	
	System.out.println("Printing a message");
}

public  void add() {
	
	System.out.println("add function");
}



	

}
