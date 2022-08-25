package Testjava;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;

import mainjava.LoginPage;

public class LoginTest extends BaseTest {

	@Test(priority=2,groups={"smoke","regression"})
	public void verifyLogin()
	{
		loginpage.loginMethod();
		AssertJUnit.assertEquals(pimpage.titleofPimPage(), "PIM");
	}

}
