package com.social91.cycle;

public class ChainAssembly implements CycleComponent {
    private String material; // plain carbon , nikel plated, alloy steel

    public double getPrice() {
        return PriceHolder.getChainAssemblyMaterialPrice(material);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
