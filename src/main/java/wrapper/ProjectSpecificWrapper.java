package wrapper;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.ReadExcel;

public class ProjectSpecificWrapper extends GenericWrapper{

//interface is not mandatory in framework but is is helpful coz it 
//automatically creates our all methods(abstract from interface) in super 
//class with implementation(body)
	
	
public String excelfile;

//@Parameters ({"url"})

@BeforeMethod
public void login () {
	invokeApp("http://leaftaps.com/opentaps");
	
}

@AfterMethod
public void closeBrower() {
	quitBrowser();
	
}

@DataProvider
public String[][] getData () throws IOException {
	ReadExcel r1 = new ReadExcel ();
	return r1.readExcel(excelfile);
	
}


}
