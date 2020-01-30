Feature: Register on TestMeApp
Scenario: Click on signup and register on Test Me App
Given The url of testmeapp "http://10.232.237.143:443/TestMeApp/RegisterUser.htm"
When User enters "nandinibb" as userName
And User enters "nandini" as firstname
And User enters "bethamcharla" as lastname
And User enters "Bnandini69@" as Password
And User enters "Bnandini69@" as confirmpassword
And User selects "female" as gender
And User enters "nandu@gmail.com" as email
And User enters "9726589453" as mobilenumber
And User enters "07/04/1998" as dob
And User enters "hyderabad" as address
And User selects "What is your Nick Name?" as securityquestion
And User writes "nandu" as answer
Then User clicks on "Register" button

