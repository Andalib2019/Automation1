Feature: User can able to login with valid email address and password
Description: "User login to  Facebook website and verify login"
@smoke
Scenario: User login with verify email address and password and verify page title
Given User can open any browser
And User can able to enter "https://www.facebook.com/" url
When User enters email "aneearyan@yahoo.com"
And User enters password "12345678"
And User clicks on Log in button
Then User can able to successifully verify  login and page title
