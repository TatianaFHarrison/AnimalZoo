/**
 * Abstract Animal class.
 * Base class for all animals in the zoo.
 */
public abstract class Animal {

    /**
     * The name of the animal.
     */
    protected String name;

    /**
     * Constructor for the Animal class.
     *
     * @param name The name of the animal.
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Abstract method that prints the sound the animal makes.
     */
    public abstract void sound();

    /**
     * Abstract method that describes how the animal plays.
     */
    public abstract void play();

    /**
     * Prints a description of the animal eating.
     */
    public void eat() {
        System.out.println(name + " is eating.");
    }

}

