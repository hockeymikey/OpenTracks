package de.dennisguse.opentracks.content.sensor;

import androidx.annotation.NonNull;

public class SensorDataCyclingPower extends SensorData {

    private final float power_w;

    public SensorDataCyclingPower(String name, String address, float power_w) {
        super(name, address);
        this.power_w = power_w;
    }

    public boolean hasPower_w() {
        return !Float.isNaN(power_w);
    }

    public float getPower_w() {
        return power_w;
    }

    @NonNull
    @Override
    public String toString() {
        return "power=" + power_w;
    }
}
