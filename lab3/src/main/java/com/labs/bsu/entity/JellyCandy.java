package com.labs.bsu.entity;

public class JellyCandy extends Candy {
    private int jelly;

    public JellyCandy(String name, int sugar, int weight, int jelly) {
        super(name, sugar, weight);
        this.jelly = jelly;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        JellyCandy that = (JellyCandy) o;

        return jelly == that.jelly;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + jelly;
        return result;
    }

    @Override
    public String toString() {
        return "JellyCandy{" +
                "jelly=" + jelly +
                "} " + super.toString();
    }
}
