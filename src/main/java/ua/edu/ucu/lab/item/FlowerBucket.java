package ua.edu.ucu.lab.item;

import ua.edu.ucu.lab.item.flower.Flower;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    private final List<FlowerPack> packs = new ArrayList<>();

    public FlowerBucket() { setDescription("Bucket of flowers"); }

    public void addFlowers(FlowerPack pack) {
        packs.add(pack);
    }

    public double price() {
        double ans = 0;
        for (FlowerPack pack : packs) {
            ans += pack.getPrice();
        }
        return ans;
    }

    public boolean equals(Object o) {
        if (o == null) { return false; }
        if (!(o instanceof FlowerBucket)) { return false; }
        return packs.equals(((FlowerBucket) o).packs);
    }

    public boolean searchFlower(Flower flower) {
        for (FlowerPack pack : packs) {
            if (pack.search(flower)) { return true; }
        }
        return false;
    }
}
