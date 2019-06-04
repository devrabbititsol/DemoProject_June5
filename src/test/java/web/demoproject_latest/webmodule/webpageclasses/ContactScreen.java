package web.demoproject_latest.webmodule.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class ContactScreen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.devrabbit.com/\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"DemoProject_Latest\",\"project_description\":\"desc\",\"project_id\":296,\"module_name\":\"WebModule\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":435,\"testcase_name\":\"ContactUsTestcase\",\"testcase_id\":481,\"testset_id\":0,\"executed_timestamp\":572077809,\"browser_type\":\"chrome\"}";

	public static String projectName = "demoproject_latest";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public ContactScreen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//INPUT[@id='ninja_forms_field_19']")	
	private WebElement	Ninja_forms_field_19_314145INPUT;
	public void fillINPUTNinja_forms_field_19_314145(String varInputValue) {
		waitForExpectedElement(driver, Ninja_forms_field_19_314145INPUT);
		Ninja_forms_field_19_314145INPUT.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//INPUT[@id='ninja_forms_field_20']")	
	private WebElement	Ninja_forms_field_20_314144INPUT;
	public void fillINPUTNinja_forms_field_20_314144(String varInputValue) {
		waitForExpectedElement(driver, Ninja_forms_field_20_314144INPUT);
		Ninja_forms_field_20_314144INPUT.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//INPUT[@id='ninja_forms_field_23']")	
	private WebElement	Ninja_forms_field_23_314143INPUT;
	public void fillINPUTNinja_forms_field_23_314143(String varInputValue) {
		waitForExpectedElement(driver, Ninja_forms_field_23_314143INPUT);
		Ninja_forms_field_23_314143INPUT.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//INPUT[@id='ninja_forms_field_26_type']")	
	private WebElement	Textarea_314134INPUT;
	public void fillINPUTTextarea_314134(String varInputValue) {
		waitForExpectedElement(driver, Textarea_314134INPUT);
		Textarea_314134INPUT.sendKeys(varInputValue);
	}

	@FindBy(how = How.XPATH, using = "//A[@id='tpth']")	
	private WebElement	Tirupati_314165A;
	public String clkATirupati_314165() {
		waitForExpectedElement(driver, Tirupati_314165A);		
		String text = Tirupati_314165A.getText();
		Tirupati_314165A.click();
		return text;
	}

}