package com.labs.bsu.entity;

public class Candy {
    private String name;
    private int sugar;
    private int weight;

    public Candy(String name, int sugar, int weight) {
        this.name = name;
        this.sugar = sugar;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Candy candy = (Candy) o;

        if (sugar != candy.sugar) return false;
        if (weight != candy.weight) return false;
        return name != null ? name.equals(candy.name) : candy.name == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + sugar;
        result = 31 * result + weight;
        return result;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", sugar=" + sugar +
                ", weight=" + weight +
                '}';
    }
}
