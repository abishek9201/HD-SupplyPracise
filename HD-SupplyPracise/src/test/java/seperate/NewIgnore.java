package seperate;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//@Ignore
//using ignore at class level
public class NewIgnore {
	@Test
	public void tet1() {
		System.out.println("test1");
	}
	@Test
	@Ignore
//using ignore at method level
	public void tet2() {
		System.out.println("test2");
	}
}
