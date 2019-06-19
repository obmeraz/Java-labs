package com.labs.bsu.entity;

public class ChocolateCandy extends Candy {
    private int chocolate;

    public ChocolateCandy(String name, int sugar, int weight, int chocolate) {
        super(name, sugar, weight);
        this.chocolate = chocolate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ChocolateCandy that = (ChocolateCandy) o;

        return chocolate == that.chocolate;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + chocolate;
        return result;
    }

    @Override
    public String toString() {
        return "ChocolateCandy{" +
                "chocolate=" + chocolate +
                "} " + super.toString();
    }
}
