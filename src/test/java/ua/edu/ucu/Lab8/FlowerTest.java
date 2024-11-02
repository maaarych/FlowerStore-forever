package ua.edu.ucu.Lab8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.lab.item.flower.Flower;
import ua.edu.ucu.lab.item.flower.FlowerColor;

import java.util.Random;

public class FlowerTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private static final int MAX_LENGTH = 100;
    private Flower flower;

    @BeforeEach
    public void init() {
        int length = RANDOM_GENERATOR.nextInt(MAX_LENGTH);
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower = new Flower(length, FlowerColor.BLUE, price);
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }

    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        Assertions.assertEquals(FlowerColor.RED, flower.getColor());
    }
}
