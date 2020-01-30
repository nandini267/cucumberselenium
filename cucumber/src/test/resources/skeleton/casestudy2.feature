	Feature: Login on testmeapp
Scenario Outline: Login on testmeapp with registered username
Given The url of testmeapp "http://10.232.237.143:443/TestMeApp/fetchcat.htm"
When User clicks on "signin" button
And User enters "<username>" as UserName
And User enters "<password>" as PassWord
Then User clicks on the "LOGIN" button
Examples:
|username|password|
|nandinib|Bnandini69@|

Scenario: searching for a product
Given The url of testmeapp "http://10.232.237.143:443/TestMeApp/fetchcat.htm"
When User searches for a product
And User clicks on find details
Then User clicks on addtocart

