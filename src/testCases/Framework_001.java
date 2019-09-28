package testCases;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.BaseClass;
import pageObjects.BusinessRulesHierarchy_Page;
import pageObjects.BusinessrulesGoal_Page;
import pageObjects.Home_Page;
import pageObjects.LogIn_Page;
import utility.Configuration;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;

public class Framework_001 {
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

		ExcelUtils.setExcelFile(Configuration.readProperty("Path_TestData") + Configuration.readProperty("File_TestData"), "BRHierarchy");
		 iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName,Constant.Col_TestCaseName);

		driver = Utils.OpenBrowser();

		new BaseClass(driver);

		LogIn_Page.CallSingn_Analyst_Action();

	}

	@Test
	public void main() throws Exception {

		try {
			
			Home_Page.label_CONFIGURE_BUSINESS_EVALUATORS();
			Home_Page.label_CONFIGURE_BUSINESS_EVALUATORS_Review();
			Thread.sleep(1200);
			
			for (int i = 1;i <= ExcelUtils.getRowUsed();i++) {
				
			
				
				BusinessrulesGoal_Page.MoveToBRScreen(i);
				Thread.sleep(1200);
				
				BusinessRulesHierarchy_Page.AddBusinessRuleHierarchy(i);
				
				if (BaseClass.bResult == true) {

					ExcelUtils.setCellData("Pass", i, Constant.Col_Result);

					Thread.sleep(1200);

				} else {

					throw new Exception("Test Case Failed because of Verification");
				}

				
			}

		}

		catch (Exception e) {

			ExcelUtils.setCellData("Fail", i, Constant.Col_Result2);
			Utils.takeScreenshot1();

			Log.error(e.getMessage());

			throw (e);
		}

	}

	@AfterMethod
	public void afterMethod() {

		Log.endTestCase(sTestCaseName);

		driver.close();
	}
}
