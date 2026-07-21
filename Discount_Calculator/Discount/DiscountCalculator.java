package Discount;

abstract public class DiscountCalculator {
    protected int totalPrice;
    private double finalPrice;

    public int getTotalPrice()
    {
        return totalPrice;
    }
    public double getFinalPrice()
    {
        return finalPrice;
    }

    public DiscountCalculator(int totalPrice, int offer)
    {
        this.totalPrice = totalPrice;
        this.finalPrice = calculateDiscount(offer);
    }

    abstract protected double calculateDiscount(int offer);
}
