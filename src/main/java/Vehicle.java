public class Vehicle {
    // Interface for drive
    interface Drive {
        void start();
        void stop();
    }
    static class Car implements Drive {
        public void start() {
            System.out.println("Zooooooooomm");
        }
        public void stop() {
            System.out.println("Skrrrrtt");
        }
    }
    static class motorcycle implements Drive {
        public void start() {
            System.out.println("Nyoooooooooom");
        }
        public void stop() {
            System.out.println("SKrrrrrrrrrt");
        }
    }
}
