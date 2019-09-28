package pageObjects;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import utility.Constant;
import utility.ExcelUtils;
import utility.Log;
import utility.Utils;
import appModules.BusinessRulesHierarchy_Action;





public class BusinessRulesHierarchy_Page extends BaseClass {
	
 
	 
	 public BusinessRulesHierarchy_Page(WebDriver driver)
	 {
		 super(driver);
	 }
	 

		 
	 public static  void AddBusinessRuleHierarchy(int iTestCaseRow)
		{
			
			try
			{
				String sLevel= ExcelUtils.getCellData(iTestCaseRow,Constant.Col_Hiearchylevel);
				switch(sLevel)
				
				{
				

						case "0": 
							BusinessRulesHierarchy_Action.btnAddBusinessRule();
							BusinessRulesHierarchy_Action.txtRootBusinessRuleName(iTestCaseRow);
							BusinessRulesHierarchy_Action.btnokBusinessRule();		
							 break;
						 	
						case "1":
						
							BusinessRulesHierarchy_Action.btnParentBR(iTestCaseRow);												
							BusinessRulesHierarchy_Action.btnAddBusinessRule2();							
							BusinessRulesHierarchy_Action.txtChild1BusinessRuleName(iTestCaseRow);						
							BusinessRulesHierarchy_Action.txtChild2BusinessRuleName(iTestCaseRow);
							BusinessRulesHierarchy_Action.btnokBusinessRule();
				
							break; 
							
							
						case "2":	
							
							BusinessRulesHierarchy_Action.btnHierarchylevel1(iTestCaseRow);
							BusinessRulesHierarchy_Action.btnAddBusinessRule2();
							BusinessRulesHierarchy_Action.txtChild1BusinessRuleName(iTestCaseRow);
							BusinessRulesHierarchy_Action.txtChild2BusinessRuleName(iTestCaseRow);
							BusinessRulesHierarchy_Action.btnokBusinessRule();
							break;  
						
						
						case "3":	
							BusinessRulesHierarchy_Action.btnHierarchylevel2(iTestCaseRow);
							BusinessRulesHierarchy_Action.btnAddBusinessRule2();
							BusinessRulesHierarchy_Action.txtChild1BusinessRuleName(iTestCaseRow);
							BusinessRulesHierarchy_Action.txtChild2BusinessRuleName(iTestCaseRow);
							BusinessRulesHierarchy_Action.btnokBusinessRule();
							
						break;  
						
						case "4":	
							BusinessRulesHierarchy_Action.btnHierarchylevel3(iTestCaseRow);
							BusinessRulesHierarchy_Action.btnAddBusinessRule2();
							BusinessRulesHierarchy_Action.txtChild1BusinessRuleName(iTestCaseRow);
							BusinessRulesHierarchy_Action.txtChild2BusinessRuleName(iTestCaseRow);
							BusinessRulesHierarchy_Action.btnokBusinessRule();
							
						break;
						
						case "5":	
							BusinessRulesHierarchy_Action.btnHierarchylevel4(iTestCaseRow);
							BusinessRulesHierarchy_Action.btnAddBusinessRule2();
							BusinessRulesHierarchy_Action.txtChild1BusinessRuleName(iTestCaseRow);
							BusinessRulesHierarchy_Action.txtChild2BusinessRuleName(iTestCaseRow);
							BusinessRulesHierarchy_Action.btnokBusinessRule();
							
						break;  
			
			
						case "6":	
							BusinessRulesHierarchy_Action.btnHierarchylevel5(iTestCaseRow);
							BusinessRulesHierarchy_Action.btnAddBusinessRule2();
							BusinessRulesHierarchy_Action.txtChild1BusinessRuleName(iTestCaseRow);
							BusinessRulesHierarchy_Action.txtChild2BusinessRuleName(iTestCaseRow);
							BusinessRulesHierarchy_Action.btnokBusinessRule();
							
						break;  
			
						case "7":	
							BusinessRulesHierarchy_Action.btnHierarchylevel6(iTestCaseRow);
							BusinessRulesHierarchy_Action.btnAddBusinessRule2();
							BusinessRulesHierarchy_Action.txtChild1BusinessRuleName(iTestCaseRow);
							BusinessRulesHierarchy_Action.txtChild2BusinessRuleName(iTestCaseRow);
							BusinessRulesHierarchy_Action.btnokBusinessRule();
							
						break;
						
						case "8":	
							BusinessRulesHierarchy_Action.btnHierarchylevel7(iTestCaseRow);
							BusinessRulesHierarchy_Action.btnAddBusinessRule2();
							BusinessRulesHierarchy_Action.txtChild1BusinessRuleName(iTestCaseRow);
							BusinessRulesHierarchy_Action.txtChild2BusinessRuleName(iTestCaseRow);
							BusinessRulesHierarchy_Action.btnokBusinessRule();
							
						break;
		  
						case "9":	
							BusinessRulesHierarchy_Action.btnHierarchylevel8(iTestCaseRow);
							BusinessRulesHierarchy_Action.btnAddBusinessRule2();
							BusinessRulesHierarchy_Action.txtChild1BusinessRuleName(iTestCaseRow);
							BusinessRulesHierarchy_Action.txtChild2BusinessRuleName(iTestCaseRow);
							BusinessRulesHierarchy_Action.btnokBusinessRule();
							
						break;
		  
						case "10":	
							BusinessRulesHierarchy_Action.btnHierarchylevel9(iTestCaseRow);
							BusinessRulesHierarchy_Action.btnAddBusinessRule2();
							BusinessRulesHierarchy_Action.txtChild1BusinessRuleName(iTestCaseRow);
							BusinessRulesHierarchy_Action.txtChild2BusinessRuleName(iTestCaseRow);
							BusinessRulesHierarchy_Action.btnokBusinessRule();
							
						break;
						
						case "11":	
							BusinessRulesHierarchy_Action.btnHierarchylevel10(iTestCaseRow);
							BusinessRulesHierarchy_Action.btnAddBusinessRule2();
							BusinessRulesHierarchy_Action.txtChild1BusinessRuleName(iTestCaseRow);
							BusinessRulesHierarchy_Action.txtChild2BusinessRuleName(iTestCaseRow);
							BusinessRulesHierarchy_Action.btnokBusinessRule();
							
						break;
		  
				}


		

			Utils.takeScreenshot1();

			}
			
catch (Exception e) {
				
				Reporter.log("Unable to add BusinessRule");
				
				 Log.error(e.getMessage());
			
			}
	 
		}
	
	 
	
			
	

	
	 
}


