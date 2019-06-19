package com.labs.bsu.starter;

import com.labs.bsu.action.GiftAction;
import com.labs.bsu.entity.Candy;
import com.labs.bsu.entity.ChocolateCandy;
import com.labs.bsu.entity.Gift;
import com.labs.bsu.entity.JellyCandy;

import java.util.ArrayList;
import java.util.List;

public class GiftStarter {
    public static void main(String[] args) {
        List<Candy> candies = new ArrayList<>();

        candies.add(new ChocolateCandy("Twix", 25, 12, 22));
        candies.add(new ChocolateCandy("Snickers", 11, 15, 11));
        candies.add(new ChocolateCandy("Milki way", 32, 4, 23));
        candies.add(new ChocolateCandy("Mars", 9, 32, 7));
        candies.add(new JellyCandy("Jelly", 21, 3, 15));
        candies.add(new JellyCandy("Bubble", 13, 6, 12));

        Gift gift = new Gift(candies);

        System.out.println(gift.getCandies());

        System.out.println(GiftAction.getGiftWeight(gift));

        GiftAction.sortByWeight(gift);

        System.out.println(gift.getCandies());

        System.out.println(GiftAction.findBySugarRange(gift, 12, 10));
    }
}
