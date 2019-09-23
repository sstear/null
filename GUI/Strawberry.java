import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Strawberry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Strawberry extends Actor
{
    private int speed;
    public Strawberry(){
        this.speed = 5;
    }
    public void act() 
    {
        move(this.speed);
        if(Greenfoot.isKeyDown("t")){
            turn(5);
        }
        if(Greenfoot.isKeyDown("r")){
            turn(-5);
        }
        if(Greenfoot.isKeyDown(" ")){
            this.speed++;
        }
        if(Actor.isAtEdge()){
            turn((int)(Math.random()*90+1));
        }
    }    
}
