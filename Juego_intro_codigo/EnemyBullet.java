import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyBullet extends Actor
{
    int MOVE_VAL = 3;
    //Esto es para el tamaño de la bala
    public EnemyBullet()
    {
        getImage().scale(25,25);
    }
    //Esto sirve para como se comporta la bala y que pasa cuando choca
    //o no choca contra la nave.
    /**
     * Act - do whatever the EnemyBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY() + MOVE_VAL);
        
        Spacechip s = (Spacechip) getOneIntersectingObject(Spacechip.class);
        if (s != null)
        {
            getWorld().removeObject(s);
            getWorld().removeObject(this);
            Greenfoot.playSound("Explosion+3.wav");
        }
        else if (getY() > 390)
        {
            getWorld().removeObject(this);
        }
    }    
}
