package testCases;



import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.BaseClass;
import pageObjects.BusinessRulesConfig_page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;

public class Framework_002 {
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

		//ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "BR");
		// iTestCaseRow =
		// ExcelUtils.getRowContains(sTestCaseName,Constant.Col_TestCaseName);

		driver = Utils.OpenBrowser();

		new BaseClass(driver);

		//Utils.login();

	}

	@Test
	public void main() throws Exception {

		try {

			for (int i = 2;i <= ExcelUtils.getRowUsed();i++) {

				
				BusinessRulesConfig_page.AddBusinessRuleConfig(i);

				if (BaseClass.bResult == true) {

					ExcelUtils.setCellData("Pass", i, Constant.Col_Result2);

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
