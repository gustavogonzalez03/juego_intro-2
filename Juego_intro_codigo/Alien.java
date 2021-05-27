import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Actor
{
    
    public int x = 4;    // Nunero entero para la funcion move
    public void act() 
    {    
         moving();  
    }        
    
    /**
     La funcion moving() hace que los aliens reboten en cada esquina del 
     juego
     */
    
    public void moving()
    {
        if (getX() == 599 || getX() == 0 )
        {
        x = x * -1;
        }
        move(x);
    }
}
