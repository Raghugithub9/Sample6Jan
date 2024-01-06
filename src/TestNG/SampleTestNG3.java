package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNG3 {

private static final boolean False = false;
private static final String[] testcase3 = null;
/*
@BeforeSuite
	@BeforeTest
		@BeforeClass
			@BeforeMethod
				TC1  @Test
			@AfterMethod
			@BeforeMethod
				TC2  @Test
			@AfterMethod
			@BeforeMethod
				TC3  @Test
			@AfterMethod
		@AfterClass
	@AfterTest
@AfterSuite
*/
	
@Test(enabled=false)
public void testcase4() {
	System.out.println("Testcase4");
}


@Test(description="This is my Test Case1 Method")
public void testcase1() {
	System.out.println("Testcase1");
}
@Test(dependsOnMethods="testcase3")
public void testcase2() {
	System.out.println("Testcase2");
}
@Test()
public void testcase3() {
	System.out.println("Testcase3");
int a[]=new int[2];
a[0]=10;
a[1]=11;
a[2]=12;
a[3]=13;
a[4]=14;
a[5]=15;
	System.out.println(a[5]);
}

@AfterMethod
public void testaftermethod() {
	System.out.println("AfterMethod");
}

@BeforeMethod
public void testbeforemethod() {
	System.out.println("BeforeMethod");
}
@AfterSuite
public void testaftersuite() {
	System.out.println("AfterSuite");
}

@BeforeSuite
public void testbeforesuite() {
	System.out.println("BeforeSuite");
}	
	

@BeforeTest
public void testbeforetest() {
	System.out.println("BeforeTest");
}
@BeforeClass
public void testbeforeclass() {
	System.out.println("BeforeClass");
}
@AfterTest
public void testaftertest() {
	System.out.println("AfterTest");
}
@AfterClass
public void testafterclass() {
	System.out.println("AfterClass");
}


}
