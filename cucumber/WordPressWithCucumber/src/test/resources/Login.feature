Feature: Test Login Functionality 

Scenario Outline: scenario description 
	Given Open wordpress application
	When Click on Login Link 
	When Enter user name with "<username>" 
	When Enter password "<password>"
	When Clic on Login Button 
	Then Login should be failed 
	Then Close browser 
	
	Examples: 
		|username|password| 
		| ABC | ABC |
		| $@#$3 | #@$@$ |