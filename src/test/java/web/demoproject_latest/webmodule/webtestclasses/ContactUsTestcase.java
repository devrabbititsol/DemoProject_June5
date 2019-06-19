package web.demoproject_latest.webmodule.webtestclasses;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.configurations.Constants;
import com.configurations.ExtentConfigurations;
import web.demoproject_latest.webmodule.webpageclasses.HomeScreen;
import web.demoproject_latest.webmodule.webpageclasses.IOTScreen;
import web.demoproject_latest.webmodule.webpageclasses.ContactScreen;
import com.utilities.BaseClass;
import com.utilities.ConfigFilesUtility;
import com.utilities.Utilities;
import org.json.JSONObject;

@SuppressWarnings("unused")
public class ContactUsTestcase extends BaseClass {
	ExtentReports reports;
	ExtentTest test;
	ITestResult result;
	private Logger logger;
	private ConfigFilesUtility configFileObj;
	public boolean isElementDispalyed = false;	public static final int datasetsLength = 1;

	public ContactUsTestcase() throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		logger = Logger.getLogger(ContactUsTestcase.class);
		configFileObj = new ConfigFilesUtility();
		configFileObj.loadPropertyFile("contactustestcase.properties");
		reports = ExtentConfigurations.getExtentInstance(reportsPath, projectPath, HomeScreen.projectName);
		test = reports.startTest("ContactUsTestcase");
	}
	
	public void setUP() throws Exception {
		String primaryInfo = HomeScreen.primaryInfo;
		Constants.PRIMARY_INFO = primaryInfo;
		driver = launchBrowser(new JSONObject(primaryInfo).optString("browser_type"), configFileObj);
	}

	public void HomeScreenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 1;
		HomeScreen objHomeScreen = PageFactory.initElements(driver, HomeScreen.class);
		testLogHeader(test, "Verify HomeScreen page");
String text1 = objHomeScreen.clkAIoTSolutionsAndServices_313749();
		if(text1.equalsIgnoreCase(configFileObj.getProperty("IoTSolutionsAndServices"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on : " + configFileObj.getProperty("IoTSolutionsAndServices"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Link Text : " + configFileObj.getProperty("IoTSolutionsAndServices"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Link Text is not displayed  : " + configFileObj.getProperty("IoTSolutionsAndServices"+ i + datasetScreencount));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	

	public void IOTScreenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 2;
		IOTScreen objIOTScreen = PageFactory.initElements(driver, IOTScreen.class);
		testLogHeader(test, "Verify IOTScreen page");
String text1 = objIOTScreen.clkATalkToOurExperts_314003();
		if(text1.equalsIgnoreCase(configFileObj.getProperty("TalkToOurExperts"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on : " + configFileObj.getProperty("TalkToOurExperts"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Link Text : " + configFileObj.getProperty("TalkToOurExperts"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Link Text is not displayed  : " + configFileObj.getProperty("TalkToOurExperts"+ i + datasetScreencount));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	

	public void ContactScreenTest(int i) throws Exception {

	 try{
		Constants.TOTAL_TC = Constants.TOTAL_TC + 1;
		Constants.IS_TESTCASE = true; Constants.iS_WEB = true;
		int datasetScreencount = 3;
		ContactScreen objContactScreen = PageFactory.initElements(driver, ContactScreen.class);
		testLogHeader(test, "Verify ContactScreen page");
		objContactScreen.fillINPUTNinja_forms_field_19_314145(configFileObj.getProperty("Ninja_forms_field_19"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered Ninja_forms_field_19 : " + configFileObj.getProperty("Ninja_forms_field_19"+ i + datasetScreencount));
		objContactScreen.fillINPUTNinja_forms_field_20_314144(configFileObj.getProperty("Ninja_forms_field_20"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered Ninja_forms_field_20 : " + configFileObj.getProperty("Ninja_forms_field_20"+ i + datasetScreencount));
		objContactScreen.fillINPUTNinja_forms_field_23_314143(configFileObj.getProperty("Ninja_forms_field_23"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered Ninja_forms_field_23 : " + configFileObj.getProperty("Ninja_forms_field_23"+ i + datasetScreencount));
		objContactScreen.fillINPUTTextarea_314134(configFileObj.getProperty("Textarea"+ i + datasetScreencount));
		printSuccessLogAndReport(test, logger,  "Entered Textarea : " + configFileObj.getProperty("Textarea"+ i + datasetScreencount));
String text5 = objContactScreen.clkATirupati_314165();
		if(text5.equalsIgnoreCase(configFileObj.getProperty("Tirupati"+ i + datasetScreencount))){
			printSuccessLogAndReport(test, logger,  "Clicked on : " + configFileObj.getProperty("Tirupati"+ i + datasetScreencount));
			printSuccessLogAndReport(test, logger,  "Validated Link Text : " + configFileObj.getProperty("Tirupati"+ i + datasetScreencount));
		} else {
			printFailureLogAndReport(test, logger,  "Link Text is not displayed  : " + configFileObj.getProperty("Tirupati"+ i + datasetScreencount));
		}

	   } catch (Exception e) {
		  isElementDispalyed = false;
		  printFailureLogAndReport(test, logger,  "Element is not found" + e.getLocalizedMessage());
		}
	}
	
	@Test
	public void screensTest() throws Exception {
		for(int datasets = 1; datasets <= ContactScreen.datasetsLength; datasets++) {
			isElementDispalyed = true;			
			setUP();
			if(isElementDispalyed) { HomeScreenTest(datasets);}
			if(isElementDispalyed) { IOTScreenTest(datasets);}
			if(isElementDispalyed) { ContactScreenTest(datasets);}
			tearDown();
		}	}

	
	public void tearDown() throws Exception {
		reports.endTest(test);
		reports.flush();
		driver.quit();
	}
}