package seperate;

import org.testng.annotations.Test;

public class TestNGDependencies {

	//DependsOnMethods 
	@Test(dependsOnMethods = {"Test2"})
	public void Test1() {
		System.out.println("I am inside test1");
	}
	@Test(dependsOnMethods = {"Test3"})
	public void Test2() {
		System.out.println("I am inside test2");
	}
	@Test()
	public void Test3() {
		System.out.println("I am inside test3");
	}
	@Test(dependsOnMethods = {"Test2"})
	public void Test4() {
		System.out.println("I am inside test4");
	}
	
	
	/*
	//DependsOnGroups
	@Test(dependsOnGroups ={"res.*"})
	public void Test1() {
		System.out.println("I am inside test1");
	}
	@Test(dependsOnGroups ={"res.*"})
	public void Test2() {
		System.out.println("I am inside test2");
	}
	@Test(groups ={"res1"})
	public void Test3() {
		System.out.println("I am inside test3");
	}
	@Test(groups ={"res2"})
	public void Test4() {
		System.out.println("I am inside test4");
	}
	*/
	
	
}
