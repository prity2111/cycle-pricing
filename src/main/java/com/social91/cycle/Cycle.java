package com.social91.cycle;

/**
 * This file explains all the components of a cycles for which we have to calculate price
 * once we calculate the price of individual components then,
 * we can calculate the overall price of cycle by adding all prices
 */
public class Cycle {

    private int id;
    private Frame frame;
    private Wheels wheel;
    private Seating seating;
    private HandleBarWithBrakes handleBarWithBrakes;
    private ChainAssembly chainAssembly;

    public double getPrice() {
        return wheel.getPrice() + chainAssembly.getPrice() + seating.getPrice() + handleBarWithBrakes.getPrice() + frame.getPrice();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public Wheels getWheel() {
        return wheel;
    }

    public void setWheel(Wheels wheel) {
        this.wheel = wheel;
    }

    public Seating getSeating() {
        return seating;
    }

    public void setSeating(Seating seating) {
        this.seating = seating;
    }

    public HandleBarWithBrakes getHandleBarWithBrakes() {
        return handleBarWithBrakes;
    }

    public void setHandleBarWithBrakes(HandleBarWithBrakes handleBarWithBrakes) {
        this.handleBarWithBrakes = handleBarWithBrakes;
    }

    public ChainAssembly getChainAssembly() {
        return chainAssembly;
    }

    public void setChainAssembly(ChainAssembly chainAssembly) {
        this.chainAssembly = chainAssembly;
    }
}
