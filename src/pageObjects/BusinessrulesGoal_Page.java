/**
 * 
 */
package pageObjects;

import org.openqa.selenium.WebDriver;
import appModules.BusinessGoal_Action;
import utility.Log;

/**
 * @author 2304195
 *
 */
public class BusinessrulesGoal_Page extends BaseClass {

	public BusinessrulesGoal_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public static void MoveToBRScreen(int iTestCaseRow) throws Exception {
		try
		{
			BusinessGoal_Action.btnClickBG(iTestCaseRow);
			
		}

	 catch (Exception e) {
		// TODO Auto-generated catch block
		 Log.info("Unable to move the BR Screen");
		e.printStackTrace();
	}

	}		

}
