package appModules;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjects.BaseClass;
import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;

public class BusinessRulesConfig_Action  extends BaseClass{

	public BusinessRulesConfig_Action(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
		public static void tabBusinessRuleconfig() throws Exception {

			try {

				Utils.ClickEvn(BaseClass.Loca_BR_brconfigure_tab);
				Log.info("Click action is performed on brconfigure tab");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on brconfigure tab");
				Log.error(e.getMessage());
			}

		
		}	
		
		
		public static void btnBusinessRuleRecommentation() throws Exception {

			try {

				Utils.ClickEvn(BaseClass.Loca_BR_brconfigure_recomend_btn);
				Log.info("Click action is performed on brconfigure_recomend btn");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on brconfigure_recomend btn");
				Log.error(e.getMessage());
			}

		
		}	
		
		
		public static void btnClickBR(int iTestCaseRow) throws Exception {

			String sBGName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_BusinessRuleName);

			try {

				List<WebElement> G1 = Utils.getWebelements(BaseClass.Loca_BR_brconfigure_Brcount);

				int temp = G1.size();

				for (int i = 1; i <= temp; i++) {

					WebElement BGName = driver
							.findElement(By.xpath("//*[@id='aum-body']/div[2]/div[1]/div[1]/div[2]/div/div[2]/span[+i+]"));

					if (BGName.getText().equals(sBGName)) {
						BGName.click();

						Log.info("Click action is performed on Add BusinessGoal btn");
					}
				}
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on Add BusinessGoal btn");
				Log.error(e.getMessage());
			}

		}
		
		
		public static void btnParentBR(int iTestCaseRow) throws Exception {

			String sBRName = ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_BusinessRuleName);

			try {

							
				WebElement BRName = driver.findElement(By.xpath(BaseClass.Loca_BR_ConfigParanent_name));

					if (BRName.getText().equals(sBRName)) {
						BRName.click();

						Log.info("Click action is performed on BR name btn");
					
					
				}
					
				
				
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BR name btn");
				Log.error(e.getMessage());
			}

		
		}	
		
		
		public static void btnHierarchylevel1(int iTestCaseRow) throws Exception {

			String sBRName = ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_BusinessRuleName);

			try {
				
				
				List<WebElement> G2 = Utils.getWebelements(BaseClass.Loca_BR_ConfigbrHierarchy1_count);

				int temp2 = G2.size();

				for (int j = 1; j <= temp2; j++) {
					WebElement BRName = driver.findElement(By.xpath("//*[@id='brConfigTree']/div/ul/li/ul/li[i]/a"));

					if (BRName.getText().equals(sBRName)) {
						BRName.click();
						Log.info("Click action is performed on BR name btn");
						break;
					
				}
					
				}
				
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BR name btn");
				Log.error(e.getMessage());
			}

			
		}
		
		public static void btnHierarchylevel2(int iTestCaseRow) throws Exception {

			String sBRName = ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_BusinessRuleName);

			try {
				
				
				List<WebElement> G2 = Utils.getWebelements(BaseClass.Loca_BR_ConfigbrHierarchy2_count);

				int temp2 = G2.size();

				for (int j = 1; j <= temp2; j++) {
					WebElement BRName = driver.findElement(By.xpath("//*[@id='brConfigTree']/div/ul/li/ul/li/ul/li[i]/a"));

					if (BRName.getText().equals(sBRName)) {
						BRName.click();
						Log.info("Click action is performed on BR name btn");
						break;
					
				}
					
				}
				
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BR name btn");
				Log.error(e.getMessage());
			}

			
		}
		
		
		public static void btnHierarchylevel3(int iTestCaseRow) throws Exception {

			String sBRName = ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_BusinessRuleName);

			try {
				
				
				List<WebElement> G2 = Utils.getWebelements(BaseClass.Loca_BR_ConfigbrHierarchy3_count);

				int temp2 = G2.size();

				for (int j = 1; j <= temp2; j++) {
					WebElement BRName = driver.findElement(By.xpath("//*[@id='brConfigTree']/div/ul/li/ul/li/ul/li/ul/li[i]/a"));

					if (BRName.getText().equals(sBRName)) {
						BRName.click();
						Log.info("Click action is performed on BR name btn");
						break;
					
				}
					
				}
				
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BR name btn");
				Log.error(e.getMessage());
			}

			
		}
		
		public static void btnHierarchylevel4(int iTestCaseRow) throws Exception {

			String sBRName = ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_BusinessRuleName);

			try {
				
				
				List<WebElement> G2 = Utils.getWebelements(BaseClass.Loca_BR_ConfigbrHierarchy4_count);

				int temp2 = G2.size();

				for (int j = 1; j <= temp2; j++) {
					WebElement BRName = driver.findElement(By.xpath("//*[@id='brConfigTree']/div/ul/li/ul/li/ul/li/ulli/ul/li[i]/a"));

					if (BRName.getText().equals(sBRName)) {
						BRName.click();
						Log.info("Click action is performed on BR name btn");
						break;
					
				}
					
				}
				
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BR name btn");
				Log.error(e.getMessage());
			}

			
		}
		
		
		public static void btnHierarchylevel5(int iTestCaseRow) throws Exception {

			String sBRName = ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_BusinessRuleName);

			try {
				
				
				List<WebElement> G2 = Utils.getWebelements(BaseClass.Loca_BR_ConfigbrHierarchy5_count);

				int temp2 = G2.size();

				for (int j = 1; j <= temp2; j++) {
					WebElement BRName = driver.findElement(By.xpath("//*[@id='brConfigTree']/div/ul/li/ul/li/ul/li/ulli/ul/li/ul/li[i]/a"));

					if (BRName.getText().equals(sBRName)) {
						BRName.click();
						Log.info("Click action is performed on BR name btn");
						break;
					
				}
					
				}
				
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BR name btn");
				Log.error(e.getMessage());
			}

			
		}
		
		
		public static void btnHierarchylevel6(int iTestCaseRow) throws Exception {

			String sBRName = ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_BusinessRuleName);

			try {
				
				
				List<WebElement> G2 = Utils.getWebelements(BaseClass.Loca_BR_ConfigbrHierarchy6_count);

				int temp2 = G2.size();

				for (int j = 1; j <= temp2; j++) {
					WebElement BRName = driver.findElement(By.xpath("//*[@id='brConfigTree']/div/ul/li/ul/li/ul/li/ulli/ul/li/ul/li/ul/li[i]/a"));

					if (BRName.getText().equals(sBRName)) {
						BRName.click();
						Log.info("Click action is performed on BR name btn");
						break;
					
				}
					
				}
				
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BR name btn");
				Log.error(e.getMessage());
			}

			
		}
		
		
		public static void btnHierarchylevel7(int iTestCaseRow) throws Exception {

			String sBRName = ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_BusinessRuleName);

			try {
				
				
				List<WebElement> G2 = Utils.getWebelements(BaseClass.Loca_BR_ConfigbrHierarchy7_count);

				int temp2 = G2.size();

				for (int j = 1; j <= temp2; j++) {
					WebElement BRName = driver.findElement(By.xpath("//*[@id='brConfigTree']/div/ul/li/ul/li/ul/li/ulli/ul/li/ul/li/ul/li/ul/li[i]/a"));

					if (BRName.getText().equals(sBRName)) {
						BRName.click();
						Log.info("Click action is performed on BR name btn");
						break;
					
				}
					
				}
				
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BR name btn");
				Log.error(e.getMessage());
			}

			
		}

		
		public static void btnHierarchylevel8(int iTestCaseRow) throws Exception {

			String sBRName = ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_BusinessRuleName);

			try {
				
				
				List<WebElement> G2 = Utils.getWebelements(BaseClass.Loca_BR_ConfigbrHierarchy8_count);

				int temp2 = G2.size();

				for (int j = 1; j <= temp2; j++) {
					WebElement BRName = driver.findElement(By.xpath("//*[@id='brConfigTree']/div/ul/li/ul/li/ul/li/ulli/ul/li/ul/li/ul/li/ul/li/ul/li[i]/a"));

					if (BRName.getText().equals(sBRName)) {
						BRName.click();
						Log.info("Click action is performed on BR name btn");
						break;
					
				}
					
				}
				
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BR name btn");
				Log.error(e.getMessage());
			}

			
		}
		
		
		public static void btnHierarchylevel9(int iTestCaseRow) throws Exception {

			String sBRName = ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_BusinessRuleName);

			try {
				
				
				List<WebElement> G2 = Utils.getWebelements(BaseClass.Loca_BR_ConfigbrHierarchy9_count);

				int temp2 = G2.size();

				for (int j = 1; j <= temp2; j++) {
					WebElement BRName = driver.findElement(By.xpath("//*[@id='brConfigTree']/div/ul/li/ul/li/ul/li/ulli/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li[i]/a"));

					if (BRName.getText().equals(sBRName)) {
						BRName.click();
						Log.info("Click action is performed on BR name btn");
						break;
					
				}
					
				}
				
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BR name btn");
				Log.error(e.getMessage());
			}

			
		}
		
		public static void btnHierarchylevel10(int iTestCaseRow) throws Exception {

			String sBRName = ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_BusinessRuleName);

			try {
				
				
				List<WebElement> G2 = Utils.getWebelements(BaseClass.Loca_BR_ConfigbrHierarchy10_count);

				int temp2 = G2.size();

				for (int j = 1; j <= temp2; j++) {
					WebElement BRName = driver.findElement(By.xpath("//*[@id='brConfigTree']/div/ul/li/ul/li/ul/li/ulli/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li[i]/a"));

					if (BRName.getText().equals(sBRName)) {
						BRName.click();
						Log.info("Click action is performed on BR name btn");
						break;
					
				}
					
				}
				
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BR name btn");
				Log.error(e.getMessage());
			}

			
		}
		
		
		public static  boolean btnBRTree(int iTestCaseRow) throws Exception {

			try {
				 
				if (Utils.IsVisible(BaseClass.LOCA_BR_Tree_btn))
				{

				Utils.ClickEvn(BaseClass.LOCA_BR_Tree_btn);
				Log.info("Click action is performed on Tree button");
				}
				else
				{
					Utils.ClickEvn(BaseClass.LOCA_BR_BRConfig_save_btn);
					Log.info("Click action is performed on Tree Save button");					
					return false;      
				}
				
			} catch (Exception e) {
				Utils.takeScreenshot1();
			
				Log.info("Click action is not performed on Tree1 button");
				Log.error(e.getMessage());
			}
			return true;			

		}
		
		public static void click_lableBRAttribute() throws Exception {

			try {

				Utils.ClickEvn(BaseClass.LOCA_BR_BRConfig_Attribute_btn);
				Log.info("Click action is performed on BRConfig_Attribute button");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BRConfig_Attribute buttion");
				Log.error(e.getMessage());
			}

		}

	
		public static void lableBROperator() throws Exception {

			try {

				Utils.ClickEvn(BaseClass.LOCA_BR_BRConfig_Operator_btn);
				Log.info("Click action is performed on BRConfig_Operator button");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BRConfig_Operator buttion");
				Log.error(e.getMessage());
			}

		}
		
		public static void drpdBROperator(int iTestCaseRow) throws Exception {

			String sBRBG= ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_BR_Sec_Operator);
			try {
				Utils.SelectbyValue(BaseClass.LOCA_BR_BRConfig_Operator_drpd, sBRBG);

				Log.info(sBRBG + " is Selected  in BRConfig_Operator_drpd");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info(sBRBG + " is not Selected  in BRConfig_Operator_drpd");
				Log.error(e.getMessage());
			}

		}
		
		public static void btnBROperatorAdd() throws Exception {

			try {

				Utils.ClickEvn(BaseClass.LOCA_BR_BRConfig_Operator_add_btn);
				Log.info("Click action is performed on BR_BRConfig_Operator_add_btn");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BR_BRConfig_Operator_add_btn");
				Log.error(e.getMessage());
			}

		}
		
		public static void btnBROperatorCanel() throws Exception {

			try {

				Utils.ClickEvn(BaseClass.LOCA_BR_BRConfig_Operator_Cancel_btn);
				Log.info("Click action is performed on BRConfig_Operator_Cancel_btn");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BRConfig_Operator_Cancel_btn");
				Log.error(e.getMessage());
			}

		}
		
		
		
		public static void radioBRAttributeExistBR() throws Exception {

			try {

				Utils.ClickEvn(BaseClass.LOCA_BR_BRConfig_Attribute_ExistingBR_radio);
				Log.info("Click action is performed on BRConfig_Attribute_ExistingBR button");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BRConfig_Attribute_ExistingBR buttion");
				Log.error(e.getMessage());
			}

		}	
		
		
		public static void radioBRAttributekeyword() throws Exception {

			try {

				Utils.ClickEvn(BaseClass.LOCA_BR_BRConfig_Attribute_keyword_radio);
				Log.info("Click action is performed on BRConfig_Attribute_keyword button");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BRConfig_Attribute_keyword buttion");
				Log.error(e.getMessage());
			}

		}
		
		
		public static void radioBRAttributeMeta() throws Exception {

			try {

				Utils.ClickEvn(BaseClass.LOCA_BR_BRConfig_Attribute_Metadata_radio);
				Log.info("Click action is performed on BRConfig_Attribute_Metadata button");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BRConfig_Attribute_Metadata buttion");
				Log.error(e.getMessage());
			}

		}
		
		
		public static void drpdBRAttributeExistBR(int iTestCaseRow) throws Exception {

			String sBRBG= ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_BR_Sec_Operator);
			try {
				Utils.SelectbyValue(BaseClass.LOCA_BR_BRConfigAtt_ExistBR_drpd, sBRBG);

				Log.info(sBRBG + " is Selected  in BR_BRConfigAtt_ExistBR");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info(sBRBG + " is not Selected  in BR_BRConfigAtt_ExistBR");
				Log.error(e.getMessage());
			}

		}

		public static void btnBRAttributeExistBRSave() throws Exception {

			try {

				Utils.ClickEvn(BaseClass.LOCA_BR_BRConfigAtt_ExistBR_add_btn);
				Log.info("Click action is performed on BR Component Add button");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BR Component Add buttion");
				Log.error(e.getMessage());
			}

		}

		public static void btnBRAttributeExistBRCancel() throws Exception {

			try {

				Utils.ClickEvn(BaseClass.LOCA_BR_BRConfigAtt_ExistBR_Cancel_btn);
				Log.info("Click action is performed on BRConfigAtt_ExistBR_Cancel button");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BRConfigAtt_ExistBR_Cancel buttion");
				Log.error(e.getMessage());
			}

		}

		
		
		public static void drpdBRAttributeChanelType(int iTestCaseRow) throws Exception {

			String sBRBG= ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_BR_Sec_Operator);
			try {
				Utils.SelectbyValue(BaseClass.LOCA_BR_BRConfigAtt_KeyChannel_drpd, sBRBG);

				Log.info(sBRBG + " is Selected  in BRConfigAtt_KeyChannel");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info(sBRBG + " is not Selected  in BRConfigAtt_KeyChannel");
				Log.error(e.getMessage());
			}

		}	
		
		
		public static void drpdBRAttributeInclusiontype(int iTestCaseRow) throws Exception {

			String sBRBG= ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_BR_Sec_Operator);
			try {
				Utils.SelectbyValue(BaseClass.LOCA_BR_BRConfigAtt_KeyInclusion_drpd, sBRBG);

				Log.info(sBRBG + " is Selected  in BRConfigAtt_KeyInclusion");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info(sBRBG + " is not Selected  in BRConfigAtt_KeyInclusion");
				Log.error(e.getMessage());
			}

		}
		
		
		public static void drpdBRAttributeMatchtype(int iTestCaseRow) throws Exception {

			String sBRBG= ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_BR_Sec_Operator);
			try {
				Utils.SelectbyValue(BaseClass.LOCA_BR_BRConfigAtt_KeyMatch_drpd, sBRBG);

				Log.info(sBRBG + " is Selected  in BR_BRConfigAtt_KeyMatch");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info(sBRBG + " is not Selected  in BR_BRConfigAtt_KeyMatch");
				Log.error(e.getMessage());
			}

		}
		
		public static void listBRAttributekeyword(int iTestCaseRow) throws Exception {

			String sBRBG= ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_BR_Sec_Operator);
			try {
				Utils.SelectbyValue(BaseClass.LOCA_BR_BRConfigAtt_keywordbox_btnorlist, sBRBG);

				Log.info(sBRBG + " is Selected  in BR_BRConfigAtt_keywordbox");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info(sBRBG + " is not Selected  in BR_BRConfigAtt_keywordbox");
				Log.error(e.getMessage());
			}

		}
		
		
		public static void drpdBRAttributeOffset(int iTestCaseRow) throws Exception {

			String sBRBG= ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_BR_Sec_Operator);
			try {
				Utils.SelectbyValue(BaseClass.LOCA_BR_BRConfigAtt_KeyOffset_drpd, sBRBG);

				Log.info(sBRBG + " is Selected  in BR_BRConfigAtt_KeyOffset_drpd");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info(sBRBG + " is not Selected  in BR_BRConfigAtt_KeyOffset_drpd");
				Log.error(e.getMessage());
			}

		}
		
		public static void txtbxBRAttributeoffset(int iTestCaseRow) throws Exception {

			String sBRBG= ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_BR_Sec_Meta_operator_value);
			try {
				Utils.Editsetvalue(BaseClass.LOCA_BR_BRConfigAtt_KeyOffset_txtbx, sBRBG);

				Log.info(sBRBG + " is Entered in BR_BRConfigAtt_KeyOffset_txtbx");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info(sBRBG + " is not Selected  in BR_BRConfigAtt_KeyOffset_txtbx");
				Log.error(e.getMessage());
			}

		}	
		
		
		public static void drpdBRAttributeOccurs(int iTestCaseRow) throws Exception {

			String sBRBG= ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_BR_Sec_Operator);
			try {
				Utils.SelectbyValue(BaseClass.LOCA_BR_BRConfigAtt_KeyOccurs_drpd, sBRBG);

				Log.info(sBRBG + " is Selected  in BR_BRConfigAtt_KeyOccurs_drpd");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info(sBRBG + " is not Selected  in BR_BRConfigAtt_KeyOccurs_drpd");
				Log.error(e.getMessage());
			}

		}
		
		
		public static void txtbxBRAttributeOccurs(int iTestCaseRow) throws Exception {

			String sBRBG= ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_BR_Sec_Meta_operator_value);
			try {
				Utils.Editsetvalue(BaseClass.LOCA_BR_BRConfigAtt_KeyOccurs_txtbx, sBRBG);

				Log.info(sBRBG + " is Entered in BR_BRConfigAtt_KeyOccurs_txtbx");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info(sBRBG + " is not Selected  in BR_BRConfigAtt_KeyOccurs_txtbx");
				Log.error(e.getMessage());
			}

		}		
		
		
		public static void drpdBRAttributeAmplitude(int iTestCaseRow) throws Exception {

			String sBRBG= ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_BR_Sec_Operator);
			try {
				Utils.SelectbyValue(BaseClass.LOCA_BR_BRConfigAtt_KeyAmplitude_drpd, sBRBG);

				Log.info(sBRBG + " is Selected  in BR_BRConfigAtt_KeyAmplitude_drpd");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info(sBRBG + " is not Selected  in BR_BRConfigAtt_KeyAmplitude_drpd");
				Log.error(e.getMessage());
			}

		}
		
		
		
		public static void drpdBRAttributeChoose() throws Exception {

			try {

				Utils.ClickEvn(BaseClass.LOCA_BR_BRConfigAtt_choosekeyword_drpd);
				Log.info("Click action is performed on BR_BRConfigAtt_choosekeyword");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BR_BRConfigAtt_choosekeyword");
				Log.error(e.getMessage());
			}

		}

		
		
		
		
		
		public static void labelBRAttributeChooseCreate() throws Exception {

			try {

				Utils.ClickEvn(BaseClass.LOCA_BR_BRConfigAtt_choosekeyword_create_lable);
				Log.info("Click action is performed on BRConfigAtt_choosekeyword_create_lable");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BRConfigAtt_choosekeyword_create_lable");
				Log.error(e.getMessage());
			}

		}
		
		
		public static void labelBRAttributeChooseAdd() throws Exception {

			try {

				Utils.ClickEvn(BaseClass.LOCA_BR_BRConfigAtt_choosekeyword_add_lable);
				Log.info("Click action is performed on BR_BRConfigAtt_choosekeyword_add_lable");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BR_BRConfigAtt_choosekeyword_add_lable");
				Log.error(e.getMessage());
			}

		}
		
		public static void labelBRAttributeChooseRemove() throws Exception {

			try {

				Utils.ClickEvn(BaseClass.LOCA_BR_BRConfigAtt_choosekeyword_Remove_lable);
				Log.info("Click action is performed on BRConfigAtt_choosekeyword_Remove_lable");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BRConfigAtt_choosekeyword_Remove_lable");
				Log.error(e.getMessage());
			}

		}
		
		public static void btnBRAttributeChooseRemoveAll() throws Exception {

			try {

				Utils.ClickEvn(BaseClass.LOCA_BR_BRConfigAtt_choosekeyword_RemoveAll_btn);
				Log.info("Click action is performed on BR_BRConfigAtt_choosekeyword_RemoveAll_btn");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BR_BRConfigAtt_choosekeyword_RemoveAll_btn");
				Log.error(e.getMessage());
			}

		}
		
		public static void txtbxBRAttributekeywordinput(int iTestCaseRow) throws Exception {

			String sBRBG= ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_BR_Sec_Meta_operator_value);
			try {
				Utils.Editsetvalue(BaseClass.LOCA_BR_BRConfigAtt_choosekeyword_keywordinput, sBRBG);

				Log.info(sBRBG + " is Entered in BRConfigAtt_choosekeyword_keywordinput");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info(sBRBG + " is not Selected  in BRConfigAtt_choosekeyword_keywordinput");
				Log.error(e.getMessage());
			}

		}		
		
		public static void autobxBRAttributekeywordinput(int iTestCaseRow) throws Exception {

		
			try {
				Utils.ClickEvn(BaseClass.LOCA_BR_BRConfigAtt_choosekeyword_Firstkeyword);

				Log.info( " Click action is performed on BRConfigAtt_choosekeyword_Firstkeyword");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BRConfigAtt_choosekeyword_Firstkeyword");
				Log.error(e.getMessage());
			}

		}	
		
		
		
		public static void btnBRAttributeChooseOK() throws Exception {

			try {

				Utils.ClickEvn(BaseClass.LOCA_BR_BRConfigAtt_choosekeyword_keywordinput_ok_btn);
				Log.info("Click action is performed on BRConfigAtt_choosekeyword_keywordinput_ok");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BRConfigAtt_choosekeyword_keywordinput_ok");
				Log.error(e.getMessage());
			}

		}
		
		
		public static void btnBRAttributekeywordSave() throws Exception {

			try {

				Utils.ClickEvn(BaseClass.LOCA_BR_BRConfigAtt_add_btn);
				Log.info("Click action is performed on BR_BRConfigAtt_add_btn");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BR_BRConfigAtt_add_btn");
				Log.error(e.getMessage());
			}

		}
		
		
		public static void btnBRAttributekeywordCancel() throws Exception {

			try {

				Utils.ClickEvn(BaseClass.LOCA_BR_BRConfigAtt_Cancel_btn);
				Log.info("Click action is performed on BR_BRConfigAtt_Cancel_btn");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BR_BRConfigAtt_Cancel_btn");
				Log.error(e.getMessage());
			}

		}
		
		
		
		
		
		/* ~~~~~~~~~~~~~~~~~~~~~~Meta Data~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
		
		public static void drpdBRMetadata() throws Exception {

			try {

				Utils.ClickEvn(BaseClass.LOCA_BR_BRConfigAtt_Metadata_drpd);
				Log.info("Click action is performed on BRConfigAtt_Metadata_drpd");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BRConfigAtt_Metadata_drpd");
				Log.error(e.getMessage());
			}

		}
		
		
		public static void drpdBRMetadataChanel() throws Exception {

			try {

				Utils.ClickEvn(BaseClass.LOCA_BR_BRConfigAtt_MetaChannel_drpd);
				Log.info("Click action is performed on BRConfigAtt_MetaChannel_drpd");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BRConfigAtt_MetaChannel_drpd");
				Log.error(e.getMessage());
			}

		}
		
		
		public static void drpdBRMetadataCalduration() throws Exception {

			try {

				Utils.ClickEvn(BaseClass.LOCA_BR_BRConfigAtt_MetaCallDuration_drpd);
				Log.info("Click action is performed on BRConfigAtt_MetaCallDuration_drpd");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BRConfigAtt_MetaCallDuration_drpd");
				Log.error(e.getMessage());
			}

		}
		
		
		
		public static void txtbxBRMetadataCalduration(int iTestCaseRow) throws Exception {

			String sBRBG= ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_BR_Sec_Meta_operator_value);
			try {
				Utils.Editsetvalue(BaseClass.LOCA_BR_BRConfigAtt_MetaCallDuration_txtbx, sBRBG);

				Log.info(sBRBG + " is Entered in BRConfigAtt_MetaCallDuration_txtbx");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info(sBRBG + " is not Selected  in BRConfigAtt_MetaCallDuration_txtbx");
				Log.error(e.getMessage());
			}

		}	

		public static void drpdBRMetadataCallHoldDurationIstance() throws Exception {

			try {

				Utils.ClickEvn(BaseClass.LOCA_BR_BRConfigAtt_MetaCallHold_Instance_drpd);
				Log.info("Click action is performed on BRConfigAtt_MetaCallHold_Instance_drpd");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BRConfigAtt_MetaCallHold_Instance_drpd");
				Log.error(e.getMessage());
			}

		}
		
		
		public static void drpdBRMetadataCallHoldDurationIstanceOperator() throws Exception {

			try {

				Utils.ClickEvn(BaseClass.LOCA_BR_BRConfigAtt_MetaCallHold_InstanceOperator_drpd);
				Log.info("Click action is performed on BRConfigAtt_MetaCallHold_InstanceOperator_drpd");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BRConfigAtt_MetaCallHold_InstanceOperator_drpd");
				Log.error(e.getMessage());
			}

		}
		
		public static void txtbxBRMetadataCallHoldDuration(int iTestCaseRow) throws Exception {

			String sBRBG= ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_BR_Sec_Meta_operator_value);
			try {
				Utils.Editsetvalue(BaseClass.LOCA_BR_BRConfigAtt_MetaCallHold_Duration_txtbx, sBRBG);

				Log.info(sBRBG + " is Entered in BRConfigAtt_MetaCallHold_Duration_txtbx");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info(sBRBG + " is not Selected  in BRConfigAtt_MetaCallHold_Duration_txtbx");
				Log.error(e.getMessage());
			}

		}	
		
		public static void drpdBRMetadataCallHoldOccurs() throws Exception {

			try {

				Utils.ClickEvn(BaseClass.LOCA_BR_BRConfigAtt_MetaCallHold_Occurs_drpd);
				Log.info("Click action is performed on BRConfigAtt_MetaCallHold_Occurs_drpd");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BRConfigAtt_MetaCallHold_Occurs_drpd");
				Log.error(e.getMessage());
			}

		}
		
		
		
		public static void txtbxBRMetadataCallHoldOccurs(int iTestCaseRow) throws Exception {

			String sBRBG= ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_BR_Sec_Meta_operator_value);
			try {
				Utils.Editsetvalue(BaseClass.LOCA_BR_BRConfigAtt_MetaCallHold_Occurs_txtbx, sBRBG);

				Log.info(sBRBG + " is Entered in BR_BRConfigAtt_MetaCallHold_Occurs_txtbx");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info(sBRBG + " is not Selected  in BR_BRConfigAtt_MetaCallHold_Occurs_txtbx");
				Log.error(e.getMessage());
			}

		}	
		
		
		public static void drpdBRMetadataAmplitude() throws Exception {

			try {

				Utils.ClickEvn(BaseClass.LOCA_BR_BRConfigAtt_KeyAmplitude_drpd);
				Log.info("Click action is performed on BR_BRConfigAtt_KeyAmplitude_drpd");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BR_BRConfigAtt_KeyAmplitude_drpd");
				Log.error(e.getMessage());
			}

		}
		
		
		
		public static void drpdBRMetadataAmplitudeoccurs() throws Exception {

			try {

				Utils.ClickEvn(BaseClass.LOCA_BR_BRConfigAtt_MetaAmplitude_Occurs_drpd);
				Log.info("Click action is performed on BRConfigAtt_MetaAmplitude_Occurs_drpd");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BRConfigAtt_MetaAmplitude_Occurs_drpd");
				Log.error(e.getMessage());
			}

		}
		
		
		
		public static void txtbxBRMetadataAmplitudeoccurs(int iTestCaseRow) throws Exception {

			String sBRBG= ExcelUtils.getCellData(iTestCaseRow,
					Constant.Col_BR_Sec_Meta_operator_value);
			try {
				Utils.Editsetvalue(BaseClass.LOCA_BR_BRConfigAtt_MetaAmplitude_Occurs_txtbx, sBRBG);

				Log.info(sBRBG + " is Entered in BR_BRConfigAtt_MetaAmplitude_Occurs_txtbx");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info(sBRBG + " is not Selected  in BRConfigAtt_MetaAmplitude_Occurs_txtbx");
				Log.error(e.getMessage());
			}

		}	
		
		
		public static void btnBRAttributeMetaSave() throws Exception {

			try {

				Utils.ClickEvn(BaseClass.LOCA_BR_BRConfigAtt_Meta_add_btn);
				Log.info("Click action is performed on BRConfigAtt_Meta_add_btn");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BRConfigAtt_Meta_add_btn");
				Log.error(e.getMessage());
			}

		}
		
		
		public static void btnBRAttributeMetaCancel() throws Exception {

			try {

				Utils.ClickEvn(BaseClass.LOCA_BR_BRConfigAtt_Meta_cancel_btn);
				Log.info("Click action is performed on BRConfigAtt_Meta_cancel_btn");
			} catch (Exception e) {
				Utils.takeScreenshot1();
				Log.info("Click action is not performed on BRConfigAtt_Meta_cancel_btn");
				Log.error(e.getMessage());
			}

		}
		
		
		
}
