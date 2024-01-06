package Test;

public class ConcatCondiExample {

	public static void main(String[] args) {

int a=10;
int b=20;
int c=30;

String st="Java";

System.out.println("This is Java");
System.out.println(a);

System.out.println(a+b);

System.out.print(a+b+st);

System.out.print(st+a+b);


//10,8 and 8,10
if(a>b) {
	System.out.println("a is Greater");
}else {
	System.out.println("b is greater");
}

//10,8,7 - 7,8,10 - 7,10,8
if(a>b & a>c) {
	System.out.println("a is greatest "+a);
}else if(b>c) {
	System.out.println("b is greatest "+b);
}else {
	System.out.println("c is greatest "+c);
}



		
		
		
	}

}
