public class BlueRingedOctopus extends Animal {
    
    /**
     * Constructor
     * @param name Name of animal
     */
    public BlueRingedOctopus (String name) {
        super(name);
    }

    /**
     * Prints out the sound of the octopus
     * @Override
     */
    public void sound() {
        Sytem.out.println("Blub, Blub, Blub");
    }

    /**
     * Prints out the play noises of the octopus
     * @Override
     */
    public void play() {
        System.out.println("Swimming in circles! Yeah!");
    }
}   

