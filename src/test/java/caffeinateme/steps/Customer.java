package caffeinateme.steps;

import net.serenitybdd.core.steps.ScenarioActor;

public class Customer extends ScenarioActor {

    private int customerId;

    public void hasACustomerIdOf(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }


    public void placesAnOrderFor(int i, String order) {
    }
}
