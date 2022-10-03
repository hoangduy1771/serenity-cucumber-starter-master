package caffeinateme;

import caffeinateme.steps.Customer;
import caffeinateme.steps.UserRegistrationClient;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class OrderACoffeeStepDefinitions {
    @Steps
    UserRegistrationClient userRegistrations;

    @Steps
    Customer customer;

    @Given("Buyer has a Caffeinate-Me account")
    public void buyerHasACaffeinateMeAccount() {
        userRegistrations.registerUser(customer);
    }

    @When("Buyer orders a (.*)")
    public void buyerOrdersA(String order) {
//        customer.placesAnOrderFor(1, order);
    }


}
