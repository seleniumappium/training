Feature: My Profile

Scenario Outline: Verify the Save button visibility
Given Open wordpress application
When Click on Login Link
When Enter user name with "<username>"
When Enter password "<password>"
When Clic on Login Button
When click on profile icon
And enter first name <"sudheer">
And enter last name <"kumar">
And enter about me <"Sudheer Kumar">
And enter display name <"Sudheer K">
And click on save profile button
Then verify save message displayed
Then Close browser 

Examples:
|username|password|
|sudheerkumar.gv@gmail.com|abcxyz123|


Scenario: Verify the Save button visibility
Given Open wordpress application
When Click on Login Link
When Enter user name with "sudheerkumar.gv@gmail.com"
When Enter password "abcxyz123"
When Clic on Login Button
When click on profile icon
When Enter the form details
	|Fields			| Value		|
	|FirstName		| sudheer	|
	|LastName		| kumar		|
	|DisplayName	| Sudheer K	|
	|AboutMe		| Trainer	|
And click on save profile button
Then verify save message displayed
Then Close browser 