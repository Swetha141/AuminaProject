package testCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import appModules.Users_Action;
import pageObjects.BaseClass;
import pageObjects.LogIn_Page;
import pageObjects.Users_Page;
import utility.Configuration;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;

public class UsersPage_TC {

	public WebDriver driver;
	private String sTestCaseName;
	public int iTestCaseRow;
	public int i;
	
	@BeforeMethod
	public void beforeMethod() throws Exception {
		

		DOMConfigurator.configure("log4j.xml");

		sTestCaseName = this.toString();

		sTestCaseName = Utils.getTestCaseName(this.toString());

		Log.startTestCase(sTestCaseName);

		ExcelUtils.setExcelFile(Configuration.readProperty("Path_TestData") + Configuration.readProperty("File_TestData"), "users_data");
		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_TestCaseName);

		driver = Utils.OpenBrowser();

		new BaseClass(driver);

		//LogIn_Page.CallSingn_Analyst_Action();
		LogIn_Page.Admin_user_login();

	}
	
	@Test
	public void main() throws Exception {
		
		try
		{
		Users_Page.verify_Navigate_to_Add_user_page();
		
		for (int i = 1;i <= ExcelUtils.getRowUsed();i++) {
			
			if(Users_Page.clkSave(i))
			{
//			Users_Page.clkSave(i);
			//BusinessrulesGoal_Page.MoveToBRScreen(i);
			Thread.sleep(1200);
			
		//	BusinessRulesHierarchy_Page.AddBusinessRuleHierarchy(i);
			
		if (BaseClass.bResult == true) {

				ExcelUtils.setCellData("Pass", i, Constant.Col_Users_TESTSTATUS);
                                                                   
				Thread.sleep(1200);

			} else {
			//	ExcelUtils.setCellData("Fail", i, Constant.Col_FailResult);

				throw new Exception("Test Case Failed because of Verification");
			}

			
		}

	}
		}
	catch (Exception e) {

		//ExcelUtils.setCellData("Fail", i, Constant.Col_FailResult);
		//Utils.takeScreenshot1();

		Log.error(e.getMessage());

		throw (e);
	}
		//Users_Page.logout();

	}
	
				
	@Test
    public void edit_main() throws Exception {
		
		try
		{
		Users_Page.verify_Navigate_to_Add_user_page();
		Users_Page.edit_user();
		
		for (int i = 1;i <= ExcelUtils.getRowUsed();i++) {
			
			if(Users_Page.edituser_data(i))
			{
//			Users_Page.clkSave(i);
			//BusinessrulesGoal_Page.MoveToBRScreen(i);
			Thread.sleep(1200);
			
		//	BusinessRulesHierarchy_Page.AddBusinessRuleHierarchy(i);
			
		if (BaseClass.bResult == true) {

				ExcelUtils.setCellData("Pass", i, Constant.Col_Users_TESTSTATUS);
                                                                   
				Thread.sleep(1200);

			} else {
			//	ExcelUtils.setCellData("Fail", i, Constant.Col_FailResult);

				throw new Exception("Test Case Failed because of Verification");
			}

			
		}

	}
		}
	catch (Exception e) {

		//ExcelUtils.setCellData("Fail", i, Constant.Col_FailResult);
		//Utils.takeScreenshot1();

		Log.error(e.getMessage());

		throw (e);
	}
		//Users_Page.logout();

	}
	
	@Test
	public static void users_Functions() throws Exception {
		Users_Page.delete_user();
		Users_Page.homeclick();
		Users_Page.navigate_Usersscrn();
		Users_Page.navigatescreen();
		Users_Page.agentPopupVerify();
	}
	@Test
	public static void file_Function() throws Exception {
		Users_Page.filedownload();
		Users_Page.fileupload();
	}

		
		

	
	
	
	
	/*@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	*/
	}	


	



