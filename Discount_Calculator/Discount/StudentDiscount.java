package Discount;

public class StudentDiscount extends DiscountCalculator {

    public StudentDiscount(int totalPrice, int offer) {
        super(totalPrice, offer);
    }

    public double calculateDiscount(int offer) {
        System.out.println("20% Student Discount applied to your Order");
        return ((totalPrice) / 5.0) * 4;

    }
}
