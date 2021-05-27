import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    int score = 0;
    /**
    En esta funcion se crea un contador que despliega el puntaje del usuario
     */
    public void act() 
    {
        setImage(new GreenfootImage("Score : "+ score, 24 , Color.WHITE, Color.BLACK));
    }    
    
    public void addScore()
    {
        score++;
    }
}
