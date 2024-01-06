package Test;

public class TwoDimensionalExample {

	public static void main(String[] args) {
			//rows columns
int c[][]=new int[2][3];

c[0][0]=100;
c[0][1]=200;
c[0][2]=300;

c[1][0]=500;
c[1][1]=600;
c[1][2]=700;

System.out.println(c[0][2]);

System.out.println(c[1][1]);

System.out.println("####################");

for(int a=0;a<2;a++) {//a=0,1,2,3
	
	for(int b=0;b<3;b++) {//b=0,1,2 - 0,1,2 - 0,1,2
		System.out.print(c[a][b]+" ");
	}
	System.out.println();
}

	}

}
