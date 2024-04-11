import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bisnaguinhaFase1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bisnaguinhaFase1 extends Actor
{   
    public int countBis ;
    private int tB ; 
    /**
     * Act - do whatever the bisnaguinhaFase1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(isTouching(samurai.class)){
            getWorld().removeObject(this);
            countBis = countBis + 1 ; 
        }
        if(countBis >= 6) { 
            tB = countBis ; 
        }
    }
     public int TotCount(){ 
             return tB;
     }
}

