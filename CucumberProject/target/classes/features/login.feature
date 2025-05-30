Feature: Login functionality of Leaftaps application

Scenario: Login with valid credential

Given Launch the browser
And Load the url
And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then It should navigate to the next page

Scenario: Login with invalid credential

Given Launch the browser
And Load the url
And Enter the username as 'Demo'
And Enter the password as 'crm'
When Click on the Login button
But It should throw Error message