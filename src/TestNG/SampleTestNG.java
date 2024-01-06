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

public class SampleTestNG {

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
@Test(groups = {"Sanity", "Regression"}, enabled=true, description = "This is my Sanity Test")
public void TC1() {
	System.out.println("Testcase3");

}

@Test(groups= "Regression")
public void TC2() {
	System.out.println("newtest2");
}

@Test(groups="Sanity")
public void TC3() {
	System.out.println("newtest1");
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
