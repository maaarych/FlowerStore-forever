package ua.edu.ucu.Lab8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.lab.item.flower.Flower;
import ua.edu.ucu.lab.item.flower.FlowerColor;
import ua.edu.ucu.lab.item.flower.Store;
import ua.edu.ucu.lab.item.FlowerBucket;
import ua.edu.ucu.lab.item.FlowerPack;

import java.util.Random;

public class StoreTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private static final int MAX_QUANTITY = 10;
    private static final int MAX_LENGTH = 100;

    @Test
    public void testSearch() {
        int lengthOne = RANDOM_GENERATOR.nextInt(MAX_LENGTH);
        int lengthTwo = RANDOM_GENERATOR.nextInt(MAX_LENGTH);
        int priceOne = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int priceTwo = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantityOne = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        int quantityTwo = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flowerOne = new Flower(lengthOne, FlowerColor.BLUE, priceOne);
        Flower flowerTwo = new Flower(lengthOne, FlowerColor.RED, priceTwo);
        Flower testFlowerOne = new Flower(lengthOne, FlowerColor.BLUE, priceOne);
        Flower testFlowerTwo = new Flower(lengthOne, FlowerColor.RED, priceTwo);
        Flower testFlowerThree = new Flower(lengthTwo, FlowerColor.RED, priceTwo);
        FlowerPack packOne = new FlowerPack(flowerOne, quantityOne);
        FlowerPack packTwo = new FlowerPack(flowerTwo, quantityTwo);
        FlowerBucket bucket = new FlowerBucket();
        FlowerPack testPackOne = new FlowerPack(testFlowerOne, quantityOne);
        FlowerPack testPackTwo = new FlowerPack(testFlowerTwo, quantityTwo);
        FlowerBucket testBucketOne = new FlowerBucket();
        FlowerPack testPackThree = new FlowerPack(testFlowerThree, quantityTwo);
        FlowerBucket testBucketTwo = new FlowerBucket();
        Store store = new Store();
        bucket.addFlowers(packOne);
        bucket.addFlowers(packTwo);
        testBucketOne.addFlowers(testPackOne);
        testBucketOne.addFlowers(testPackTwo);
        testBucketTwo.addFlowers(testPackOne);
        testBucketTwo.addFlowers(testPackThree);
        store.add(bucket);
        Assertions.assertSame(store.search(testBucketOne), bucket);
        Assertions.assertNotSame(store.search(testBucketTwo), bucket);
    }
}
