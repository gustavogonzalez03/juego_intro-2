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
    
    /*
     
     */
    public void moving()
    {
        setLocation(getX(),getY()-3);        
    }
    
    /*
     La funcion destroy() evita que la bala se quede en la orilla del
     mapa en caso de no hacer contacto con un alien
     */
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
    
    /*
     La funcion kill elimina al alien y a la bala cuando estos entran
     en contacto
     */
    public void kill()
    {        
        Actor alien;
        alien = getOneObjectAtOffset(0,0,Alien.class);
        if(alien != null)
        {
            World world;
            world = getWorld();
            world.removeObject(alien);
            world.removeObject(this);   
            Greenfoot.playSound("explosion.wav");
        }                               
    }
}
