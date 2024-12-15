package task1;

class PaymentProcessor {
    public double calculateDiscount(Customer customer, double amount) {
        return amount * customer.getDiscountRate();
    }
}
