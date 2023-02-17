@BackgroundColor
Feature: Techfios test page background color validation

@Scenario1
Scenario: Sky Blue Background
Given "Set SkyBlue Background" button exists
When I click on the "Set SkyBluebutton" 
Then The background color will change to "sky blue" 


@Scenario2
Scenario: White Background Change
Given "Set SkyWhite Background" button exists
When I click on the "Set White button" 
Then The background color will change to "white"
