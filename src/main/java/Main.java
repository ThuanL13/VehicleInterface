public class Main {
    public static void main(String[] args) {
        Vehicle.Drive car = new Vehicle.Car();
        Vehicle.Drive motorcycle = new Vehicle.Motorcycle();

        car.start();
        car.stop();

        motorcycle.start();
        motorcycle.stop();
    }
}
