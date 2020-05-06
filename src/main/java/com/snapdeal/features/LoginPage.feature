Feature: Login into snapdeal website

Scenario: Login into snapdeal website

Given enter website details
When user click on signin 
Then user enter username 
Then user enter password
Then get the title of the page
Then user click on useraccount
Then user click on logout
Then close the browser