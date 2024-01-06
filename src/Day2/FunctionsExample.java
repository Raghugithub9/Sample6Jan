package Day2;

public class FunctionsExample {

	public static void main(String[] args) {
		
		
		FunctionsExample fe=new FunctionsExample();
		fe.print();
		fe.add();
		fe.add();
		fe.add();
		fe.add();
		fe.addition(123, 234);
		fe.addition(101,200);
		fe.addition(102,200);
		fe.addition(103,200);
		
		fe.addition(100,200);
		
		fe.add("new", 123);

	}
	
	public void print() {
		System.out.println("Print");
	}
	
	public void add() {
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println("Value of c is "+c);
	}
	
	public void addition(int i,int j) {
		System.out.println(i+j);
	}
	
	public void add(int a) {
		System.out.println();
	}
	public void add(String b) {
		System.out.println();
	}
	public void add(String b, int c) {
		System.out.println();
	}
	
}
