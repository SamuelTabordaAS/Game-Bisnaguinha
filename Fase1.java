import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fase1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fase1 extends World
{
    
    /**
     * Constructor for objects of class Fase1.
     * 
     */
    public Fase1()
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
        addObject(tileMap,299,579);
        
        BossPortal bossPortal = new BossPortal();
        addObject(bossPortal,6,114);

        samurai samurai = new samurai();
        addObject(samurai,38,451);

        plataform plataform = new plataform();
        addObject(plataform,827,455);

        plataform plataform1 = new plataform();
        addObject(plataform1,654,352);

        plataform plataform2 = new plataform();
        addObject(plataform2,879,200);

        plataform plataform3 = new plataform();
        addObject(plataform3,667,76);

        plataform plataform4 = new plataform();
        addObject(plataform4,460,151);

        plataform plataform5 = new plataform();
        addObject(plataform5,302,235);

        plataform plataform6 = new plataform();
        addObject(plataform6,1,233);
        bisnaguinhaFase1 bisnaguinhaFase1 = new bisnaguinhaFase1();
        addObject(bisnaguinhaFase1,828,404);

        bisnaguinhaFase1 bisnaguinhaFase12 = new bisnaguinhaFase1();
        addObject(bisnaguinhaFase12,666,305);

        bisnaguinhaFase1 bisnaguinhaFase13 = new bisnaguinhaFase1();
        addObject(bisnaguinhaFase13,847,151);

        bisnaguinhaFase1 bisnaguinhaFase14 = new bisnaguinhaFase1();
        addObject(bisnaguinhaFase14,670,37);

        bisnaguinhaFase1 bisnaguinhaFase15 = new bisnaguinhaFase1();
        addObject(bisnaguinhaFase15,458,95);

        bisnaguinhaFase1 bisnaguinhaFase16 = new bisnaguinhaFase1();
        addObject(bisnaguinhaFase16,298,184);

        thales thales = new thales();
        addObject(thales,469,493);

        
        
    }
    
}

    
   

