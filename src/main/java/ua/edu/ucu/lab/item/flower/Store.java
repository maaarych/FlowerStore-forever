package ua.edu.ucu.lab.item.flower;

import ua.edu.ucu.lab.item.FlowerBucket;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<FlowerBucket> buckets = new ArrayList<>();

    public void add(FlowerBucket bucket) {
        buckets.add(bucket);
    }

    public FlowerBucket search(FlowerBucket bucket) {
        for (FlowerBucket bucketBucket : buckets) {
            if (bucketBucket.equals(bucket)) {
                return bucketBucket;
            }
        }
        return null;
    }

}
