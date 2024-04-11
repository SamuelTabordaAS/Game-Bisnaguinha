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
        super(900, 600, 1 ); 
        prepare();
       
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Door door = new Door();
        addObject(door,65,379);
        samurai samurai = new samurai();
        addObject(samurai,200,296);

        tileMap tileMap = new tileMap();
        addObject(tileMap,450,579);

        

        plataform plataform = new plataform();
        addObject(plataform,471,478);

        plataform plataform4 = new plataform();
        addObject(plataform4,670,406);

        plataform plataform7 = new plataform();
        addObject(plataform7,70,457);

        plataform plataform10 = new plataform();
        addObject(plataform10,836,348);

        plataform plataform13 = new plataform();
        addObject(plataform13,676,184);

        plataform plataform16 = new plataform();
        addObject(plataform16,476,85);

        plataform plataform19 = new plataform();
        addObject(plataform19,245,169);

        plataform plataform20 = new plataform();
        addObject(plataform20,70,81);

        bisnaguinha bisnaguinha = new bisnaguinha();
        addObject(bisnaguinha,474,410);

        bisnaguinha bisnaguinha3 = new bisnaguinha();
        addObject(bisnaguinha3,713,342);

        bisnaguinha bisnaguinha4 = new bisnaguinha();
        addObject(bisnaguinha4,869,230);

        bisnaguinha bisnaguinha5 = new bisnaguinha();
        addObject(bisnaguinha5,676,138);

        bisnaguinha bisnaguinha6 = new bisnaguinha();
        addObject(bisnaguinha6,501,35);

        bisnaguinha bisnaguinha7 = new bisnaguinha();
        addObject(bisnaguinha7,295,120);

        bisnaguinha bisnaguinha8 = new bisnaguinha();
        addObject(bisnaguinha8,92,42);

    }
    
}
