import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spade here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spade extends Actor
{
    /**
     * Act - do whatever the Spade wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        //move the spade one pixel
        move(10);
        //check the object is at edge, if yes then bounce
        if(isAtEdge()){
            turn(Greenfoot.getRandomNumber(180));
    }    
     if(isTouching(Spade.class)){
        turn(Greenfoot.getRandomNumber(180));
}
}
}
