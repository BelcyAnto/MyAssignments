Feature: Salesforce Appication Functionality

Scenario: Login with valid credential

Given Launch the Webbrowser
And Load the url page
And Enter the username as 'vidyar@testleaf.com' 
And Enter the password as 'Sales@123'
When Click on Login button
Then It should navigate to the home page
When Click on toggle menu button from the left corner
Then It should show menu option
When Click view All and click Sales from App Launcher
Then It should navigate to the Sales page
When Click on Accounts tab
Then It should navigate to the Accounts tab
When Click on New button
Then It should navigate to the New Accounts page
When Enter account name as 'Newtestleaf'
When Select Ownership as Public 
When Click on save button
Then It should navigate to the Accounts created page
When verify the Accounts name 'Newtestleaf'
Then It should validdate the Accout name
 
 
