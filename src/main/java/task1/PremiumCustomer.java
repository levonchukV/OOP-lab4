package task1;

class PremiumCustomer implements Customer {
    @Override
    public double getDiscountRate() {
        return 0.10;
    }
}
