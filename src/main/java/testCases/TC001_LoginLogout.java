package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrapper.ProjectSpecificWrapper;

public class TC001_LoginLogout extends ProjectSpecificWrapper{
	
	//@ test create korte hobe, also login logout java method create korte hobe
	//coz annotation use korle java method lage
		
		@BeforeTest//@Test r age setData method create korte hobe with @BeforeTest annotation, coz data set hole data get hobe @Test e,
		public void setData () {
		
			excelfile = "TC001_LoginLogout" ; //TC001_LoginLogout from microsoft excel sheet name
		}

		@Test (dataProvider= "getData")
		public void loginLogout (String uName ,String pwd) { //from setData, get korbe getData, seta String kore pass korte hobe username, pass
			
			new LoginPage (). //class or je page e achi seter reference variable create korlam
			enterUserName(uName).
			enterPassword(pwd).
			clickLogin().
			clickLogout();
			
			
		}



			
		}





