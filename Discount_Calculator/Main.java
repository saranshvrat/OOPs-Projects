import Discount.*;

public class Main{
   public static void main(String[] args){
   
        DiscountCalculator dc1 = DiscountSelector.getDiscount(1000,1);
        System.out.println("Final Price (Student): " + dc1.getFinalPrice());

        DiscountCalculator dc2 = DiscountSelector.getDiscount(1000,2);
        System.out.println("Final Price (Student): " + dc2.getFinalPrice());

        DiscountCalculator dc3 = DiscountSelector.getDiscount(1000,3);
        System.out.println("Final Price (Student): " + dc3.getFinalPrice());

        DiscountCalculator dc4 = DiscountSelector.getDiscount(1000,4);
        System.out.println("Final Price (Student): " + dc4.getFinalPrice());

        DiscountCalculator dc5 = DiscountSelector.getDiscount(1000,5);
        System.out.println("Final Price (Student): " + dc5.getFinalPrice());
   }
}