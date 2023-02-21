package GroupExercise2;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car(22000.0, "Red");
        System.out.println("Car price: " + car.calculateSalePrice());

        Sedan sedan = new Sedan(29000.0, "Blue", 18.0);
        System.out.println("Sedan price: " + sedan.calculateSalePrice());

        Truck truck = new Truck(37000.0, "Green", 2500.0);
        System.out.println("Truck price: " + truck.calculateSalePrice());
    }
}
