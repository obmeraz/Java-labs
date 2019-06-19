package com.labs.bsu.entity;

import java.util.List;

public class Gift {
    private List<Candy> candies;

    public Gift() {
    }

    public Gift(List<Candy> candies) {
        this.candies = candies;
    }

    public List<Candy> getCandies() {
        return candies;
    }

    public void setCandies(List<Candy> candies) {
        this.candies = candies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Gift gift = (Gift) o;

        return candies != null ? candies.equals(gift.candies) : gift.candies == null;

    }

    @Override
    public int hashCode() {
        return candies != null ? candies.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "candies=" + candies +
                '}';
    }
}
