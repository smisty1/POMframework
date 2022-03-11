Feature: Automate TestLeaf Application

Scenario: TC001_LoginLogout

Given Launch Chromebrowser and load url
And enter username as demosalesmanager
And enter password as crmsfa
When click the login button 
Then its navigated to Homepage
And click the logout button
And close browser


Scenario: TC002_login and Logout for failure

Given Launch Chromebrowser and load url
And enter username as shohana
And enter password as crmsfa
When click the login button 
Then its navigated to samepage
But verify error message 
And close browser

Scenario: TC003_CreateLead

Given Launch Chromebrowser and load url
And enter username as demosalesmanager
And enter password as crmsfa
And click the login button
And click CRMSFA
And click leads link
When click createLead 
And enter the company as ABC
And enter the firstname as Hema
And enter the lastname as Mali
And choose source as Website
And click the create lead button 
Then its navigated ViewLeadPage
And verify the firstname
And close browser

Scenario: TC004_EditLead

Given Launch Chromebrowser and load url
And enter username as demosalesmanager
And enter password as crmsfa
And click the login button
And click CRMSFA
And click leads link
When click Find Leads
And enter firstname
And click Find Leads button
And click first resulting lead
Then navigated ViewLeadPage
And verify title of the page
And click on Edit
Then navigated Edit Lead page
And change the company name
And click update
And confirm change name appears
And close browser


Scenario: TC005_DeleteLead

Given Launch Chromebrowser and load url
And enter username as demosalesmanager
And enter password as crmsfa
And click the login button
And click CRMSFA
And click leads link
When click Find Leads

And click on phone
And enter phone number
And click find leads button
And capture lead ID of first resulting lead
And click first resulting lead 
And click Delete
Then navigated MyLeadsPage

And click Find Leads
And enter capture lead ID
And click find leads button
But verify error meassage
And close browser



	
	