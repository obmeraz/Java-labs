package com.labs.bsu.creator;

import com.labs.bsu.entity.Bus;
import com.labs.bsu.entity.BusStop;

import java.util.ArrayList;
import java.util.List;

public class BusCreator {

    public static List<Bus> createBusList() {
        List<BusStop> route1 = new ArrayList<>();
        route1.add(new BusStop());
        route1.add(new BusStop());
        route1.add(new BusStop());
        route1.add(new BusStop());
        List<BusStop> route2 = new ArrayList<>();
        route2.add(new BusStop());
        route2.add(new BusStop());
        Bus bus1 = new Bus("Bus1", route1);
        Bus bus2 = new Bus("Bus2", route1);
        Bus bus3 = new Bus("Bus3", route1);
        Bus bus4 = new Bus("Bus4", route1);
        Bus bus5 = new Bus("Bus5", route1);
        Bus bus6 = new Bus("Bus6", route1);
        Bus bus7 = new Bus("Bus7", route1);
        Bus bus8 = new Bus("Bus8", route2);
        Bus bus9 = new Bus("Bus9", route2);
        Bus bus10 = new Bus("Bus10", route2);
        List<Bus> buses = new ArrayList<>();
        buses.add(bus1);
        buses.add(bus2);
        buses.add(bus3);
        buses.add(bus4);
        buses.add(bus5);
        buses.add(bus6);
        buses.add(bus7);
        buses.add(bus8);
        buses.add(bus9);
        buses.add(bus10);
        return buses;
    }
}
