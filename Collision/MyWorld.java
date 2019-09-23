import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class MyWorld extends World
{
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Snek(),(int)(Math.random()*getHeight()+1),(int)(Math.random()*getWidth()+1));
        addObject(new Snek("Jefff",5,12),(int)(Math.random()*getHeight()+1),(int)(Math.random()*getWidth()+1));
        addObject(new Snak(),(int)(Math.random()*getHeight()+1),(int)(Math.random()*getWidth()+1));
        addObject(new Snak(0,"Jerryy"),(int)(Math.random()*getHeight()+1),(int)(Math.random()*getWidth()+1));
    }
}
