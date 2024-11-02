package ua.edu.ucu.lab.item;

public class RibbonDecorator extends ItemDecorator {
    private static final int DECORATOR_PRICE = 40;
    private final Item item;

    public RibbonDecorator(Item item) {
        this.item = item;
        setDescription("Ribbon decoration for " + item.getDescription());
    }

    @Override
    public double price() {
        return DECORATOR_PRICE + item.price();
    }
}
