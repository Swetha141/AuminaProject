package appModules;

import pageObjects.BaseClass;
import utility.Configuration;
import utility.Log;
import utility.Utils;

public class SignIn_Admin_Action {


	 public static void txtUserName() throws Exception{
		 
	 
		 	String sUserName = Configuration.readProperty("AdimnUserName");        	
       try
       {
	  	

       	Utils.Editsetvalue(BaseClass.Loca_Emailid_txtbx,sUserName);
       	Log.info(sUserName+" is entered in UserName text box" );
       }
       catch(Exception e)
       {
       	 Utils.takeScreenshot1();
       	 Log.error(e.getMessage());
       	 Log.info(sUserName+"is Not entered in UserName text box" );
       	
       }

	 }
	 
	 
	 public static void txtPassword() throws Exception{ 
	 
		 	String sPassword = Configuration.readProperty("AdminPassword");

   
   try
   {
   		Utils.Editsetvalue(BaseClass.Loca_Password_txtbx,sPassword);
 
   		Log.info(sPassword+" is entered in Password text box" );
   }
   catch(Exception e)
   {
   	    Utils.takeScreenshot1();
   		 Log.error(e.getMessage());
   		 Log.info(sPassword+" is entered in Password text box" );
   }
   
	 } 
	 
	 
	 public static void btnLogin() throws Exception{     	 
	 
   try
   {      
   		Utils.ClickEvn(BaseClass.Loca_Login_btn);
   		Log.info("Click action is performed on Submit button");
   		Utils.takeScreenshot1();
   }
   catch(Exception e)
   {
   	
   		Utils.takeScreenshot1();
   		 Log.error(e.getMessage());
   		Log.info("Click action is not performed on Submit button");
   		 Log.error(e.getMessage()); 
   }

	 } 
	 
	 
	 
	
  /* public static void LicensePopup(int iTestCaseRow) throws Exception{  
  
  	 
       try
       {  
       	
          Utils.getWebelement(BaseClass.Loca_Licensewarning_btn);
       	
       	if(Utils.IsVisible(Utils.element))
       	{
       	 // Utils.waitForElement(BaseClass.Loca_Licensewarning_btn);
       		Utils.ClickEvn(BaseClass.Loca_Licensewarning_btn);
       		Utils.Gettext(BaseClass.Loca_Licensewarning_msg);
       		Log.info("Click action is performed on Licensepopup button");
       	}
       else
       	{
       	
       	Log.info("Licensepopup not present");
       	}
       }
   	
       catch(Exception e)
       {
       	
       		Utils.takeScreenshot1();
       		 Log.error(e.getMessage());
       		Log.info("Click action is not performed on Licensepopup button");
       }
   
	 }
	        */               
 
   
 

   

}

