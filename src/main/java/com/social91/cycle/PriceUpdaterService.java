package com.social91.cycle;
/**
 * Here we are reading the price of each sub-parts of each components from the properties file
 * and storing these in a map
 */

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PriceUpdaterService {

    public static void updatePriceFromFile(InputStream inputStream) throws IOException {
        Properties properties = new Properties();
        properties.load(inputStream);
        Map<String, Double> priceMap = new HashMap<>();
        properties.forEach((k, v) -> priceMap.put(k.toString(), Double.parseDouble(v.toString())));
        PriceHolder.updatePrice(priceMap);
    }
}
