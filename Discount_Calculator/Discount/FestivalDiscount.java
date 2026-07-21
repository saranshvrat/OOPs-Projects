package Discount;

public class FestivalDiscount extends DiscountCalculator {

    public FestivalDiscount(int totalPrice, int offer) {
        super(totalPrice, offer);
    }

    public double calculateDiscount(int offer) {
        System.out.println("30% Festival Discount applied to your Order");
        return ((totalPrice) / 10.0) * 7;
    }
}
