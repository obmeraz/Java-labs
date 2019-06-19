package com.labs.bsu.entity;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class BusStop {
    private static ReentrantLock lock = new ReentrantLock();
    private Queue<Bus> buses = new LinkedList<>();


    public void stopBus(Bus bus) {
        try {
            System.out.println("Stop bus :" + bus);
            lock.lock();
            buses.add(bus);
        } finally {
            lock.unlock();
        }
    }

    public Bus releaseBus() {
        try {
            System.out.println("Releasing bus");
            lock.lock();
            return buses.poll();
        } finally {
            lock.unlock();
        }
    }

    public Queue<Bus> getBuses() {
        return buses;
    }

    public void setBuses(Queue<Bus> buses) {
        this.buses = buses;
    }

    @Override
    public String toString() {
        return "BusStop{" +
                "buses=" + buses +
                '}';
    }
}
