public class AnimalZooMain {
    public static void main(String[] args){
        System.out.println("Test All your animals here :)");

        //CHIPMUNK
        System.out.println("Chipmunk");
        
        Chipmunk chipmunk = new Chipmunk("Tony Tran");
        chipmunk.play();
        chipmunk.sound();

        //HORSE
        System.out.println("Horse Time!");

        Horse horse = new Horse("Orchlon");
        horse.sound();
        horse.play();

        //DRAGON
        System.out.println("Dragon Time.");

        Dragon d1 = new Dragon("Anderson");
        d1.sound();
        d1.play();
        d1.eat();

        //HUMAN
        System.out.println("Human Time.");

        Human human = new Human("Alex");
        human.play();
        human.sound();
        human.payTaxes();
        human.play();
        human.die();
        human.play();
        human.payTaxes();
    }
}