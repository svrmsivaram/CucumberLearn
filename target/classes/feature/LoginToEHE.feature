Feature: Login to the Gmail
Background: 

Scenario: Login to the Gmail with Valid User.
Given Launch the browser 
And Load the URL
And Maximize the window
And Set the Session Timeout
When Enter the userName as testingha01@mailinator.com
And Enter the Password as Test@1234
Then Click on the Login Button