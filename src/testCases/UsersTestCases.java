package testCases;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.server.Authentication.User;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.BaseClass;
import pageObjects.Home_Page;
import pageObjects.LogIn_Page;
import pageObjects.UsersPage;
import utility.Configuration;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;

public class UsersTestCases {
	private static final int colNum = 0;
	private static final String firstTimeOnly = null;
	public WebDriver driver;
	private String sTestCaseName;
	//public Properties prop ;

	
	@BeforeMethod
	public void beforeMethod() throws Exception {
		System.out.println("Enter Before");
		Log.startTestCase(sTestCaseName);
		/*driver = Utils.OpenBrowser(browsername);
		System.out.println("browser opened");
		new BaseClass(driver);
		System.out.println("driver declared");*/
		
		//prop = new Properties();
		//prop.getProperty("user.dir", "./src/testData/Users.xlsx");
		//ExcelUtils.setExcelFile("./src/testData/Users.xlsx", "Usersdata");
		ExcelUtils.setExcelFile(Configuration.readProperty("Path_TestData") + Configuration.readProperty("File_TestData"), "Usersdata");
		//LogIn_Page.Admin_user_login();
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

	@Test //1
	public void verify_Navigate_to_Add_user_page_Test() throws Exception {
		try {
			UsersPage.verify_Navigate_to_Add_user_page();
			Reporter.log("Users page navigated successfully", true);
			 WebElement add_click = driver.findElement(By.xpath("//i[contains(@class,'fa fa-plus')]"));
			 Utils.click(driver, add_click);
			 System.out.println("Enter required details");
			 Reporter.log("Enter details in required fields to add user", true);
			 Thread.sleep(3000);
			 
		} catch (Exception e) {
			//Utils.takeScreenshot1();
			Reporter.log(e.getMessage(),true);
		}
	}
		
	
	@Test //2
	public void verify_Add_User_Test() throws Exception {
		try
		{
			UsersPage.verify_Navigate_to_Add_user_page();
			//UsersPage.verify_Add_User("DisplayName", "Business Analyst", "userone@gmail.com","123456","usertest","Uni@12345","Uni@123456");
			
			 
				for (int i = 1; i <= ExcelUtils.getRowUsed(); i++) {
				//	for(int j=1; j<=i;j++) {

							if (UsersPage.verify_Add_User(ExcelUtils.getCellData(i, 1),
									ExcelUtils.getCellData(i, 2),
									ExcelUtils.getCellData(i, 3),
									ExcelUtils.getCellData(i, 4),ExcelUtils.getCellData(i, 5),
									ExcelUtils.getCellData(i, 6),ExcelUtils.getCellData(i, 7)))
								ExcelUtils.setCellData("PASS", i, 8);
							else
								ExcelUtils.setCellData("FAIL", i, 8);
						}
				
				

				 

	
			UsersPage.verify_Add_User(ExcelUtils.getCellData(1, 1),ExcelUtils.getCellData(1, 2) , 
					ExcelUtils.getCellData(1, 3),ExcelUtils.getCellData(1, 4),
					ExcelUtils.getCellData(1, 5),ExcelUtils.getCellData(1, 6),
					ExcelUtils.getCellData(1,7));
			
			UsersPage.verify_Add_User(ExcelUtils.getCellData(2, 1),ExcelUtils.getCellData(2, 2) , 
					ExcelUtils.getCellData(2, 3),ExcelUtils.getCellData(2, 4),
					ExcelUtils.getCellData(2, 5),ExcelUtils.getCellData(2, 6),
					ExcelUtils.getCellData(2,7));
			//Reporter.log("User added successfully", true);
			
		}
		catch(Exception e){
			Reporter.log(e.getMessage());
			
		}
	}
	
	@Test //3
	public void adduser_savechanges_btn_Test() throws Exception {
		UsersPage.verify_Navigate_to_Add_user_page();
		
		 
			for (int i = 1; i <= ExcelUtils.getRowUsed(); i++) {
			

						if (UsersPage.adduser_savechanges_btn(ExcelUtils.getCellData(i, 1),
								ExcelUtils.getCellData(i, 2),
								ExcelUtils.getCellData(i, 3),
								ExcelUtils.getCellData(i, 4),ExcelUtils.getCellData(i, 5),
								ExcelUtils.getCellData(i, 6),ExcelUtils.getCellData(i, 7)))
							ExcelUtils.setCellData("PASS", i, 8);
						else
							ExcelUtils.setCellData("FAIL", i, 8);
					}
			
			
		
	}
	
	@Test //4
	public void adduser_Discardchanges_btn() throws Exception {
		UsersPage.verify_Navigate_to_Add_user_page();
		
		 
		for (int i = 1; i <= ExcelUtils.getRowUsed(); i++) {
		

					if (UsersPage.adduser_Discardchanges_btn(ExcelUtils.getCellData(i, 1),
							ExcelUtils.getCellData(i, 2),
							ExcelUtils.getCellData(i, 3),
							ExcelUtils.getCellData(i, 4),ExcelUtils.getCellData(i, 5),
							ExcelUtils.getCellData(i, 6),ExcelUtils.getCellData(i, 7)))
						ExcelUtils.setCellData("PASS", i, 8);
					else
						ExcelUtils.setCellData("FAIL", i, 8);
				}
		
		
	}
		
	
	
		
	@Test
	public void clk_User_Test() throws Exception {
		UsersPage.verify_Navigate_to_Add_user_page();
		
		Utils.waitForAjax(driver);
		Thread.sleep(5000);
		UsersPage.clk_User("Quality Analyst");
		Thread.sleep(3000);
			
	}
	
	@Test //6
	public void delete_User_Test() throws Exception
	{
		UsersPage.verify_Navigate_to_Add_user_page();
		UsersPage.delete_user("efdsgds");
	}
	
	@Test //5
	public void edit_User_Test() throws Exception
	{
		UsersPage.verify_Navigate_to_Add_user_page();
		//for (int i = 1; i <= ExcelUtils.getRowUsed(); i++) {
		UsersPage.edit_User("modifieduser");
		
	}
	
	@Test //7
	public void Role_getElements_List_Test() throws Exception
	{
		UsersPage.verify_Navigate_to_Add_user_page();
		UsersPage.getElements_List();
		
		//Random r = new Random();
	   // int list= 	r.nextInt(UsersPage.getList());
		//UsersPage.delete_user("");
		
		UsersPage.clk_User("Reporting Analyst");
		Utils.waitForAjax(driver);
		System.out.println("users in reporting analyst are:");
		UsersPage.getElements_List();
		Utils.waitForAjax(driver);
		
		UsersPage.clk_User("Quality Analyst");
		Utils.waitForAjax(driver);
		System.out.println("users in quality analyst are:");
		UsersPage.getElements_List();
		Utils.waitForAjax(driver);
		
		
	}
	
	@Test //8
	public void homeIcon_clk_Test() throws Exception{
		
		UsersPage.verify_Navigate_to_Add_user_page();
		UsersPage.homeIcon_clk();
		
	}
	@Test //9
	public void navigation_scrn_Test() throws Exception{
		UsersPage.verify_Navigate_to_Add_user_page();
		UsersPage.navigation_scrn(2);
	}
	
	@Test //10
	public void downloadFile_Test() throws Exception {
		UsersPage.verify_Navigate_to_Add_user_page();
		//UsersPage.downloadFile("C:\\Users\\Banuswetha Mareddy\\Downloads", "Template.csv");
		UsersPage.downloadFile(Paths.get(System.getProperty("user.home"), "Downloads").toString(), "Template.csv");
	}
	
	@Test //11
	public void uploadFile_Test() throws Exception {
		UsersPage.verify_Navigate_to_Add_user_page();
		UsersPage.uploadFile(System.getProperty("user.dir")+"\\Files\\Template.csv");
	}
	
	@Test
	public void clk_defineusers_Test() throws Exception {
		UsersPage.clk_defineusers();
		
	}
	
	@Test //12
	public void clk_adduser_nulldata_Test() throws Exception {
		UsersPage.verify_Navigate_to_Add_user_page();
		UsersPage.clk_adduser_nulldata();

		UsersPage.clk_User("Reporting Analyst");
		Utils.waitForAjax(driver);
		UsersPage.clk_adduser_nulldata();
		
		UsersPage.clk_User("Quality Analyst");
		Utils.waitForAjax(driver);
		UsersPage.clk_adduser_nulldata();
	}
	
	@Test //13
	public void field_Validation_Test() throws Exception {
		UsersPage.verify_Navigate_to_Add_user_page();
	//	UsersPage.displaynameval("testtesttest");
		UsersPage.field_Validation("");
	}
	@Test
	public void edittestdynamic() throws Exception {
		UsersPage.verify_Navigate_to_Add_user_page();
		UsersPage.edit_User("UserOnetestest");
		Utils.waitForAjax(driver);
		Utils.Editsetvalue(BaseClass.LOCA_USER_Displayname, "Usereditset");
		Utils.waitForAjax(driver);
		UsersPage.edit_User("revathi");
		Utils.ClickEvn(BaseClass.LOCA_users_discardchanges_btn);
		Utils.waitForAjax(driver);
		
	}
	@AfterMethod
	public void afterMethod(ITestResult result) {
		System.out.println("after started");
		Log.endTestCase(sTestCaseName);
		//driver.close();
		if (ITestResult.FAILURE == result.getStatus()) {
		//	Utils.captureScreenShot(result.getName());
		}
		driver.quit();

	}
	

}
