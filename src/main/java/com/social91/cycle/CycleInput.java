package com.social91.cycle;

/**
 * This is POJO File for JSON Input
 */
public class CycleInput {

    private int id;
    private Wheel wheel;
    private Frame frame;
    private ChainAssembly chainAssembly;
    private HandleBarWithBrakes handleBarWithBrakes;
    private Seatings seatings;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public ChainAssembly getChainAssembly() {
        return chainAssembly;
    }

    public void setChainAssembly(ChainAssembly chainAssembly) {
        this.chainAssembly = chainAssembly;
    }

    public HandleBarWithBrakes getHandleBarWithBrakes() {
        return handleBarWithBrakes;
    }

    public void setHandleBarWithBrakes(HandleBarWithBrakes handleBarWithBrakes) {
        this.handleBarWithBrakes = handleBarWithBrakes;
    }

    public Seatings getSeatings() {
        return seatings;
    }

    public void setSeatings(Seatings seatings) {
        this.seatings = seatings;
    }

    public static class Wheel {
        private int spokes;
        private String rim;
        private boolean tube;
        private String tyre;

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

    public static class Frame {
        private String material;

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }


    }

    public static class ChainAssembly {
        private String material;

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }
    }

    public static class HandleBarWithBrakes {
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
    }


    public static class Seatings {
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
            style = style;
        }

        public Boolean getSeatCover() {
            return seatCover;
        }

        public void setSeatCover(Boolean seatCover) {
            this.seatCover = seatCover;
        }
    }
}
