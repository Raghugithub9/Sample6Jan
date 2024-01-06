package Day2;

public class ConstructorExample {

	public ConstructorExample() {
		System.out.println("Constructor Example");
	}
	
	public ConstructorExample(int a) {
		System.out.println("Constructor Example");
		System.out.println(a);
	}
	
	public ConstructorExample(String a) {
		System.out.println("Constructor Example");
		System.out.println(a);
	}
	
	public static void main(String[] args) {
	
		ConstructorExample ce1=new ConstructorExample();
		ConstructorExample ce2=new ConstructorExample(1234);
		ConstructorExample ce3=new ConstructorExample();
		ConstructorExample ce4=new ConstructorExample("Java");
	
		
	}

}
