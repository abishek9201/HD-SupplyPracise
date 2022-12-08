package groupTest;

import org.testng.annotations.Test;

public class Test2 {
	@Test(groups = { "sanity", "regression" })
	public void t6() {
		System.out.println("t6 from Test2");
	}

	@Test(groups = { "regression", "retesting" })
	public void t7() {
		System.out.println("t7 from Test2");
	}

	@Test(groups = { "functional" })
	public void t8() {
		System.out.println("t8 from Test2");
	}

	@Test(groups = { "retesting" })
	public void t9() {
		System.out.println("t9 from Test2");
	}

}
