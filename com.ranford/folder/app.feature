Feature: login
Scenario: validate the tittle of homepage
Given     launch the site
When      check the tittle with "KEXKIM BANK" data
Then      login fields shoulds be displayed 
And       close site

Scenario: validate the login fields
Given     launch the site
When      enter the userid with  "Admin" data and password with "Admin" data and click on login btn

Then      Branches btn should be displayed
And       close site





