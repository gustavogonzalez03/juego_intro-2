import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Actor
{
    /**
     * Act - do whatever the Alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        /*destroy();*/
    }        
    public void destroy()
    {
        Actor bullet;
        bullet = getOneObjectAtOffset(0,0,Bullet.class);
        if(bullet != null)
        {
            World world;
            world = getWorld();            
            world.removeObject(this);                
        }
    }
}
