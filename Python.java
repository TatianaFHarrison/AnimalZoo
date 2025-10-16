/**
    Python class extends animal class implements and override
    sound(), play(), and eat() methods. 
 */
public class Python extends Animal{

    /**
     * Python class constructor takes name of the 
     * animal as an input. 
     * @param name the name of the animal. 
     */
    public Python (String name){
        super(name);

    }

    /**
     * Sound() outputs the sound of a Python. 
     */
    @Override
    public void sound(){
        System.out.println(name + " SSSSSSSSS");
    }

    /**
     * play() outputs leisurely activities that pythons do.
     */
    @Override
    public void play(){
        System.out.println(name + " like hiding in bush");
    }

    /**
     * Prints python like bird to eat. 
     */
    @Override
    public void eat(){
        System.out.println(name + " like to eat bird.");
    }
    
}
