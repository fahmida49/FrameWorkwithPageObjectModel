Feature: Verify Customer Login functionality

@Sanity @Regression
Scenario Outline: Verify Customer Login functionality happy path
Given I am in landing page http://it.microtechlimited.com
When I Click on Login menu
And Click on Customer Login
Then Enter User Id as "<userId>"          
And I Enter Password as "<password>"
And I Click on Login Button
Then Verify that I am in CUSTOMER Home Page

Examples:
|userId          |password|
|david@gmail.com | 1234   |