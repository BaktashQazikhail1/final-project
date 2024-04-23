Feature:Validate Account Table

  @US_12
  Scenario: Validate account table row

    Then clicking on Login button
    When enter username as "supervisor"
    When enter password as "tek_supervisor"
    Then click on login button
    Then click on "Account" link
    Then validate accounts table have 5 rows

  @US_13
  Scenario: Validate change Item per page

    When clicking on Login button
    When enter username as "supervisor"
    When enter password as "tek_supervisor"
    Then click on login button
    Then click on "Account" link
    Then validate accounts table have 5 rows
    When change item per page to "10"
    When wait 2 Seconds
    Then validate accounts table have 10 rows
    When wait 2 Seconds
    When change item per page to "25"
    When wait 2 Seconds
    Then validate accounts table have 25 rows
    When wait 2 Seconds
    When change item per page to "50"
    Then validate accounts table have 50 rows
    When wait 2 Seconds








