#Author: David Spare
#Feature: Customer Order
#User Story: NGAS-523
#Scenario: scenario 1 title

Feature: Create Order Opearations

	Scenario: Create Order by Customer
		Given I logged in as Customer
    |userId         |password|
    |david@gmail.com|1234    |		
		Then I click on Order Product menu
		Then Select Product name
		And Enter Order Date
		And Click Order Product button
		And Click Confirm Order
		Then Verify Order Status is Confirmed




#	And Click Confirm Order
#	By.xpath("//tr")
#			
#	Then Verify Order Status is Confirmed
#	By.xpath("//tr")		