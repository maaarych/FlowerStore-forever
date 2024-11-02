package ua.edu.ucu.Lab8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.lab.item.*;
import ua.edu.ucu.lab.item.flower.Flower;

import static ua.edu.ucu.lab.item.flower.FlowerColor.BLUE;
import static ua.edu.ucu.lab.item.flower.FlowerColor.RED;

public class DecoratorTests {

    private FlowerBucket bucket;
    private FlowerPack packOne;
    private FlowerPack packTwo;

    @BeforeEach
    public void init() {
        Flower first = new Flower(5., RED, 10.);
        Flower second = new Flower(5., BLUE, 20.);

        packOne = new FlowerPack(first, 5);
        packTwo = new FlowerPack(second, 10);

        bucket = new FlowerBucket();
    }

    @Test
    public void testPaper() {
        PaperDecorator paper = new PaperDecorator(bucket);

        Assertions.assertTrue(paper instanceof ItemDecorator);
        Assertions.assertTrue(paper instanceof Item);

        Assertions.assertEquals(paper.price(), 13);
        bucket.addFlowers(packOne);
        Assertions.assertEquals(paper.price(), 63);
        bucket.addFlowers(packTwo);
        Assertions.assertEquals(paper.price(), 263);
    }

    @Test
    public void testBasket() {
        BasketDecorator basket = new BasketDecorator(bucket);

        Assertions.assertTrue(basket instanceof ItemDecorator);
        Assertions.assertTrue(basket instanceof Item);

        Assertions.assertEquals(basket.price(), 4);
        bucket.addFlowers(packOne);
        Assertions.assertEquals(basket.price(), 54);
        bucket.addFlowers(packTwo);
        Assertions.assertEquals(basket.price(), 254);
    }

    @Test
    public void testRobbin() {
        RibbonDecorator ribbon = new RibbonDecorator(bucket);

        Assertions.assertTrue(ribbon instanceof ItemDecorator);
        Assertions.assertTrue(ribbon instanceof Item);

        Assertions.assertEquals(ribbon.price(), 40);
        bucket.addFlowers(packOne);
        Assertions.assertEquals(ribbon.price(), 90);
        bucket.addFlowers(packTwo);
        Assertions.assertEquals(ribbon.price(), 290);
    }

}
