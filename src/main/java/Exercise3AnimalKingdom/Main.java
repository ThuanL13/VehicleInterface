package Exercise3AnimalKingdom;

public class Main {
    public static void main(String[] args) {
        Animal.AniActions bigKitty = new Animal.Lion();
        Animal.AniActions dumbo = new Animal.Elephant();
        Animal.AniActions birdy = new Animal.Parrot();

        bigKitty.makeSound();
        bigKitty.eat();
        dumbo.makeSound();
        dumbo.eat();
        birdy.makeSound();
        birdy.eat();
    }
}
