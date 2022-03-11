Feature: Automate TestLeaf Application

Scenario: TC001_LoginLogout

Given Launch Chromebrowser and load url
And enter username as demosalesmanager
And enter password as crmsfa
When click the login button 
Then its navigated to Homepage
And click the logout button
And close browser





Scenario: TC002_CreateLead

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


