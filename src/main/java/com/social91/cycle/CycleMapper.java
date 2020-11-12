package com.social91.cycle;

/**
 * This is the mapper file which maps the JSON input to their correspondings component object
 * all the input values will be set here in the components fields.
 */
public class CycleMapper {

    public static Cycle map(CycleInput cycleInput) {
        Cycle cycle = new Cycle();
        cycle.setId(cycleInput.getId());
        cycle.setWheel(map(cycleInput.getWheel()));
        cycle.setChainAssembly(map(cycleInput.getChainAssembly()));
        cycle.setHandleBarWithBrakes(map(cycleInput.getHandleBarWithBrakes()));
        cycle.setSeating(map(cycleInput.getSeatings()));
        cycle.setFrame(map(cycleInput.getFrame()));
        return cycle;
    }


    private static Wheels map(CycleInput.Wheel wheelInput) {
        Wheels wheels = new Wheels();
        wheels.setRim(wheelInput.getRim());
        wheels.setSpokes(wheelInput.getSpokes());
        wheels.setTube(wheelInput.isTube());
        wheels.setTyre(wheelInput.getTyre());
        return wheels;
    }

    private static ChainAssembly map(CycleInput.ChainAssembly chainAssemblyInput) {
        ChainAssembly chainAssembly = new ChainAssembly();
        chainAssembly.setMaterial(chainAssemblyInput.getMaterial());
        return chainAssembly;
    }
    private static Frame map(CycleInput.Frame frameInput) {
        Frame frame = new Frame();
        frame.setMaterial(frameInput.getMaterial());
        return frame;
    }
    private static Seating map(CycleInput.Seatings seatingsInput) {
        Seating seatings = new Seating();
        seatings.setMaterial(seatingsInput.getMaterial());
        seatings.setSeatCover(seatingsInput.getSeatCover());
        seatings.setStyle(seatingsInput.getStyle());
        return seatings;
    }
    private static HandleBarWithBrakes map(CycleInput.HandleBarWithBrakes handleBarWithBrakesInput) {
        HandleBarWithBrakes handleBarWithBrakes = new HandleBarWithBrakes();
        handleBarWithBrakes.setHandleBarSize(handleBarWithBrakesInput.getHandleBarSize());
        handleBarWithBrakes.setMaterial(handleBarWithBrakesInput.getMaterial());
        return handleBarWithBrakes;
    }
}
