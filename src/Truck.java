public class Truck extends AutoTransport {  // Грузовик

    public Truck(String modelName, int wheelsCount) {

        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public void check() {

        transportName();

        for (int i = 0; i < this.getWheelsCount(); i++) {
           updateTyre();
        }
        super.checkEngine();
        checkTrailer();
        System.out.println();

    }
}

