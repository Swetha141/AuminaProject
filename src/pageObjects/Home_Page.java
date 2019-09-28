package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import utility.Log;
import utility.Utils;
    public class Home_Page extends BaseClass{
            private static WebElement element = null;
           
        public Home_Page(WebDriver driver){
            	super(driver);
        }   
        
        
       /* public static void lableEntity(int iTestCaseRow) throws Exception{
   		 
       	 
            try
            {
       	  	

            	Utils.ClickEvn(BaseClass.Loca_Entity_icons);
            	Log.info("Click action is performed on Configurator lable" );
            }
            catch(Exception e)
            {
            	
           		Log.info("Click action is not performed on Configurator lable" );
            	
            }

       	 }
        */
        
        
        
        public static void label_CONFIGURE_BUSINESS_EVALUATORS() throws Exception{
     		 
         	 
            try
            {
       	  	

            	Utils.ClickEvn(BaseClass.Loca_Config_Dashboard);
            	Log.info("Click action is performed on CONFIGURE BUSINESS EVALUATORS lable" );
            }
            catch(Exception e)
            {
            	
           		Log.info("Click action is not performed on CONFIGURE BUSINESS EVALUATORS lable" );
            	
            }

       	 }
    
        
        public static void label_CONFIGURE_BUSINESS_EVALUATORS_Review() throws Exception{
    		 
        	 
            try
            {
       	  	

            	Utils.ClickEvn(BaseClass.Loca_Config_Review_btn);
            	Log.info("Click action is performed on CONFIGURE BUSINESS EVALUATORS Review button" );
            }
            catch(Exception e)
            {
            	
           		Log.info("Click action is not performed on CONFIGURE BUSINESS EVALUATORS Review button" );
            	
            }

       	 }
        
        
             
        
       
           

      
    }
