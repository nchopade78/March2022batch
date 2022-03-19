Feature: Login functionality

Background: User is sucessfully LaunchedApplication
When user opens "Chrome" browser with exe as "D:\\ProjectFlipkart\\Flipkart\\src\test\\resources\\DRIVERS\\chromedriver.exe"
When user opens URL as "https://www.flipkart.com"

@SmokeTest
Scenario: Login functionality with valid credentials
When user click on cancel login window 
When user use move cursor to login 
When user click on MyProfile
When user enter "9922231642" as username
When user enter "Nitin123" as a password
When user click on login button
Then Application shows logged successfully
