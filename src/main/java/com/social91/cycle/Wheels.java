package com.social91.cycle;

public class Wheels implements CycleComponent {
    private int spokes;
    private String rim;// tubular or clincher
    private boolean tube; // available or not
    private String tyre;// tubeless or tube

    @Override
    public double getPrice() {
        double sum = 0;
        sum += spokes * PriceHolder.getWheelSpokePrice();
        sum += PriceHolder.getWheelRimPrice(rim);
        if (tube) {
            sum += PriceHolder.getWheelTubePrice();
        }
        sum += PriceHolder.getWheelTyrePrice(tyre);
        return sum;
    }

    public int getSpokes() {
        return spokes;
    }

    public void setSpokes(int spokes) {
        this.spokes = spokes;
    }

    public String getRim() {
        return rim;
    }

    public void setRim(String rim) {

        this.rim = rim;
    }

    public boolean isTube() {
        return tube;
    }

    public void setTube(boolean tube) {
        this.tube = tube;
    }

    public String getTyre() {
        return tyre;
    }

    public void setTyre(String tyre) {
        this.tyre = tyre;
    }
}
