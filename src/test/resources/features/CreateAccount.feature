@Smoke @Regression
Feature: Create Account

  Background:
  When click on Create Primary Account


  @US_3
  Scenario:Validate Create Primary Account
    Then Validate form title is "Create Primary Account Holder"

    @US_4
    Scenario: Filling the form
      When Enter Email Address "shaista.33333111111@gmail.com"
      Then Select Title "Mr"
      When Enter First Name "Baktash"
      When Enter Last Name "Khan"
      Then Select Gender "Male"
      Then Select Marital Status "Married"
      When Enter Employment Status "Student"
      Then Select Date Of Birth "12/20/1986"
      And Click on Create Account button
      Then validate email address is "shaista.33333111111@gmail.com"
      And Validate to sign up page title is "Sign up your account"


  @US_5
  Scenario: Validate Error Message Using Same Email Address
    When Enter Email Address "shaista.33333@gmail.com"
    Then Select Title "Mr"
    When Enter First Name "Baktash"
    When Enter Last Name "Khan"
    Then Select Gender "Male"
    Then Select Marital Status "Married"
    When Enter Employment Status "Student"
    Then Select Date Of Birth "12/20/1986"
    When Click on Create Account button
    Then Validate error Message "ERROR"

