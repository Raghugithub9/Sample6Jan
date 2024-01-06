package Day2;

public class ChildExample extends ParentExample{

	public static void main(String[] args) {
		
		ChildExample ce=new ChildExample();
		ce.sub();
		
		ce.add();

	}

public void sub() {
	System.out.println("child");
}

public void add() {
	System.out.println("child add");
}
	
}
