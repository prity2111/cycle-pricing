import com.social91.cycle.*;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

public class JunitTest extends CycleMapper {

    public static void updatePriceFromFile(InputStream inputStream) throws IOException {
        Properties properties = new Properties();
        properties.load(inputStream);
        Map<String, Double> priceMap = new HashMap<>();
        properties.forEach((k, v) -> priceMap.put(k.toString(), Double.parseDouble(v.toString())));
        PriceHolder.updatePrice(priceMap);

    }
    @Test
    public void testNotNull(){
        assertNotNull(Double.valueOf(PriceHolder.getWheelSpokePrice()));
        assertNotNull(Double.valueOf(PriceHolder.getWheelTubePrice()));
        assertNotNull(Double.valueOf(PriceHolder.getSeatingSeatCoverPrice()));
        assertNotNull(Double.valueOf(PriceHolder.getHandleBarsSizePrice()));
    }






}
