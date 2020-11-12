package com.social91.cycle;

public class Seating implements CycleComponent {
    private String material;//plastic, leather
    private String style;// saddle, custom
    private Boolean seatCover;// available or not


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public Boolean getSeatCover() {
        return seatCover;
    }

    public void setSeatCover(Boolean seatCover) {
        this.seatCover = seatCover;
    }


    @Override
    public double getPrice() {
        double sum = 0;
        sum += PriceHolder.getSeatingMaterialPrice(material);
        if (seatCover) {
            sum += PriceHolder.getSeatingSeatCoverPrice();
        }
        sum += PriceHolder.getSeatingStylePrice(style);
        return sum;
    }
}
