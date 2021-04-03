package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {

    @Given("^User is on Netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
    	//code to navigate login url
        System.out.println("Navigated to login url");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password() throws Throwable {
        //code to login
    	System.out.println("Logged in success");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
    	//home page validation
    	System.out.println("Validated home page");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        //validating the cards
    	System.out.println("Validated cards");
    }
    
    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }
    
    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
    	System.out.println(strArg1);
    }

}