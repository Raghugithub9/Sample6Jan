package Day2;

public class StaticNonStaticExample {

	int b=200;//non static global variable
	static int c=300;//static global variable
	
	public static void main(String[] args) {

		int a=100;//local variable
		

	}

public static void add() {
	//System.out.println(a);
	//System.out.println(b);
	System.out.println(c);
}

public void test() {
	//System.out.println(a);
	System.out.println(b);
	System.out.println(c);
}
	
	
}
