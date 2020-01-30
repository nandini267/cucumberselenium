Feature: shout Feature
@dry @valid
Scenario: Persons are within the range
Given Sean is 10 meters away from Lucia
When Sean shouts "Free Coffee"
Then Lucia hears the message "Free Coffee"

@dry
Scenario: Persons are not in the range
Given Sean is 100 meters away from Lucia
When Sean shouts "Free Coffee"
Then Lucia hears no message