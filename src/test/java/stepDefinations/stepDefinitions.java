package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


public class stepDefinitions {

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
//        throw new PendingException();
        System.out.println("The given section");
    }

    @When("^User logs into the application with username and password$")
    public void user_logs_into_the_application_with_username_and_password() throws Throwable {
//        throw new PendingException();
        System.out.println("The when section");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
//        throw new PendingException();
        System.out.println("The then section");
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
//        throw new PendingException();
        System.out.println("The and section");
    }

    @When("User logs into the application with {string} and {string}")
    public void userLogsIntoTheApplicationWithAnd(String arg0, String arg1) {
        System.out.println(arg0 + " " + arg1);
    }

    @And("Cards are displayed are {string}")
    public void cardsAreDisplayedAre(String arg0) {
        System.out.println(arg0);
    }
}