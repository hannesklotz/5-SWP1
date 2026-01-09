package strategy.rabattberechnung;

public class ShoppingCart {

    private double totalPrice;
    private DiscountStrategy discountStrategy;

    public ShoppingCart(double totalPrice) {
        this.totalPrice = totalPrice;
        this.discountStrategy = new NoDiscountStrategy(); // Default
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double getFinalPrice() {
        if (discountStrategy == null) {
            throw new IllegalStateException("Keine DiscountStrategy gesetzt.");
        }
        double discount = discountStrategy.calculateDiscount(totalPrice);
        return totalPrice - discount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}

