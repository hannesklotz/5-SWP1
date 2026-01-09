package strategy.rabattberechnung;

public class NoDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscount(double price) {
        return 0.0;
    }
}

