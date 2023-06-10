public class Bicycle extends Transport  {   ///велосипед

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check () {

        transportName();

            for (int i = 0; i < this.getWheelsCount(); i++) {
               updateTyre();
            }
            System.out.println();
        }
    }



