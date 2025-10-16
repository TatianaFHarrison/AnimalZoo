/**
 * @Author John Whitmore
 * Date: 10 / 15 / 25
 * File: Lion.java
 */

public class Lion extends Animal {
    

    /**
     * The constructor for the Lion class
     * @param name The name of the Lion
     */
    public Lion(String name){
        super(name);
    }

    /**
     * A method that prints out the sound of the animal
     */
    public void sound(){
        System.out.println("The lion lets out a mighty roar");
    }

    /**
     * A method that prints out how the animal plays
     */
    public void play(){
        System.out.println("The lion cares not of the humans' desire to watch it play");
    }

    /**
     * A method that prints out the animal eating
     */
    public void eat(){
        System.out.println(name+" is eating");
    }

}