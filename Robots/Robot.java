import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Robot extends Actor
{
    private int speed;
    private int batteryLevel;
    private String name;
    public Robot(int sped, int bat, String nem){
        this.speed = sped;
        this.batteryLevel = bat;
        this.name = nem;
    }
    public void act() 
    {
        System.out.println("Battery life remaining: "+this.batteryLevel);
        if(this.batteryLevel>0){
            move(this.speed);
            for(int i = 0; i<4; i++){
                if(i == 3){
                    this.batteryLevel--;
                }
            }
        }
        if(isAtEdge()){
            if((getX()==getWorld().getWidth())){
                turnTowards(getWorld().getWidth(),getWorld().getHeight());
            }
            else if(getY()==getWorld().getHeight()){
                turnTowards(0,getWorld().getHeight());
            }
            else if((getX()==0)&&(getY()!=0)){
                turnTowards(0,0);
            }
            else if(getX()==0){
                turnTowards(getWorld().getWidth(),0);
            }
        }
    }    
    public String toString(){
        return this.name+" has "+this.batteryLevel+" power \nand is moving at "+this.speed+" \nunits per second";
    }
}
