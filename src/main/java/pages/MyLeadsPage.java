package pages;

import wrapper.ProjectSpecificWrapper;

public class MyLeadsPage extends ProjectSpecificWrapper{
	
	public CreateLeadPage clickCreateLead() {
		clickByLinkText("Create Lead");
		return new CreateLeadPage();
	}

	public FindLeadsPage clickFindLeads () {
		clickByLinkText("Find Leads");
		
		return new FindLeadsPage ();
	}

	public MergeLeadsPage clickMergeLeads() { 
		clickByXpath ("//a[text()='Merge Leads']");
		return new MergeLeadsPage();
	}
	
	public void moveToNewWindow() {
		
	}
	
	


	
}
