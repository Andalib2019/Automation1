Feature: User can able to login with valid email address and password
Description: "User login to  Facebook website and verify login"
@regression
Scenario Outline: User login with verify email address and password and verify page title
Given User can open any browser
And User can able to enter "https://www.facebook.com/" url
When User enters email "<username>"
And User enters password "<password>"
And User clicks on Log in button
Then User can able to successifully verify  login and page title


Examples:

|username           | password |
|aneearyan@yahoo.com| 12345678 |
|aneearyan          | 12345678 |
|aneearyan@yahoo.com| 1234567  |
|aneearyan@yahoo.com| 123456   |
|aneearyan@yahoo.com| 123456789|