Feature:Validate User Profile

  @US_8
  Scenario: Navigate to User Profile
    Then clicking on Login button
    When enter username as "supervisor"
    When enter password as "tek_supervisor"
    Then click on login button
    Then validate the Customer Section Title is "Customer Service Portal"
    Then click on profile button
    Then validate user Active "Status"
    Then validate CSR as a "User Type"
    Then validate Supervisor as a "Name"
    Then validate supervisor as a "Username"
    Then validate admin as an "Authorities"
    Then validate Logout as a "Logout"
    Then click on color mode

    @US_9
    Scenario:
      Then clicking on Login button
      When enter username as "supervisor"
      When enter password as "tek_supervisor"
      Then click on login button
      Then click on profile button
      Then click on Logout Button
      Then validate App Title is "TEK Insurance App"

