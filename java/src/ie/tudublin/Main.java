package ie.tudublin;

public class Main
{

    public void helloArrays()
<<<<<<< HEAD
=======
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new ArraysExample());
    }

    public void helloProcessing()
>>>>>>> 3abc8db5bc26035d1738ad470a5d37a4dc04ebf7
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Arrays());
    }

    public void loops()
    {
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Loops());
    }
    
    public void bugZap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new BugZap());
    }
    
    public void airSeaBattle()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new AirSeaBattle());
    }
    
    public void dogsCats()
    {
        // Polymorphism means
        // The type is a superclass, the instance is a subclass

        // This is not polymorphism
        Cat topcat = new Cat("Topcat");

        // This is polymorphism!
        Animal mino = new Cat("Mino");
        // A vitual method!
        // Dynamic binding
        mino.speak();
        // This wont compile!!
        //System.out.println(mino.getNumLives());
        // This is an example of a cast
        System.out.println(((Cat)mino).getNumLives());

        mino = new Dog("Misty");  // This will compile!
        //topcat = new Dog("Tara"); // This wont compile!

        Animal a = new Cat("a");
        Animal b = new Cat("b");
        
        System.out.println(a);
        System.out.println(b);

        a = b;

        a.setName("c");

        System.out.println(a);
        System.out.println(b);

        // c c will get printed out because 
        // a & b are object references

    }
    
    public static void main(String[] arg)
    {
        Main main = new Main();
<<<<<<< HEAD
		main.helloArrays();      
=======
		main.helloArrays();        
>>>>>>> 3abc8db5bc26035d1738ad470a5d37a4dc04ebf7
    }
}