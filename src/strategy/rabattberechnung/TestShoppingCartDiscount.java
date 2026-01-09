package strategy.rabattberechnung;

public class TestShoppingCartDiscount {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(100.0);

        System.out.println("Grundpreis: " + cart.getTotalPrice());
        System.out.println("Endpreis (kein Rabatt): " + cart.getFinalPrice());

        cart.setDiscountStrategy(new StudentDiscountStrategy());
        System.out.println("Endpreis (Student 10%): " + cart.getFinalPrice());

        cart.setDiscountStrategy(new PremiumCustomerDiscountStrategy());
        System.out.println("Endpreis (Premium 20%): " + cart.getFinalPrice());

        cart.setTotalPrice(250.0);
        cart.setDiscountStrategy(new StudentDiscountStrategy());
        System.out.println("Neuer Grundpreis: " + cart.getTotalPrice());
        System.out.println("Endpreis (Student 10%): " + cart.getFinalPrice());
    }
}

