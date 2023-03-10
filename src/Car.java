public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();

        System.out.println("Engine is started");
    }

    private String startElectricity() {
        return "Electricity is started";
    }

    private String startCommand() {
        return "Command system is started";
    }

    private String startFuelSystem() {
        return "Fuel system is started";
    }
}
