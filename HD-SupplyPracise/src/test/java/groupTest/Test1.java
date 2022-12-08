package groupTest;

import org.testng.annotations.Test;

public class Test1 {
	@Test(groups = { "sanity", "regression" })
	public void t1() {
		System.out.println("t1 from Test1");
	}

	@Test(groups = { "regression" })
	public void t3() {
		System.out.println("t3 from Test1");
	}

	@Test(groups = { "functional" })
	public void t4() {
		System.out.println("t4 from Test1");
	}

	@Test(groups = { "sanity", "regression", "functional" })
	public void t5() {
		System.out.println("t5 from Test1");
	}
}
