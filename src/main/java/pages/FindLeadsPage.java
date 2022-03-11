package pages;

import wrapper.ProjectSpecificWrapper;

public class FindLeadsPage extends ProjectSpecificWrapper {
	
	public FindLeadsPage enterFirstName (String FName) {
		
		enterByXpath("(//input[@name='firstName'])[3]", FName);
		
		return this;
	}
	
	
	public FindLeadsPage clickFindLeadsBtn () {
		
		clickByXpath("//button[text()='Find Leads']");
		
		return this;
	}
	
	
	
	
	public ViewLeadPage clickFstResLead () throws InterruptedException {
		
		Thread.sleep(2000); //sometimes test doesn't go through becoz we need code to slow, so we add thread.sleep
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
	
	return new ViewLeadPage(); 
	
	}
	

}
