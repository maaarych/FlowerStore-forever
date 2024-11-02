package ua.edu.ucu.lab.item;

public class PaperDecorator extends ItemDecorator {
    private static final int DECORATOR_PRICE = 13;
    private final Item item;

    public PaperDecorator(Item item) {
        this.item = item;
        setDescription("Paper decoration for " + item.getDescription());
    }

    @Override
    public double price() {
        return DECORATOR_PRICE + item.price();
    }
}
