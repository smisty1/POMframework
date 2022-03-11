package steps_of_Parametarization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;

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


}
