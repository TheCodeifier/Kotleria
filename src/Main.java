interface VehicleWithEngine {
    void startEngine();
}

interface VehicleWithPedals {
    void kickPedals();
}

class Bike implements VehicleWithPedals {
    @Override
    public void kickPedals() {
        System.out.println("A bike moves with pedals");
    }
}

class Scooter implements VehicleWithEngine {
    @Override
    public void startEngine() {
        System.out.println("The scooter starts the engine.");
    }
}

class EBike implements VehicleWithEngine, VehicleWithPedals {
    @Override
    public void startEngine() {
        System.out.println("The e-bike starts the engine");
    }

    @Override
    public void kickPedals() {
        System.out.println("A e-bikke moves with pedals.");
    }
}

public class Main {
    public static void main(String[] args) {
        VehicleWithEngine vehicle1 = new Scooter();
        vehicle1.startEngine();

        VehicleWithPedals vehicle2 = new Bike();
        vehicle2.kickPedals();

        EBike vehicle3 = new EBike();
        vehicle3.startEngine();
        vehicle3.kickPedals();
    }
}

