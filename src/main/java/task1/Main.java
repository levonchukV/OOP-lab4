package task1;

public class Main {
    public static void main(String[] args) {
        Customer regularCustomer = new RegularCustomer();
        Customer premiumCustomer = new PremiumCustomer();

        PaymentProcessor paymentProcessor = new PaymentProcessor();

        double regularDiscount = paymentProcessor.calculateDiscount(regularCustomer, 1000);
        double premiumDiscount = paymentProcessor.calculateDiscount(premiumCustomer, 1000);

        System.out.println("Regular Customer Discount: " + regularDiscount);
        System.out.println("Premium Customer Discount: " + premiumDiscount);
    }
}