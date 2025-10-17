/**
 * Horse class.
 * Extends the Animal class and overrides the abstract methods.
 * @author Orchlon (50291063)
 */
public class Horse extends Animal {

    /**
     * Constructor that takes in the desired name of the horse.
     *
     * @param name The name of the animal.
     */
    public Horse(String name) {
        super(name);
    }

    /**
     * Prints a string representing the sound that a horse makes.
     */
    @Override
    public void sound() {
        System.out.println(name + " makes a high-pitched \"Neigh\" noise!");
    }

    /**
     * Prints a string representing what the horse does when playing.
     */
    @Override
    public void play() {
        System.out.println(name + " runs around the field for fun!");
    }

    /**
     * Prints a string representing what the horse does when eating.
     */
    @Override
    public void eat() {
        System.out.println(name + " is eating hay.");
    }

}

class Main {

    public static void main(String[] args) {

        System.out.println("Horse Time!");

        Horse horse = new Horse("Orchlon");
        horse.sound();
        horse.play();
        horse.eat();
    }
}