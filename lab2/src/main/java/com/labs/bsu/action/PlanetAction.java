package com.labs.bsu.action;

import com.labs.bsu.entity.Continent;
import com.labs.bsu.entity.Planet;

public class PlanetAction {

    public static void printMatericName(Planet planet) {
        for (Continent continent : planet.getContinents()) {
            System.out.println(continent.getName());
        }
    }

    public static void printPlanetName(Planet planet) {
        System.out.println(planet.getName());
    }

    public static void printMatericCount(Planet planet) {
        System.out.println(planet.getContinents().size());
    }
}
