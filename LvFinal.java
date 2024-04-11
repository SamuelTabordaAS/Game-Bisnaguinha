import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LvFinal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LvFinal extends World
{
    private int contadorFrames = 0; 
    /**
     * Constructor for objects of class LvFinal.
     * 
     */
    public LvFinal()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        prepare();
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        tileMap tileMap = new tileMap();
        addObject(tileMap,449,580);
        plataform plataform = new plataform();
        addObject(plataform,73,419);
        samurai samurai = new samurai();
        addObject(samurai,60,505);
    }

    public void act(){
         contadorFrames ++; 
         
        if(contadorFrames % 180 == 0){
            spawn();
        }
    }
    public void spawn () { 
       int posY = 0 ; 
       int posX = Greenfoot.getRandomNumber(getWidth());
       
       thales thales = new thales(); 
       addObject(thales, posX, posY);
    }
}
