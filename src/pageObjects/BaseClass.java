package pageObjects;

import org.openqa.selenium.WebDriver;
    public class BaseClass {
	public static WebDriver driver;
	public static boolean bResult;
	public static boolean Jobdata;

	

	
	
	public static final String Loca_Homeicone="//*[@id='home']/a/i";
	public static final String Loca_Home_Button_ReportPage = "//i[@class='md md-home']";
	
	/*User Icon */
	public static final String Loca_User_Icon="//*[@class='md md-account-circle user-logo md-hc-3x p-l-5']";
	public static final String Loca_User_Icon_Change_Password = "//*[@data-href='passwordChange']";
	public static final String Loca_User_Icon_LogOut = "//a[@id='logout-trigger']";
	/* Change Password Screen*/
	public static final String Loca_Old_Password_Textbox = "//*[@id='oldPassword']";
	public static final String Loca_New_Password_Textbox = "//*[@id='newPassword']";
	public static final String Loca_Confirm_Password_Textbox = "//*[@id='confirmPassword']";
	public static final String Loca_Submit_Button_changepwd = "//*[@id='subBtnId']";
	

	/*Login page */
	public static final String Loca_Emailid_txtbx="//*[@id='username']";
	public static final String Loca_Password_txtbx="//*[@id='password']";
	public static final String Loca_Login_btn="//*[@id='login']/div[4]/div/button";
	public static final String Loca_sessionkill_btn = "//button[contains(@id,'sessionKill')]";
	
	/*Logout page */
	public static final String Loca_User_logo="//*[@id='wrapper']/nav/div/div[3]/ul/li/a/i";
	public static final String Loca_Logout_btn="//*[@id='logout-trigger']";
	
	/*CONFIGURE BUSINESS EVALUATORS*/
	public static final String Loca_Config_Dashboard="//*[@id='page-wrapper']/div/div/div/div/div[1]/div";
	public static final String Loca_Config_Dashboard_text="//h3[contains(text(),'CONFIGURE BUSINESS EVALUATORS')]";
	public static final String Loca_Config_Create_btn="//*[@id='create']";
	
	/*Business goal*/
	public static final String Loca_Config_Home_btn= "//*[@id='page-wrapper']/div/div[1]/div[1]/div[2]/a/i";
	public static final String Loca_Config_Business_Evaluators_btn= "//*[@id='page-wrapper']/div/div[1]/div/div/div[1]/div/ul";	
	public static final String Loca_Config_Create_btnh3="//*[@id='create']/h3";
	public static final String Loca_Config_Review_btn="//*[@id='review']";
	public static final String Loca_Config_Import_btn="//*[@id='import']";
	public static final String Loca_Config_Create_BG_BusinessGoal_txtbx="//*[@id='bg-form']/div[1]/div/input";
	public static final String Loca_Config_Create_BG_Description_txtbx="//*[@id='bg-form']/div[2]/div/input";
	public static final String Loca_Config_Create_BG_Category_drp="//*[@id='bg-form']/div[3]/div/select";
	public static final String Loca_Config_Create_BG_Next_btn="//*[@id='next-eval']";
	public static final String Loca_Config_Create_BG_SaveChanges="//*[@id='saveChanges']/div/h5/span[1]";
	public static final String Loca_Config_Create_BG_DiscardChanges="//*[@id='discardChanges']/div/h5/span[1]";
	
	

	
	
	
	
	/*CONFIGURE BUSINESS EVALUATORS*/ 
	
	
	public static final String Loca_Config_tab1_bredscram="//*[@id='tab']/a[1]";
	public static final String Loca_Config_BRhierarchy_recom="//*[@id='recommendationId']";
	
	
	/*Setup System*/
	public static final String Loca_Setupsystem_btn = "//*[@id='admin_home_nav']/div[2]/div/ul";
		
	/*Business goal*/
	public static final String Loca_Config_Import_Category_drp="//*[@id='category']";
//	public static final String Loca_Config_Create_BG_Next_btn="//*[@id='next-eval']";
	public static final String Loca_Config_Popup_Ok_btn="//button[@id='informationId']";
//	public static final String Loca_Config_Create_BG_SaveChanges="//*[@id='saveChanges']/div/h5/span[1]";
//	public static final String Loca_Config_Create_BG_DiscardChanges="//*[@id='discardChanges']/div/h5/span[1]";
	public static final String Loca_Config_Click_OK="//*[@id='informationId']";
	public static final String Loca_Config_Click_DefineGoal_Tab_btn="//*[@id='tab']/a[1]";
	public static final String Loca_Config_Click_DeleteOk = "// *[@id='del-button']";
	
		

	/*Machine Properties*/
	public static final String Loca_MP_HostName_txtbx="//*[@id='input-HostName']";
	public static final String Loca_MP_AuminaRootPath_txtbx="//*[@id='input-AuMinaHome']";
	public static final String Loca_MP_FileCollectionHost_chkbx="//*[@id='input-FileCollectionHost']";
	public static final String Loca_MP_ProcessingNode_chkbx="//*[@id='input-ProcessingNode']";
	public static final String Loca_MP_Description_txtbx="//*[@id='input-Description']";
	public static final String Loca_MP_Sipport_txtbx="//*[@id='input-ProcessingNodeNSSServerSipPort']";
	public static final String Loca_MP_Mrcpport_txtbx="//*[@id='input-ProcessingNodeNSSServerMrcpPort']";
	public static final String Loca_MP_MachineCore_txtbx="//*[@id='input-Core']";
	public static final String Loca_MP_TranscriberInstances_txtbx="//*[@id='input-TranscriberInstances']";
	public static final String Loca_MP_Save="//*[@id='formMachinePropertyFeilds']/div[11]/div/button";
	
	
	/* Reprocess */
	public static final String Loca_Reprocess_btn="//*[@id='side-menu']/li[5]/a/span";
	public static final String Loca_RP_Org_drp="//select[@id='orglist']";
	public static final String Loca_RP_Cat_drp="//select[@id='catlist']";
	public static final String Loca_RP_DatePick="//input[@id='datepickerId']";
	public static final String Loca_RP_ChkBox_SI="//input[@id='SI']";
	public static final String Loca_RP_ChkBox_RptData="//input[@id='reportData']";
	public static final String Loca_RP_btn_Submit="//button[@id='reprocess_save']";
	public static final String Loca_RP_Scroll="//*[@id='ascrail2000']/div";

	
	
	/*Session Time Out  */
	public static final String Loca_Session_Analyze_btn="//*[@id='chartsList']/div/button";
	public static final String Loca_Session_Operationl_drp="//*[@id='side-menu']/li[2]/a/span";
	public static final String Loca_Session_callanalysis_opt="//*[@id='callanalysis']";
	public static final String Loca_Session_firstcall="//table[@id='customer_table']//tbody/tr[1]/td[1]/a";
	
	/*Business goal*/
	public static final String Loca_Config_BG_CategoryCount="//*[@id='page-wrapper']/div/div[2]/div";
    public static final String Loca_Config_BG_Scroll="//*[@id='ascrail2000']/div";
    public static final String Loca_Config_BG_Review_CatCount = "//div[@class='m-t-10']";
    
	
	/*Define Business Rule Hierarchy*/
	public static final String Loca_BR_Root_add_btn="//*[@id='addRootBr']";
	public static final String Loca_BR_linkBr_btn="//*[@id='linkBr']";
	public static final String Loca_BR_Next_btn="//*[@id='nextValId']";
	public static final String Loca_BR_Root_Name_txt="//*[@id='br-name']";
	public static final String Loca_BR_Root_Nonspeach_checkbox="//*[@id='externalId']";
	public static final String Loca_BR_AddTree_btn="//*[@id='brAddTree']";
	public static final String Loca_BR_AddchildBr_btn="//*[@id='addChilBrId']";
	public static final String Loca_BR_Editbr_btn="//*[@id='editBrId']";
	public static final String Loca_BR_deletebr_btn="//*[@id='deleteBrId']";
	public static final String Loca_BR_delinkbr_btn="//*[@id='delinkBrId']";
	public static final String Loca_BR_hierarchy_cancel_btn="//*[@id='ok_cancel']";
	public static final String Loca_BR_child1_name_txt="//*[@id='br-name']";
	public static final String Loca_BR_child2_name_txt="//*[@id='br-child']";
	public static final String Loca_BR_addchild_btn="//*[@id='brAddTree']";
	public static final String Loca_BR_Paranent_count="//*[@id='brHierarchy']/div";
	
	public static final String Loca_BR_Delete_OK_btn = "//button[@id='delButId']";

	/*Configure Business Rule*/
	public static final String Loca_BR_brconfigure_tab="//*[@id='tab']/a[3]";
	public static final String Loca_BR_brconfigure_recomend_btn="//*[@id='recommendationId']";
	public static final String Loca_BR_brconfigure_Brcount="//*[@id='aum-body']/div[2]/div[1]/div[1]/div[2]/div/div[2]/span";
	public static final String Loca_BR_brconfigure_Brparentname_btn="//*[@id='aum-body']/div[2]/div[1]/div[1]/div[2]/div/div[2]/span[i]";
	
	//public static final String Loca_BR_ConfigParanent_count="//*[@id='brConfigTree']/div";
	public static final String Loca_BR_ConfigParanent_name= "//*[@id='brConfigTree']/div/ul/li/a";
	public static final String Loca_BR_ConfigbrHierarchy1_count="//*[@id='brConfigTree']/div/ul/li/ul/li";
	public static final String Loca_BR_ConfigbrHierarchy1_name="//*[@id='brConfigTree']/div/ul/li/ul/li[i]/a";
	public static final String Loca_BR_ConfigbrHierarchy2_count="//*[@id='brConfigTree']/div/ul/li/ul/li/ul/li";
	public static final String Loca_BR_ConfigbrHierarchy2_name="//*[@id='brConfigTree']/div/ul/li/ul/li/ul/li[i]/a";
	public static final String Loca_BR_ConfigbrHierarchy3_count="//*[@id='brConfigTree']/div/ul/li/ul/li/ul/li/ul/li";
	public static final String Loca_BR_ConfigbrHierarchy3_name="//*[@id='brConfigTree']/div/ul/li/ul/li/ul/li/ul/li[i]/a";
	public static final String Loca_BR_ConfigbrHierarchy4_count="//*[@id='brConfigTree']/div/ul/li/ul/li/ul/li/ul/li/ul/li";
	public static final String Loca_BR_ConfigbrHierarchy4_name="//*[@id='brConfigTree']/div/ul/li/ul/li/ul/li/ulli/ul/li[i]/a";
	public static final String Loca_BR_ConfigbrHierarchy5_count="//*[@id='brConfigTree']/div/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li";
	public static final String Loca_BR_ConfigbrHierarchy5_name="//*[@id='brConfigTree']/div/ul/li/ul/li/ul/li/ulli/ul/li/ul/li[i]/a";
	public static final String Loca_BR_ConfigbrHierarchy6_count="//*[@id='brConfigTree']/div/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li";
	public static final String Loca_BR_ConfigbrHierarchy6_name="//*[@id='brConfigTree']/div/ul/li/ul/li/ul/li/ulli/ul/li/ul/li/ul/li[i]/a";
	public static final String Loca_BR_ConfigbrHierarchy7_count="//*[@id='brConfigTree']/div/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li";
	public static final String Loca_BR_ConfigbrHierarchy7_name="//*[@id='brConfigTree']/div/ul/li/ul/li/ul/li/ulli/ul/li/ul/li/ul/li/ul/li[i]/a";
	public static final String Loca_BR_ConfigbrHierarchy8_count="//*[@id='brConfigTree']/div/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li";
	public static final String Loca_BR_ConfigbrHierarchy8_name="//*[@id='brConfigTree']/div/ul/li/ul/li/ul/li/ulli/ul/li/ul/li/ul/li/ul/li/ul/li[i]/a";
	public static final String Loca_BR_ConfigbrHierarchy9_count="//*[@id='brConfigTree']/div/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li";
	public static final String Loca_BR_ConfigbrHierarchy9_name="//*[@id='brConfigTree']/div/ul/li/ul/li/ul/li/ulli/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li[i]/a";
	public static final String Loca_BR_ConfigbrHierarchy10_count="//*[@id='brConfigTree']/div/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li";
	public static final String Loca_BR_ConfigbrHierarchy10_name="//*[@id='brConfigTree']/div/ul/li/ul/li/ul/li/ulli/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li/ul/li[i]/a";
	
	
	
	

	
	public static final String LOCA_BR_Tree_btn ="//*[@id='br_tree']/li/a/span/i";
	public static final String LOCA_BR_DisplayinAlerts="//*[@id='isAlertable']";
	public static final String LOCA_BR_BRConfig_Attribute_btn ="//*[@id='headradio']/div/label[1]";
	public static final String LOCA_BR_BRConfig_Operator_btn = "//*[@id='headradio']/div/label[2]";
	public static final String LOCA_BR_BRConfig_Operator_drpd = "//*[@id='operator_option']";
	public static final String LOCA_BR_BRConfig_Operator_add_btn="//*[@id='add_br_operator']";
	public static final String LOCA_BR_BRConfig_Operator_Cancel_btn="//*[@id='operator_list_footer']/button[1]";
	public static final String LOCA_BR_BRConfig_Attribute_ExistingBR_radio="//*[@id='op_label_br']";
	public static final String LOCA_BR_BRConfig_Attribute_keyword_radio="//*[@id='op_label_audioattr']";
	public static final String LOCA_BR_BRConfig_Attribute_Metadata_radio="//*[@id='op_label_metadata']";
	public static final String LOCA_BR_BRConfigAtt_ExistBR_drpd = "//*[@id='BR_option']";
	public static final String LOCA_BR_BRConfigAtt_ExistBR_add_btn="//*[@id='add_br_businessrule']";
	public static final String LOCA_BR_BRConfigAtt_ExistBR_Cancel_btn="//*[@id='BR_list_footer']/button[1]";
	public static final String LOCA_BR_BRConfigAtt_KeyChannel_drpd = "//*[@id='channel_option']";
	public static final String LOCA_BR_BRConfigAtt_KeyInclusion_drpd = "//*[@id='inclusion_option']";
    public static final String LOCA_BR_BRConfigAtt_KeyMatch_drpd = "//*[@id='match_option']";
    public static final String LOCA_BR_BRConfigAtt_keywordbox_btnorlist="//*[@id='keyword_in_div']/div[1]";
    public static final String LOCA_BR_BRConfigAtt_choosekeyword_drpd="//*[@id='keywordModal']/div[1]/div/div[2]/div[1]/div/div[1]/div/div[1]/button[2]";
    public static final String LOCA_BR_BRConfigAtt_choosekeyword_add_lable="//*[@id='dm-clk']/li[1]";
    public static final String LOCA_BR_BRConfigAtt_choosekeyword_create_lable="//*[@id='dm-clk']/li[2]";
    public static final String LOCA_BR_BRConfigAtt_choosekeyword_Remove_lable="//*[@id='dm-clk']/li[3]";
    public static final String LOCA_BR_BRConfigAtt_choosekeyword_RemoveAll_btn="//*[@id='RemoveButton']";
    public static final String LOCA_BR_BRConfigAtt_choosekeyword_keywordinput="//*[@id='addKeywordInput']";
    public static final String LOCA_BR_BRConfigAtt_choosekeyword_Firstkeyword="//*[@id='kw-drop']/ul/li[1]";
    public static final String LOCA_BR_BRConfigAtt_choosekeyword_keywordinput_ok_btn="//*[@id='keywordModal']/div[1]/div/div[2]/div[2]/div/button";
    public static final String LOCA_BR_BRConfigAtt_KeyOffset_drpd = "//*[@id='span_option']";
    public static final String LOCA_BR_BRConfigAtt_KeyOffset_txtbx = "//*[@id='spanoffset_text']";
    public static final String LOCA_BR_BRConfigAtt_KeyOccurs_drpd = "//*[@id='occurs_option']";
	public static final String LOCA_BR_BRConfigAtt_KeyOccurs_txtbx = "//*[@id='occursoffset_text']";
	public static final String LOCA_BR_BRConfigAtt_KeyAmplitude_drpd = "//*[@id='amplitude_option']";
    public static final String LOCA_BR_BRConfigAtt_add_btn="//*[@id='add_br_audiokeyword']";	 
	public static final String LOCA_BR_BRConfigAtt_Cancel_btn="//*[@id='audioattribute_footer']/button[1]";
	public static final String LOCA_BR_BRConfigAtt_Metadata_drpd = "//*[@id='metadata_option']";
	public static final String LOCA_BR_BRConfigAtt_MetaChannel_drpd = "//*[@id='channelList_option']";
	public static final String LOCA_BR_BRConfigAtt_MetaCallDuration_drpd ="//*[@id='callDuration_occurs_option']";
	public static final String LOCA_BR_BRConfigAtt_MetaCallDuration_txtbx = "//*[@id='callDuration_occurs_text']";
	public static final String LOCA_BR_BRConfigAtt_MetaCallHold_Instance_drpd = "//*[@id='callHold_instance_option']";
	public static final String LOCA_BR_BRConfigAtt_MetaCallHold_InstanceOperator_drpd = "//*[@id='callHold_lengthoccurs_option']";
	public static final String LOCA_BR_BRConfigAtt_MetaCallHold_Duration_txtbx = "//*[@id='callHold_lengthoccurs_text']";
	public static final String LOCA_BR_BRConfigAtt_MetaCallHold_Occurs_drpd = "//*[@id='callHold_occurs_option']";
	public static final String LOCA_BR_BRConfigAtt_MetaCallHold_Occurs_txtbx = "//*[@id='callHold_occurs_text']";
	public static final String LOCA_BR_BRConfigAtt_MetaAmplitude_Occurs_drpd = "//*[@id='amplitude_occurs_option']";
	public static final String LOCA_BR_BRConfigAtt_MetaAmplitude_Occurs_txtbx = "//*[@id='amplitude_occurs_text']";
	public static final String LOCA_BR_BRConfigAtt_Meta_add_btn="//*[@id='add_br_metadata']";
	public static final String LOCA_BR_BRConfigAtt_Meta_cancel_btn="//*[@id='metadata_footer']/button[1]";
	public static final String LOCA_BR_BRConfig_save_btn="//*[@id='saveclosebr']";
	public static final String LOCA_BR_BRConfig_Edit1_link="//*[@id='br_tree']/li/span/a[1]/span/i";
	public static final String LOCA_BR_BRConfig_addasparent1_link="//*[@id='br_tree']/li/span/a[2]/span/i";
	public static final String LOCA_BR_BRConfig_delete1_link="//*[@id='br_tree']/li/span/a[3]/span/i";	
	public static final String LOCA_BR_BRConfig_Edit2_link="//*[@id='br_tree']/li/ul/li[1]span/a[1]/span/i";
	public static final String LOCA_BR_BRConfig_addasparent2_link="//*[@id='br_tree']/li/ul/li[1]span/a[2]/span/i";
	public static final String LOCA_BR_BRConfig_delete2_link="//*[@id='br_tree']/li/ul/li[1]span/a[3]/span/i";	
	public static final String LOCA_BR_BRConfig_Edit3_link="//*[@id='br_tree']/li/ul/li[2]span/a[1]/span/i";
	public static final String LOCA_BR_BRConfig_addasparent3_link="//*[@id='br_tree']/li/ul/li[2]span/a[2]/span/i";
	public static final String LOCA_BR_BRConfig_delete3_link="//*[@id='br_tree']/li/ul/li[2]span/a[3]/span/i";
	
	//Admin Landing Page
	public static final String LOCA_Warning_Popup = "//div[@id='warnModal']//h4[@id='mess_header']";
	public static final String LOCA_Warning_OK_Btn = "//button[@id='warn_confirm']";
	public static final String LOCA_Setup_Entity = "//h3[contains(text(),'SET UP ENTITIES')]";
	public static final String LOCA_Setup_Entity_Pic = "div[@class='white-box waves-effect waves-light db z-depth-5']//ul[@class='list-inline two-part']";
	// ********************************************** Users Module **************************************************
	/* Configure Category */
	



	public static final String LOCA_SetUpEntities_Button = "//*[@id='setupentityId']";
	public static final String LOCA_SetUpEntites_Review_Button = "//*[@id='reviewId']";
	public static final String LOCA_Category_Tab = "//*[@id='tab']/a[2]";
	public static final String LOCA_ReviewOrg = "//*[@id='page-wrapper']/div/div[2]/div/div/div/form/div";
	public static final String LOCA_Cat_CatName_TxtBx = "//*[@id='categoryName']";
	public static final String LOCA_Cat_CatName_label = "//*[@id='category-Form']/div[1]/label";
	public static final String LOCA_Cat_StereoCat_RadioBtn = "//*[@id='stereo']";
	public static final String LOCA_Cat_MonoCat_RadioBtn = "//*[@id='mono']";
	public static final String LOCA_Cat_SDON_RadioBtn = "//*[@id='sdon']";
	public static final String LOCA_Cat_SDOFF_RadioBtn = "//*[@id='sdoff']";
	public static final String LOCA_Cat_EvalEngine_DrpDwn = "//*[@id='brengineSelectId']";
	public static final String LOCA_Cat_TransEng_DrpDwn = "//*[@id='transcriptionEngine']";
	public static final String LOCA_Cat_LAngDetection_ChkBox = "//*[@id='ldCheck']";
	public static final String LOCA_Cat_TransLang_DrpDwn = "//*[@id='singleLangDiv']/div[1]/span/span[1]/span/ul";
	public static final String LOCA_Cat_TransLang_DrpDwn1 = "//*[@id='singleLangDiv']/div[1]/span/span[1]/span/ul/li/input";
	public static final String LOCA_Cat_TransLangDrpDwn3 = "//*[@id='select2-langSelect-container']";
	

	public static final String LOCA_Cat_AgntLang_DrpDwn = "//*[@id='languagesDiv']/div[1]/div[1]/span/span[1]/span/ul";

	public static final String LOCA_Cat_AgntLang_DrpDwn1="//*[@id='languagesDiv']/div[1]/div[1]/span/span[1]/span/ul/li/input";
	//public static final String LOCA_Cat_AgntLang_DrpDwn2 = "/html/body/span/span/span/*[@id='select2-multi-agentlang-results']/li[1]";
	public static final String LOCA_Cat_AgntLang_DrpDwn3 = "//*[@id='select2-single-agentlang-container']";
	
	public static final String LOCA_Cat_CustLang_DrpDwn = "//*[@id='languagesDiv']/div[2]/div[1]/span/span[1]/span/ul";
	public static final String LOCA_Cat_CustLang_DrpDwn1 = "//*[@id='languagesDiv']/div[2]/div[1]/span/span[1]/span/ul/li/input";
	
	public static final String LOCA_Cat_CustLang_DrpDwn3 ="//*[@id='select2-single-custlang-container']";
	
	public static final String LOCA_Cat_ProfileParam_Button = "//*[@id='btnProfile']";
	public static final String LOCA_Cat_Add_Button = "//*[@id='btnPlusCat']";
	
	public static final String LOCA_Cat_ExistCatName_Button = "//*[@id='parent']/div";
	public static final String LOCA_Cat_PopUpDelete_Button = "//*[@id='del-button']";
	public static final String LOCA_Cat_CancelIConPopUp_Button = "//*[@id='message']/div/div/div[1]/button";
	public static final String LOCA_Cat_ExistCatName1_Button = "//*[@id='set']";
	
	public static final String LOCA_admin_logo = "//*[@id='wrapper']/nav/div/div[3]/ul/li/a/i";
	public static final String LOCA_admin_logout = "//*[@id='logout-trigger']";
	
	//Admin Setup Entity
	public static final String LOCA_Create_Btn = "//h3[contains(text(),'CREATE')]";
	// Navigate to users page
	public static final String LOCA_Reviewbtn ="//h3[text()[normalize-space()='REVIEW']]";
	public static final String LOCA_OrgName = "//div[text()[normalize-space()='Report Data Testing Organization']]";
	public static final String LOCA_Defineuserbtn = "//a[@data-href='userPage']";
	public static final String LOCA_Userheader = "//h2[text()='Define Users']";

	public static final String LOCA_Cat_SingleLang_DrpDwn = "/html/body/span/span/span[1]/input";
	
	//Admin Create Org
	public static final String LOCA_Org_Input_txtbx = "//input[@id='organization']";
	public static final String LOCA_Domain_drpd = "//select[@id='domain']";
	public static final String LOCA_Save_Org_Btn = "//button[@id='saveOrg']";
	public static final String LOCA_Save_Popup = "//span[contains(text(),'save changes')]";
	
	
	
	
	// Mail Notification
		public static final String LOCA_MN_Status_ON_Radiobtn="//*[@id=\'mailOn\']";
		public static final String LOCA_MN_Status_OFF_Radiobtn="//*[@id='mailOff']";
		public static final String LOCA_MN_NotificationTime_txtbx="//*[@id='notificationtimeId']";
		public static final String LOCA_MN_EmailRecipens_txtbx = "//*[@id='recipientsId']";
		public static final String LOCA_MN_Mailnotification_Save="//*[@id='mailScheduleDataSave']";
		
		
		public static final String LOCA_MN_SetupSystem= "//h3[contains(text(),'SET UP SYSTEM')]";
		public static final String LOCA_license_btn = "//button[@type='button'][contains(@id,'confirm')][contains(.,'OK')]";
		public static final String LOCA_color_jobsche= "//div[@class='sidebar-nav navbar-collapse slimscrollsidebar']/ul/li[4]";
		public static final String LOCA_jobsche_options_text = "//div[@class='sidebar-nav navbar-collapse slimscrollsidebar']/ul/li[4]/ul/li";
		public static final String LOCA_jobsche_options = "//div[@class='sidebar-nav navbar-collapse slimscrollsidebar']/ul/li[4]/ul/li";
		public static final String LOCA_MN_jobsche = "//ul[@class='nav']/li[4]";
		public static final String 	LOCA_MN_Mailntfn = "//ul[@class='nav']/li[4]/ul/li[2]";
		public static final String LOCA_MN_tabs ="//div[@class='sidebar-nav navbar-collapse slimscrollsidebar']/ul/li";
		public static final String LOCA_MN_Logoutbtn = "//i[contains(@class,'md md-account-circle user-logo md-hc-3x p-l-5')]";
		public static final String LOCA_MN_Logouttrigger ="//a[@id='logout-trigger']";
		//public static final String 	LOCA_MN_NotificationTime ="//input[@id='notificationtimeId']";
		public static final String  LOCA_MN_Email ="//input[@id='recipientsId']";
		public static final String  LOCA_MN_Save = "//button[@id='mailScheduleDataSave']";
		public static final String LOCA_MN_Jobdata ="//span[contains(text(),'Job Data updated Successfully')";
		public static final String  LOCA_MN_jobschemsehvr = "//ul[@class='nav']/li[4]";
		public static final String 	LOCA_MN_Mailntfnmsehvr = "//ul[@class='nav']/li[4]/ul/li[2]";
		public static final String LOCA_MN_JS="//a[contains(@class,'waves-effect top')])[1]";
		public static final String LOCA_MN_Hmebtn ="//a[contains(@class,'btn btn-info btn-circle btn-lg home-btn waves-effect waves-light')]";
		public static final String LOCA_MN_discrdchange = "//span[contains(.,'discard changes')]";
		public static final String LOCA_MN_Machineprop = "//span[contains(.,'Machine Properties')]";
		//public static final String LOCA_MN_Logoutbtn = "//i[contains(@class,'md md-account-circle user-logo md-hc-3x p-l-5')]";
		
		public static final String LOCA_MN_Invalid ="//li[contains(.,'Invalid')]";
	
	
	
	
	
	//Score
	public static final String LOCA_Sc_Home = "//div/a/i[@class='md md-home']";
	public static final String LOCA_Sc_CBE ="//div[@class='row']/div/div[@data-target='#conf-breval']";
	public static final String LOCA_Sc_Review="//div/div[@id='review']";
	public static final String LOCA_Sc_Name ="//input[contains(@id,'scoreName')]";
	public static final String LOCA_Sc_Descrptn ="//input[@id='scoreDescription']";
	public static final String LOCA_Sc_Range ="//input[contains(@name,'rangeName')]";
	public static final String LOCA_Sc_Range_Value="//input[contains(@id,'slabEnd1')]";
	public static final String LOCA_Sc_PositvScore_chkbx ="//input[contains(@id,'isHighScoregood')]";
	public static final String LOCA_Sc_MoniteredScore_chkbx="//input[@id='isqamonitoredscore']";
	public static final String LOCA_Sc_ScComponentName="(//input[contains(@autocomplete,'off')])[5]";
	public static final String LOCA_Sc_FatalErrChkbx="//input[@id='fatal_1']";
	public static final String LOCA_Sc_Weightage="//input[@id='weightage_1']";
	public static final String LOCA_Sc_RangeDelete="//i[contains(@class,'fa fa-trash-o border-icon cursor_pointer deleteRangeTag')]";
	public static final String LOCA_Sc_RangeAdd="//i[@id='addrangerow']";
	public static final String LOCA_Sc_NxtBtn="//button[@id='SaveAndNext']";
	public static final String LOCA_Sc_MainAddBtn="(//i[contains(@class,'fa fa-plus')])[4]";
	public static final String LOCA_Sc_Tableadd="//i[@class='fa fa-plus addrow fa-6 pull-right']";
	public static final String LOCA_Sc_TableDelete ="//i[@class='fa fa-trash-o deleterow pull-right']";
	public static final String LOCA_Sc_Informationpopup="//button[@id='informationId']";
	public static final String LOCA_Sc_Score="//a[@data-href='confScore']";
	public static final String LOCA_SC_ScComponentType="//select[contains(@id,'sctypeselect_1')]";
	public static final String LOCA_SC_ScCompType_options_text = "//select[@class='sctype form-control']/option";
	public static final String LOCA_SC_BusinessruleType_option_text="//select[@class='brmddrop form-control']/option";
   
	
	
	
		
	
	
	
	//Organization page next button	public static final String LOCA_Setupentities = "//h3[contains(text(),'SET UP ENTITIES')]";

	public static final String LOCA_revieworg_nxtbtn = "//button[contains(.,'Next')]";
	public static String LOCA_definecat = "//a[contains(.,'Define Category')]";
	
	//category page
	public static String LOCA_disable_nxt_btn = "//button[@class='btn btn-primary pull-left show-popup disabled']";
	
	// Users Page
	
	public static final String LOCA_defineusers_disable = "//a[@class='tab-disabled'][contains(.,'Define Users')]";
	
	public static final String LOCA_catscrn_next_btn = "//button[@class='btn btn-primary pull-left show-popup'][contains(.,'Next')]";
	public static final String LOCA_USER_Displayname = "//input[contains(@id,'displayName')]";
	public static final String LOCA_USER_Role= "//label[text()='Quality Analyst']/../input";
	public static final String LOCA_Email = "//input[contains(@id,'email')]";
	public static final String LOCA_ExternalID = "//input[contains(@id,'externalID')]";
	public static final String LOCA_UserName = "//input[contains(@id,'userName')]";
	public static final String LOCA_Password ="//input[@id='password']";
	public static final String LOCA_ConfirmPassword ="//input[contains(@id,'re-enterPassword')]";
	//public static final String LOCA_addUsers = "//i[contains(@class,'fa fa-plus')]";
	
	public static final String LOCA_addUsers = "//button[@id='saveUser']";
	public static final String LOCA_successpopup_msg = "//span[contains(.,'User Added Successfully!')]";
	
	
	public static final String LOCA_Users_scrollbar = "//div[@class = 'btn-demo scrollBarCustom']";
	
	
	public static final String LOCA_Users_DefaultRole ="//span[@id='select2-filter-by-role-container']";

	public static final String LOCA_Users_getUserspath = "//div/div/div/div[@class='btn-demo scrollBarCustom']";
	
	public static final String LOCA_users_homeicon = "//i[contains(@class,'md md-home')]";
	
	public static final String LOCA_users_savechanges_btn = "//span[contains(.,'save changes')]";
	public static final String LOCA_users_discardchanges_btn = "//span[contains(.,'discard changes')]";
	
	public static final String LOCA_users_importagents_btn = "//button[contains(.,'Import Agents')]";
	public static final String LOCA_users_downloadtemplate_btn = "//button[contains(.,'Download Template')]";
	
	public static final String LOCA_users_uploadFile_filed = "//input[contains(@id,'simpleUpload')]";
	
	public static final String LOCA_users_uploadFile_btn = "//button[@type='button'][contains(.,'Upload')]";
	
	public static final String LOCA_users_filebrowse_field = "//input[contains(@id,'simpleUpload')]";
	
	
	
	public static final String LOCA_users_updateuser_btn = "//i[contains(@class,'fa fa-plus')]";
	
	public static final String LOCA_users_displayname_val = "//li[contains(.,'Required')]";
	public static final String LOCA_users_displayname_val1 = "//li[contains(.,'Can contain only letters and spaces')]";
	public static final String LOCA_users_displayname_limit = "//li[contains(.,'Display Name length should be a minimum of 3 characters')]";
	
	
	public static final String LOCA_users_email_val = "//div[@class='help-block with-errors']/ul/li[contains(.,'Enter a valid email address.')]";
	public static final String LOCA_users_email_val1 = "//div[@class='help-block with-errors']/ul/li[contains(.,'Required')]";
	
	public static final String LOCA_homepage_license_popup = "//button[@type='button'][contains(@id,'confirm')][contains(.,'OK')]";
	
	public static final String LOCA_Users_logoutdropdown = "//i[contains(@class,'md md-account-circle user-logo md-hc-3x p-l-5')]";
	public static final String LOCA_Users_Logout = "//a[contains(.,'Logout')]";
	public static final String LOCA_Logout_login = "//div[@class='login_container']";
	
	public static final String LOCA_defineorg_nextbtn = "//button[contains(@id,'updateOrg')]";
	public static final String LOCA_definecat_nextbtn = "//button[contains(@id,'btnNextcat')]";
	
	public static final String import_agent_popup = "//h4[@class='modal-title'][contains(.,'IMPORT AGENTS')]";
	
	public static final String LOCA_users_usernameval = "(//li[contains(.,'Required')])[2]";
	public static final String LOCA_users_usernameval1 = "//li[contains(.,'User Name length should be a minimum of 3 characters.It accepts only alphanumeric and underscore and should start and end with only alphabets.Double underscore is not allowed.')]";
	
	
	public static final String LOCA_users_externalIDval = "(//li[contains(.,'Required')])[3]";
	public static final String LOCA_users_externalIDval1 = "//li[contains(.,'Only Alphanumeric Character are allowed.')]";
	
	
	public static final String LOCA_users_passwordval = "(//li[contains(.,'Required')])[4]";	
	public static final String LOCA_users_passwordval1 = "//li[contains(.,'Password length should be a minimum of 8 characters.It must contain alphanumeric characters and at least one uppercase letter,one lowercase letter,one number and one special character.Space is not allowed.')]";
	
	public static final String LOCA_users_confirmpassword_val = "(//li[contains(.,'Required')])[2]";
	public static final String LOCA_users_confirmpassword_val1 = "//li[contains(.,'Confirm Password and Password do not match.')]";
			
	//Reportproess page
	public static final String LOCA_setup_system_btn = "//div[@class='col-md-3 col-sm-3 col-xs-12'][contains(.,'SET UP SYSTEM')]";
	public static final String LOCA_Reprocess_btn = "//span[@class='hide-menu'][contains(.,'Reprocess')]";
	public static final String LOCA_reprocesslicense_ok_btn = "//button[@type='button'][contains(@id,'confirm')][contains(.,'OK')]";

public static final String LOCA_reportprocess_title = "//div[@id='reportProcessId']/h2[contains(.,'Report Process')]";
	public static final String LOCA_reportProcess_radioOn = "//input[contains(@id,'reportOn')]";
	public static final String LOCA_reportProcess_radioOff = "//input[contains(@id,'reportOff')]";
	public static final String LOCA_reportProcess_color = "//a[contains(.,'Report Process')]";
	public static final String LOCA_reportProcess_color_val = "//a[contains(.,'Report Process')]";
	public static final String LOCA_reportprocess_scheduletime = "//input[contains(@id,'reportTime')]";
	public static final String LOCA_license_ok_btn = "//button[@type='button'][contains(@id,'confirm')][contains(.,'OK')]";
	// Home page 
	public static final String LOCA_Setupentities = "//h3[contains(text(),'SET UP ENTITIES')]";
	public static final String LOCA_setupentities_loc = "//div[@class='col-md-3 col-sm-3 col-xs-12'][contains(.,'SET UP ENTITIES')]";

	public static final String LOCA_reportprocess_jobschetext= "//span[text()[normalize-space()='Job Scheduler']]";
	
	

	
	
	
	

    public  BaseClass(WebDriver driver){
		BaseClass.driver = driver;
		BaseClass.bResult = true;
}
}
