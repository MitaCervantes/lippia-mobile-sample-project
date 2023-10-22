@Demo
Feature: As a potential client i want to interact with the mobile application

  @Register
  Scenario Outline: The user starts the application, registers a new user.
    Given The app is loaded correctly
    When The user goes to the Sign Up page
    And The user registers a new user with: <username>, <email>, <password>
    Then Home page is displayed


    Examples:
      | username   | email                | password |
      | automation | automation@gmail.com | 123456   |

  @Login
  Scenario: The user starts the application, log in to the app.
    Given The app is loaded correctly
    When The user logs in the application with: automation@gmail.com, 123456
    Then Home page is displayed

  @ChangeLanguage
  Scenario: The user starts the application, log in to the app, changes the language and log out of the app and .
    Given The app is loaded correctly
    When The user logs in the application with: automation@gmail.com, 123456
    Then Home page is displayed

    When The user changes the language
    And The user log out of the app
    Then Login page is displayed


