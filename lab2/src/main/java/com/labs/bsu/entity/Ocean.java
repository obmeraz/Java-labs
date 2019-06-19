package com.labs.bsu.entity;

public class Ocean {
    private String name;

    public Ocean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ocean ocean = (Ocean) o;

        return name != null ? name.equals(ocean.name) : ocean.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Ocean{" +
                "name='" + name + '\'' +
                '}';
    }
}
