/**
 * Abstract class Owl.
 * Extends the Animal class and overrides the abstract methods.
 * @author Charles Link
 */
public class Owl extends Animal {
    /**
     * Constructor for the Animal class.
     *
     * @param name The name of the animal.
     */
    public Owl(String name) {
        super(name);
    }

    /**
     * Abstract method that prints the sound the animal makes.
     */
    @Override
    public void sound() {
        System.out.println("An "+name + " goes \"Hoot\"");
    }

    /**
     * Abstract method that describes how the animal plays.
     */
    @Override
    public void play() {
        System.out.println("You can use an "+name + "to hunt, or give them stimulation toys");
    }
}
