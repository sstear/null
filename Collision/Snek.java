import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Snek extends Actor
{
    private String name;
    private int speed;
    private int turnAmount;
    public Snek(){
        name = null;
        speed = 0;
        turnAmount = 0;
    }
    public Snek(String name, int speed, int turnAmount){
        this.name = name;
        this.speed = speed;
        this.turnAmount = turnAmount;
    }
    public void act(){
        // Add your action code here.
        move(speed);
        turn(turnAmount);
        getWorld().showText(toString(),200,100);
        if (isAtEdge()){
            turn((int)(Math.random()*90+1));
        }
    }    
    public String toString(){
        return "Name: "+this.name+", Speed = "+this.speed+", Turn Amount = "+this.turnAmount+"\nX: "+getX()+" Y: "+getY();
    }
}
