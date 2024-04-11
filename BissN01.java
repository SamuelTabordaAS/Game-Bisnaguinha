import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BissN01 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BissN01 extends bissN
{
    World myWorld = new MyWorld(); 
    GifImage myTest = new GifImage("bissN.gif"); 
    /**
     * Act - do whatever the BissN01 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(myWorld);
        }
        setImage(myTest.getCurrentImage());
    }
}
