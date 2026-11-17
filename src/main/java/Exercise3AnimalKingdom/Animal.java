package Exercise3AnimalKingdom;

public class Animal {
    interface AniActions {
        void makeSound();
        void eat();
    }
    static class Lion implements AniActions {
        public void makeSound() {
            System.out.println("Meoooow");
        }
        public void eat() {
            System.out.println("Chomp chomp chomp");
        }
    }
    static class Elephant implements AniActions {
        public void makeSound() {
            System.out.println("pawoooooo");
        }
        public void eat() {
            System.out.println("Nom nom nom");
        }
    }
    static class Parrot implements AniActions {
        public void makeSound() {
            System.out.println("AHHHHHHHHHHHHH");
        }
        public void eat() {
            System.out.println("Peck peck peck");
        }
    }
}
