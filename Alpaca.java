/**
 * Abstract class Alpaca.
 * Extends the Animal class and overrides the abstract methods sound() and play().
 * @author Cruz
 */
public class Alpaca extends Animal {

   /**
    * A constructor that takes in the desired name of the Alpaca.
    *
    * @param name Name of the Alpaca.
    */
   public Alpaca(String name) {
      super(name);
   }

   /**
    * prints the sound the Alpaca makes.
    */
   @Override
   public void sound() {
      System.out.println(name + " quietly hums...");
   }

   /**
    * prints how the Alpaca plays"
    */
   @Override
   public void play() {
      System.out.println(name + " runs around the zoo!");
   }

}
