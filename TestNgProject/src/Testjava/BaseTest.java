package Testjava;

import java.util.concurrent.TimeUnit;

import mainjava.LoginPage;
import mainjava.PimPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

	
	public static WebDriver driver;
	protected LoginPage loginpage;
	protected PimPage pimpage;
	@BeforeClass
	public void launchBrowser()
	{
		  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();

		driver.get("http://opensource-demo.orangehrmlive.com/");
	   driver.manage().window().maximize();
	   //driver.manage().timeouts().getPageLoadTimeout();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   System.out.println("window maximized");
	}
	   
	   @BeforeClass
	   public void pageObjects()
	   {
		   loginpage=new LoginPage(driver);
		   pimpage=new PimPage(driver);
	   }
	   
	   @AfterClass
	   
	   public void tearDownEnvirnment()
	   {
		   driver.quit();
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}
	
	


