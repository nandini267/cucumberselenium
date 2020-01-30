Feature: moves to proceed to pay without add to cart
Scenario: user moves to cart without adding the items in it
Given  Alex has registered on testmeapp "http://10.232.237.143:443/TestMeApp/fetchcat.htm"
When Alex search for a particular product like headphones
And try to proceed for payment without any item in cart
Then Testmeapp doesnt display the cart icon