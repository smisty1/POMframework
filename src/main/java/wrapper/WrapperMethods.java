package wrapper;

import java.io.IOException;

import org.openqa.selenium.Keys;

public interface WrapperMethods {
	
//interface e method declare thakbe but all methods will be abstract and no body, 
//interface r methods gulo implement/apply hobe class e. 

//we use readexcel to read data from excel.

//Generic super class use kori jeta implemnt or connection korbe interface ke.
//interface r joto gulo abbstract methods ache sobgulo implementation soho super class e ashbe.
//by adding unimplemented line in super class. 

//These 4 things interface (wrappermethods),super class (genericwrapper), 
//sub super class (projspewrap), read excel are 1 time implentation means
// 1 time dile againa again use korte perbo. 
//if developer change username from id to xpath, locator thik ache but locator value
//change, then code will not work, in that case we will design like develpoer
//act like developer, developer design each application page by page
//we will create a structure like developer that is called POM 
//(Page object model or page pattern model not Project object model(ata maven e bole))
//so that we can make our pages separately, 
//also alada rakbo test cases, super class, sub super class, read excel, data
//jegulo excel e thakbe,,,, so onekgulo jinish prepare korte hobe but everything
//will be in a structure, so that i dont have tochange all, only change 
// a single code whenever is needed. 

	//maven is a type ,,,java use korle java, maven uses korle maven
	//maven dependencies e akakata file hoche Java access resource file (jar). 
	//so,jar file hishebe maven depencies folder r modhe add hoi
	//maven dep madhome selenium and selenium related sob kisu use korte perbo
	
//pages r modhe pages r classes thakbe, so, sob gulo pages r name e akta kore class thakbe.
//major code change korte hole je page e prob sei page only code change korbo
//Pages classes gulo subsuperclass r shathe extends hobe, super class and interface
//r shathe implement hobe.

//projspewrap Genericwrap r shathe extend hobe, pages gulo akakta class, pages gulo
//projectspewrap r shathe extend hobe, testcase gulo pages r shathe aber connect hobe.
//avabe upper level theke lower level porjonto multiple and multilevel inheritance cover hobe.

//at first interface and generic extend na hoye implement hobe, tokon class 
// r interface e multiple inheritance hobe, nicher gulo akter shathe r akta, super r shathe sub,,,,
//avabe small ter shathe borota connect hoye namte thakbe then multilevel inheritance cover hobe, last e projspewr
// r shathe sob gulo pages connect hoye jabe
	
//make excel sheet for each test case
//create lead page korte kotogulo page e jete hobe atake bole navigating in specific test case. ex: navigate to home page, navigate to login page etc.

	/**
	 * This method will launch the given browser and maximize the browser and set the
	 * wait for 30 seconds and load the urlGeneric
	 * @param browser - The browser of the application to be launched
	 * @param url - The url with http or https
	 * 
	 */
	public void invokeApp(String url);//invokeApp mean launch browser/ open application/open software/login
//@param means parameter , not annotation
	/**
	 * This method will enter the value to the text field using id attribute to locate		 * 
	 * @param idValue (id locator value)- id of the webelement
	 * @param data - The data to be sent to the webelement
	 */
	public void enterById(String idValue, String data);
	/**
	 * This method will enter the value to the text field using id attribute to locate		 * 
	 * @param idValue - id of the webelement
	 * @param data - The data to be sent to the webelement
	 */
	//public void enterById(String idValue, int value); 

	/**
	 * This method will enter the value to the text field using name attribute to locate		 * 
	 * @param nameValue - name of the webelement
	 * @param data - The data to be sent to the Webelement
	 */
	
	public void enterByName(String nameValue, String data);		

	/**
	 * This method will enter the value to the text field using xpath attribute to locate		 * 
	 * @param xpathValue - name of the webelement
	 * @param data - The data to be sent to the webelement
	 */
	public void enterByXpath(String xpathValue, String data);
	
	/**
	 * This method will clear the value to the text field using Xpath attribute to locate		 * 
	 * @param xpathValue - name of the Webelement
	 * @param data - The data to be sent to the webelement
	 */
	//public void clearById(String xpathValue, Keys clear);
	
	/**
	 * This method will enter the value to the text field using CssSelector attribute to locate		 * 
	 * @param CssValue - name of the webelement
	 * @param data - The data to be sent to the webelement
	 */
	public void enterByCssSelector(String CssValue, String data);

	/**
	 * This method will verify the title of the browser 
	 * @param title - The expected title of the browser
	 * @return 
	 */
	public boolean verifyTitle(String title);

	/**
	 * This method will verify the given text
	 * @param id - The locator of the object in id
	 * @param text  - The text to be verified
	 */
	public void verifyTextById(String id, String text);

	/**
	 * This method will verify the given text
	 * @param xpath - The locator of the object in xpath
	 * @param text  - The text to be verified
	 */
	public void verifyTextByXpath(String xpath, String text);
	
	/**
	 * This method will verify the given text
	 * @param xpath - The locator of the object in xpath
	 * @param text  - The text to be verified
	 */
	public void verifyTextContainsByXpath(String xpath, String text);
	
	public void verifyErrorMessage(String xpathValue);

	/**
	 * This method will verify the given text
	 * @param xpath - The locator of the object in xpath
	 * @param text  - The text to be verified
	 */
	public void verifyTextContainsById(String id, String text);

	/**
	 * This method will click the element using id as locator
	 * @param id  The id (locator) of the element to be clicked
	 */
	public void clickById(String id);

	/**
	 * This method will click the element using id as locator
	 * @param id  The id (locator) of the element to be clicked
	 */
	public void clickByClassName(String classVal);

	/**
	 * This method will click the element using name as locator
	 * @param name  The name (locator) of the element to be clicked
	 */
	public void clickByName(String name);

	/**
	 * This method will click the element using link name as locator
	 * @param name  The link name (locator) of the element to be clicked
	 */
	public void clickByLinkText(String text);

	/**
	 * This method will click the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element to be clicked
	 */
	public void clickByXpath(String xpathVal);
	
	/**
	 * This method will click the element using cssSelector as locator
	 * @param cssSelector  The cssSelector (locator) of the element to be clicked
	 */
	public void clickByCssSelector(String CssValue, String value);

	/**
	 * This method will get the text of the element using id as locator
	 * @param xpathVal  The id (locator) of the element 
	 */
	public String getTextById(String idVal);

	/**
	 * This method will get the text of the element using xpath as locator
	 * @param xpathVal  The xpath (locator) of the element 
	 */
	public String getTextByXpath(String xpathVal);

	/**
	 * This method will select the drop down visible text using id as locator
	 * @param id The id (locator) of the drop down element
	 * @param value The value to be selected (visibletext) from the dropdown 
	 */
	
	
	
	public void selectVisibileTextById(String id, String value);
	
	/**
	 * This method will select the drop down visible text using name as locator
	 * @param name The name (locator) of the drop down element
	 * @param value The value to be selected (visibletext) from the dropdown 
	 */
	public void selectByVisibleTextByName(String name, String value);

	/**
	 * This method will select the drop down using index as id locator
	 * @param id The id (locator) of the drop down element
	 * @param value The value to be selected (index) from the dropdown 
	 */
	public void selectIndexById(String id, int value);
	
	/**
	 * This method will select the drop down using index as name locator
	 * @param name The name (locator) of the drop down element
	 * @param value The value to be selected (index) from the dropdown 
	 */
	
	public void selectIndexByName(String name, int Value);

	/**
	 * This method will select the drop down using index as id locator
	 * @param id The id (locator) of the drop down element
	 * @param id The id to be selected (value) from the dropdown 
	 */
	public void selectByValueById(String id, String value);
	
	/**
	 * This method will select the drop down using index as name locator
	 * @param name The name (locator) of the drop down element
	 * @param name The name to be selected (value) from the dropdown 
	 */
	public void selectByValueByName(String name, String value);
	
	/**
	 * This method will switch to the parent Window
	 */
	public void switchToParentWindow();

	/**
	 * This method will move the control to the last window
	 */
	public void switchToLastWindow();

	/**
	 * This method will accept the alert opened
	 */
	public void acceptAlert();
	
	/**
	 * This method will reject/dismiss the alert opened
	 */
	public void dismissAlert();
	
	
	public void takesnap() throws IOException;//This method will take a snapshot of the  particular page
	
	public void explecitWait() throws InterruptedException;

	/**
	 * This method will close all the browsers
	 */
	public void quitBrowser();
	/**
	 * This method will close the current active browser
	 */
	public void closeBrowser();
	
	}	
	
	
	
	
	
	
	
	/*Page Object Model (POM) Framework: (it also known as POM Structure/design pattern framework)
1.	Create a Maven Project name POMframework
2.	Add necessary dependencies (like- selenium-java, Apache commons-io, poi, poi-ooxml, TestNG etc.)
3.	Create two folder drivers and data inside the project “POMframework” (or copy-paste for existing project)
4.	Create a Package “wrapper” under src/main/java
a)	Under the package create a Interface “WrapperMethods”
b)	Under the wrapper package create a Super class “GenericWrapper”
c)	Under the wrapper package create a class “ProjectSpecificWrapper”
5.	Create another package “utils”
a) Under Utils package create a class “ReadExcel”
6. Create another package “pages” 
a) Under the pages package, create all required pages class (ex.-LoginPage, HomePage etc.)
7. Create another package “testCases”
a) Under the testCases package create all Real Test Cases (ex.- TC001_LoginLogout, TC002_CreateLead etc.)

Steps to follow for POM:-
-1st we decide how many pages we are navigating/traveling in the specific testcase (Ex.- CreateLead)
-2nd how many elements (such as kon element click korte hobe, kn element e data dite hobe etc) we are interacting for each page
-3rd Identify the Actions of each Element such as send keys for enter etc
-After interaction each element, where it’s navigated or where is our control or where it travel

After clicking any element if it stays in same page then it is called Return this
Return this; -> return current action page. Mouse hover on it-> ex: click and change as a loginPage
Return new ; >  we will  use Return new page when the page is changed

Roles of Page Object Model:
1.	Create every page as Individual java class. **jokon POM create kori then 
each page name r shathe page mention korte hoi.
2.	All pages will have to inherit common superclass (ProjectSpecificWrapper)
3.	Every action/verification on each element you perform should 
be a method of the page
( means enterbyid,enterbyxpath...action(enter) with locator,, protita action 
r name e akta java method hobe) ex: public void enterbyid, then change return type : same page 
thakle return his, onno page e gele return new. 
4.	Every method should return the page where it will land(navigate)

Structure of POM.....

Note: In your real field day to day works, update only “pages” (like developer) and existing everything remain same.
If developer change any value of any attribute, we just change in our page pages only, not every testcases.
Expectation  */


