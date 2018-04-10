import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snakes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snakes extends Actor
{
     private int score = 0;
    /**
     * Act - do whatever the Snakes wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       move(4);
       if(Greenfoot.getRandomNumber(100)<10){
           turn(Greenfoot.getRandomNumber(15)-30);
    }
    eatBug();
}
    public void eatBug(){
        if(isTouching(Bug.class)){
            removeTouching(Bug.class);     
      if(score!=14){
      getWorld().showText("YOU LOSE !",600,200);
      Greenfoot.stop();
}
}
}
}
