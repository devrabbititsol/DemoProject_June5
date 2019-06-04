package web.demoproject_latest.webmodule.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class IOTScreen extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.devrabbit.com/\",\"report_upload_url\":\"https://smartqe.io:443/UploadReportFile\",\"project_name\":\"DemoProject_Latest\",\"project_description\":\"desc\",\"project_id\":296,\"module_name\":\"WebModule\",\"module_description\":\"desc\",\"sub_module_id\":0,\"module_id\":435,\"testcase_name\":\"ContactUsTestcase\",\"testcase_id\":481,\"testset_id\":0,\"executed_timestamp\":571637362,\"browser_type\":\"chrome\"}";

	public static String projectName = "demoproject_latest";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public IOTScreen(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//HTML/BODY[1]/DIV[1]/DIV[2]/DIV[2]/DIV[1]/A[1]")	
	private WebElement	TalkToOurExperts_314003A;
	public String clkATalkToOurExperts_314003() {
		waitForExpectedElement(driver, TalkToOurExperts_314003A);		
		String text = TalkToOurExperts_314003A.getText();
		TalkToOurExperts_314003A.click();
		return text;
	}

}