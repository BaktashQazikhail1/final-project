Feature: Validate plan page


  @US_10
  Scenario: navigate to plan page and validate 4 rows

    Then clicking on Login button
    When enter username as "supervisor"
    When enter password as "tek_supervisor"
    Then click on login button
    Then click on Plans
    Then validate 4 row of data is present

  @US_11
  Scenario:
    Then clicking on Login button
    When enter username as "supervisor"
    When enter password as "tek_supervisor"
    Then click on login button
    Then click on Plans
    Then validate Create Date is todays date in EST Time zone
    Then validate Date Expire is a day after EST Time Zone







