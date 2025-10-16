/**
*class Goat
*extends class Animal 
*@author Jeshua Manwell
*/
public class Goat extends Animal{
   
   /**
    * A constructor that takes in a name.
    *@param name Name of the goat.
    */
   public Goat(String name){
      super(name);
   }
   
   
   /**
    *Abstract method that should represent a specific sound
    * a goat makes. 
    */
   @Override
   public void sound(){
      System.out.println(name + " bahhhs");
   }
   
   
   /**
    * Abstract method that should represent a specific activity
    * that a goat does for fun.
    */
    @Override
   public void play(){
         System.out.println(name + " tries to headbutt you.");
   }
   
   /**
    * A method that prints out that the goat is eating food.
    */
   public void eat(){
      System.out.println(name + " eats whatever he lays his eyes on.");
   }  
}

class Main  {

      public static void main(String[] args) {
         Goat Goat1 = new Goat("Lebron James");
         Goat1.sound();
         Goat1.play();
         Goat1.eat();

      }
}

