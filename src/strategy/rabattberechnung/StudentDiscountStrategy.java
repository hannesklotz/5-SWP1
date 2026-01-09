package strategy.rabattberechnung;

public class StudentDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.10; // 10%
    }
}

