Feature: login functions
  @US_6
  Scenario: validate login with valid user name and password
    Then validate App Title is "TEK Insurance App"
    Then clicking on Login button
    When enter username as "supervisor"
    When enter password as "tek_supervisor"
    Then click on login button
    Then validate the Customer Section Title is "Customer Service Portal"


    @US_6
    Scenario:validate login with wrong username
      Then clicking on Login button
      When enter username as "WrongUsername"
      When enter password as "tek_supervisor"
      Then click on login button
      Then validate error message "ERROR"

      @US_7
      Scenario: validate login with wrong password
        Then clicking on Login button
        When enter username as "supervisor"
        When enter password as "WrongPassword"
        Then click on login button
        Then validate error message "ERROR"









