# ai.zeninnBox
# Project Details
Framework : Data driven
Reason :
Easy to use
Scalable
Modular
Easy to maintain
Multiple data can be used
Objects, Functions & Tests can be kept seperate

# Project Structure

To Run please run : /testBox/src/test/java/runTest/Runner.java
            Maven : 
                Dependencies :
                        Java Selenium
                        WebDriver Manager
                        TestNG  : 
                                @Test
                                @AfterSuite
                                @Parameters
                                Listeners : ITestListener
                        Reporting : ExtentReporter
             Synchronization : Explicit Wait           
             URL :https://staging.zeninbox.ai/
             Path :Staging
             Browser: Chrome
             
#Manual Testing Test cases
    Login page :
       To check all the fields are visible
       To check all the elements are interactable
       To check user is able to login using valid email & password
       To check user is able to do SSO using Google and MS account
       To check user is able to do forgot password
       To check user is able to see incorrect data error when user enters incorrect details
       To check if user is able to refresh the page
       To check is user account gets locked after 3 incorrect password attempts
       To check if user can access his account from various browsers
       To check multiple users can login at same time from different systems
       To check if user can login from his Computer as wel as Mobile at once
       To check if website is accessible to visually impared people
       To check if password is masked while user enters password
       TO check  proper error messages are displayed when user enters incorrect details
       
    Select Workspace Page :
       To check if user is able to switch betwin workspaces
       To check if user can select workspace and enter
       To check Enter button is enabled only when workspace is selected
       To check if user can create a new workspace
       To check if user is able to logout from the page
       
    Inbox Page :
       To check inbox items are visible to user
       To check workspace name is displayed
       To check if user can see calender details
       To  check if user can search the inbox items
       To check if user can pin / forword / delete inbox items
       To check if user can select multiple inbox items
       To check if user can compose new item
       To check if user sees 10 items per page
       To check if user deleted the item it gets stored in trash folder
       To check if user can switch in betwin views
       
Bug :

1. Latency issue
2. When user howers over pin/delete options in inbox at mail bar the popup is hidden under another item
       
       
       
    
    
    
 


             
                     
                        
               
                             
                        
