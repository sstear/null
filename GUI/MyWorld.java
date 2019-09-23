import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(280, 280, 1); 
        for(int x = 0; x < 281; x+=40){
            for(int y = 0; y < 281; y+=70){
                addObject(new Strawberry(),x,y);
            }
        }
    }
}
