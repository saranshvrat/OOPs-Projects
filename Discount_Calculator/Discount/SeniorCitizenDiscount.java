package Discount;

public class SeniorCitizenDiscount extends DiscountCalculator {

    public SeniorCitizenDiscount(int totalPrice, int offer) {
        super(totalPrice, offer);
    }

    public double calculateDiscount(int offer) {
        System.out.println("25% Senior Citiizen Discount applied to your Order");
        return ((totalPrice) / 4.0) * 3;
    }
}
