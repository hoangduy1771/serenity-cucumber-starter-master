package caffeinateme;

import java.util.Objects;

public class OrderReceipt {
    private final int customerId;
    private final int quantity;
    private final String product;

    public int getCustomerId() {
        return customerId;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProduct() {
        return product;
    }

    public OrderReceipt(int customerId, int quantity, String product) {
        this.customerId = customerId;
        this.quantity = quantity;
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderReceipt that = (OrderReceipt) o;
        return customerId == that.customerId && quantity == that.quantity && Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, quantity, product);
    }

    @Override
    public String toString() {
        return "OrderReceipt{" +
                "customerId=" + customerId +
                ", quantity=" + quantity +
                ", product='" + product + '\'' +
                '}';
    }
}
