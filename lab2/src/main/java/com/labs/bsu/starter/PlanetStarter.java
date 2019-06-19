package com.labs.bsu.starter;

import com.labs.bsu.action.PlanetAction;
import com.labs.bsu.entity.Continent;
import com.labs.bsu.entity.Island;
import com.labs.bsu.entity.Ocean;
import com.labs.bsu.entity.Planet;

import java.util.ArrayList;
import java.util.List;

public class PlanetStarter {

    public static void main(String[] args) {
        Continent eurasia = new Continent("Eurasia");
        Continent africa = new Continent("Africa");
        Continent australia = new Continent("Australia");

        Island madascar = new Island("Madagascar");

        Ocean atlantic = new Ocean("Atlantic");
        Ocean indian = new Ocean("Indian");

        List<Continent> continents = new ArrayList<>();
        List<Island> islands = new ArrayList<>();
        List<Ocean> oceans = new ArrayList<>();

        continents.add(eurasia);
        continents.add(africa);
        continents.add(australia);

        islands.add(madascar);

        oceans.add(atlantic);
        oceans.add(indian);

        Planet planet = new Planet();
        planet.setContinents(continents);
        planet.setIslands(islands);
        planet.setOceans(oceans);

        planet.setName("Earth");

        PlanetAction.printMatericCount(planet);
        PlanetAction.printMatericName(planet);
        PlanetAction.printPlanetName(planet);

    }
}
