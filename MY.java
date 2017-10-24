import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MY here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MY extends World
{
    GreenfootSound backgroundMusic = new GreenfootSound("Defense Line.mp3");
    /**
     * Constructor for objects of class MY.
     * 
     */
    public MY()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(860, 540, 1); 
        prepare();
        backgroundMusic.playLoop();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bug bug = new Bug();
        addObject(bug,41,304);
        bug.getWorld();
        Cherry cherry = new Cherry();
        addObject(cherry,231,48);
        Cherry cherry2 = new Cherry();
        addObject(cherry2,161,488);
        Cherry cherry3 = new Cherry();
        addObject(cherry3,328,150);
        Cherry cherry4 = new Cherry();
        addObject(cherry4,340,321);
        Cherry cherry5 = new Cherry();
        addObject(cherry5,782,56);
        cherry5.setLocation(525,48);
        Cherry cherry6 = new Cherry();
        addObject(cherry6,620,184);
        Cherry cherry7 = new Cherry();
        addObject(cherry7,492,397);
        Cherry cherry8 = new Cherry();
        addObject(cherry8,672,378);
        Cherry cherry9 = new Cherry();
        addObject(cherry9,535,496);
        Cherry cherry10 = new Cherry();
        addObject(cherry10,802,278);
        Cherry cherry11 = new Cherry();
        addObject(cherry11,492,246);
        cherry10.setLocation(396,448);

        Snakes snakes = new Snakes();
        addObject(snakes,729,133);
        Snakes snakes2 = new Snakes();
        addObject(snakes2,669,308);
        Snakes snakes3 = new Snakes();
        addObject(snakes3,657,499);
        Snakes snakes4 = new Snakes();
        addObject(snakes4,815,51);

        snakes2.setLocation(797,263);
        snakes.setLocation(812,136);
        snakes3.setLocation(780,488);
        snakes2.setLocation(795,326);
        snakes.setLocation(810,178);
        Cherry cherry12 = new Cherry();
        addObject(cherry12,693,66);
        Cherry cherry13 = new Cherry();
        addObject(cherry13,216,181);
        Cherry cherry14 = new Cherry();
        addObject(cherry14,205,321);
        removeObject(snakes3);
        snakes2.setLocation(810,475);
        snakes.setLocation(816,268);
        snakes.setLocation(815,161);
        Snakes snakes5 = new Snakes();
        addObject(snakes5,822,317);
    }
}
