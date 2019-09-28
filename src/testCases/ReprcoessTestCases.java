package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.BaseClass;
import pageObjects.LogIn_Page;
import pageObjects.ReprocessPage;
import pageObjects.UsersPage;
import utility.Log;
import utility.Utils;

public class ReprcoessTestCases   {
	private static final int colNum = 0;
	private static final String firstTimeOnly = null;
	public WebDriver driver;
	private String sTestCaseName;

	
	@BeforeMethod
	
	public void beforeMethod() throws Exception {
		System.out.println("Enter Before");
		Log.startTestCase(sTestCaseName);

}
	
	//@Parameters("browsername")
	@Test
	public void verify_home_page_title_and_setup_entities_module_Test() throws Exception {
		try {
			driver = Utils.OpenBrowser();
			
			new BaseClass(driver);
			System.out.println("driver declared");
			LogIn_Page.Admin_user_login();
			String title = UsersPage.verify_home_page_title_and_setup_entities_module();
			Assert.assertEquals(title, "auMina - Admin Home", "Title not matched");
			Reporter.log("Home page displayed and setup entities module displayed", true);
		} catch (Exception e) {
			//Utils.takeScreenshot1();
			Reporter.log(e.getMessage(),true);
		}
	}
	
	@Test
	public void verify_reprocessnavigation_Test() throws Exception {
		//Reprocess_Page.verify_reprocessnavigation();
		System.out.println("browser opened");
	}
	
}