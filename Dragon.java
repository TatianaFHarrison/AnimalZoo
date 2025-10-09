/**
 * Abstract class Dragon.
 * Extends the Animal class and overrides the abstract methods.
 * @author Carson
 */
public class Dragon extends Animal {

    /**
     * A constructor that takes in the desired name of the dragon.
     *
     * @param name Name of the animal.
     */
    public Dragon(String name) {
        super(name);
    }

    /**
     * Prints a string representing the sound that a dragon makes.
     */
    @Override
    public void sound() {
        System.out.println(name + " lets out a might roar!");
    }

    /**
     * Prints a string representing what happens when you
     * attempt to play with the dragon.
     */
    @Override
    public void play() {
        System.out.println("You decide not to risk playing with " + name + ".");
    }

}

class Main {

    public static void main(String[] args) {

        System.out.println("Dragon Time.");

        Dragon d1 = new Dragon("Anderson");
        d1.sound();
        d1.play();
        d1.eat();

    }
}
