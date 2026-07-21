package Discount;

public class EmployeeDiscount extends DiscountCalculator {

    public EmployeeDiscount(int totalPrice, int offer) {
        super(totalPrice, offer);
    }

    public double calculateDiscount(int offer) {
        System.out.println("25% Senior Citiizen Discount applied to your Order");
        return ((totalPrice) / 20.0) * 17;
    }
}
