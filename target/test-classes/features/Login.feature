Feature: Application Login

Scenario: Homepage default login
Given User is on landing page
When User login to application with Username and Password
Then Homepage is displayed
And Cards are displayed

Scenario: Homepage default login
Given User is on landing page
When User login to application with "Hello" and "World123"
Then Homepage is displayed
And Cards displayed are "true"

Scenario: Homepage default login
Given User is on landing page
When User login to application with "Hello" and "World123"
Then Homepage is displayed
And Cards displayed are "false"