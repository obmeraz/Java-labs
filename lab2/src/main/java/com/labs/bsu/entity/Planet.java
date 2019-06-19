package com.labs.bsu.entity;

import java.util.List;

public class Planet {
    private String name;
    private List<Ocean> oceans;
    private List<Island> islands;
    private List<Continent> continents;

    public Planet() {
    }

    public Planet(String name, List<Ocean> oceans, List<Island> islands, List<Continent> continents) {
        this.name = name;
        this.oceans = oceans;
        this.islands = islands;
        this.continents = continents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ocean> getOceans() {
        return oceans;
    }

    public void setOceans(List<Ocean> oceans) {
        this.oceans = oceans;
    }

    public List<Island> getIslands() {
        return islands;
    }

    public void setIslands(List<Island> islands) {
        this.islands = islands;
    }

    public List<Continent> getContinents() {
        return continents;
    }

    public void setContinents(List<Continent> continents) {
        this.continents = continents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Planet planet = (Planet) o;

        if (name != null ? !name.equals(planet.name) : planet.name != null) return false;
        if (oceans != null ? !oceans.equals(planet.oceans) : planet.oceans != null) return false;
        if (islands != null ? !islands.equals(planet.islands) : planet.islands != null) return false;
        return continents != null ? continents.equals(planet.continents) : planet.continents == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (oceans != null ? oceans.hashCode() : 0);
        result = 31 * result + (islands != null ? islands.hashCode() : 0);
        result = 31 * result + (continents != null ? continents.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", oceans=" + oceans +
                ", islands=" + islands +
                ", continents=" + continents +
                '}';
    }
}
