package pages;

import wrapper.ProjectSpecificWrapper;


public class LoginPage extends ProjectSpecificWrapper {
	

	public LoginPage enterUserName(String uName) {
		 enterById("username", uName);
		 return this;
	}
	
	public LoginPage enterPassword (String pwd) {
		enterById("password", pwd);
		return this;
		
	}
	
	public HomePage clickLogin() {
		clickByClassName("decorativeSubmit");
		return new HomePage();
	}
}





/*public class LoginPage extends ProjectSpecificWrapper { // 1 page is 1 java class. for createlead page 
	                    //we need 6 pages(java classes)
//for loginpage we need 3 actions enter username,enter pass and click login
//after 2 actins we stay at current page- so "return this" use it
//click login -we go to next page, so i have to type "return new MyHomePage"
//scenario- what we get when we develope a software? we need requirements to develope a software
//as a QA for testing from reqs we find out scenario- what to be tested , how to be tested, 
//so scenerio hoche jake test korbo seta. ex: here our scenario is verify login functionality
//correct data diye test korle-positive test , wrong data- negative test
	
//Genericwrap  super, projswra- sub super class
//projspwr r shathe sob sub class connected(ex: sub classes are login,home, myhome, myleads,cresteleads viewlead)
//each action (such as enterusername, clicklogin etc) will be a java method	
//then inside body call- enterById(idValue-locator value, data); etc
	
	public LoginPage eneterUserName (String uName) {//(String uName) argument pass kori implementaion method e use [enterById("username", uName)] korer jonno, jokhon argument pass kori , atake parameratized method bole(public LoginPage eneterUserName (String uName))
	//so java r implentation method e kono key or value pass korer jonno method sign normal bracket r modhe argument hishebe pass korte hobe.akhane string data hishebe pass koresi.	
		enterById("username", uName); //instead of demosalesmanager type as a string uName
	                                   //enterById("username", "uName"); is an action
	return this; //change method return type to loginPage by clicking under red mark on return this, then up e public void cancel hoye loginpage hobe coz we r in same current page
	}
	
	public LoginPage eneterPassWord (String pwd) {
		  
		 enterById("password", pwd);
		 
		 return this;
	}
    
	public HomePage clickLogin () {
		
		clickByClassName("decorativeSubmit");
		
		return new HomePage () ; //je page e jabe seter name dite hobe after return new
		

		
	
	}
	
}*/
