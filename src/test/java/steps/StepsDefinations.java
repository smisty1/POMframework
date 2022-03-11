package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class StepsDefinations {
	
	ChromeDriver driver;
	
	@Given("Launch Chromebrowser and load url")
	public void launch_Chromebrowser_and_load_url() {
	    
     System.setProperty("webdriver.chrome.driver", "C:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
		
	 driver = new ChromeDriver ();
	 driver.get("http://leaftaps.com/opentaps");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}

	@Given("enter username as demosalesmanager")
	public void enter_username_as_demosalesmanager() {
	    driver.findElementById("username").sendKeys("DemoSalesManager");
	}

	@Given("enter password as crmsfa")
	public void enter_password_as_crmsfa() {
	    driver.findElementById("password").sendKeys("crmsfa");
	}

	@When("click the login button")
	public void click_the_login_button() {
	    driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("its navigated to Homepage")
	public void its_navigated_to_Homepage() {
		
		System.out.println(driver.getTitle());
	}

	@Then("click the logout button")
	public void click_the_logout_button() {
	    driver.findElementByClassName("decorativeSubmit").click();
	}

	@Then("close browser")
	public void close_browser() {
	    driver.close();
	}

	@Given("enter username as shohana")
	public void enter_username_as_shohana() {
	    driver.findElementById("username").sendKeys("shohana");
	}

	@Then("its navigated to samepage")
	public void its_navigated_to_samepage() {
	
		System.out.println(driver.getTitle());
	}
	   

	@Then("verify error message")
	public void verify_error_message() throws InterruptedException {
	    
		Thread.sleep(2000);
		
		String text = driver.findElementByClassName("serviceError").getText();
		
		if(text.contains("The Following Errors Occurred")) {
			System.out.println("Error message is matched");
		} else {
			System.out.println("Error message is not matched");
		}
	}

	@Given("click CRMSFA")
	public void click_CRMSFA() {
	    driver.findElementByLinkText("CRM/SFA").click();
	}

	@Given("click leads link")
	public void click_leads_link() {
	    driver.findElementByLinkText("Leads").click();
	}

	@When("click createLead")
	public void click_createLead() {
	    driver.findElementByLinkText("Create Lead").click();
	}

	@When("enter the company as ABC")
	public void enter_the_company_as_ABC() {
	    driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
	}

	@When("enter the firstname as Hema")
	public void enter_the_firstname_as_Hema() {
	    driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
	}

	@When("enter the lastname as Mali")
	public void enter_the_lastname_as_Mali() {
	    driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
	}

	@When("choose source as Website")
	public void choose_source_as_Website() {
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(source);
		dd.selectByVisibleText("Website");
		
	}

	@When("click the create lead button")
	public void click_the_create_lead_button() {
	    driver.findElementByXPath("//input[@value='Create Lead']").click();
	}

	@Then("its navigated ViewLeadPage")
	public void its_navigated_ViewLeadPage() {
	    System.out.println(driver.getTitle());
	}

	@Then("verify the firstname")
	public void verify_the_firstname() {
		
		String fname = driver.findElementById("viewLead_firstName_sp").getText();
		if(fname.equals("Hema")) {
			System.out.println("Firstname is matched");
		} else 
			System.out.println("Firstname is not mathched");
		
	}

	@When("click Find Leads")
	public void click_Find_Leads() {
	    driver.findElementByLinkText("Find Leads").click();
	}

	@When("enter firstname")
	public void enter_firstname() {
	    driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Gopi");
	}

	@When("click Find Leads button")
	public void click_Find_Leads_button() throws InterruptedException {
	    driver.findElementByXPath("//button[text()='Find Leads']").click();
	Thread.sleep(2000);
	}

	@When("click first resulting lead")
	public void click_first_resulting_lead() throws InterruptedException {
	    driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").click();
	
	    Thread.sleep(2000);
	}

	@Then("navigated ViewLeadPage")
	public void navigated_ViewLeadPage() {
	    System.out.println(driver.getTitle());
	}

	@Then("verify title of the page")
	public void verify_title_of_the_page() {
	    System.out.println(driver.getTitle());
	}

	@Then("click on Edit")
	public void click_on_Edit() {
	   driver.findElementByLinkText("Edit").click();
	}

	@Then("navigated Edit Lead page")
	public void navigated_Edit_Lead_page() {
	    System.out.println(driver.getTitle());
	}

	@Then("change the company name")
	public void change_the_company_name() {
	    driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
	driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("CTS");
	}

	@Then("click update")
	public void click_update() {
	    driver.findElementByXPath("//input[@value='Update']").click();
	}

	@Then("confirm change name appears")
	public void confirm_change_name_appears() {
		String changedName = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(changedName);
					 
		 if(changedName.contains("CTS")) {
		 System.out.println("Name is matched"); 
						  
		} else {
		 System.out.println("Name is not matched");
						 }

	}

	

	@When("click on phone")
	public void click_on_phone() {
		driver.findElementByXPath("//span[text()='Phone']").click();

	}

	@When("enter phone number")
	public void enter_phone_number() {
		driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("123456");

	}
	
	@When("click find leads button")
	public void click_find_leads_button() throws InterruptedException {
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	Thread.sleep(2000); 
	}
	
	@When("capture lead ID of first resulting lead")
	
	public void capture_lead_ID_of_first_resulting_lead() throws InterruptedException {
		Thread.sleep(2000);
		String leadId = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]").getText();
		System.out.println(leadId);
		
		Thread.sleep(2000);
	}

	@When("click Delete")
	public void click_Delete() {
		driver.findElementByXPath("//a[text()='Delete']").click();
	}

	@Then("navigated MyLeadsPage")
	public void navigated_MyLeadsPage() {
		System.out.println(driver.getTitle());
	}

	

	@Then("enter capture lead ID")
	public void enter_capture_lead_ID() {
		driver.findElementByXPath("(//div[@class='x-form-element']/input)[13]").sendKeys("10708");


	}

	
	
	@Then("verify error meassage")
	public void verify_error_meassage() {
		String errorMessage = driver.findElementByXPath("//div[text()='No records to display']").getText();
		if(errorMessage.contains("No records to")) {
			System.out.println("Error message is matched");
		}else {
			System.out.println("Error message is not matched");
		}
	}



	

	
	
}
