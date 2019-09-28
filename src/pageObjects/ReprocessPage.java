package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Utils;

public class ReprocessPage extends BaseClass {
	//private static WebElement element = null;

	
	public ReprocessPage(WebDriver driver) {
		super(driver);
	}
	
	public static void verify_reprocessnavigation() throws Exception
	{
		try {
		Utils.ClickEvn(BaseClass.LOCA_license_ok_btn);
		//Utils.waitForAjax(driver);
		Utils.ClickEvn(BaseClass.LOCA_setup_system_btn);
		//Utils.waitForAjax(driver);
		Utils.ClickEvn(BaseClass.LOCA_Reprocess_btn);
		//Utils.waitForAjax(driver);
		//getting and validaing reprocess background color
		WebElement reprocess_textcolor = driver.findElement(By.xpath("//span[@class='hide-menu'][contains(.,'Reprocess')]"));
		System.out.println("The color of reprocess link is : "+reprocess_textcolor.getCssValue("background-color"));
	}

  	catch(Exception e) {
		Utils.ClickEvn(BaseClass.LOCA_setup_system_btn);
		//Utils.waitForAjax(driver);
		Utils.ClickEvn(BaseClass.LOCA_Reprocess_btn);
		//Utils.waitForAjax(driver);
		//getting and validaing reprocess background color
		WebElement reprocess_textcolor = driver.findElement(By.xpath("//span[@class='hide-menu'][contains(.,'Reprocess')]"));
		System.out.println("The color of reprocess link is : "+reprocess_textcolor.getCssValue("background-color"));
	}
}
	
}