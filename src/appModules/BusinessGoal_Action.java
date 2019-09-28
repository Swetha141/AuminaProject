package appModules;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import pageObjects.BaseClass;
import pageObjects.Home_Page;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;

public class BusinessGoal_Action extends BaseClass {

	public BusinessGoal_Action(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void btnClickBG(int iTestCaseRow) throws Exception {

		String sCatName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_BGCategory);
		String sBGName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_BG);
		String sBGName1 = "";
		if (iTestCaseRow == 1) {

			List<WebElement> G1 = Utils.getWebelements(BaseClass.Loca_Config_BG_CategoryCount);

			int temp = G1.size();

			for (int i = 1; i <= temp; i++) {

				WebElement BGCat = driver
						.findElement(By.xpath("//*[@id='page-wrapper']/div/div[2]/div[" + i + "]/div/form/h3"));
				
				Utils.WindowScroll(BGCat);

				if (BGCat.getText().equalsIgnoreCase(sCatName)) {

					String sBG = "//*[@id='page-wrapper']/div/div[2]/div[" + i + "]/div/form/div/div";

					List<WebElement> G2 = Utils.getWebelements(sBG);

					int temp1 = G2.size();

					for (int j = 2; j <= temp1; j++) {

						WebElement sBG1 = driver.findElement(By.xpath(
								"//*[@id='page-wrapper']/div/div[2]/div[" + i + "]/div/form/div/div[" + j + "]"));
					

						if (sBG1.getText().equalsIgnoreCase(sBGName)) {
							
							//Utils.Smartwait(sBG1);
							sBG1.click();
							Thread.sleep(1200);
							BusinessGoal_Action.btnNextBG();
							Thread.sleep(1200);
						}
						break;

					}

					Log.info("Click action is performed on Add BusinessGoal btn");
					break;
				}
				
			}

		}

		else if (iTestCaseRow >= 2) {
			sBGName1 = ExcelUtils.getCellData(iTestCaseRow - 1, Constant.Col_BG);

			if (sBGName != sBGName1) {
				Thread.sleep(1200);
				Utils.ClickEvn(BaseClass.Loca_Homeicone);
				Thread.sleep(1200);
				Utils.ClickEvn(BaseClass.Loca_Config_BRhierarchy_recom);
				Thread.sleep(1200);
				Home_Page.label_CONFIGURE_BUSINESS_EVALUATORS();
				Thread.sleep(1200);
				Home_Page.label_CONFIGURE_BUSINESS_EVALUATORS_Review();
				Thread.sleep(1200);

				List<WebElement> G1 = Utils.getWebelements(BaseClass.Loca_Config_BG_CategoryCount);

				int temp = G1.size();

				for (int i = 1; i <= temp; i++) {

					WebElement BGCat = driver
							.findElement(By.xpath("//*[@id='page-wrapper']/div/div[2]/div[" + i + "]/div/form/h3"));

					if (BGCat.getText().equalsIgnoreCase(sCatName)) {

						String sBG = "//*[@id='page-wrapper']/div/div[2]/div[" + i + "]/div/form/div/div";

						List<WebElement> G2 = Utils.getWebelements(sBG);

						int temp1 = G2.size();

						for (int j = 2; j <= temp1; j++) {

							WebElement sBG1 = driver.findElement(By.xpath(
									"//*[@id='page-wrapper']/div/div[2]/div[" + i + "]/div/form/div/div[" + j + "]"));

							if (sBG1.getText().equalsIgnoreCase(sBGName)) {
                                
								Utils.Smartwait(sBG1);
								sBG1.click();							
								BusinessGoal_Action.btnNextBG();
								Thread.sleep(1200);
							}
							break;

						}

						Log.info("Click action is performed on Add BusinessGoal btn");
						break;
					}

				}

			}

		}

	}

	public static void btnNextBG() throws Exception {

		try {

			Utils.ClickEvn(BaseClass.Loca_Config_Create_BG_Next_btn);
			Log.info("Click action is performed on BusinessGoal Next btn");
		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("Click action is not performed on  BusinessGoal Next btn");
			Log.error(e.getMessage());
		}

	}

	public static void btntab1BG() throws Exception {

		try {

			Utils.ClickEvn(BaseClass.Loca_Config_tab1_bredscram);
			Log.info("Click action is performed on BusinessGoal Next btn");
		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("Click action is not performed on  BusinessGoal Next btn");
			Log.error(e.getMessage());
		}

	}

	public static void btnRecommandation() throws Exception {

		try {

			Utils.ClickEvn(BaseClass.Loca_Config_BRhierarchy_recom);
			Log.info("Click action is performed on BusinessGoal Next btn");
		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("Click action is not performed on  BusinessGoal Next btn");
			Log.error(e.getMessage());
		}

	}
	
	
	

}
