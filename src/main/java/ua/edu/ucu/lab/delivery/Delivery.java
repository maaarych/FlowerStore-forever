package ua.edu.ucu.lab.delivery;

import ua.edu.ucu.lab.item.Item;

import java.util.List;

public interface Delivery {
    void deliver(List<Item> items);
}
