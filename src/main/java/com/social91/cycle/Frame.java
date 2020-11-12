package com.social91.cycle;

public class Frame implements CycleComponent {
    private String material;//steel, aluminium,iron

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }


    public double getPrice() {
        return PriceHolder.getFrameMaterialPrice(material);
    }
}
