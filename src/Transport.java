public abstract class Transport implements InterfaceTransport {
    public String modelName;
    public int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void transportName () {
        System.out.println("Обслуживаем - " + this.getModelName());
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

}
