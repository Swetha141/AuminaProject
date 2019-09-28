package pageObjects;

import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.seleniumhq.jetty9.server.Authentication.User;
import org.testng.Assert;
import org.testng.Reporter;

import appModules.Users_Action;
import testCases.UsersTestCases;
import utility.Log;
import utility.Utils;

public class Users_Page extends BaseClass {
	
	public static String role1;
	public static String role2;
	
	public Users_Page(WebDriver driver)
	{
		super(driver);
	}
	
	public static void verify_Navigate_to_Add_user_page() throws Exception {
		Users_Action.verify_Navigate_to_Add_user();
	}
	
	public static boolean clkSave(int iTestCaseRow) throws Exception {
		try
		{
		Users_Action.setDisplayName(iTestCaseRow);
		Users_Action.role(iTestCaseRow);
		Users_Action.setEmail(iTestCaseRow);
		Users_Action.setExternalID(iTestCaseRow);
		Users_Action.setUserName(iTestCaseRow);
		Users_Action.setPassword(iTestCaseRow);
		Users_Action.setConfirmPassword(iTestCaseRow);
		Users_Action.saveBtn();
		}
		catch(Exception e) {
			Log.info("unable to clcik on save button");
			e.printStackTrace();
			
		}
		return bResult;
	}
	
	
	public static void edit_user() throws Exception {
		//Users_Action.verify_Navigate_to_Add_user();
		Users_Action.clk_User("Quality Analyst");
		Users_Action.edit_User("Swethatest");
	}
	public static void delete_user() throws Exception {
		Users_Action.verify_Navigate_to_Add_user();
		Users_Action.delete_user("Swethatest");
	}
	public static void homeclick() throws Exception {
		Users_Action.verify_Navigate_to_Add_user();
		Users_Action.homeIcon_clk();
		Users_Action.navigation_scrn(1);
		
	}
	public static void navigatescreen() throws Exception {
		Users_Action.verify_Navigate_to_Add_user();
		Users_Action.navigation_scrn(1);
		
	}
	public static void navigate_Usersscrn() throws Exception {
		Users_Action.verify_Navigate_to_Add_user();
		Users_Action.navigate_add_user_nxtbtn();
		
	}
	
	public static void fileupload() throws Exception {
		Users_Action.verify_Navigate_to_Add_user();
		Users_Action.uploadFile(System.getProperty("user.dir")+"\\Files\\Template.csv");
	}
	public static void filedownload() throws Exception {
		Users_Action.verify_Navigate_to_Add_user();
		Users_Action.downloadFile(Paths.get(System.getProperty("user.home"), "Downloads").toString(), "Template.csv");
		
	}
	 public static void negative_Scenario(int iTestCaseRow) throws Exception {
		 //Users_Action.displaynameval(iTestCaseRow);
		
		Users_Action.username_validation(iTestCaseRow);
		// Users_Action.email_validation(iTestCaseRow);
		 //Users_Action.email_validation(iTestCaseRow);
		 //Users_Action.password_validation1(iTestCaseRow);
		 //Users_Action.confirmpassword_validation1(iTestCaseRow);
	 }
	 public static void agentPopupVerify() throws Exception {
		 Users_Action.verify_Navigate_to_Add_user();
		 Users_Action.agentPopupVerify();
	 }
	 public static boolean edituser_data(int iTestCaseRow) throws Exception {
		// Users_Action.verify_Navigate_to_Add_user();
		 Users_Action.edit_User("Swethatest");
		 return Users_Action.edit_Data(iTestCaseRow);
		
	 }
	
	 public static void logout() throws Exception
	 {
		 Users_Action.logout_User();
	 }

	
	
}
