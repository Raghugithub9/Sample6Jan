package Day2;

public class FunctionswithReturnExample {

	public static void main(String[] args) {

		FunctionswithReturnExample fw=new FunctionswithReturnExample();
		int i=fw.add(100, 200);
		System.out.println(i);
		int j=fw.add(1000, 2000);
		System.out.println(j);
		int k=fw.add(1100, 2200);
		System.out.println(k);

	}
	
	public int add(int a,int b) {
		int c=a+b;
		return c;
	}

}
