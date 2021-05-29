import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moving();
        destroy();
        
    }    
    public void moving()
    {
        setLocation(getX(),getY()-3);        
    }
    public void destroy() 
    {
        if (getY() == 0)
        {
            getWorld().removeObject(this);
        }
        else
        {
            kill();
        }
    }
    public void kill() //al momento que la bala toca el alien destruye ambos objetos y se agrega al contador
    {        
        Actor alien;
        alien = getOneObjectAtOffset(0,0,Alien.class);
        if(alien != null)
        {
            World world;
            world = getWorld();
            world.removeObject(alien);
            Space space = (Space)world;
            Counter counter = space.getCounter();
            counter.addScore();
            world.removeObject(this);   
            Greenfoot.playSound("explosion.wav");
        }                               
    }
}
