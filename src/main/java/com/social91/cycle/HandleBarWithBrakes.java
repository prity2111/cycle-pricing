package com.social91.cycle;

public class HandleBarWithBrakes implements CycleComponent {
    private String material;
    private Float handleBarSize;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Float getHandleBarSize() {
        return handleBarSize;
    }

    public void setHandleBarSize(Float handleBarSize) {
        this.handleBarSize = handleBarSize;
    }


    @Override
    public double getPrice() {
        double sum = 0;
        sum += PriceHolder.getHandleBarsWithBreakMaterialPrice(material);
        sum += handleBarSize * PriceHolder.getHandleBarsSizePrice();
        return sum;
    }
}
