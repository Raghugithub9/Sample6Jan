package Test;

public class LoopsExamples {

	public static void main(String[] args) {

		//For Loop
for(int i=0;i<10;i++) {//increment operator i++ = i+1
	System.out.println("This is Java class "+i);
}

System.out.println("*******************************");

for(int i=5;i>0;i--) {//decrement operator i-- = i-1
	System.out.println("This is Java class "+i);
}

System.out.println("###################################");
//Nested For loop

for(int a=0;a<5;a++) {//a=0,1,2,3
	System.out.println("This is  class "+a);
	for(int b=0;b<3;b++) {//b=0,1,2 - 0,1,2 - 0,1,2
		System.out.println("This is Java class "+b);
	}
}



	}

}
