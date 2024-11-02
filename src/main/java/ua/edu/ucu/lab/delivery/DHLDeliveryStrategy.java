package ua.edu.ucu.lab.delivery;

import ua.edu.ucu.lab.item.Item;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery {
    @Override
    public void deliver(List<Item> items) {
        System.out.println("The next items have been sent to you via DHL: ");
        for (Item item : items) {
            System.out.println(item.getDescription());
        }
    }
}
