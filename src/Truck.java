public class Truck extends transportService {  // Грузовик

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check() {

        transportName();

        for (int i = 0; i < this.getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
        System.out.println();

    }
}

