package com.social91.cycle;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.jetbrains.annotations.VisibleForTesting;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * This is the entry point of the project having main()
 */
public class UserInputInterfaceForCycle {
    @VisibleForTesting
    public static void main(String[] args) throws IOException {

        PriceUpdaterService.updatePriceFromFile(UserInputInterfaceForCycle.class.getClassLoader().getResourceAsStream("CycleComponentsPrice.properties"));

        Gson gson = new Gson();
        System.out.println("------Provide the component details for bicycle -------");
        InputStream jsonStream = UserInputInterfaceForCycle.class.getClassLoader().getResourceAsStream("CycleInput.json");
        List<CycleInput>
                cycleInputObject = gson.fromJson(new InputStreamReader(jsonStream), new TypeToken<List<CycleInput>>() {
        }.getType());
        ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 10,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(1000));

        int index = 0;
        for (CycleInput input : cycleInputObject) {
            executor.execute(() -> {
                Cycle cycle = CycleMapper.map(input);
                StringBuilder builder = new StringBuilder();
                builder.append(String.format("**** Cycle (%d) ****", cycle.getId())).append(System.lineSeparator());
                builder.append("Cycle Price                : ").append(toCurrency(cycle.getPrice())).append(System.lineSeparator());
                builder.append("Wheel Price                : ").append(toCurrency(cycle.getWheel().getPrice())).append(System.lineSeparator());
                builder.append("Frame Price                : ").append(toCurrency(cycle.getFrame().getPrice())).append(System.lineSeparator());
                builder.append("ChainAssembly Price        : ").append(toCurrency(cycle.getChainAssembly().getPrice())).append(System.lineSeparator());
                builder.append("HandleBarWithBrakes Price  : ").append(toCurrency(cycle.getHandleBarWithBrakes().getPrice())).append(System.lineSeparator());
                builder.append("Seat Price                 : ").append(toCurrency(cycle.getSeating().getPrice())).append(System.lineSeparator());
                System.out.println(builder.toString());
            });
        }
        executor.shutdown();
    }

    private static String toCurrency(double input) {
        return String.format("%.2f", input);
    }
}
