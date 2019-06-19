package com.labs.bsu.runner;

import com.labs.bsu.creator.BusCreator;
import com.labs.bsu.entity.Bus;

import java.util.List;

public class BusRunner {
    public static void main(String[] args) {
        List<Bus> buses = BusCreator.createBusList();
        buses.forEach(Thread::start);
    }
}
