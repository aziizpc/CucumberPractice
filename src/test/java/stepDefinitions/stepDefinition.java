package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinition {
	
	@Given("^User is on landing page$")
	public void user_is_on_landing_page() throws Throwable {
	    System.out.println("Login Page ...");
	}

	@When("^User login to application with Username and Password$")
	public void user_login_to_application_with_Username_and_Password() throws Throwable {
	    System.out.println("UN and PWD ...");
	}

	@Then("^Homepage is displayed$")
	public void homepage_is_displayed() throws Throwable {
	    System.out.println("Homepage ...");
	}

	@Then("^Cards are displayed$")
	public void cards_are_displayed() throws Throwable {
	    System.out.println("Cards ...");
	}
	
	@When("^User login to application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_to_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
        System.out.println("UN: " + strArg1);
        System.out.println("PWD: " + strArg2);
    }
	
	@Then("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
		System.out.println("Status: " + strArg1);
    }

}