package utility;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class Utils {
	public static WebDriver driver = null;
	public static WebElement element = null;

	public static WebDriver OpenBrowser() throws Exception {
		// String sBrowserName;
		try {
			// sBrowserName = ExcelUtils.getCellData(iTestCaseRow,
			// Constant.Col_Browser);
			// if(sBrowserName.equals("Chrome")){ Configuration.readProperty("DriverPath"
			System.setProperty("webdriver.chrome.driver",
					Configuration.readProperty("DriverPath"));
			driver = new ChromeDriver();
			Log.info("New driver instantiated");
			driver.manage().timeouts().implicitlyWait(600, TimeUnit.SECONDS);
			Log.info("Implicit wait applied on the driver for 50 seconds");
			driver.get(Configuration.readProperty("URL"));
			Log.info("Web application launched successfully");
			driver.manage().window().maximize();
			// }
		} catch (Exception e) {
			Log.error("Class Utils | Method OpenBrowser | Exception desc : "
					+ e.getMessage());
		}
		return driver;
	}

	

	public static String getTestCaseName(String sTestCase) throws Exception {
		String value = sTestCase;
		try {
			int posi = value.indexOf("@");
			value = value.substring(0, posi);
			posi = value.lastIndexOf(".");
			value = value.substring(posi + 1);
			return value;
		} catch (Exception e) {
			Log.error("Class Utils | Method getTestCaseName | Exception desc : "
					+ e.getMessage());
			throw (e);
		}
	}

	public static void mouseHoverAction(String objxpath1, String objxpath2) {

		try {
			Actions action = new Actions(driver);

			getWebelement(objxpath1);
			action.clickAndHold(element);
			getWebelement(objxpath2);
			action.moveToElement(element).perform();
			// action.click();
			Log.info("Mouse move action is performed");
		} catch (Exception e) {
			e.printStackTrace();
			Log.info("Mouse move action is not performed");

		}
	}

	public static void MoveandClickAction(String objxpath) {

		try {
			Actions action = new Actions(driver);			
			action.moveToElement(element).perform();
			action.click();
			Log.info("Mouse move action is performed");
			
		} catch (Exception e) 
		
		{
			
			e.printStackTrace();
			Log.info("Mouse move action is not performed");

		}
	}
	
	
	
	public static void waitForElement(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 40);

		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void takeScreenshot1() throws Exception {
		try {

			int i = (int) (System.currentTimeMillis() / 1000);
			File scrFile = ((TakesScreenshot) driver)
					.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(scrFile, new File(Constant.Path_ScreenShot + i
					+ ".jpg"));
		} catch (Exception e) {
			Log.error("Class Utils | Method takeScreenshot | Exception occured while capturing ScreenShot : "
					+ e.getMessage());
			throw new Exception();
		}
	}

	public static WebElement getWebelement(String objxpath) throws Exception {

		try {
			element = null;

			element = driver.findElement(By.xpath(objxpath));

		} catch (Exception e) {

			takeScreenshot1();

			Log.info("No such element" + element);

			// Log.error("No such element"+element);
			// e.printStackTrace();

		}
		return element;

	}

	public static List<WebElement> getWebelements(String objxpath)
			throws Exception {
		List<WebElement> elements = null;
		 driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);  
		try {
			elements = driver.findElements(By.xpath(objxpath));

		} catch (Exception e) {

			takeScreenshot1();
			Log.info("No such element" + elements);
			// Log.error("No such element"+element);
			// e.printStackTrace();

		}
		finally  
        {  
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
        } 
		return elements;

	}

	public static void Editsetvalue(String objxpath, String Value)
			throws Exception {

		// element = driver.findElement(By.xpath(objxpath));

		try {

			getWebelement(objxpath);
			waitForElement(element);

			element.clear();

			element.sendKeys(Value);

		} catch (Exception e) {
			takeScreenshot1();
			Log.error(Value + "Unable to Entered the value in text box");

		}

	}

	public static void ClickEvn(String objxpath) throws Exception {

		try {

			// element = driver.findElement(By.xpath(objxpath));

			getWebelement(objxpath);

			waitForElement(element);

			element.click();

		} catch (Exception e) {
		
			//takeScreenshot1();
			Log.error("Unable to click the webelement" + element);

		}

	}

	public static void DoubleClickEvn(String objxpath) throws Exception {

		try {

			// element = driver.findElement(By.xpath(objxpath));
			getWebelement(objxpath);

			waitForElement(element);
			Actions action = new Actions(driver);
			action.doubleClick(element);

		} catch (Exception e) {
			takeScreenshot1();

			Log.error("Unable to click the webelement" + element);

		}

	}
	
	
	public static void keyEnter() throws Exception {

		try {

			// element = driver.findElement(By.xpath(objxpath));
			//getWebelement(objxpath);

			//waitForElement(element);
			Actions action = new Actions(driver);
			action.sendKeys(Keys.RETURN);
			
			
		} catch (Exception e) {
			takeScreenshot1();

			Log.error("Unable to click the webelement" + element);

		}

	}
	

	public static void TABEvent(String objxpath) throws Exception {

		try {
			// element = driver.findElement(By.xpath(objxpath));
			getWebelement(objxpath);
			waitForElement(element);
			element.sendKeys(Keys.TAB);

		} catch (Exception e) {
			takeScreenshot1();

			Log.error("Unable to click the webelement" + element);

		}
	}

	public static void SelectbyValue(String objxpath, String Value)
			throws Exception {
		try {

			// element = driver.findElement(By.xpath(objxpath));
			getWebelement(objxpath);
			waitForElement(element);
			Select sel = new Select(element);
			sel.selectByVisibleText(Value);

		} catch (Exception e) {
			takeScreenshot1();

			Log.error("Unable to  Selecte value from dropdown list box");
		}

	}

	public static void SelectAllValues(String objxpath) throws Exception {
		try {

			WebElement elements = null;
			elements = getWebelement(objxpath);
			// waitForElement(element);
			Select sel = new Select(elements);
			List<WebElement> allval = sel.getOptions();

			for (WebElement we : allval) {
				we.click();

				Log.info(we.getText() + ": is selected in JobSchedule");

			}

		} catch (Exception e) {
			takeScreenshot1();
			Log.error("Unable to  Selecte value from dropdown list box");

			Log.error("Unable to  Selecte value from dropdown list box");

		}

	}

	public static String Gettext(String objxpath) throws Exception {

		getWebelement(objxpath);
		// waitForElement(element);

		String Value = null;

		try {

			Value = element.getText();
			element.getAttribute(objxpath);

			Log.info("Text value captured" + Value);

		}

		catch (Exception e) {
			takeScreenshot1();
			Log.error("Text value Not captured");

		}
		return Value;

	}

	public boolean Comparetext(String Expected, String Actual) throws Exception {

		try {
			if (Expected.equals(Gettext(Actual))) {
				Log.info(Expected + "is equal to " + Actual);
			} else {
				Log.error(Expected + "is not equal to " + Actual);
				return false;
			}
		} catch (Exception e) {

			takeScreenshot1();
			e.printStackTrace();
		}
		return true;
	}

	public static boolean IsVisible(String objxpath) throws Exception {

		Utils.getWebelement(objxpath);

		if (element == null || element.equals(""))

			return false;
		if (element.isDisplayed())
			return true;

		else
			return false;

	}

	public static boolean IsSelected(String objxpath) throws Exception {

		Utils.getWebelement(objxpath);

		if (element.isSelected())

			return false;

		else
			return true;

	}

	public static boolean IsVisible(WebElement element) {

		try {

			if (element == null || element.equals(""))

				return false;
			else if (element.isDisplayed())
				return true;

			else
				return false;

		} catch (Exception e) {

			e.printStackTrace();
		}
		return false;

	}

	public static int TableRowcount(String objxpath) throws Exception {
		WebElement tablebody = getWebelement(objxpath);
		List<WebElement> rows = tablebody.findElements(By.tagName("tr"));

		int tablerows = rows.size();
		return tablerows;

	}

	public static int TableColumncount(String objxpath) throws Exception {
		WebElement tablebody = getWebelement(objxpath);

		List<WebElement> columns = tablebody.findElements(By.tagName("td"));

		int tablecolumns = columns.size();

		return tablecolumns;
	}

	public static List<WebElement> DatePic(String objxpath) throws Exception {
		WebElement tablebody = getWebelement(objxpath);
		List<WebElement> rows = tablebody.findElements(By.tagName("tr"));
		List<WebElement> columns = tablebody.findElements(By.tagName("td"));
		return columns;
	}

	public static void WindowScroll(WebElement element) throws Exception {		
		
		((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", element);

	}

	
	public static void Smartwait(WebElement element) throws Exception {	
	
	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
	wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void waitForAjax(WebDriver driver) {
		new WebDriverWait(driver, 180).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				return (Boolean) js.executeScript("return jQuery.active == 0");
			}
		});
	}
	public static void uploadFile(WebDriver driver, WebElement browseButton, String filePath) throws Exception {
		StringSelection sel2 = new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel2,null);
		Reporter.log("Selection: "+sel2, true);
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", browseButton);
		Reporter.log("Browse button clicked", true);
		Robot robot2 = new Robot();
		Thread.sleep(1000);
		robot2.keyPress(KeyEvent.VK_ENTER);
		robot2.keyRelease(KeyEvent.VK_ENTER);
		robot2.keyPress(KeyEvent.VK_CONTROL);
		robot2.keyPress(KeyEvent.VK_V);
		robot2.keyRelease(KeyEvent.VK_CONTROL);
		robot2.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot2.keyPress(KeyEvent.VK_ENTER);
		robot2.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	}
	public static boolean isFileDownloaded(String downloadPath, String fileName) {
		File dir = new File(downloadPath);
		File[] dirContents = dir.listFiles();	

		for (int i = 0; i < dirContents.length; i++) {
			if (dirContents[i].getName().contains(fileName)) {
				// File has been found, it can now be deleted:
				dirContents[i].delete();
				return true;
			}
		}
		return false;
	}
        public static void click(WebDriver driver, WebElement element) {
		try {
			(new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(element));
			element.click();
		}
		catch (StaleElementReferenceException  e) {
			// simply retry finding the element in the refreshed DOM
			element.click();
		}
		catch (WebDriverException e) {
			element.click();
		}
	}


}
