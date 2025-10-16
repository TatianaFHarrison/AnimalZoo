/**
* Author: Gerardo Lopez-Medina
* Date: 10/15/2025
* File: Kiwi extends Animal Class
*/

/**
* A Kiwi subclass that extends an Animal class
**/
public class Kiwi extends Animal{
   
   /**
   * Extends the Animal class and creates a new animal
   **/
   public Kiwi(String name){
      super("Jerry");
      this.name = "Jerry";
   }
   
   /**
   * A method that prints out a sound
   **/
   public void sound(){
      System.out.println("SCREECH");
   }
   
   /**
   * A method that prints out a behavior
   **/
   public void play(){
      System.out.println("*Starts fighting with other Kiwis");
   }
}