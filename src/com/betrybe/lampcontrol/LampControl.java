package com.betrybe.lampcontrol;

public class LampControl {

    public boolean lampOn;

    public LampControl() {
        this.lampOn = false;
    }

    public void turnLampOn() {
        this.lampOn = true;
    }

    public void turnLampOff() {
        this.lampOn = false;
    }

    public boolean isLampOn() {
        return lampOn;
    }
}

