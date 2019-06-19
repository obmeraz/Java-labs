package com.labs.bsu.action;

import com.labs.bsu.entity.Candy;
import com.labs.bsu.entity.Gift;

import java.util.Comparator;

public class GiftAction {

    public static int getGiftWeight(Gift gift) {
        int giftWeight = 0;
        for (Candy candy : gift.getCandies()) {
            giftWeight += candy.getWeight();
        }
        return giftWeight;
    }

    public static void sortByWeight(Gift gift) {
        gift.getCandies().sort(Comparator.comparingInt(Candy::getWeight));
    }

    public static Candy findBySugarRange(Gift gift, int maxRange, int minRange) {
        return gift.getCandies().stream()
                .filter(candy -> candy.getSugar() > minRange && candy.getSugar() < maxRange)
                .findFirst()
                .orElse(null);
    }
}
