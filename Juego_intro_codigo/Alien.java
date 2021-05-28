import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Actor
{
    SimpleTimer shortTimer = new SimpleTimer();
    public static int x = 4;  /*Variable que modifica la velocidad y direccion
                                del alien*/
    /**
     * Act - do whatever the Alien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (shortTimer.millisElapsed() > 3000)
        {
            getWorld().addObject(new EnemyBullet(),getX(),getY());
            Greenfoot.playSound("laser-01.wav");
            shortTimer.mark();
        }
        moving();
    }        
    
    public void moving()
    {
        if (getX() == 599 || getX() == 0 )
        {
        x = x * -1;
        }
        move(x);
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
