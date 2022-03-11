package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrapper.ProjectSpecificWrapper;

public class TC002_CreateLead extends ProjectSpecificWrapper{
	
	
	
	@BeforeTest
	public void setData () {
		
		excelfile = "TC002_CreateLead" ;
}
	
	@Test (dataProvider= "getData")
	public void editLead (String uName ,String pwd, String cName, String fName, String lName ) { 


new LoginPage()
.enterUserName(uName)
.enterPassword(pwd)
.clickLogin()
.clickCRMSFA()
.clickLeadsLink()
.clickCreateLead()
.enterCompanyName(cName)
.enterFirstName(fName)
.enterLastName(lName)
.clickCreateLead();
	}

}