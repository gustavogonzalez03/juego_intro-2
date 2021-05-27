import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{
    GreenfootSound myMusic = new GreenfootSound("space1.wav");
    /**
     * Constructor for objects of class Space.
     * 
     */
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        set();
        prepare();
    }

    public void set()
    {
        Spacechip spaceship = new Spacechip();
        addObject(spaceship,298,341);
        Alien alien = new Alien();
        addObject(alien,393,95);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Alien alien = new Alien();
        addObject(alien,72,48);
        alien.setLocation(60,39);
        Alien alien2 = new Alien();
        addObject(alien2,199,139);
        Alien alien3 = new Alien();
        addObject(alien3,534,84);
        Alien alien4 = new Alien();
        addObject(alien4,269,48);
        Alien alien5 = new Alien();
        addObject(alien5,78,148);
        Alien alien6 = new Alien();
        addObject(alien6,456,164);
        Alien alien7 = new Alien();
        addObject(alien7,452,42);
        Alien alien8 = new Alien();
        addObject(alien8,334,162);
        Alien alien9 = new Alien();
        addObject(alien9,163,47);
        alien5.setLocation(65,178);
        alien.setLocation(80,103);
        alien9.setLocation(146,45);
        alien2.setLocation(182,132);
        alien8.setLocation(296,146);
        alien6.setLocation(440,142);
        Alien alien10 = new Alien();
        addObject(alien10,533,205);
    }
    public void act()
    {
        myMusic.play();
    }
}
