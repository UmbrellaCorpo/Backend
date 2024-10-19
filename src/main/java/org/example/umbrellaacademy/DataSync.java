package org.example.umbrellaacademy;


import java.util.concurrent.CountDownLatch;

public class DataSync {

    private final CountDownLatch latch = new CountDownLatch(3);

    public void awaitDataSync() throws InterruptedException {
        latch.await();
    }

    public void dataReady() {
        latch.countDown();
    }
}
