package com.labs.bsu.entity;

import com.labs.bsu.action.BusAction;

import java.util.List;

public class Bus extends Thread {
    private String name;
    private List<BusStop> busStops;

    public Bus(String name, List<BusStop> busStops) {
        this.name = name;
        this.busStops = busStops;
    }

    @Override
    public void run() {
        System.out.println("Start bus: " + name);
        for (BusStop busStop : busStops) {
            BusAction.stopOnTheBusStop(this, busStop);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bus bus = (Bus) o;

        return name != null ? name.equals(bus.name) : bus.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "name='" + name + '\'' +
                '}';
    }
}
