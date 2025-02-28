package org.example;

public class OrderService {
    private final InventoryService inventoryService;

    public OrderService(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    public String placeOrder(String productName, int quantity) {
        if (inventoryService.isProductAvailable(productName,quantity)){
            return "Order placed for " + quantity + " x " + productName;
        } else {
            return "Product out of stock: " + productName;
        }
    }
}
