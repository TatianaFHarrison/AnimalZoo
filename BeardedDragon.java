/**
 * Abstract class BeardedDragon.
 * Extends the Animal class and overrides the abstract methods.
 * @author Harrison Ingram-Bate
 */
public class BeardedDragon extends Animal {

    /**
     * A constructor that takes the name of the BeardedDragon.
     *
     * @param name Name of the animal.
     */
    public Dragon(String name) {
        super(name);
    }

    /**
     * Prints a string that is the sound a BeardedDragon makes.
     */
    @Override
    public void sound() {
        System.out.println(name + " chirps friendly");
    }

    /**
     * Prints a string of a BeardedDragon playing
     */
    @Override
    public void play() {
        System.out.println(name + " strokes its scaly beard.");
    }

}
