public class Main {
    public static void main(String[] args) {

        System.out.println();

        Bicycle bicycle = new Bicycle("Велосипед 1", 2);
        Bicycle bicycle2 = new Bicycle("Велосипед 2", 2);

        Car car = new Car("Машина 1", 4);
        Car car2 = new Car("Машина 2", 4);

        Truck truck = new Truck("Грузовик 1", 6);
        Truck truck2 = new Truck("Грузовик 2", 8);



        ServiceStation printText = new ServiceStation();

        printText.print(bicycle);
        printText.print(bicycle2);
        printText.print(car);
        printText.print(car2);
        printText.print(truck);
        printText.print(truck2);






    }


}

