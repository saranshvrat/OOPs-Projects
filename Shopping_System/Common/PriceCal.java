package Common;

public class PriceCal {
    public static int calculateTotal(int... prices) {
        int total = 0;
        for (int price : prices) {
            total += price;
        }
        return total;
    }
}
