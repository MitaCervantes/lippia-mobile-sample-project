package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.LoginService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.crowdar.core.PropertyManager;

/**
 * This class handles the steps in the features files and connects with the service in case of having business logic.
 * Otherwise, if it is a simple action, like clicking a button and it has nothing related to business logic, is correct to put here.
 */
public class LoginSteps extends PageSteps {
    private final String password = PropertyManager.getProperty("password");
    @Given("The app is loaded correctly and locked a password")
    public void isLoginPageVisible() {
        LoginService.isViewLoaded(password);
    }


    @When("The user click the go to tella button")
    public void goTellaProcess() {
        LoginService.goTella();
    }

}
