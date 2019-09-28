package appModules;

import java.util.List;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.google.common.base.Verify;
import com.sun.xml.bind.v2.runtime.reflect.opt.Const;

import pageObjects.BaseClass;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;

public class Users_Action extends BaseClass {

	public Users_Action(WebDriver driver) {
		super(driver);
	}

	public static void setDisplayName(int iTestCaseRow) throws Exception {

		String usercellData = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Users_input);
		try {
			Utils.Editsetvalue(BaseClass.LOCA_USER_Displayname, usercellData);
			Log.info("data is passing into displayname field");
		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("data is not passing into displayname field");
			Log.error(e.getMessage());

		}

	}

	/*public static void role(int iTestCaseRow, String role1, String role2) throws Exception {

		String rolecellData = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Users_role1);
		String rolecellData1 = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Users_role2);
		try {
			WebElement check = driver.findElement(By.xpath("//label[text()='Quality Analyst']/../input"));
			Utils.click(driver, check);
			
			Utils.Editsetvalue(BaseClass.LOCA_USER_Displayname, rolecellData);
			Utils.Editsetvalue(BaseClass.LOCA_USER_Displayname, rolecellData1);
			
			
			Utils.click(driver, driver.findElement(By.xpath("//label[text()='"+role1+"']/../input")));
			Utils.click(driver, driver.findElement(By.xpath("//label[text()='"+role2+"']/../input")));
			
			// Utils.Editsetvalue(BaseClass.rol, rolecellData);
			Log.info("role is checked");
		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("role is not checked");
			Log.error(e.getMessage());

		}
	}*/
	public static void role(int iTestCaseRow) throws Exception {
		String rolecellData = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Users_role1);
		try {
			//Utils.Editsetvalue(BaseClass.LOCA_USER_Role, rolecellData);
			Log.info("data is passing into role field");
			Utils.click(driver, driver.findElement(By.xpath("//label[text()='"+rolecellData+"']/../input")));
			Thread.sleep(1000);
		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("data is not passing into role field");
			Log.error(e.getMessage());

		}

		
	}

	public static void setEmail(int iTestCaseRow) throws Exception {

		String emailcellData = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Users_Email);
		try {
			Utils.Editsetvalue(BaseClass.LOCA_Email, emailcellData);
			Log.info("data is passing into email field");
		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("data is not passing into email field");
			Log.error(e.getMessage());

		}

	}

	public static void setExternalID(int iTestCaseRow) throws Exception {
		String externalcellData = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Users_ExternalID);
		try {
			Utils.Editsetvalue(BaseClass.LOCA_ExternalID, externalcellData);
			Log.info("data is passing into externalid field");
		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("data is not passing into externalid field");
			Log.error(e.getMessage());

		}

	}

	public static void setUserName(int iTestCaseRow) throws Exception {
		String usercellData = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Users_UserName);
		try {
			Utils.Editsetvalue(BaseClass.LOCA_UserName, usercellData);
			Log.info("data is passing into username field");
		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("data is not passing into username field");
			Log.error(e.getMessage());

		}

	}

	public static void setPassword(int iTestCaseRow) throws Exception {
		String passwordcellData = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Users_Password);
		try {
			Utils.Editsetvalue(BaseClass.LOCA_Password, passwordcellData);
			Log.info("data is passing into password field");
		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("data is not passing into password field");
			Log.error(e.getMessage());

		}

	}

	public static void setConfirmPassword(int iTestCaseRow) throws Exception {
		String confirmpwcellData = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Users_ConfirmPassword);
		try {
			Utils.Editsetvalue(BaseClass.LOCA_ConfirmPassword, confirmpwcellData);
			Log.info("data is passing into confirmpassword field");
		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("data is not passing into confirmpassword field");
			Log.error(e.getMessage());

		}

	}
	
//-----------------------TC_004 & TC_006--------------------------
	public static void saveBtn() throws Exception {
		try {
			if (!Utils.getWebelement(BaseClass.LOCA_addUsers).getAttribute("class")
					.contains("col-md-offset-1 add-button tooltip-warning disabled")) {
				Utils.ClickEvn(BaseClass.LOCA_addUsers);
				System.out.println("clicked on add user button");
				Utils.waitForAjax(driver);

			} else {
				System.out.println("enetered invalid data");

			}
		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("data is not passing into displayname field");
			Log.error(e.getMessage());
		}

	}
	
	//-------------------TC_007--------------------------------
	public static void clk_User(String user) throws Exception {
		Utils.ClickEvn(BaseClass.LOCA_Users_DefaultRole);
		driver.findElement(By.xpath("//li[contains(text(),'"+user+"')]")).click();

		Thread.sleep(2000);
		// driver.findElement(By.xpath("//span[contains(.,'discard changes')]"));
		WebElement ele = driver.findElement(By.xpath("//span[contains(.,'discard changes')]"));
		if(ele.isDisplayed()) {
			Utils.ClickEvn(BaseClass.LOCA_users_discardchanges_btn);
			Utils.waitForAjax(driver);
		}
	}
	//----------------------TC_007--------------------------------
	public static void edit_User(String user) throws Exception {
		Actions action = new Actions(driver);
		List<WebElement> users = driver.findElements(By.xpath("//div[@class='col-md-12 card']/div/div/div/span"));
		
		int count = users.size();
		System.out.println("The no of users are:"+ count);
		for (WebElement ele : users) {

			String un = ele.getText();
			System.out.println(un);
			Reporter.log("User: "+un, true);
			if (un.equalsIgnoreCase(user)) {
				Reporter.log("Given User existed", true); //span[@class='mch-hostname'][contains(.,'Bus Qua Analyst')]
				WebElement userpath = driver.findElement(By.xpath("//span[@class='user-name-div mch-hostname'][contains(.,'"+user+"')"));
				//span[@class='user-name-div mch-hostname'][contains(.,'"+user+"')]
				action.moveToElement(userpath).build().perform();
				userpath.click();
				Utils.waitForAjax(driver);
			}		
				

		}	}
	public static boolean edit_Data(int iTestCaseRow) throws Exception {
						
		String usercellData = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Users_input);
		String useremail = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Users_Email);
		String externalID = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Users_ExternalID);
		String username = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Users_UserName);
		String passwordchk = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Users_Password);
		String confirmpassword = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Users_ConfirmPassword);
		
				try {
					
					Utils.ClickEvn(BaseClass.LOCA_users_discardchanges_btn);
					Utils.Editsetvalue(BaseClass.LOCA_USER_Displayname, usercellData);
					Thread.sleep(1000);
					Utils.Editsetvalue(BaseClass.LOCA_Email, useremail);
					Thread.sleep(1000);
					Utils.Editsetvalue(BaseClass.LOCA_ExternalID,externalID );
					Thread.sleep(1000);
					Utils.Editsetvalue(BaseClass.LOCA_UserName,username );
					Thread.sleep(1000);
					Utils.Editsetvalue(BaseClass.Loca_Password_txtbx,passwordchk );
					Thread.sleep(1000);
					Utils.Editsetvalue(BaseClass.LOCA_ConfirmPassword, confirmpassword);
					Thread.sleep(1000);
					Utils.ClickEvn(BaseClass.LOCA_users_updateuser_btn);
					Utils.waitForAjax(driver);

				} catch (Exception e) {
					Utils.Editsetvalue(BaseClass.LOCA_USER_Displayname, usercellData);
					Thread.sleep(1000);
					Utils.Editsetvalue(BaseClass.LOCA_Email, useremail);
					Thread.sleep(1000);
					Utils.Editsetvalue(BaseClass.LOCA_ExternalID,externalID );
					Thread.sleep(1000);
					Utils.Editsetvalue(BaseClass.LOCA_UserName,username );
					Thread.sleep(1000);
					Utils.Editsetvalue(BaseClass.Loca_Password_txtbx,passwordchk );
					Thread.sleep(1000);
					Utils.Editsetvalue(BaseClass.LOCA_ConfirmPassword, confirmpassword);
					Thread.sleep(1000);
					Utils.ClickEvn(BaseClass.LOCA_users_updateuser_btn);
					Utils.waitForAjax(driver);

				}
				return bResult;

		}
	

	
	public static void delete_user(String user) throws Exception {

		//Utils.getWebelements(BaseClass.LOCA_Users_getUserspath);
		//Thread.sleep(3000);
		Actions action = new Actions(driver);
		List<WebElement> users = driver.findElements(By.xpath("//span[@class='mch-hostname']"));
		int count = users.size();
		for (WebElement ele : users) {

			String un = ele.getText();
			Reporter.log("User: "+un, true);
			if (un.equalsIgnoreCase(user)) {
				Reporter.log("Given User existed", true);
				action.moveToElement(ele).build().perform();
				driver.findElement(By.xpath("//button[contains(@id,'del-button')]")).click();
				Thread.sleep(5000);
			}
		}
		List<WebElement> users2 = driver.findElements(By.xpath("//span[@class='mch-hostname']"));
		int count2 = users2.size();
		Assert.assertTrue("User not deleted", count2 < count);
		Reporter.log("User deleted", true);

		//Reporter.log("Exception: "+e.getMessage(), true);

	}
	
	public static void homeIcon_clk() throws Exception {

		Utils.ClickEvn(BaseClass.LOCA_users_homeicon);
		Thread.sleep(2000);
		System.out.println("home icon clicked");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertTrue("Not navigated to home screen ", title.equals("auMina - Admin Home"));



	}

	public static void navigation_scrn(int i) throws Exception{
		WebElement ele = driver.findElement(By.xpath("//div/div[@class='breadcrumb-bg flat']/a["+ i +"]"));
		ele.click();
		Thread.sleep(2000);
		Utils.ClickEvn(BaseClass.LOCA_users_discardchanges_btn);
		Utils.waitForAjax(driver);
	}
	
	public static void downloadFile(String downloadPath, String fileName) throws Exception {
		Utils.ClickEvn(BaseClass.LOCA_users_importagents_btn);
		Utils.waitForAjax(driver);
		Utils.ClickEvn(BaseClass.LOCA_users_downloadtemplate_btn);
		Thread.sleep(5000);
		Assert.assertTrue("File not downloaded", Utils.isFileDownloaded(downloadPath, fileName));
		Reporter.log("Template downloaded", true);
	}

	
	public static void uploadFile(String filePath) throws Exception {
		//WebElement objpath = driver.findElement(By.xpath("//input[contains(@id,'simpleUpload')]"));
		Utils.ClickEvn(BaseClass.LOCA_users_importagents_btn);
		WebElement browse = driver.findElement(By.xpath(BaseClass.LOCA_users_filebrowse_field));
		//Utils.javascriptClickElement(driver,browse);
		//Utils.uploadFileEvn(browseButton, filePath);
		//driver.findElement(By.xpath("//input[contains(@id,'simpleUpload')]")).click();
		Utils.uploadFile(driver, browse, filePath);
		Utils.ClickEvn(BaseClass.LOCA_users_uploadFile_btn);

		Thread.sleep(3000);

		Utils.waitForAjax(driver);

		WebElement validation = driver.findElement(By.xpath("//div[@class='row'][contains(.,'Success : 1')]"));
		String successtext = validation.getText();
		if(successtext.endsWith("1"))
		{
			System.out.println("upload file got success");
		}
		else
		{
			System.out.println("upload file got failure");
		}
		//	if(validation.)

	}

	

	// --------------- Tc_001 -------------------
	public static void navigate_add_user_nxtbtn() throws Exception {
		try {
			Utils.ClickEvn(BaseClass.LOCA_license_ok_btn);
			Thread.sleep(2000);
			// Utils.waitForAjax(driver);
			Utils.ClickEvn(BaseClass.LOCA_Setupentities);
			Thread.sleep(1000);
			// Utils.waitForAjax(driver);
			Utils.ClickEvn(BaseClass.LOCA_Reviewbtn);
			Utils.waitForAjax(driver);
			Utils.ClickEvn(BaseClass.LOCA_OrgName);
			Utils.waitForAjax(driver);
			Utils.ClickEvn(BaseClass.LOCA_defineorg_nextbtn);
			Utils.waitForAjax(driver);
			Utils.ClickEvn(BaseClass.LOCA_definecat_nextbtn);
			Utils.waitForAjax(driver);

		} catch (Exception e) {
			Utils.ClickEvn(BaseClass.LOCA_Setupentities);
			Thread.sleep(1000);
			// Utils.waitForAjax(driver);
			Utils.ClickEvn(BaseClass.LOCA_Reviewbtn);
			Utils.waitForAjax(driver);
			Utils.ClickEvn(BaseClass.LOCA_OrgName);
			Utils.waitForAjax(driver);
			Utils.ClickEvn(BaseClass.LOCA_defineorg_nextbtn);
			Utils.waitForAjax(driver);
			Utils.ClickEvn(BaseClass.LOCA_definecat_nextbtn);
			Utils.waitForAjax(driver);

		}

		String exptitle = "auMina - Users";
		String acttitle = driver.getTitle();
		System.out.println(acttitle);
		if (exptitle.equals(acttitle)) {
			System.out.println("naviagted to define users screen");
		} else {
			System.out.println("not navigated to define suers screen");
		}
	}

	// --------------TC_002-------------------
	public static void verify_Navigate_to_Add_user() throws Exception {

		try {
			Utils.ClickEvn(BaseClass.LOCA_license_ok_btn);
			Thread.sleep(2000);
			//Utils.waitForAjax(driver);
			Utils.ClickEvn(BaseClass.LOCA_Setupentities);
			Thread.sleep(1000);
			// Utils.waitForAjax(driver);
			Utils.ClickEvn(BaseClass.LOCA_Reviewbtn);
			Utils.waitForAjax(driver);
			Utils.ClickEvn(BaseClass.LOCA_OrgName);
			Utils.waitForAjax(driver);
			Utils.ClickEvn(BaseClass.LOCA_Defineuserbtn);
			Utils.waitForAjax(driver);
			Assert.assertTrue("Unable to navigate users page",
					Utils.getWebelement(BaseClass.LOCA_Userheader).isDisplayed());

		} catch (Exception e) {
			Utils.ClickEvn(BaseClass.LOCA_Setupentities);
			Thread.sleep(1000);
			//Utils.waitForAjax(driver);
			Utils.ClickEvn(BaseClass.LOCA_Reviewbtn);
			Thread.sleep(3000);
			//Utils.waitForAjax(driver);
			Utils.ClickEvn(BaseClass.LOCA_OrgName);
			Utils.waitForAjax(driver);
			Utils.ClickEvn(BaseClass.LOCA_Defineuserbtn);
			Utils.waitForAjax(driver);
			Assert.assertTrue("Unable to navigate users page",
					Utils.getWebelement(BaseClass.LOCA_Userheader).isDisplayed());

		}
	}

	public static void logout_User() throws Exception {
		try {
			Utils.ClickEvn(BaseClass.LOCA_Users_logoutdropdown);
			Thread.sleep(2000);
			Utils.ClickEvn(BaseClass.LOCA_Users_Logout);
			Thread.sleep(2000);
			Utils.ClickEvn(BaseClass.LOCA_users_discardchanges_btn);
			Thread.sleep(2000);
			String url = driver.getCurrentUrl();
			Thread.sleep(1000);
			if (url.equalsIgnoreCase("https://auminauat.uniphore.com:8068/AuminaUI_2_9_1_MIG_PreRelease/")) {
				System.out.println("navigated to login page after logout from users screen");
				Log.info("navigated to login page after logout from users screen");
			} else {
				System.out.println("navigated to login page after logout from users screen");
				Log.info(" Not navigated to login page after logout from users screen");

			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void displaynameval(int iTestCaseRow) throws Exception {

		SoftAssert a = new SoftAssert();
		// DisplayName
		// String usercellData = ExcelUtils.getCellData(iTestCaseRow,
		// Constant.Col_Users_DisplayName);
		String usercellData = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Users_input);
		 Utils.Editsetvalue(BaseClass.LOCA_USER_Displayname, usercellData);

		if (usercellData == null) {
			//Utils.ClickEvn(BaseClass.LOCA_USER_Displayname);
			String actEmailFieldErrorMessage1 = driver.findElement(By.xpath(BaseClass.LOCA_users_displayname_val)).getText();
			a.assertEquals(actEmailFieldErrorMessage1, ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ErrorMessage), "No error message displayed for empty email field");
			//Log.info("Error message displayed as Required for empty displayname field");
			System.out.println("Error message displayed as Required for empty displayname field");
		} else if (usercellData != null) {
			try {
				Utils.Editsetvalue(BaseClass.LOCA_USER_Displayname, usercellData);
				String actdispFieldErrorMessage = driver.findElement(By.xpath(BaseClass.LOCA_users_displayname_val1))
						.getText();
				a.assertEquals(actdispFieldErrorMessage, ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ErrorMessage),
						"No error message displayed for displayname field");
				Log.info("Error message displayed for displayname field");
			} catch (NoSuchElementException e) {
				try {
					Utils.Editsetvalue(BaseClass.LOCA_USER_Displayname, usercellData);
					String actdispFieldErrorMessage = driver
							.findElement(By.xpath(BaseClass.LOCA_users_displayname_limit)).getText();
					a.assertEquals(actdispFieldErrorMessage, "Display Name length should be a minimum of 3 characters",
							"No error message displayed for email field");
					Log.info("Error message displayed for displayname field");
				} catch (NoSuchElementException | AssertionError e1) {
					Log.info("No error message displayed for Display Name length should be a minimum of 3 characters");
				}
			} catch (AssertionError e) {
				Log.info("No error message displayed for display name with only characters and spaces");
			}
			a.assertAll();
		}
	}	
	
	public static void username_validation(int iTestCaseRow) throws Exception {
        
		SoftAssert a = new SoftAssert();
		String usercellData = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Users_UserName);
		try {
			Utils.Editsetvalue(BaseClass.LOCA_UserName, usercellData);
			String actuserFieldErrorMessage = driver.findElement(By.xpath(BaseClass.LOCA_users_usernameval)).getText();
			a.assertEquals(actuserFieldErrorMessage, Constant.Col_ErrorMessage);
			Log.info("Error message displayed for username field");

	}
		catch(Exception e)
		{
			Utils.Editsetvalue(BaseClass.LOCA_UserName, usercellData);
		    String actuserFieldErrorMessage = driver.findElement(By.xpath(BaseClass.LOCA_users_usernameval1)).getText();
		    a.assertEquals(actuserFieldErrorMessage, Constant.Col_ErrorMessage);
		    Log.info("Error message displayed for username field");
			
		}
			a. assertAll();
		}
	
public static void email_validation(int iTestCaseRow) throws Exception {
        
		SoftAssert a = new SoftAssert();
		String usercellData = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Users_Email);
		try {
			Utils.Editsetvalue(BaseClass.Loca_Emailid_txtbx, usercellData);
			String actuserFieldErrorMessage = driver.findElement(By.xpath(BaseClass.LOCA_users_email_val1)).getText();
			a.assertEquals(actuserFieldErrorMessage, Constant.Col_ErrorMessage,"No error message displayed for email field");
			Log.info("Error message displayed for email field");

	}
		catch(Exception e)
		{
			Utils.Editsetvalue(BaseClass.LOCA_UserName, usercellData);
		    String actuserFieldErrorMessage = driver.findElement(By.xpath(BaseClass.LOCA_users_email_val)).getText();
		    a.assertEquals(actuserFieldErrorMessage, Constant.Col_ErrorMessage,"No error message displayed for email field");
		    Log.info("Error message displayed for email field");
			
		}
			a. assertAll();
		}

public static void externalID_validation(int iTestCaseRow) throws Exception {
    
	SoftAssert a = new SoftAssert();
	String usercellData = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Users_ExternalID);
	try {
		Utils.Editsetvalue(BaseClass.LOCA_ExternalID, usercellData);
		String actuserFieldErrorMessage = driver.findElement(By.xpath(BaseClass.LOCA_users_externalIDval)).getText();
		a.assertEquals(actuserFieldErrorMessage, Constant.Col_ErrorMessage,"No error message displayed for externalid field");
		Log.info("Error message displayed for externalid field");

}
	catch(Exception e)
	{
		Utils.Editsetvalue(BaseClass.LOCA_UserName, usercellData);
	    String actuserFieldErrorMessage = driver.findElement(By.xpath(BaseClass.LOCA_users_externalIDval1)).getText();
	    a.assertEquals(actuserFieldErrorMessage, Constant.Col_ErrorMessage,"No error message displayed for external id field");
	    Log.info("Error message displayed for externalid field");
		
	}
		
	}

public static void password_validation1(int iTestCaseRow) throws Exception {
    
	SoftAssert a = new SoftAssert();
	String usercellData = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Users_Password);
	try {
		Utils.Editsetvalue(BaseClass.Loca_Password_txtbx, usercellData);
		String actuserFieldErrorMessage = driver.findElement(By.xpath(BaseClass.LOCA_users_passwordval)).getText();
		a.assertEquals(actuserFieldErrorMessage, Constant.Col_ErrorMessage,"No error message displayed for password field");
		Log.info("Error message displayed for password field");

}
	catch(Exception e)
	{
		Utils.Editsetvalue(BaseClass.Loca_Password_txtbx, usercellData);
	    String actuserFieldErrorMessage = driver.findElement(By.xpath(BaseClass.LOCA_users_passwordval1)).getText();
	    a.assertEquals(actuserFieldErrorMessage, Constant.Col_ErrorMessage,"No error message displayed for password field");
	    Log.info("Error message displayed for password field");
		
	}
		a. assertAll();
	}

public static void confirmpassword_validation1(int iTestCaseRow) throws Exception {
    
	SoftAssert a = new SoftAssert();
	String usercellData = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Users_ConfirmPassword);
	try {
		Utils.Editsetvalue(BaseClass.LOCA_ConfirmPassword, usercellData);
		String actuserFieldErrorMessage = driver.findElement(By.xpath(BaseClass.LOCA_users_confirmpassword_val)).getText();
		a.assertEquals(actuserFieldErrorMessage, Constant.Col_ErrorMessage,"No error message displayed for confirmpassword field");
		Log.info("Error message displayed for confirmpassword field");

}
	catch(Exception e)
	{
		Utils.Editsetvalue(BaseClass.LOCA_ConfirmPassword, usercellData);
	    String actuserFieldErrorMessage = driver.findElement(By.xpath(BaseClass.LOCA_users_confirmpassword_val1)).getText();
	    a.assertEquals(actuserFieldErrorMessage, Constant.Col_ErrorMessage);
	    Log.info("Error message displayed for reconfirm field");
		
	}
		a. assertAll();
	}


	
	
		
	
		
	//----------TC_003-------------
	public static void agentPopupVerify() throws Exception {
		Utils.ClickEvn(BaseClass.LOCA_users_importagents_btn);
		Thread.sleep(2000);
		if(Utils.getWebelement(BaseClass.import_agent_popup).isDisplayed())
		{
		
		Log.info("import agents popup displayed");
		}
		else
		{
			Log.info("import agents popup not displayed");
		}
	}
	
	//
	
	

}
