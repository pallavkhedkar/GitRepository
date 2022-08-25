package Testjava;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import mainjava.LoginPage;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class PimTest extends BaseTest{

	@BeforeMethod
	public void login()
	{
		loginpage.loginMethod();
	}
	@Test(priority=3)
	public void verifyPimPage()
	{
		AssertJUnit.assertEquals(pimpage.titleofPimPage(), "PIM");
	}
}
