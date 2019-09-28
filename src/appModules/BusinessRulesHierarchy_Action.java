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

public class BusinessRulesHierarchy_Action extends BaseClass {

	public BusinessRulesHierarchy_Action(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/* ~~~~~~~~~~~BusinessRule Details~~~~~~~~~~~~~~ */
	public static void btnAddBusinessRule() throws Exception {

		try {

			Utils.ClickEvn(BaseClass.Loca_BR_Root_add_btn);
			Thread.sleep(1200);
			Log.info("Click action is performed on Add BusinessRule btn");
		} catch (Exception e) {
			Utils.takeScreenshot1();

			Log.info("Click action is not performed on Add BusinessRule btn");
			Log.error(e.getMessage());
		}

	}

	public static void txtRootBusinessRuleName(int iTestCaseRow) throws Exception {

		String sBRName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ParentBR);
		try {
			Utils.Editsetvalue(BaseClass.Loca_BR_Root_Name_txt, sBRName);

			Log.info(sBRName + " is entered in RootBusinessRule text box");
		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info(sBRName + " is not entered in RootBusinessRule text box");
			Log.error(e.getMessage());
		}

	}

	public static void checkboxkNonspeach() throws Exception {

		try {

			Utils.ClickEvn(BaseClass.Loca_BR_Root_Nonspeach_checkbox);
			Log.info("Click action is performed on Add Nonspeach checkbox");
		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("Click action is not performed on Add Nonspeach checkbox");
			Log.error(e.getMessage());
		}

	}

	public static void btnParentBR(int iTestCaseRow) throws Exception {
		
		String sBRName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ParentBR);

		try {

			List<WebElement> G1 = Utils.getWebelements(BaseClass.Loca_BR_Paranent_count);

			int temp = G1.size();

			for (int i = 1; i <= temp; i++) {
				WebElement BRName = driver.findElement(By.xpath("//*[@id='brHierarchy']/div[" + i + "]/ul/li/a"));

				if (BRName.getText().equals(sBRName)) {
					BRName.click();
					Thread.sleep(1200);
					Log.info("Click action is performed on BR name btn");

				}
			}

		} catch (Exception e) {
			Utils.takeScreenshot1();

			Log.info("Click action is not performed on BR name btn");
			Log.error(e.getMessage());
		}

	}

	public static void btnAddBusinessRule2() throws Exception {

		try {

			Utils.ClickEvn(BaseClass.Loca_BR_AddchildBr_btn);
			Thread.sleep(1200);
			Log.info("Click action is performed on Add BusinessRule2 btn");
		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("Click action is not performed on Add BusinessRule2 btn");
			Log.error(e.getMessage());
		}

	}

	public static void txtChild1BusinessRuleName(int iTestCaseRow) throws Exception {

		String sBRName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_BusinessRuleName1);
		try {
			Utils.Editsetvalue(BaseClass.Loca_BR_child1_name_txt, sBRName);

			Log.info(sBRName + " is entered in child1BusinessRule text box");
		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info(sBRName + " is not entered in child1BusinessRule text box");
			Log.error(e.getMessage());
		}

	}

	public static boolean txtChild2BusinessRuleName(int iTestCaseRow) throws Exception {

		String sBRName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_BusinessRuleName2);
		try {
			if (Utils.IsVisible(BaseClass.Loca_BR_child2_name_txt)) {

				Utils.Editsetvalue(BaseClass.Loca_BR_child2_name_txt, sBRName);
				Log.info(sBRName + " is entered in child2BusinessRule text box");

			} else {
				Log.info("one child only needs to be enter");
			}
		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info(sBRName + " is not entered in child2BusinessRule text box");
			Log.error(e.getMessage());
		}
		return true;

	}

	public static void btnokBusinessRule() throws Exception {

		try {

			Utils.ClickEvn(BaseClass.Loca_BR_addchild_btn);
			Thread.sleep(1200);
			Log.info("Click action is performed on Add BusinessRule2 btn");
		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("Click action is not performed on Add BusinessRule2 btn");
			Log.error(e.getMessage());
		}

	}

	public static void btnHierarchylevel1(int iTestCaseRow) throws Exception {

		String sBRName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ParentBR);

		try {

			List<WebElement> G1 = Utils.getWebelements(BaseClass.Loca_BR_Paranent_count);

			int temp1 = G1.size();
			for (int i = 1; i <= temp1; i++) {

				String name = "//*[@id='brHierarchy']/div[" + i + "]/ul/li";
				List<WebElement> G2 = Utils.getWebelements(name);
				int temp2 = G2.size();

				for (int j = 1; j <= temp2; j++) {

					String name1 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li";

					List<WebElement> G3 = Utils.getWebelements(name1);
					int temp3 = G3.size();

					for (int k = 1; k <= temp3; k++) {

						WebElement BRName = driver.findElement(
								By.xpath("//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k + "]/a"));

						if (BRName.getText().equals(sBRName)) {
							BRName.click();
							Thread.sleep(1200);
							Log.info("Click action is performed on BR name btn");
						}
					}
				}

			}

		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("Click action is not performed on BR name btn");
			Log.error(e.getMessage());
		}

	}

	public static void btnHierarchylevel2(int iTestCaseRow) throws Exception {

		String sBRName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ParentBR);

		try {

			List<WebElement> G1 = Utils.getWebelements(BaseClass.Loca_BR_Paranent_count);

			int temp1 = G1.size();
			for (int i = 1; i <= temp1; i++) {

				String name = "//*[@id='brHierarchy']/div[" + i + "]/ul/li";
				List<WebElement> G2 = Utils.getWebelements(name);
				int temp2 = G2.size();

				for (int j = 1; j <= temp2; j++) {

					String name1 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li";

					List<WebElement> G3 = Utils.getWebelements(name1);
					int temp3 = G3.size();

					for (int k = 1; k <= temp3; k++) {

						String name2 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k + "]/ul/li";
						List<WebElement> G4 = Utils.getWebelements(name2);
						int temp4 = G4.size();

						for (int l = 1; l <= temp4; l++) {

							WebElement BRName = driver.findElement(By.xpath("//*[@id='brHierarchy']/div[" + i
									+ "]/ul/li[" + j + "]/ul/li[" + k + "]/ul/li[" + l + "]/a"));

							if (BRName.getText().equals(sBRName)) {
								BRName.click();
								Thread.sleep(1200);
								Log.info("Click action is performed on BR name btn");
							}
						}
					}
				}
			}

		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("Click action is not performed on BR name btn");
			Log.error(e.getMessage());
		}

	}

	public static void btnHierarchylevel3(int iTestCaseRow) throws Exception {

		String sBRName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ParentBR);

		try {

			List<WebElement> G1 = Utils.getWebelements(BaseClass.Loca_BR_Paranent_count);

			int temp1 = G1.size();
			for (int i = 1; i <= temp1; i++) {

				String name = "//*[@id='brHierarchy']/div[" + i + "]/ul/li";
				List<WebElement> G2 = Utils.getWebelements(name);
				int temp2 = G2.size();

				for (int j = 1; j <= temp2; j++) {

					String name1 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li";

					List<WebElement> G3 = Utils.getWebelements(name1);
					int temp3 = G3.size();

					for (int k = 1; k <= temp3; k++) {

						String name2 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k + "]/ul/li";
						List<WebElement> G4 = Utils.getWebelements(name2);
						int temp4 = G4.size();

						for (int l = 1; l <= temp4; l++) {

							String name3 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k
									+ "]/ul/li[" + l + "]/ul/li";
							List<WebElement> G5 = Utils.getWebelements(name3);
							int temp5 = G5.size();

							for (int m = 1; m <= temp5; m++) {

								WebElement BRName = driver.findElement(By.xpath("//*[@id='brHierarchy']/div[" + i
										+ "]/ul/li[" + j + "]/ul/li[" + k + "]/ul/li[" + l + "]/ul/li[" + m + "]/a"));

								if (BRName.getText().equals(sBRName)) {
									BRName.click();
									Thread.sleep(1200);
									Log.info("Click action is performed on BR name btn");
								}
							}
						}
					}
				}
			}

		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("Click action is not performed on BR name btn");
			Log.error(e.getMessage());
		}

	}

	public static void btnHierarchylevel4(int iTestCaseRow) throws Exception {

		String sBRName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ParentBR);

		try {

			List<WebElement> G1 = Utils.getWebelements(BaseClass.Loca_BR_Paranent_count);

			int temp1 = G1.size();
			for (int i = 1; i <= temp1; i++) {

				String name = "//*[@id='brHierarchy']/div[" + i + "]/ul/li";
				List<WebElement> G2 = Utils.getWebelements(name);
				int temp2 = G2.size();

				for (int j = 1; j <= temp2; j++) {

					String name1 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li";

					List<WebElement> G3 = Utils.getWebelements(name1);
					int temp3 = G3.size();

					for (int k = 1; k <= temp3; k++) {

						String name2 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k + "]/ul/li";
						List<WebElement> G4 = Utils.getWebelements(name2);
						int temp4 = G4.size();

						for (int l = 1; l <= temp4; l++) {

							String name3 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k
									+ "]/ul/li[" + l + "]/ul/li";
							List<WebElement> G5 = Utils.getWebelements(name3);
							int temp5 = G5.size();

							for (int m = 1; m <= temp5; m++) {

								String name4 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k
										+ "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li";
								List<WebElement> G6 = Utils.getWebelements(name4);
								int temp6 = G6.size();

								for (int n = 1; n <= temp6; n++) {

									WebElement BRName = driver.findElement(
											By.xpath("//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k
													+ "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li[" + n + "]/a"));

									if (BRName.getText().equals(sBRName)) {
										BRName.click();
										Thread.sleep(1200);
										Log.info("Click action is performed on BR name btn");
									}
								}
							}
						}
					}
				}
			}

		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("Click action is not performed on BR name btn");
			Log.error(e.getMessage());
		}

	}

	public static void btnHierarchylevel5(int iTestCaseRow) throws Exception {

		String sBRName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ParentBR);

		try {

			List<WebElement> G1 = Utils.getWebelements(BaseClass.Loca_BR_Paranent_count);

			int temp1 = G1.size();
			for (int i = 1; i <= temp1; i++) {

				String name = "//*[@id='brHierarchy']/div[" + i + "]/ul/li";
				List<WebElement> G2 = Utils.getWebelements(name);
				int temp2 = G2.size();

				for (int j = 1; j <= temp2; j++) {

					String name1 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li";

					List<WebElement> G3 = Utils.getWebelements(name1);
					int temp3 = G3.size();

					for (int k = 1; k <= temp3; k++) {

						String name2 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k + "]/ul/li";
						List<WebElement> G4 = Utils.getWebelements(name2);
						int temp4 = G4.size();

						for (int l = 1; l <= temp4; l++) {

							String name3 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k
									+ "]/ul/li[" + l + "]/ul/li";
							List<WebElement> G5 = Utils.getWebelements(name3);
							int temp5 = G5.size();

							for (int m = 1; m <= temp5; m++) {

								String name4 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k
										+ "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li";
								List<WebElement> G6 = Utils.getWebelements(name4);
								int temp6 = G6.size();

								for (int n = 1; n <= temp6; n++) {

									String name5 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k
											+ "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li[" + n + "]/ul/li";
									List<WebElement> G7 = Utils.getWebelements(name5);
									int temp7 = G7.size();

									for (int p = 1; p <= temp7; p++) {

										WebElement BRName = driver.findElement(By.xpath("//*[@id='brHierarchy']/div["
												+ i + "]/ul/li[" + j + "]/ul/li[" + k + "]/ul/li[" + l + "]/ul/li[" + m
												+ "]/ul/li[" + n + "]/ul/li[" + p + "]/a"));

										if (BRName.getText().equals(sBRName)) {
											BRName.click();
											Thread.sleep(1200);
											Log.info("Click action is performed on BR name btn");
										}
									}
								}
							}
						}
					}
				}
			}

		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("Click action is not performed on BR name btn");
			Log.error(e.getMessage());
		}

	}

	public static void btnHierarchylevel6(int iTestCaseRow) throws Exception {

		String sBRName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ParentBR);

		try {

			List<WebElement> G1 = Utils.getWebelements(BaseClass.Loca_BR_Paranent_count);

			int temp1 = G1.size();
			for (int i = 1; i <= temp1; i++) {

				String name = "//*[@id='brHierarchy']/div[" + i + "]/ul/li";
				List<WebElement> G2 = Utils.getWebelements(name);
				int temp2 = G2.size();

				for (int j = 1; j <= temp2; j++) {

					String name1 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li";

					List<WebElement> G3 = Utils.getWebelements(name1);
					int temp3 = G3.size();

					for (int k = 1; k <= temp3; k++) {

						String name2 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k + "]/ul/li";
						List<WebElement> G4 = Utils.getWebelements(name2);
						int temp4 = G4.size();

						for (int l = 1; l <= temp4; l++) {

							String name3 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k
									+ "]/ul/li[" + l + "]/ul/li";
							List<WebElement> G5 = Utils.getWebelements(name3);
							int temp5 = G5.size();

							for (int m = 1; m <= temp5; m++) {

								String name4 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k
										+ "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li";
								List<WebElement> G6 = Utils.getWebelements(name4);
								int temp6 = G6.size();

								for (int n = 1; n <= temp6; n++) {

									String name5 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k
											+ "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li[" + n + "]/ul/li";
									List<WebElement> G7 = Utils.getWebelements(name5);
									int temp7 = G7.size();

									for (int p = 1; p <= temp7; p++) {

										String name6 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li["
												+ k + "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li[" + n + "]/ul/li[" + p
												+ "]/ul/li";
										List<WebElement> G8 = Utils.getWebelements(name6);
										int temp8 = G8.size();

										for (int q = 1; q <= temp8; q++) {

											WebElement BRName = driver.findElement(By.xpath(
													"//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k
															+ "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li[" + n
															+ "]/ul/li[" + p + "]/ul/li[" + q + "]/a"));

											if (BRName.getText().equals(sBRName)) {
												BRName.click();
												Thread.sleep(1200);
												Log.info("Click action is performed on BR name btn");
											}
										}
									}
								}
							}
						}
					}
				}
			}

		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("Click action is not performed on BR name btn");
			Log.error(e.getMessage());
		}

	}

	public static void btnHierarchylevel7(int iTestCaseRow) throws Exception {

		String sBRName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ParentBR);

		try {

			List<WebElement> G1 = Utils.getWebelements(BaseClass.Loca_BR_Paranent_count);

			int temp1 = G1.size();
			for (int i = 1; i <= temp1; i++) {

				String name = "//*[@id='brHierarchy']/div[" + i + "]/ul/li";
				List<WebElement> G2 = Utils.getWebelements(name);
				int temp2 = G2.size();

				for (int j = 1; j <= temp2; j++) {

					String name1 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li";

					List<WebElement> G3 = Utils.getWebelements(name1);
					int temp3 = G3.size();

					for (int k = 1; k <= temp3; k++) {

						String name2 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k + "]/ul/li";
						List<WebElement> G4 = Utils.getWebelements(name2);
						int temp4 = G4.size();

						for (int l = 1; l <= temp4; l++) {

							String name3 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k
									+ "]/ul/li[" + l + "]/ul/li";
							List<WebElement> G5 = Utils.getWebelements(name3);
							int temp5 = G5.size();

							for (int m = 1; m <= temp5; m++) {

								String name4 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k
										+ "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li";
								List<WebElement> G6 = Utils.getWebelements(name4);
								int temp6 = G6.size();

								for (int n = 1; n <= temp6; n++) {

									String name5 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k
											+ "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li[" + n + "]/ul/li";
									List<WebElement> G7 = Utils.getWebelements(name5);
									int temp7 = G7.size();

									for (int p = 1; p <= temp7; p++) {

										String name6 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li["
												+ k + "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li[" + n + "]/ul/li[" + p
												+ "]/ul/li";
										List<WebElement> G8 = Utils.getWebelements(name6);
										int temp8 = G8.size();

										for (int q = 1; q <= temp8; q++) {

											String name7 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j
													+ "]/ul/li[" + k + "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li[" + n
													+ "]/ul/li[" + p + "]/ul/li[" + q + "]/ul/li";
											List<WebElement> G9 = Utils.getWebelements(name7);
											int temp9 = G9.size();

											for (int r = 1; r <= temp9; r++) {

												WebElement BRName = driver
														.findElement(By.xpath("//*[@id='brHierarchy']/div[" + i
																+ "]/ul/li[" + j + "]/ul/li[" + k + "]/ul/li[" + l
																+ "]/ul/li[" + m + "]/ul/li[" + n + "]/ul/li[" + p
																+ "]/ul/li[" + q + "]/ul/li[" + r + "]/a"));

												if (BRName.getText().equals(sBRName)) {
													BRName.click();
													Thread.sleep(1200);
													Log.info("Click action is performed on BR name btn");
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("Click action is not performed on BR name btn");
			Log.error(e.getMessage());
		}

	}

	public static void btnHierarchylevel8(int iTestCaseRow) throws Exception {

		String sBRName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ParentBR);

		try {

			List<WebElement> G1 = Utils.getWebelements(BaseClass.Loca_BR_Paranent_count);

			int temp1 = G1.size();
			for (int i = 1; i <= temp1; i++) {

				String name = "//*[@id='brHierarchy']/div[" + i + "]/ul/li";
				List<WebElement> G2 = Utils.getWebelements(name);
				int temp2 = G2.size();

				for (int j = 1; j <= temp2; j++) {

					String name1 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li";

					List<WebElement> G3 = Utils.getWebelements(name1);
					int temp3 = G3.size();

					for (int k = 1; k <= temp3; k++) {

						String name2 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k + "]/ul/li";
						List<WebElement> G4 = Utils.getWebelements(name2);
						int temp4 = G4.size();

						for (int l = 1; l <= temp4; l++) {

							String name3 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k
									+ "]/ul/li[" + l + "]/ul/li";
							List<WebElement> G5 = Utils.getWebelements(name3);
							int temp5 = G5.size();

							for (int m = 1; m <= temp5; m++) {

								String name4 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k
										+ "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li";
								List<WebElement> G6 = Utils.getWebelements(name4);
								int temp6 = G6.size();

								for (int n = 1; n <= temp6; n++) {

									String name5 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k
											+ "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li[" + n + "]/ul/li";
									List<WebElement> G7 = Utils.getWebelements(name5);
									int temp7 = G7.size();

									for (int p = 1; p <= temp7; p++) {

										String name6 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li["
												+ k + "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li[" + n + "]/ul/li[" + p
												+ "]/ul/li";
										List<WebElement> G8 = Utils.getWebelements(name6);
										int temp8 = G8.size();

										for (int q = 1; q <= temp8; q++) {

											String name7 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j
													+ "]/ul/li[" + k + "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li[" + n
													+ "]/ul/li[" + p + "]/ul/li[" + q + "]/ul/li";
											List<WebElement> G9 = Utils.getWebelements(name7);
											int temp9 = G9.size();

											for (int r = 1; r <= temp9; r++) {

												String name8 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j
														+ "]/ul/li[" + k + "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li["
														+ n + "]/ul/li[" + p + "]/ul/li[" + q + "]/ul/li[" + r
														+ "]/ul/li";
												List<WebElement> G10 = Utils.getWebelements(name8);
												int temp10 = G10.size();

												for (int s = 1; s <= temp10; s++) {

													WebElement BRName = driver.findElement(
															By.xpath("//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j
																	+ "]/ul/li[" + k + "]/ul/li[" + l + "]/ul/li[" + m
																	+ "]/ul/li[" + n + "]/ul/li[" + p + "]/ul/li[" + q
																	+ "]/ul/li[" + r + "]/ul/li[" + s + "]/a"));

													if (BRName.getText().equals(sBRName)) {
														BRName.click();
														Thread.sleep(1200);
														Log.info("Click action is performed on BR name btn");
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("Click action is not performed on BR name btn");
			Log.error(e.getMessage());
		}

	}

	public static void btnHierarchylevel9(int iTestCaseRow) throws Exception {

		String sBRName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ParentBR);

		try {

			List<WebElement> G1 = Utils.getWebelements(BaseClass.Loca_BR_Paranent_count);

			int temp1 = G1.size();
			for (int i = 1; i <= temp1; i++) {

				String name = "//*[@id='brHierarchy']/div[" + i + "]/ul/li";
				List<WebElement> G2 = Utils.getWebelements(name);
				int temp2 = G2.size();

				for (int j = 1; j <= temp2; j++) {

					String name1 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li";

					List<WebElement> G3 = Utils.getWebelements(name1);
					int temp3 = G3.size();

					for (int k = 1; k <= temp3; k++) {

						String name2 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k + "]/ul/li";
						List<WebElement> G4 = Utils.getWebelements(name2);
						int temp4 = G4.size();

						for (int l = 1; l <= temp4; l++) {

							String name3 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k
									+ "]/ul/li[" + l + "]/ul/li";
							List<WebElement> G5 = Utils.getWebelements(name3);
							int temp5 = G5.size();

							for (int m = 1; m <= temp5; m++) {

								String name4 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k
										+ "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li";
								List<WebElement> G6 = Utils.getWebelements(name4);
								int temp6 = G6.size();

								for (int n = 1; n <= temp6; n++) {

									String name5 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k
											+ "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li[" + n + "]/ul/li";
									List<WebElement> G7 = Utils.getWebelements(name5);
									int temp7 = G7.size();

									for (int p = 1; p <= temp7; p++) {

										String name6 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li["
												+ k + "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li[" + n + "]/ul/li[" + p
												+ "]/ul/li";
										List<WebElement> G8 = Utils.getWebelements(name6);
										int temp8 = G8.size();

										for (int q = 1; q <= temp8; q++) {

											String name7 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j
													+ "]/ul/li[" + k + "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li[" + n
													+ "]/ul/li[" + p + "]/ul/li[" + q + "]/ul/li";
											List<WebElement> G9 = Utils.getWebelements(name7);
											int temp9 = G9.size();

											for (int r = 1; r <= temp9; r++) {

												String name8 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j
														+ "]/ul/li[" + k + "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li["
														+ n + "]/ul/li[" + p + "]/ul/li[" + q + "]/ul/li[" + r
														+ "]/ul/li";
												List<WebElement> G10 = Utils.getWebelements(name8);
												int temp10 = G10.size();
												for (int s = 1; s <= temp10; s++) {

													String name9 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j
															+ "]/ul/li[" + k + "]/ul/li[" + l + "]/ul/li[" + m
															+ "]/ul/li[" + n + "]/ul/li[" + p + "]/ul/li[" + q
															+ "]/ul/li[" + r + "]/ul/li[" + s + "]/ul/li";
													List<WebElement> G11 = Utils.getWebelements(name9);
													int temp11 = G11.size();

													for (int t = 1; t <= temp11; t++) {

														WebElement BRName = driver
																.findElement(By.xpath("//*[@id='brHierarchy']/div[" + i
																		+ "]/ul/li[" + j + "]/ul/li[" + k + "]/ul/li["
																		+ l + "]/ul/li[" + m + "]/ul/li[" + n
																		+ "]/ul/li[" + p + "]/ul/li[" + q + "]/ul/li["
																		+ r + "]/ul/li[" + s + "]/ul/li[" + t + "]/a"));

														if (BRName.getText().equals(sBRName)) {
															BRName.click();
															Thread.sleep(1200);
															Log.info("Click action is performed on BR name btn");
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("Click action is not performed on BR name btn");
			Log.error(e.getMessage());
		}

	}

	public static void btnHierarchylevel10(int iTestCaseRow) throws Exception {

		String sBRName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ParentBR);

		try {

			List<WebElement> G1 = Utils.getWebelements(BaseClass.Loca_BR_Paranent_count);

			int temp1 = G1.size();
			for (int i = 1; i <= temp1; i++) {

				String name = "//*[@id='brHierarchy']/div[" + i + "]/ul/li";
				List<WebElement> G2 = Utils.getWebelements(name);
				int temp2 = G2.size();

				for (int j = 1; j <= temp2; j++) {

					String name1 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li";

					List<WebElement> G3 = Utils.getWebelements(name1);
					int temp3 = G3.size();

					for (int k = 1; k <= temp3; k++) {

						String name2 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k + "]/ul/li";
						List<WebElement> G4 = Utils.getWebelements(name2);
						int temp4 = G4.size();

						for (int l = 1; l <= temp4; l++) {

							String name3 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k
									+ "]/ul/li[" + l + "]/ul/li";
							List<WebElement> G5 = Utils.getWebelements(name3);
							int temp5 = G5.size();

							for (int m = 1; m <= temp5; m++) {

								String name4 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k
										+ "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li";
								List<WebElement> G6 = Utils.getWebelements(name4);
								int temp6 = G6.size();

								for (int n = 1; n <= temp6; n++) {

									String name5 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k
											+ "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li[" + n + "]/ul/li";
									List<WebElement> G7 = Utils.getWebelements(name5);
									int temp7 = G7.size();

									for (int p = 1; p <= temp7; p++) {

										String name6 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li["
												+ k + "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li[" + n + "]/ul/li[" + p
												+ "]/ul/li";
										List<WebElement> G8 = Utils.getWebelements(name6);
										int temp8 = G8.size();

										for (int q = 1; q <= temp8; q++) {

											String name7 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j
													+ "]/ul/li[" + k + "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li[" + n
													+ "]/ul/li[" + p + "]/ul/li[" + q + "]/ul/li";
											List<WebElement> G9 = Utils.getWebelements(name7);
											int temp9 = G9.size();

											for (int r = 1; r <= temp9; r++) {

												String name8 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j
														+ "]/ul/li[" + k + "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li["
														+ n + "]/ul/li[" + p + "]/ul/li[" + q + "]/ul/li[" + r
														+ "]/ul/li";
												List<WebElement> G10 = Utils.getWebelements(name8);
												int temp10 = G10.size();
												for (int s = 1; s <= temp10; s++) {

													String name9 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j
															+ "]/ul/li[" + k + "]/ul/li[" + l + "]/ul/li[" + m
															+ "]/ul/li[" + n + "]/ul/li[" + p + "]/ul/li[" + q
															+ "]/ul/li[" + r + "]/ul/li[" + s + "]/ul/li";
													List<WebElement> G11 = Utils.getWebelements(name9);
													int temp11 = G11.size();

													for (int t = 1; t <= temp11; t++) {

														String name10 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li["
																+ j + "]/ul/li[" + k + "]/ul/li[" + l + "]/ul/li[" + m
																+ "]/ul/li[" + n + "]/ul/li[" + p + "]/ul/li[" + q
																+ "]/ul/li[" + r + "]/ul/li[" + s + "]/ul/li[" + t
																+ "]/ul/li";
														List<WebElement> G12 = Utils.getWebelements(name10);
														int temp12 = G12.size();

														for (int u = 1; u <= temp12; u++) {

															WebElement BRName = driver.findElement(By.xpath(
																	"//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j
																			+ "]/ul/li[" + k + "]/ul/li[" + l
																			+ "]/ul/li[" + m + "]/ul/li[" + n
																			+ "]/ul/li[" + p + "]/ul/li[" + q
																			+ "]/ul/li[" + r + "]/ul/li[" + s
																			+ "]/ul/li[" + t + "]/ul/li[" + u + "]/a"));

															if (BRName.getText().equals(sBRName)) {
																BRName.click();
																Thread.sleep(1200);
																Log.info("Click action is performed on BR name btn");
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("Click action is not performed on BR name btn");
			Log.error(e.getMessage());
		}

	}

	public static void btnHierarchylevel11(int iTestCaseRow) throws Exception {

		String sBRName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ParentBR);

		try {

			List<WebElement> G1 = Utils.getWebelements(BaseClass.Loca_BR_Paranent_count);

			int temp1 = G1.size();
			for (int i = 1; i <= temp1; i++) {

				String name = "//*[@id='brHierarchy']/div[" + i + "]/ul/li";
				List<WebElement> G2 = Utils.getWebelements(name);
				int temp2 = G2.size();

				for (int j = 1; j <= temp2; j++) {

					String name1 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li";

					List<WebElement> G3 = Utils.getWebelements(name1);
					int temp3 = G3.size();

					for (int k = 1; k <= temp3; k++) {

						String name2 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k + "]/ul/li";
						List<WebElement> G4 = Utils.getWebelements(name2);
						int temp4 = G4.size();

						for (int l = 1; l <= temp4; l++) {

							String name3 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k
									+ "]/ul/li[" + l + "]/ul/li";
							List<WebElement> G5 = Utils.getWebelements(name3);
							int temp5 = G5.size();

							for (int m = 1; m <= temp5; m++) {

								String name4 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k
										+ "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li";
								List<WebElement> G6 = Utils.getWebelements(name4);
								int temp6 = G6.size();

								for (int n = 1; n <= temp6; n++) {

									String name5 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li[" + k
											+ "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li[" + n + "]/ul/li";
									List<WebElement> G7 = Utils.getWebelements(name5);
									int temp7 = G7.size();

									for (int p = 1; p <= temp7; p++) {

										String name6 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j + "]/ul/li["
												+ k + "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li[" + n + "]/ul/li[" + p
												+ "]/ul/li";
										List<WebElement> G8 = Utils.getWebelements(name6);
										int temp8 = G8.size();

										for (int q = 1; q <= temp8; q++) {

											String name7 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j
													+ "]/ul/li[" + k + "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li[" + n
													+ "]/ul/li[" + p + "]/ul/li[" + q + "]/ul/li";
											List<WebElement> G9 = Utils.getWebelements(name7);
											int temp9 = G9.size();

											for (int r = 1; r <= temp9; r++) {

												String name8 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j
														+ "]/ul/li[" + k + "]/ul/li[" + l + "]/ul/li[" + m + "]/ul/li["
														+ n + "]/ul/li[" + p + "]/ul/li[" + q + "]/ul/li[" + r
														+ "]/ul/li";
												List<WebElement> G10 = Utils.getWebelements(name8);
												int temp10 = G10.size();
												for (int s = 1; s <= temp10; s++) {

													String name9 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li[" + j
															+ "]/ul/li[" + k + "]/ul/li[" + l + "]/ul/li[" + m
															+ "]/ul/li[" + n + "]/ul/li[" + p + "]/ul/li[" + q
															+ "]/ul/li[" + r + "]/ul/li[" + s + "]/ul/li";
													List<WebElement> G11 = Utils.getWebelements(name9);
													int temp11 = G11.size();

													for (int t = 1; t <= temp11; t++) {

														String name10 = "//*[@id='brHierarchy']/div[" + i + "]/ul/li["
																+ j + "]/ul/li[" + k + "]/ul/li[" + l + "]/ul/li[" + m
																+ "]/ul/li[" + n + "]/ul/li[" + p + "]/ul/li[" + q
																+ "]/ul/li[" + r + "]/ul/li[" + s + "]/ul/li[" + t
																+ "]/ul/li";
														List<WebElement> G12 = Utils.getWebelements(name10);
														int temp12 = G12.size();

														for (int u = 1; u <= temp12; u++) {

															String name11 = "//*[@id='brHierarchy']/div[" + i
																	+ "]/ul/li[" + j + "]/ul/li[" + k + "]/ul/li[" + l
																	+ "]/ul/li[" + m + "]/ul/li[" + n + "]/ul/li[" + p
																	+ "]/ul/li[" + q + "]/ul/li[" + r + "]/ul/li[" + s
																	+ "]/ul/li[" + t + "]/ul/li[" + u + "]/ul/li";
															List<WebElement> G13 = Utils.getWebelements(name11);
															int temp13 = G13.size();

															for (int v = 1; v <= temp13; v++) {

																WebElement BRName = driver.findElement(By.xpath(
																		"//*[@id='brHierarchy']/div[" + i + "]/ul/li["
																				+ j + "]/ul/li[" + k + "]/ul/li[" + l
																				+ "]/ul/li[" + m + "]/ul/li[" + n
																				+ "]/ul/li[" + p + "]/ul/li[" + q
																				+ "]/ul/li[" + r + "]/ul/li[" + s
																				+ "]/ul/li[" + t + "]/ul/li[" + u
																				+ "]/ul/li[" + v + "]/a"));

																if (BRName.getText().equals(sBRName)) {
																	BRName.click();
																	Thread.sleep(1200);
																	Log.info(
																			"Click action is performed on BR name btn");
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("Click action is not performed on BR name btn");
			Log.error(e.getMessage());
		}

	}

	public static void btnNextBusinessRule() throws Exception {

		try {

			Utils.ClickEvn(BaseClass.Loca_BR_Next_btn);
			Thread.sleep(1200);
			Log.info("Click action is performed on BR Next btn");
		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("Click action is not performed on  BR Next btn");
			Log.error(e.getMessage());
		}

	}

	public static void btnLinkBusinessRule() throws Exception {

		try {

			Utils.ClickEvn(BaseClass.Loca_BR_linkBr_btn);
			Thread.sleep(1200);
			Log.info("Click action is performed on BR linkBr btn");
		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("Click action is not performed on  BR linkBr btn");
			Log.error(e.getMessage());
		}

	}

	public static void btnEditBusinessRule() throws Exception {

		try {

			Utils.ClickEvn(BaseClass.Loca_BR_Editbr_btn);
			Thread.sleep(1200);
			Log.info("Click action is performed on BR Editbr btn");
		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("Click action is not performed on  BR Editbr btn");
			Log.error(e.getMessage());
		}

	}

	public static void btnDeleteBusinessRule() throws Exception {

		try {

			Utils.ClickEvn(BaseClass.Loca_BR_deletebr_btn);
			Thread.sleep(1200);
			Log.info("Click action is performed on BR Editbr btn");
		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("Click action is not performed on  BR Editbr btn");
			Log.error(e.getMessage());
		}

	}

	public static void btnDelinkBusinessRule() throws Exception {

		try {

			Utils.ClickEvn(BaseClass.Loca_BR_delinkbr_btn);
			Thread.sleep(1200);
			Log.info("Click action is performed on BR Editbr btn");
		} catch (Exception e) {
			Utils.takeScreenshot1();
			Log.info("Click action is not performed on  BR Editbr btn");
			Log.error(e.getMessage());
		}

	}

	/*
	 * public static void valdBRName() throws Exception {
	 * 
	 * try {
	 * 
	 * if (Utils.IsVisible(BaseClass.Loca_BR_BRName_Vald)) {
	 * 
	 * Assert.assertEquals( Utils.Gettext(BaseClass.Loca_BR_BRName_Vald),
	 * "Business Rule name should not be empty");
	 * 
	 * Log.info("Business Rule name should not be empty validation is fired");
	 * 
	 * } else {
	 * Log.info("Business Rule name should not be empty validation is not fired"
	 * ); } } catch (Exception e) { Utils.takeScreenshot1(); Log.
	 * error("Business Rule name should not be empty validation is not fired");
	 * Log.error(e.getMessage());
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * public static void drpdBROrganization(int iTestCaseRow) throws Exception
	 * {
	 * 
	 * String sBRCategory= ExcelUtils.getCellData(iTestCaseRow,
	 * Constant.Col_BR_Organization); try {
	 * Utils.SelectbyValue(BaseClass.Loca_BR_Org_drpd, sBRCategory);
	 * 
	 * Log.info(sBRCategory + " is Selected  in BR Organization Dropdown box");
	 * } catch (Exception e) { Utils.takeScreenshot1(); Log.info(sBRCategory +
	 * " is not Selected  in BR Organization Dropdown box");
	 * Log.error(e.getMessage()); }
	 * 
	 * } }
	 * 
	 * 
	 * 
	 * public static void valdBRAlreadyExistSuccAndsaveCancel(int iTestCaseRow)
	 * throws Exception {
	 * 
	 * try {
	 * 
	 * if (Utils.IsVisible(BaseClass.Loca_BR_AlreadyExist_vald)) {
	 * 
	 * String BRName1="Business rule name already exists :"; String
	 * BRName=Utils.Gettext(BaseClass.Loca_BR_AlreadyExist_vald);
	 * 
	 * 
	 * 
	 * if(BRName1.equalsIgnoreCase(BRName.substring(0,35)))
	 * 
	 * { Log.info("Business rule name already exists");
	 * btnBRCancel(iTestCaseRow);
	 * 
	 * 
	 * } else {
	 * Log.info("Business rule added successfully validation is not fired");
	 * Log.info("Click action is not performed on cancel button");
	 * 
	 * }
	 * 
	 * } else if (Utils.IsVisible(BaseClass.Loca_BR_Succsmsg_vald)) {
	 * 
	 * Assert.assertEquals( Utils.Gettext(BaseClass.Loca_BR_Succsmsg_vald),
	 * "Business rule added successfully");
	 * 
	 * Log.info("Business rule added successfully validation is fired");
	 * //btnBRSave(iTestCaseRow);
	 * 
	 * Utils.ClickEvn(BaseClass.Loca_BR_Succsmsg_btn);
	 * Log.info("Click action is performed on Add button");
	 * 
	 * 
	 * 
	 * } else {
	 * Log.info("Business rule added successfully validation is not fired"); }
	 * 
	 * 
	 * } catch (Exception e) { Utils.takeScreenshot1();
	 * Log.error("Business rule added successfully validation is not fired");
	 * Log.info("Business rule added successfully validation is not fired");
	 * Log.info("Click action is not performed on cancel button");
	 * Log.info("Click action is not performed on Add button");
	 * 
	 * Log.error(e.getMessage());
	 * 
	 * } }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * public static boolean btnBRTree(int iTestCaseRow) throws Exception {
	 * 
	 * try {
	 * 
	 * if (Utils.IsVisible(BaseClass.LOCA_BR_Tree_btn)) {
	 * 
	 * Utils.ClickEvn(BaseClass.LOCA_BR_Tree_btn);
	 * Log.info("Click action is performed on Tree button"); } else {
	 * Utils.ClickEvn(BaseClass.LOCA_BR_Sec_saveall);
	 * Log.info("Click action is performed on Tree Save button");
	 * Home_Page.labelBusinessRule();
	 * BusinessRules_Page.AddBusinessRuleSearch(iTestCaseRow);
	 * 
	 * 
	 * 
	 * return false; }
	 * 
	 * } catch (Exception e) { Utils.takeScreenshot1();
	 * 
	 * Log.info("Click action is not performed on Tree1 button");
	 * Log.error(e.getMessage()); } return true;
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 * public static void valdBRSec() throws Exception
	 * 
	 * { try { if
	 * (Utils.IsVisible(BaseClass.LOCA_BR_Sec_Component_BR_Meta_Audio_vald)) {
	 * switch(Utils.Gettext(BaseClass.LOCA_BR_Sec_Component_BR_Meta_Audio_vald))
	 * {
	 * 
	 * 
	 * case "Choose a operator":
	 * Log.info("Choose a operator validation is fired"); break;
	 * 
	 * case "Choose a business rule":
	 * Log.info("Choose a business rulevalidation is fired"); break;
	 * 
	 * 
	 * 
	 * case
	 * "Comparison value should be greater than one second, less than 9999 and up to two decimals values"
	 * : Log.info("Choose a business rulevalidation is fired"); break;
	 * 
	 * 
	 * 
	 * 
	 * case "Choose some Keyword":
	 * Log.info("Choose a business rulevalidation is fired"); break;
	 * 
	 * 
	 * case
	 * "Span Offset value should be greater than one second, less than 9999 and up to two decimals values"
	 * : Log.info("Choose a business rulevalidation is fired"); break;
	 * 
	 * 
	 * 
	 * case
	 * "Business rule tree structure is wrong - Every parent must have 2 or more children"
	 * : Log.info("Choose a business rulevalidation is fired"); break;
	 * 
	 * 
	 * 
	 * case "Business rule updated sucessfully":
	 * Log.info("Choose a business rulevalidation is fired"); break;
	 * 
	 * } }
	 * 
	 * else { Log.info("Choose a operator"); Log.info("Choose a business rule");
	 * Log.
	 * info("Comparison value should be greater than one second, less than 9999 and up to two decimals values"
	 * ); Log.info("Choose some Keyword"); Log.
	 * info("Span Offset value should be greater than one second, less than 9999 and up to two decimals values"
	 * ); }
	 * 
	 * }
	 * 
	 * catch (Exception e) { Utils.takeScreenshot1();
	 * //Log.info("Organization is mandatory validation is not fired");
	 * Log.error(e.getMessage());
	 * 
	 * }
	 * 
	 * 
	 * }
	 */

}