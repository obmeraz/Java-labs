package com.labs.bsu.action;

import com.labs.bsu.entity.Bus;
import com.labs.bsu.entity.BusStop;

import java.util.concurrent.Semaphore;

public class BusAction {
    private static final int BUSES_TOGETHER = 3;
    private static Semaphore semaphore = new Semaphore(BUSES_TOGETHER, true);

    public static void stopOnTheBusStop(Bus bus, BusStop busStop) {
        try {
            semaphore.acquire();
            System.out.println("After semaphore bus :" + bus);
            busStop.stopBus(bus);
            System.out.println("sleep...");
            Thread.sleep(1000);
            Bus releaseBus = busStop.releaseBus();
            System.out.println("After release bus :" + releaseBus);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            semaphore.release();
        }
    }
}
