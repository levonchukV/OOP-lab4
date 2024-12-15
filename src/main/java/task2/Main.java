package task2;

import java.util.*;

class Order {
    private final int id;
    private final List<String> items;
    private final double totalPrice;
    private final String deliveryAddress;
    private final boolean giftWrap;
    private final String note;
    private final Date deliveryDate;
    private final String couponCode;

    private Order(OrderBuilder builder) {
        this.id = builder.id;
        this.items = builder.items;
        this.totalPrice = builder.totalPrice;
        this.deliveryAddress = builder.deliveryAddress;
        this.giftWrap = builder.giftWrap;
        this.note = builder.note;
        this.deliveryDate = builder.deliveryDate;
        this.couponCode = builder.couponCode;
    }

    public static class OrderBuilder {
        private final int id;
        private final List<String> items;
        private final double totalPrice;

        private String deliveryAddress;
        private boolean giftWrap;
        private String note;
        private Date deliveryDate;
        private String couponCode;

        public OrderBuilder(int id, List<String> items, double totalPrice) {
            this.id = id;
            this.items = items;
            this.totalPrice = totalPrice;
        }

        public OrderBuilder withDeliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
            return this;
        }

        public OrderBuilder withGiftWrap(boolean giftWrap) {
            this.giftWrap = giftWrap;
            return this;
        }

        public OrderBuilder withNote(String note) {
            this.note = note;
            return this;
        }

        public OrderBuilder withDeliveryDate(Date deliveryDate) {
            this.deliveryDate = deliveryDate;
            return this;
        }

        public OrderBuilder withCouponCode(String couponCode) {
            this.couponCode = couponCode;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", items=" + items +
                ", totalPrice=" + totalPrice +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", giftWrap=" + giftWrap +
                ", note='" + note + '\'' +
                ", deliveryDate=" + deliveryDate +
                ", couponCode='" + couponCode + '\'' +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        List<String> itemsList = Arrays.asList("item1", "item2");
        double totalPrice = 1500.0;

        Order order = new Order.OrderBuilder(1, itemsList, totalPrice)
                .withDeliveryAddress("Хрещатик 1")
                .withGiftWrap(true)
                .withNote("Зателефонуйте за годину до доставки")
                .withDeliveryDate(new Date())
                .withCouponCode("coupon")
                .build();

        System.out.println(order);
    }
}

