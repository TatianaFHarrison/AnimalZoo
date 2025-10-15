/**
 * @Author Alan Ruelas-Cordova
 * Date: 10/15/25
 * Harrison
 * Cat.java
 * Finalizing
 */

public class Cat extends Animal{

    /**
     * Contructor of the Cat Object
     * @param name
     */
    public Cat(String name){
        super(name);
    }

    /**
     * The sound method that makes the cat object MEOW
     */
    public void sound(){
        System.out.println("MEEEOW");
    }

    /**
     * The play method that makes the cat play with String.
     */
    public void play(){
        System.out.println(this.name + " is playing with the string!!!");
    }

    /**
     * The eat method that makes the cat eat some fish
     */
    public void eat(){
        System.out.println(this.name + "ate some fish!");
    }





}
