public class Car extends transportService {  //машина

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }


    public void check() {

        transportName();

            for (int i = 0; i < this.getWheelsCount(); i++) {
                updateTyre();
            }
            checkEngine();
            System.out.println();
        }
    }

