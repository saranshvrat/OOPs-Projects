package Discount;

import Discount.*;

public class DiscountSelector {
    public static DiscountCalculator getDiscount(int totalPrice, int offerID) {
        switch (offerID) {
            case 1: return new StudentDiscount(totalPrice, offerID);
            case 2: return new FestivalDiscount(totalPrice, offerID);
            case 3: return new EmployeeDiscount(totalPrice, offerID);
            case 4: return new SeniorCitizenDiscount(totalPrice, offerID);
            default: throw new IllegalArgumentException("Invalid offer ID");
        }
    }
}
