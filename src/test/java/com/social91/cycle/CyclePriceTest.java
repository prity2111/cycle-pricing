package com.social91.cycle;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

public class CyclePriceTest {

    @Before
    public void setup() throws IOException {
        PriceUpdaterService.updatePriceFromFile(UserInputInterfaceForCycle.class.getClassLoader().getResourceAsStream("CycleComponentsPrice.properties"));
    }

    @Test
    public void testMainMethodNoFailure() throws IOException {
        UserInputInterfaceForCycle.main(null);
    }

    @Test
    public void testCyclePrice() throws IOException {
        Gson gson = new Gson();
        InputStream jsonStream = CyclePriceTest.class.getClassLoader().getResourceAsStream("TestCycleInput.json");
        List<CycleInput>
                cycleInputObject = gson.fromJson(new InputStreamReader(jsonStream), new TypeToken<List<CycleInput>>() {
        }.getType());

        Cycle cycle = CycleMapper.map(cycleInputObject.get(0));
        assertEquals(999, cycle.getId());
        assertDouble(437.0, cycle.getPrice());
        assertDouble(54.00, cycle.getWheel().getPrice());
        assertDouble(20.50, cycle.getChainAssembly().getPrice());
        assertDouble(12.00, cycle.getFrame().getPrice());
        assertDouble(335.50, cycle.getHandleBarWithBrakes().getPrice());
        assertDouble(15.00, cycle.getSeating().getPrice());
    }

    public static void assertDouble(double expected, double actual) {
        assertEquals(String.format("Expected: %f%nActual: %f", expected, actual), 0, Double.compare(expected, actual));
    }
}
