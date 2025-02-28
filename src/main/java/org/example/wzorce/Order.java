package org.example.wzorce;

public class Order {
    private String mainDish;
    private String sideDish;
    private String drink;

    private Order(OrderBuilder builder) {
        this.mainDish = builder.mainDish;
        this.sideDish = builder.sideDish;
        this.drink = builder.drink;
    }

    public static class OrderBuilder {
        private String mainDish;
        private String sideDish;
        private String drink;

        public OrderBuilder setMainDish(String mainDish) {
            this.mainDish = mainDish;
            return this;
        }

        public OrderBuilder setSideDish(String sideDish) {
            this.sideDish = sideDish;
            return this;
        }

        public OrderBuilder setDrink(String drink) {
            this.drink = drink;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }

    @Override
    public String toString() {
        return "Order: " + mainDish + ", " + sideDish + ", " + drink;
    }
}
