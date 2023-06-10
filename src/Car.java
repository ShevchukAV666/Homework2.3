public class Car extends AutoTransport  {  //машина

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }

    public void check() {

        transportName();

            for (int i = 0; i < this.getWheelsCount(); i++) {
                updateTyre();
            }
            super.checkEngine();
            System.out.println();
        }
    }

