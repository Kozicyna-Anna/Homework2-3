public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 3);
        Car car2 = new Car("car2", 3);


        Truck truck = new Truck("truck1", 5);
        Truck truck2 = new Truck("truck2", 7);


        Bicycle bicycle = new Bicycle("bicycle1", 1);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);


        ServiceStation station = new ServiceStation();
        station.check(car, car2, truck, truck2, bicycle, bicycle2);
    }
}
