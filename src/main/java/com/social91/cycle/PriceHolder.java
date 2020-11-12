package com.social91.cycle;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PriceHolder  {


    private static final Map<String, Double> PRICE_MAP = new HashMap<>();
    private static final Double ZERO = Double.valueOf(0);

    public static void updatePrice(Map<String, Double> updatedPriceMap) {
        PRICE_MAP.putAll(updatedPriceMap);
    }

    public static double getChainAssemblyMaterialPrice(String material) {
        return PRICE_MAP.getOrDefault("ChainAssembly-" + material, ZERO);
    }

    public static double getWheelSpokePrice() {
        return PRICE_MAP.getOrDefault("Wheel-Spoke", ZERO);
    }

    public static double getWheelTubePrice() {
        return PRICE_MAP.getOrDefault("Wheel-Tube", ZERO);
    }

    public static double getWheelRimPrice(String rimCategory) {
        return PRICE_MAP.getOrDefault("Wheel-Rim" + rimCategory, ZERO);
    }

    public static double getWheelTyrePrice(String type) {
        return PRICE_MAP.getOrDefault("Wheel-Tyre" + type, ZERO);
    }

    public static double getSeatingMaterialPrice(String material) {
        return PRICE_MAP.getOrDefault("SeatingMaterial-" + material, ZERO);
    }

    public static double getSeatingStylePrice(String style) {
        return PRICE_MAP.getOrDefault("Seating-Style" + style, ZERO);
    }

    public static double getSeatingSeatCoverPrice() {
        return PRICE_MAP.getOrDefault("Seating-SeatCover", ZERO);
    }

    public static double getFrameMaterialPrice(String material) {
        return PRICE_MAP.getOrDefault("FrameMaterial-" + material, ZERO);
    }

    public static double getHandleBarsWithBreakMaterialPrice(String material) {
        return PRICE_MAP.getOrDefault("HandleBarsWithBrakeMaterial-" + material, ZERO);
    }


    public static double getHandleBarsSizePrice() {
        return PRICE_MAP.getOrDefault("HandleBarsWithBrake-Size", ZERO);
    }

}
