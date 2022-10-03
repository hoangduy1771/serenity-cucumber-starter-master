package caffeinateme.steps;

public class UserRegistrationClient {
    int customerIdCounter = 1;
    public void registerUser(Customer newCustomer) {
        newCustomer.hasACustomerIdOf(customerIdCounter++);
    }
}
