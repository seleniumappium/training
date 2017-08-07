@all
Feature: Login Feature Tests


Background: 
   Given User Opens the CAC application 

@smoke
Scenario: test login with valid credentials
  When User enter username "johnbush@chinna.com"
  When User enter password "secret"
  When User clicks on the login button
  Then Login should be successful
 
@smoke @regression 
Scenario Outline: test login with invalid credentials
  When User enter invalid username "<username>"
  When User enter invalid password "<password>"
  When User clicks on the login button
  Then Login should be failed with "<errormessage>"

  Examples:
    | username 			| password 	| errormessage 											|
    |  abc@gmail.com	|  abc  	|  An incorrect Email address or Password was specified |  			|
    |  xyz@abc.com   	|  xyz  	|  An incorrect Email address or Password was specified |			|