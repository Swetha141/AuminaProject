package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.asserts.SoftAssert;

import utility.Utils;

public class UsersPage extends BaseClass {
	private static WebElement element = null;

	public static  List<String> elements = new ArrayList();


	public UsersPage(WebDriver driver) {
		super(driver);
	}

	public static String verify_home_page_title_and_setup_entities_module() {
		String title = null;
		try {
			title = driver.getTitle();
			Assert.assertTrue("Setup entities module NOT exist", Utils.getWebelement(BaseClass.LOCA_Setupentities).isDisplayed());
			Assert.assertTrue(Utils.getWebelement(BaseClass.LOCA_Setupentities).isDisplayed());
			Reporter.log("Setup module exist", true);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return title;
	}

	public static void verify_Navigate_to_Add_user_page() throws Exception {
		
		try
		{
			Utils.ClickEvn(BaseClass.LOCA_license_ok_btn);
			Utils.waitForAjax(driver);
							Utils.ClickEvn(BaseClass.LOCA_Setupentities);
							Utils.waitForAjax(driver);
			    			Utils.ClickEvn(BaseClass.LOCA_Reviewbtn);
			    			Utils.waitForAjax(driver);
			    			Utils.ClickEvn(BaseClass.LOCA_OrgName);
			    			Utils.waitForAjax(driver);
			    			Utils.ClickEvn(BaseClass.LOCA_Defineuserbtn);
			    			Utils.waitForAjax(driver);
			    			Assert.assertTrue("Unable to navigate users page", Utils.getWebelement(BaseClass.LOCA_Userheader).isDisplayed());

			                			
			            }
		catch(Exception e)
		{
			Utils.ClickEvn(BaseClass.LOCA_Setupentities);
			Utils.waitForAjax(driver);
			Utils.ClickEvn(BaseClass.LOCA_Reviewbtn);
			Utils.waitForAjax(driver);
			Utils.ClickEvn(BaseClass.LOCA_OrgName);
			Utils.waitForAjax(driver);
			Utils.ClickEvn(BaseClass.LOCA_Defineuserbtn);
			Utils.waitForAjax(driver);
			Assert.assertTrue("Unable to navigate users page", Utils.getWebelement(BaseClass.LOCA_Userheader).isDisplayed());

            			
		}	}
			        
				
		//Utils.ClickEvn(BaseClass.LOCA_homepage_license_popup);
	//	Utils.waitForAjax(driver);
		
	
		



	public static boolean verify_Add_User(String DisplayName, String role,
			String Email, String ExternalID, String UserName, String Password, String ConfirmPassword) throws Exception{

		Utils.Editsetvalue(BaseClass.LOCA_USER_Displayname, DisplayName);
		//UsersPage.displaynameval(DisplayName);

		Utils.TABEvent(BaseClass.LOCA_USER_Displayname);
		Utils.waitForAjax(driver);
		WebElement check = driver.findElement(By.xpath("//label[text()='"+role+"']/../input"));
		Utils.click(driver, check);
		Utils.waitForAjax(driver);
		Utils.Editsetvalue(BaseClass.LOCA_Email, Email);
		Thread.sleep(1000);
		Utils.Editsetvalue(BaseClass.LOCA_ExternalID, ExternalID);
		Thread.sleep(1000);
		Utils.Editsetvalue(BaseClass.LOCA_UserName, UserName);
		Thread.sleep(1000);
		Utils.Editsetvalue(BaseClass.LOCA_Password, Password);
		Thread.sleep(1000);
		Utils.Editsetvalue(BaseClass.LOCA_ConfirmPassword, ConfirmPassword);
		Thread.sleep(1000);
		//Utils.ClickEvn(BaseClass.LOCA_addUsers);
		//Utils.waitForAjax(driver);

		if(!Utils.getWebelement(BaseClass.LOCA_addUsers).getAttribute("class").
				contains("col-md-offset-1 add-button tooltip-warning disabled")) {
			Utils.ClickEvn(BaseClass.LOCA_addUsers);
			System.out.println("clicked on add user button");
			Utils.waitForAjax(driver);

			return true;
		}	
		else {
			System.out.println("enetered invalid data");
			return false;
		}

		//Thread.sleep(5000);


		//			WebElement successmsg_add = driver.findElement(By.xpath(BaseClass.LOCA_successpopup_msg));
		//			System.out.println("the success message for add user is:" + successmsg_add.getText());

		//Assert.assertTrue("user not added",  Utils.getWebelement(BaseClass.LOCA_successpopup_msg).isDisplayed());
		//WebElement msg=driver.findElement(By.xpath(BaseClass.LOCA_successpopup_msg));

		//System.out.println(msg.getText());
		/* String text=msg.getText();
        String expectedText = "User Added Successfully!";
        Assert.assertEquals(text,expectedText);
		return true;*/

	}
	
	public static boolean adduser_savechanges_btn(String DisplayName, String role,
			String Email, String ExternalID, String UserName, String Password, String ConfirmPassword) throws Exception{

		Utils.Editsetvalue(BaseClass.LOCA_USER_Displayname, DisplayName);
		//UsersPage.displaynameval(DisplayName);

		Utils.TABEvent(BaseClass.LOCA_USER_Displayname);
		displaynameval(DisplayName);
		Utils.waitForAjax(driver);
		WebElement check = driver.findElement(By.xpath("//label[text()='"+role+"']/../input"));
		Utils.click(driver, check);
		Utils.waitForAjax(driver);
		Utils.Editsetvalue(BaseClass.LOCA_Email, Email);
		//emailValidation(Email);
		Utils.waitForAjax(driver);
		Utils.Editsetvalue(BaseClass.LOCA_ExternalID, ExternalID);
		Utils.waitForAjax(driver);
		Utils.Editsetvalue(BaseClass.LOCA_UserName, UserName);
		Utils.waitForAjax(driver);
		//userName_Validation(UserName);
		Utils.Editsetvalue(BaseClass.LOCA_Password, Password);
		Utils.waitForAjax(driver);
	//	Password_Validation(Password);
		Utils.Editsetvalue(BaseClass.LOCA_ConfirmPassword, ConfirmPassword);
		Utils.waitForAjax(driver);
		//confirmPassword_Validation(ConfirmPassword);
		//Utils.ClickEvn(BaseClass.LOCA_addUsers);
		//Utils.waitForAjax(driver);

		if(!Utils.getWebelement(BaseClass.LOCA_addUsers).getAttribute("class").
				contains("col-md-offset-1 add-button tooltip-warning disabled")) {
			Utils.ClickEvn(BaseClass.LOCA_users_homeicon);
			Utils.waitForAjax(driver);
			Utils.ClickEvn(BaseClass.LOCA_users_savechanges_btn);
			Assert.assertTrue("user not added", BaseClass.LOCA_successpopup_msg.equals("//span[contains(.,'User Added Successfully!')]"));
			Utils.waitForAjax(driver);
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertTrue("Not clicks on save chages btn , not navigated to home screen ", title.equals("auMina - Admin Home"));
					
			
			return true;
		}	
		else {
			System.out.println("enetered invalid data");
			return false;
		}
	}	
	
	public static boolean adduser_Discardchanges_btn(String DisplayName, String role,
			String Email, String ExternalID, String UserName, String Password, String ConfirmPassword) throws Exception{

		Utils.Editsetvalue(BaseClass.LOCA_USER_Displayname, DisplayName);
		//UsersPage.displaynameval(DisplayName);

		Utils.TABEvent(BaseClass.LOCA_USER_Displayname);
		
		Utils.waitForAjax(driver);
		WebElement check = driver.findElement(By.xpath("//label[text()='"+role+"']/../input"));
		Utils.click(driver, check);
		Utils.waitForAjax(driver);
		Utils.Editsetvalue(BaseClass.LOCA_Email, Email);
		
		Utils.waitForAjax(driver);
		Utils.Editsetvalue(BaseClass.LOCA_ExternalID, ExternalID);
		Utils.waitForAjax(driver);
		Utils.Editsetvalue(BaseClass.LOCA_UserName, UserName);
		Utils.waitForAjax(driver);
		
		Utils.Editsetvalue(BaseClass.LOCA_Password, Password);
		Utils.waitForAjax(driver);
	
		Utils.Editsetvalue(BaseClass.LOCA_ConfirmPassword, ConfirmPassword);
		Utils.waitForAjax(driver);
		
		//Utils.ClickEvn(BaseClass.LOCA_addUsers);
		//Utils.waitForAjax(driver);

		if(!Utils.getWebelement(BaseClass.LOCA_addUsers).getAttribute("class").
				contains("col-md-offset-1 add-button tooltip-warning disabled")) {
			Utils.ClickEvn(BaseClass.LOCA_users_homeicon);
			Utils.waitForAjax(driver);
			Utils.ClickEvn(BaseClass.LOCA_users_discardchanges_btn);
			Reporter.log("not clicked on discard changes button", true);
			
			Utils.waitForAjax(driver);
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertTrue("Not navigated to home screen afterclicks on discard changes button ", title.equals("auMina - Admin Home"));
					
			
			return true;
		}	
		else {
			System.out.println("enetered invalid data in any of mandatory field in user screen");
			return false;
		}
	}	
	
	public static void clk_adduser_nulldata() throws Exception {
		Utils.ClickEvn(BaseClass.LOCA_addUsers);
		Utils.waitForAjax(driver);
	}
	
	/*public static boolean field_Validation(String DisplayName, String Email, String UserName, String Password, String ConfirmPassword) throws Exception {
		displaynameval(DisplayName);
		emailValidation(Email);
		userName_Validation(UserName);
		Password_Validation(Password);
		confirmPassword_Validation(ConfirmPassword);
		return true;
	}*/

	public static void displaynameval(String DisplayName) throws Exception {
		Utils.Editsetvalue(BaseClass.LOCA_USER_Displayname, DisplayName);
		
		if(BaseClass.LOCA_users_displayname_val.contentEquals("Can contain only letters and spaces")||
				BaseClass.LOCA_users_displayname_val1.contentEquals("Required"))
		{
			System.out.println("Either entered invalid data in displayname field or didnt enter data");

		}
		
	
	}
	
	public static void field_Validation(String Email) throws Exception {
		SoftAssert a = new SoftAssert();
		// Email
		Utils.Editsetvalue(BaseClass.LOCA_Email, Email);
		try
		{
		String actEmailFieldErrorMessage = driver.findElement(By.xpath(BaseClass.LOCA_users_email_val)).getText();
		a.assertEquals(actEmailFieldErrorMessage, "Enter a valid email address.", "No error message displayed for email field");
		Reporter.log("Error message displayed for email field", true);
		}
		catch(Exception e) {
		String actEmailFieldErrorMessage1 = driver.findElement(By.xpath(BaseClass.LOCA_users_email_val1)).getText();
		a.assertEquals(actEmailFieldErrorMessage1, "Required", "No error message displayed for email field");
		Reporter.log("Error message displayed as Required for email field", true);
		}
		
		// DisplayName
		
		
		
		
		//
		
		
		//
		
		
		
		
		a.assertAll();
	}
	public static boolean userName_Validation(String UserName) throws Exception {
		Utils.Editsetvalue(BaseClass.LOCA_UserName, UserName);
		String expmsg = "User Name length should be a minimum of 3 characters."
				+ "It accepts only alphanumeric and underscore and"
				+ " should start and end with only alphabets.Double underscore is not allowed.";
		String expmsg1 = "Required";
		if(expmsg.contentEquals("User Name length should be a minimum of 3 characters.It accepts"
				+ " only alphanumeric and underscore and should start "
				+ "and end with only alphabets.Double underscore is not allowed.")||expmsg1.contentEquals("Required"))
		{
			System.out.println("Either entered invalid data in username field or didnot entered username");

		}
		
		return true;
	}
	public static boolean Password_Validation(String Password) throws Exception {
		Utils.Editsetvalue(BaseClass.LOCA_Password, Password);
		String expmsg = "Password length should be a minimum of 8 characters.It must contain alphanumeric characters "
				+ "and at least one uppercase letter,one lowercase letter,one "
				+ "number and one special character.Space is not allowed.";
		String expmsg1 = "Required";
		if(expmsg.contentEquals("Password length should be a minimum of 8 characters.It must contain alphanumeric characters "
				+ "and at least one uppercase letter,one lowercase letter,"
				+ "one number and one special character.Space is not allowed.")||expmsg1.contentEquals("Required"))
		{
			System.out.println("Either entered invalid data in password field or didnot entered password");

		}
		
		return true;
	}
	
	public static boolean confirmPassword_Validation(String ConfirmPassword) throws Exception {
		Utils.Editsetvalue(BaseClass.LOCA_Password, ConfirmPassword);
		String expmsg = "Confirm Password and Password do not match.";
		
		if(expmsg.contentEquals("Confirm Password and Password do not match."))
		{
			System.out.println("Confirm Password and Password do not match.");

		}
		
		return true;
	}




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

	public static void edit_Userone(String user) throws Exception
	{
		Actions action = new Actions(driver);
		List<WebElement> users = driver.findElements(By.xpath("//span[@class='mch-hostname']"));
		int count = users.size();
		for (WebElement ele : users) {

			String un = ele.getText();
			Reporter.log("User: "+un, true);
			if (un.equalsIgnoreCase(user)) {
				Reporter.log("Given User existed", true); //span[@class='mch-hostname'][contains(.,'Bus Qua Analyst')]
				WebElement userpath = driver.findElement(By.xpath("//span[@class='mch-hostname'][contains(.,'"+user+"')]"));
				action.moveToElement(userpath).build().perform();
				userpath.click();
				//driver.findElement(By.xpath("//button[contains(@id,'del-button')]")).click();
				Thread.sleep(5000);
			}
			//Utils.Editsetvalue(BaseClass.LOCA_USER_Displayname, DisplayName);
			//UsersPage.displaynameval(DisplayName);
			WebElement editele = driver.findElement(By.xpath("//input[contains(@id,'displayName')]"));
			editele.clear();
			editele.sendKeys("modifieduser");

			Utils.TABEvent(BaseClass.LOCA_USER_Displayname);
			Utils.waitForAjax(driver);
			/*WebElement check = driver.findElement(By.xpath("//label[text()='"+role+"']/../input"));
			Utils.click(driver, check);
			Utils.waitForAjax(driver);
			Utils.Editsetvalue(BaseClass.LOCA_Email, Email);
			Thread.sleep(1000);
			Utils.Editsetvalue(BaseClass.LOCA_ExternalID, ExternalID);
			Thread.sleep(1000);
			Utils.Editsetvalue(BaseClass.LOCA_UserName, UserName);
			Thread.sleep(1000);
			Utils.Editsetvalue(BaseClass.LOCA_Password, Password);
			Thread.sleep(1000);
			Utils.Editsetvalue(BaseClass.LOCA_ConfirmPassword, ConfirmPassword);
			Thread.sleep(1000);
			//Utils.ClickEvn(BaseClass.LOCA_addUsers);
			//Utils.waitForAjax(driver);

			if(!Utils.getWebelement(BaseClass.LOCA_addUsers).getAttribute("class").
					contains("col-md-offset-1 add-button tooltip-warning disabled")) {
				Utils.ClickEvn(BaseClass.LOCA_addUsers);
				System.out.println("clicked on add user button");
				Utils.waitForAjax(driver);

				return true;
			}	
			else {
				System.out.println("enetered invalid data");
				return false;
			}
		}
		return true;
			 */		

			//WebElement userpath = driver.findElement(By.xpath("(//span[contains(@class,'mch-hostname')])["+i+"]"));

			/*action.moveToElement(userpath).perform();
		userpath.click();
		Thread.sleep(3000);
			 */	
		}
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


	public static void getElements_List() throws Exception {

		Utils.getWebelements("//div/div/div[@class='btn-demo scrollBarCustom']/div[1]");

		int i =1;
		try
		{
			while(true)
			{
				WebElement elelist = driver.findElement(By.xpath("//div/div/div[@class='btn-demo scrollBarCustom']/div["+i+"]"));

				System.out.println(elelist.getText());

				//elements.add(elelist.getText());

				i++;
			}
		}
		catch(Exception e)
		{
			System.out.println("elements not found" + e.getMessage());
			// System.out.println("size = "+elements.size());
		}

	}
	public static int getList() throws Exception {

		return elements.size();


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

	public static void edit_User(String user) throws Exception {
		Actions action = new Actions(driver);
		List<WebElement> users = driver.findElements(By.xpath("//span[@class='mch-hostname']"));
		int count = users.size();
		for (WebElement ele : users) {

			String un = ele.getText();
			Reporter.log("User: "+un, true);
			if (un.equalsIgnoreCase(user)) {
				Reporter.log("Given User existed", true); //span[@class='mch-hostname'][contains(.,'Bus Qua Analyst')]
				WebElement userpath = driver.findElement(By.xpath("//span[@class='user-name-div mch-hostname'][contains(.,'"+user+"')"));
				//span[@class='user-name-div mch-hostname'][contains(.,'"+user+"')]
				action.moveToElement(userpath).build().perform();
				userpath.click();
				Utils.waitForAjax(driver);
				
				try {
					Utils.ClickEvn(BaseClass.LOCA_users_discardchanges_btn);
					Utils.Editsetvalue(BaseClass.LOCA_USER_Displayname, "UserOnetestest");
					Utils.Editsetvalue(BaseClass.LOCA_Password, "Uni@12345");
					Thread.sleep(1000);
					Utils.Editsetvalue(BaseClass.LOCA_ConfirmPassword, "Uni@12345");
					Thread.sleep(1000);
					Utils.ClickEvn(BaseClass.LOCA_users_updateuser_btn);
					Utils.waitForAjax(driver);

				} catch (Exception e) {
					Utils.Editsetvalue(BaseClass.LOCA_USER_Displayname, "UserOnetestest");
					Utils.Editsetvalue(BaseClass.LOCA_Password, "Uni@12345");
					Thread.sleep(1000);
					Utils.Editsetvalue(BaseClass.LOCA_ConfirmPassword, "Uni@12345");
					Thread.sleep(1000);
					Utils.ClickEvn(BaseClass.LOCA_users_updateuser_btn);
					Utils.waitForAjax(driver);

				}

			}
			
			else {
				System.out.println("User not found");
			}

			





			/*WebElement ele1 = driver.findElement(By.xpath("//span[contains(.,'discard changes')]"));
			if(ele1.isDisplayed()) {
				Utils.ClickEvn(BaseClass.LOCA_users_discardchanges_btn);
				// Utils.waitForAjax(driver);

				WebElement editele = driver.findElement(By.xpath("//input[contains(@id,'displayName')]"));
				editele.clear();
				editele.sendKeys("modifieduser");

				Utils.TABEvent(BaseClass.LOCA_USER_Displayname);
				Utils.waitForAjax(driver);
*/			}
		}
	//navigating to users c sreen by clicks on next button from category screen
	public static void clk_defineusers() throws Exception {
		Utils.ClickEvn(BaseClass.LOCA_Setupentities);
		Utils.waitForAjax(driver);
		Utils.ClickEvn(BaseClass.LOCA_Reviewbtn);
		Utils.waitForAjax(driver);
		Utils.ClickEvn(BaseClass.LOCA_OrgName);
		Utils.waitForAjax(driver);
		Utils.ClickEvn(BaseClass.LOCA_revieworg_nxtbtn);
		Utils.waitForAjax(driver);
		//String cat_title = driver.get
		Assert.assertTrue("Unable to navigate category page", Utils.getWebelement(BaseClass.LOCA_definecat).isDisplayed());
		
		//Assert.ass
		
		if(//!Utils.getWebelement(BaseClass.LOCA_defineusers_disable).getAttribute("class").contains("tab-disabled")) 
				!Utils.getWebelement(BaseClass.LOCA_disable_nxt_btn).getAttribute("class").contains("btn btn-primary pull-left show-popup disabled"))
		{
			Utils.ClickEvn(BaseClass.LOCA_catscrn_next_btn);
			//Utils.ClickEvn(BaseClass.LOCA_Defineuserbtn);
			Utils.waitForAjax(driver);
			Reporter.log("navigated to define users screen by clicks on define users button",true);
			/*if() {
				
			}*/
		}		else
		{
			System.out.println("No category available, create category to navigate to users screen");
		}
		}
		
		
		/*if(Utils.getWebelement(BaseClass.LOCA_defineusers_disable).getAttribute("class").contains("tab-disabled")) {
			Utils.ClickEvn(BaseClass.LOCA_catscrn_next_btn);
			Utils.waitForAjax(driver);
			
			if(Utils.getWebelement(BaseClass.LOCA_defineusers_disable).getAttribute("class").contains("tab-disabled") && Utils.getWebelement(BaseClass.LOCA_disable_nxt_btn).isDisplayed()) {
				Reporter.log("No category available in ategory page, add category", true);
			}
		
				
		else
		{
			Utils.ClickEvn(BaseClass.LOCA_Defineuserbtn);
			Utils.waitForAjax(driver);
			Reporter.log("Navigated to users page by clicks on define users option", true);
		}
		*/
	

	
	
	//a[@class='scoreName'][contains(.,'Define Score')];
	
	}







