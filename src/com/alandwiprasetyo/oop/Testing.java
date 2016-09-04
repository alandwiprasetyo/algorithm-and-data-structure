package com.alandwiprasetyo.oop;

/**
 * Created by alandwiprasetyo on 9/4/16.
 */
public class Testing implements Test {
    @Override
    public void start() {
        System.out.println("start");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
}
