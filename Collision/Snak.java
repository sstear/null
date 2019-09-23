import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Snak extends Actor
{
    private int collisionCount;
    private String name;
    private int speed;
    public Snak(){
        collisionCount = 0;
        name = null;
        speed = 1;
    }
    public Snak(int speed, String name){
        this.collisionCount = 0;
        this.name = name;
        this.speed = 1;
    }
    public void act(){
        // Add your action code here.
        move(speed);
        getWorld().showText(toString(),500,100);
        if(isAtEdge()){
            turn((int)(Math.random()*90+1));
        }
        if(isTouching(Snek.class)){
            System.out.println("Collision!");
            collisionCount++;
            speed++;
            turn((int)(Math.random()*90+1));
            System.out.println("Collisions: "+collisionCount);
        }
    }    
    public String toString(){
        return "Name: "+this.name+"\nX: "+getX()+" Y: "+getY();
    }
}
