package com.jju;

public class Smart Light extends SmartDevice {

    // Constructor
    public SmartLight(String name) {
        super(name);
    }

    // Override activate method
    @Override
    public void activate() {
        System.out.println(getName() + " is now ON at 100% brightness.");
    }
}