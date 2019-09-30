Feature: Register to TestMeApp

  @casestudy1
  Scenario: Register User
    Given Sign Up
    And Enter Username as "fxfhhb3gf"
    And Enter Firstname as "divya"
    And Enter LastName as "yenna"
    And Enter Password as "password444"
    And Confirm your password "password444"
    And Select Gender as "female"
    And Enter Email as "divyareddy@gmail.com"
    And Enter Mobile Number as "9090458764"
    And Enter DOB as "04/04/1999"
    And Enter Address "Hyderabad"
    And Select Security question
    And Answer the question as "Hyderabad"
    And CLick on Register

  @casestudy2
  Scenario Outline: User Login
    Given Alex has registered into TestMeApp
    When Alex login with below set of "<username>" and "<password>"
    Then Alex login successfully into TestMeApp

    Examples: 
      | username | password    |
      | lalitha  | password123 |
