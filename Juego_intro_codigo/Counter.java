import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 Aqui se crea el diplay y el contador encargados de llevar el puntaje
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
