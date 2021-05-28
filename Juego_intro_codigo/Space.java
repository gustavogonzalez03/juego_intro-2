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

    public void act()
    {myMusic.play();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Alien alien = new Alien();
        addObject(alien,520,56);
        Alien alien2 = new Alien();
        addObject(alien2,258,57);
        Alien alien3 = new Alien();
        addObject(alien3,90,91);
        alien2.setLocation(254,56);
        alien2.setLocation(232,52);
    }
}
