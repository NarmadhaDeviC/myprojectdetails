package testNgMethods;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Basic {
	//should not use main method in TestNg
@Test
public void launch() {
	Reporter.log("testNG installed",true);
}
}
