package strategy.rabattberechnung;

public class PremiumCustomerDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.20; // 20%
    }
}

