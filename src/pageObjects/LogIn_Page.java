package pageObjects;
        import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import appModules.SignIn_Analyst_Action;
import utility.Configuration;
import utility.Log;
import utility.Utils;
        
    public class LogIn_Page extends BaseClass {
                      
        public LogIn_Page(WebDriver driver){
            	super(driver);
        }     
        
        public static  void CallSingn_Analyst_Action() throws Exception
    	{
    		try {
    					
				SignIn_Analyst_Action.txtUserName();
				SignIn_Analyst_Action.txtPassword();
				SignIn_Analyst_Action.btnLogin();
				Thread.sleep(3000);
				Reporter.log("SignIn Action is successfully perfomred");
				Utils.takeScreenshot1();
			
				//SignIn_Action.LicensePopup();
			    
			    
			} catch (Exception e) {
			
				 Utils.takeScreenshot1();
				 Log.error(e.getMessage());
				 Reporter.log("SignIn Action is not perfomred");
				
			}
    		
    	     
    	}
        
        
        public static  void CallSingn_Admin_Action() throws Exception
    	{
    		try {
    					
				SignIn_Analyst_Action.txtUserName();
				SignIn_Analyst_Action.txtPassword();
				SignIn_Analyst_Action.btnLogin();
				Thread.sleep(3000);
				Reporter.log("SignIn Action is successfully perfomred", true);
				Utils.takeScreenshot1();
			
				//SignIn_Action.LicensePopup();
			    
			    
			} catch (Exception e) {
			
				 Utils.takeScreenshot1();
				 Log.error(e.getMessage());
				 Reporter.log("SignIn Action is not perfomred");
				
			}
    		
    	     
    	}
        
        public static void Admin_user_login() throws Exception {
        	
        	
        	
        	String sUserName = Configuration.readProperty("AdminUsername");
		 	System.out.println(sUserName);
		 	String sPassword = Configuration.readProperty("AdminPassword");
			System.out.println(sPassword);
        	
        	try {
				Utils.Editsetvalue(BaseClass.Loca_Emailid_txtbx,sUserName);
				Utils.Editsetvalue(BaseClass.Loca_Password_txtbx,sPassword);
				Thread.sleep(1000);
				
				Utils.ClickEvn(BaseClass.Loca_Login_btn);
				Utils.waitForAjax(driver);
				Utils.ClickEvn(BaseClass.Loca_sessionkill_btn);
				Utils.waitForAjax(driver);
				
				
			//	WebElement ele = driver.findElement(By.xpath("//div[@class='modal-content']/div[3]/button[1]"));
				/*Alert alert = driver.switchTo().alert();
				System.out.println(alert.getText());
				Thread.sleep(1000);
				alert.dismiss();
				*/
	        	
			} catch (Exception e) {
				// Utils.takeScreenshot1();
				 Log.error(e.getMessage());
				 Reporter.log("SignIn Action is not perfomred");
			}
        }

		      
            
       
    }
