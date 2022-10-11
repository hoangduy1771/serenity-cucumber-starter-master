package caffeinateme;

import caffeinateme.steps.Barista;
import caffeinateme.steps.Customer;
import caffeinateme.steps.Order;
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

    @Steps
    Barista barry;

    @Given("Buyer has a Caffeinate-Me account")
    public void buyerHasACaffeinateMeAccount() {
        userRegistrations.registerUser(customer);
    }

    OrderReceipt orderReceipt;
    @When("Buyer orders {int} {string}")
    public void buyerOrdersA(int quantity, String order) {
        orderReceipt = customer.placesAnOrderFor(quantity, order);
    }


    @Then("Barry should receive the order")
    public void barryShouldReceiveTheOrder() {
        assert(barry.pendingOrders()).contains(Order.matching(orderReceipt));

    }

}


















