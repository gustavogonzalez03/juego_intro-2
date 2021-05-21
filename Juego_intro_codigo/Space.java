import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{

    /**
     * Constructor for objects of class Space.
     * 
     */
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        set();
    }
    public void set()
    {
        Spacechip spaceship = new Spacechip();
        addObject(spaceship,298,341);
        Alien alien = new Alien();
        addObject(alien,393,95);
    }
}
