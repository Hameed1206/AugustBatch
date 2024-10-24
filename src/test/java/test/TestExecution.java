package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.dockerjava.core.InvocationBuilder;

public class TestExecution {

	 
	 @BeforeMethod
		public void startUp() {
			System.out.println("StartUp Method");
		}
	@Test(alwaysRun = true)
	public void testOne() {  
		System.out.println("Welcome to TestNG 1");
	}
	@Test (priority = 2)
	public void testTwo() {   //login
		System.out.println("Welcome to TestNG 2");
	}
	@Test(groups = {"smoke","regression"})
	public void testThree() {
		System.out.println("Welcome to TestNG 3");
	}
	@Test(groups = "sanity")
	public void testSeven() {  
		System.out.println("Welcome to TestNG 7");
	}
	@Test
	public void testFive() {  
		System.out.println("Welcome to TestNG 5");
	}
	@AfterMethod
	public void tearDown() {
		System.out.println("Tear Down Method");
	}
	
	@BeforeClass
	public void MethodBeforeClass() {
		System.out.println("Before Class");
	}
	@AfterClass
	public void MethodAfterClass() {
		System.out.println("After Class");
	}
    
    
}
