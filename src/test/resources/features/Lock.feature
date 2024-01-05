Feature: Lock Options

Background:
  Given The user opens the app for the first time
@Regression

Scenario Outline: Failed password confirmation and lenght
When the user tap the "EMPEZAR" button
And tap the "Siguiente" button until reaching the lock options
And tap the "Contraseña" button
And types a <password_a>
And tap the "Siguiente" button
And types a <password_b>
And tap the "Siguiente" button
Then a message is displayed to the user, warning the passwords are not the same

Examples:
| password_a  | password_b |
| abcdef      | abcabc     |
