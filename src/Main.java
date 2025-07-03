interface Vehicle {
    void startEngine();
    void kickPedal();
}

class Bike implements Vehicle {
    @Override
    public void startEngine() {
        throw new UnsupportedOperationException("A bike doesn't have a engine.");
    }

    @Override
    public void kickPedal() {
        System.out.println("A bike moves with pedals");
    }
}

class Scooter implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("The scooter starts the engine");
    }

    @Override
    public void kickPedal() {
        throw new UnsupportedOperationException("Scooter doesn't have pedals");
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Scooter();
        vehicle1.startEngine();
        vehicle1.kickPedal(); 

        Vehicle vehicle2 = new Bike();
        vehicle2.kickPedal();
    }
}
