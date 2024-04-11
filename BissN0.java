import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BissN0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BissN0 extends bissN
{
    World myTest = new Test(); 
    GifImage myGif = new GifImage ("bissN.gif");
    /**
     * Act - do whatever the BissN0 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(myTest); 
        }
        setImage(myGif.getCurrentImage());
    }
}
