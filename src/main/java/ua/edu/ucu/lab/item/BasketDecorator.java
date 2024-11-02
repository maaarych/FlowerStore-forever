package ua.edu.ucu.lab.item;

public class BasketDecorator extends ItemDecorator {
    private static final int DECORATOR_PRICE = 4;
    private final Item item;

    public BasketDecorator(Item item) {
        this.item = item;
        setDescription("Basket decoration for " + item.getDescription());
    }

    @Override
    public double price() {
        return DECORATOR_PRICE + item.price();
    }
}
