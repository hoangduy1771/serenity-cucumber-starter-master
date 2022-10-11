package caffeinateme.steps;

import caffeinateme.OrderReceipt;
import net.serenitybdd.core.steps.ScenarioActor;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class Customer extends ScenarioActor {

    private int customerId;

    @Steps(shared = true)
    CoffeeOrdersClient coffeeOrders;

    public void hasACustomerIdOf(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }


    @Step("#actor places an order for {0} {1}")
    public OrderReceipt placesAnOrderFor(int quantity, String product) {
        return coffeeOrders.placeOrder(getCustomerId(), quantity, product);
    }
}
