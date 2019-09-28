package pageObjects;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import appModules.BusinessRulesConfig_Action;

import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;

public class BusinessRulesConfig_page extends BaseClass {

	public BusinessRulesConfig_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static void OperatorwithAttribute(int iTestCaseRow) {
		try {
			String sAttriOROperator = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_BusinessRuleName);
			if (sAttriOROperator != "NA") {

				BusinessRulesConfig_Action.lableBROperator();
				BusinessRulesConfig_Action.drpdBROperator(iTestCaseRow);
				BusinessRulesConfig_Action.btnBROperatorAdd();
				BusinessRulesConfig_page.AddAttribute(iTestCaseRow);
				}
			
			else
			{
				Log.info("With out operator or only attributs");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void AddAttribute(int iTestCaseRow) {

		try {
			BusinessRulesConfig_Action.click_lableBRAttribute();

			String existBR = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_BusinessRuleName);
			String keyword = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_BusinessRuleName);
			String Meta = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_BusinessRuleName);
			if (existBR != "NA") {
				BusinessRulesConfig_Action.radioBRAttributeExistBR();
				BusinessRulesConfig_Action.drpdBRAttributeExistBR(iTestCaseRow);
				BusinessRulesConfig_Action.btnBRAttributeExistBRSave();

			} else if (keyword != "NA") {
				BusinessRulesConfig_Action.radioBRAttributekeyword();
				BusinessRulesConfig_Action.drpdBRAttributeChanelType(iTestCaseRow);
				BusinessRulesConfig_Action.drpdBRAttributeInclusiontype(iTestCaseRow);
				BusinessRulesConfig_Action.drpdBRAttributeMatchtype(iTestCaseRow);
				BusinessRulesConfig_Action.listBRAttributekeyword(iTestCaseRow);
				BusinessRulesConfig_Action.drpdBRAttributeChoose();

				String type = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_BusinessRuleName);
				switch (type) {
				case "Add":
					BusinessRulesConfig_Action.labelBRAttributeChooseAdd();
					BusinessRulesConfig_Action.txtbxBRAttributekeywordinput(iTestCaseRow);
					Utils.keyEnter();
					break;
				case "Create":
					BusinessRulesConfig_Action.labelBRAttributeChooseCreate();
					BusinessRulesConfig_Action.txtbxBRAttributekeywordinput(iTestCaseRow);
					BusinessRulesConfig_Action.autobxBRAttributekeywordinput(iTestCaseRow);
					break;
				case "Remove":

					BusinessRulesConfig_Action.labelBRAttributeChooseRemove();
					BusinessRulesConfig_Action.btnBRAttributeChooseRemoveAll();
					break;
				default:
					break;
				}

				BusinessRulesConfig_Action.btnBRAttributeChooseOK();

				BusinessRulesConfig_Action.drpdBRAttributeOffset(iTestCaseRow);
				BusinessRulesConfig_Action.txtbxBRAttributeoffset(iTestCaseRow);
				BusinessRulesConfig_Action.drpdBRAttributeOccurs(iTestCaseRow);
				BusinessRulesConfig_Action.txtbxBRAttributeOccurs(iTestCaseRow);
				BusinessRulesConfig_Action.drpdBRAttributeAmplitude(iTestCaseRow);
				BusinessRulesConfig_Action.btnBRAttributekeywordSave();

			} else if (Meta != "NA") {
				BusinessRulesConfig_Action.radioBRAttributeMeta();
				String Metatype = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_BusinessRuleName);
				switch (Metatype) {
				case "CallDuration":

					BusinessRulesConfig_Action.drpdBRMetadata();
					BusinessRulesConfig_Action.drpdBRMetadataChanel();
					BusinessRulesConfig_Action.drpdBRMetadataCalduration();
					BusinessRulesConfig_Action.txtbxBRMetadataCalduration(iTestCaseRow);

					break;

				case "CallHold":

					BusinessRulesConfig_Action.drpdBRMetadata();
					BusinessRulesConfig_Action.drpdBRMetadataChanel();
					BusinessRulesConfig_Action.drpdBRMetadataCallHoldDurationIstance();
					BusinessRulesConfig_Action.drpdBRMetadataCallHoldDurationIstanceOperator();
					BusinessRulesConfig_Action.txtbxBRMetadataCallHoldDuration(iTestCaseRow);
					BusinessRulesConfig_Action.drpdBRMetadataCallHoldOccurs();
					BusinessRulesConfig_Action.txtbxBRMetadataCallHoldOccurs(iTestCaseRow);

					break;

				case "HighAmplitude":

					BusinessRulesConfig_Action.drpdBRMetadata();
					BusinessRulesConfig_Action.drpdBRMetadataChanel();
					BusinessRulesConfig_Action.drpdBRMetadataAmplitudeoccurs();
					BusinessRulesConfig_Action.txtbxBRMetadataAmplitudeoccurs(iTestCaseRow);

					break;

				case "LowAmplitude":

					BusinessRulesConfig_Action.drpdBRMetadata();
					BusinessRulesConfig_Action.drpdBRMetadataChanel();
					BusinessRulesConfig_Action.drpdBRMetadataAmplitudeoccurs();
					BusinessRulesConfig_Action.txtbxBRMetadataAmplitudeoccurs(iTestCaseRow);

					break;

				default:
					break;
				}
				BusinessRulesConfig_Action.btnBRAttributeMetaSave();

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	
	public static void AddBusinessRuleConfig(int iTestCaseRow) {

		try {

			BusinessRulesConfig_Action.btnClickBR(iTestCaseRow);

			String sLevel = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_BR_Sec_Meta_operator_value);
			switch (sLevel) {

			case "0":
				BusinessRulesConfig_Action.btnParentBR(iTestCaseRow);
				BusinessRulesConfig_Action.btnBRTree(iTestCaseRow);
				BusinessRulesConfig_page.OperatorwithAttribute(iTestCaseRow);
				break;
				
			case "1":
				BusinessRulesConfig_Action.btnHierarchylevel1(iTestCaseRow);
				BusinessRulesConfig_Action.btnBRTree(iTestCaseRow);
				BusinessRulesConfig_page.OperatorwithAttribute(iTestCaseRow);
				break;
				
			case "2":
				BusinessRulesConfig_Action.btnHierarchylevel2(iTestCaseRow);
				BusinessRulesConfig_Action.btnBRTree(iTestCaseRow);
				BusinessRulesConfig_page.OperatorwithAttribute(iTestCaseRow);
				break;
				
			case "3":
				BusinessRulesConfig_Action.btnHierarchylevel3(iTestCaseRow);
				BusinessRulesConfig_Action.btnBRTree(iTestCaseRow);
				BusinessRulesConfig_page.OperatorwithAttribute(iTestCaseRow);
				break;
			case "4":
				BusinessRulesConfig_Action.btnHierarchylevel4(iTestCaseRow);
				BusinessRulesConfig_Action.btnBRTree(iTestCaseRow);
				BusinessRulesConfig_page.OperatorwithAttribute(iTestCaseRow);
				break;
			case "5":
				BusinessRulesConfig_Action.btnHierarchylevel5(iTestCaseRow);
				BusinessRulesConfig_Action.btnBRTree(iTestCaseRow);
				BusinessRulesConfig_page.OperatorwithAttribute(iTestCaseRow);
				break;
			case "6":
				BusinessRulesConfig_Action.btnHierarchylevel6(iTestCaseRow);
				BusinessRulesConfig_Action.btnBRTree(iTestCaseRow);
				BusinessRulesConfig_page.OperatorwithAttribute(iTestCaseRow);
				break;
			case "7":
				BusinessRulesConfig_Action.btnHierarchylevel7(iTestCaseRow);
				BusinessRulesConfig_Action.btnBRTree(iTestCaseRow);
				BusinessRulesConfig_page.OperatorwithAttribute(iTestCaseRow);
				break;
			case "8":
				BusinessRulesConfig_Action.btnHierarchylevel8(iTestCaseRow);
				BusinessRulesConfig_Action.btnBRTree(iTestCaseRow);
				BusinessRulesConfig_page.OperatorwithAttribute(iTestCaseRow);
				break;
			case "9":
				BusinessRulesConfig_Action.btnHierarchylevel9(iTestCaseRow);
				BusinessRulesConfig_Action.btnBRTree(iTestCaseRow);
				BusinessRulesConfig_page.OperatorwithAttribute(iTestCaseRow);
				break;
			case "10":
				BusinessRulesConfig_Action.btnHierarchylevel10(iTestCaseRow);
				BusinessRulesConfig_Action.btnBRTree(iTestCaseRow);
				BusinessRulesConfig_page.OperatorwithAttribute(iTestCaseRow);
				break;
				
				
			

			}

		}

		catch (Exception e) {

			Reporter.log("Unable to add BusinessRule");

			Log.error(e.getMessage());
		}
	}

}
