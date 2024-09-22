
Feature: verify guru99 Application webpage
@addCustomer
Scenario: verify add Customer
Given user should be at home page
When user click on add_customer
And user enter first_name "Matin"
And user enter last_name "Desai"
And user enter mail "matindesai02@gmail.com"
And user enter  address "Mumbaichembur"
And user enter mobile_number "7261981526"
And user enter click on submit button
Then should get display customer_ID
And user click on home tab
@TarifPlan
Scenario: verify Add Tariff Plan
Given user should be at home page
When user click on Add_Tariff_Plan
And  user enter Monthly_Rental "123"
And  user enter Free_Local_Minutes "12"
And  user enter Free_International_Minutes "87"
And user enter Free_sms_pack "120"
And user enter Local_Per_Minutes_Charges "90"
And user enter International_Per_Minutes_Charges "80"
And user enter SMS_Per_Charges "124"
And user click on submit btn
Then user should see "Congratulation you add Tariff Plan"
And user click on clickHomebtn
@addTarif
Scenario: verify Add Tariff Plan to Customer
Given user should be at home page
When user click on Add Tariff Plan to CustomerAdd Tariff Plan to Customer
And user enter customer_id 
And user click on submit button
And user add Tariff Plan to customer
Then should get display Congratulation Tariff Plan assigned
@PayBilling
Scenario: verify Pay Billing
Given user should be at home page
When user click on Pay Billing
And  user enter payBilling Customer id
And user click on submit
Then should get display Pay Billing

