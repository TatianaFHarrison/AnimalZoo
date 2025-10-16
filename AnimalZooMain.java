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

        //CAT
        System.out.println("Cat Time.");

        Cat kitty = new Cat("Alan");
        kitty.play();
        kitty.eat();
        kitty.sound();
        
        //LION
        System.out.println("Lion Time.");

        Lion lion = new Lion("Whitmore");
        lion.sound();
        lion.play();
        lion.eat();
        
        //KIWI
        System.out.println("\nKiwi Time.");
        
        Kiwi kiwi = new Kiwi("Jerry");
        kiwi.sound();
        kiwi.play();
        kiwi.eat();
    }
}