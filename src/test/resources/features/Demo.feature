@Demo
Feature: As a potential client i want to interact with the mobile application

  @Login
  Scenario Outline: The user starts the application, log in to the app.
    Given The app is loaded correctly
    When The user logs in the application with: <email>, <password>
    Then Home page is displayed

    Examples:
      | email                            | password    |
      | cervantes.mariana.6017@gmail.com | MitaCerv#21 |


  @ChangeLanguage
  Scenario: The user starts the application, log in to the app, changes the language and log out of the app and .
    Given The app is loaded correctly
    When The user logs in the application with: automation@gmail.com, 123456
    Then Home page is displayed

    When The user changes the language
    And The user log out of the app
    Then Login page is displayed


