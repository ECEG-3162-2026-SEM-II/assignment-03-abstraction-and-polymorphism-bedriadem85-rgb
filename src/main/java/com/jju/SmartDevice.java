package com.jju;

public abstract class SmartDevice {
    // Private field (Encapsulation)
    private String name;

    // Constructor
    public SmartDevice(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Abstract method (no body)
    public abstract void activate();
}