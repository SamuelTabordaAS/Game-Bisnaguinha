import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class samurai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class samurai extends Actor
{
    public int gravidade = 4; 
    public int speed = 7; 
    public int vspeed = 1; 
    public boolean jump = false; 
    public boolean check ; 
    public String spriteLocal; 
    GreenfootImage[] walkR = new GreenfootImage [8]; 
    GreenfootImage[] walkL = new GreenfootImage [8]; 
    GreenfootImage[] attack = new GreenfootImage [4]; 
    int animCounter = 0 ; 
    World Morto = new gameOver(); 
    public boolean checkHit = false ; 
    boolean hitInimigo = true;
    int score = 0 ; 
    boolean morte = false; 
    private GreenfootSound meuSom; 
    boolean testPause = false;
    
  
    /**
     * Act - do whatever the samurai wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getWorld().showText("SCORE : "+ score, 100, 70);
        // Add your action code here.
        fall(); 
        moviment();
        checkTouching();
        comer();
        dead();
        hit();
        tomeiHit();
        checkScore();
        
        
    }
    public samurai (){ 
        checkMove(); 
        atack();
        
        } 
        
    public void moviment() 
    { 
        // 
        if(Greenfoot.isKeyDown("space")){
            jumps();
            hitInimigo = true; 
            checkHit = false ;
        }
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX() + speed, getY());
            //r
            executeAnimR();
            hitInimigo = true; 
            checkHit = false ;
        }
        if(Greenfoot.isKeyDown("a")){
            setLocation(getX() - speed, getY());
            //l 
            executeAnimL(); 
            hitInimigo = true; 
            checkHit = false ;
        }
        if(Greenfoot.isKeyDown("j")){ 
            executeAnimAttack(); 
            checkHit = true; 
            hitInimigo = false ; 
        }
       
    }
    public void fall()
    {
         setLocation(getX(), getY()+ gravidade);
         
    }
    public void checkTouching() {
    if (!isTouching(Ground.class)) {
        gravidade++;
        check = false;
    } else if (isTouching(Ground.class)) {
        Ground ground = (Ground) getOneIntersectingObject(Ground.class);
        int characterCenterY = getY() + getImage().getHeight() / 2;
        int groundCenterY = ground.getY() + ground.getImage().getHeight() / 2;

        if (characterCenterY < groundCenterY) {
            setLocation(getX(), getY() - 1);
            gravidade = 0;
            jump = true;
            check = true;
        }
    }
    }
    public void jumps() 
    {
        if(jump && check ){ 
            gravidade = -16; 
            jump = false; 
        }
    }
    public void checkMove(){ 
        for(int i = 0; i < 8; i ++ ) { 
            spriteLocal = "Run" + i + ".png"; 
            walkR[i] = new GreenfootImage(spriteLocal);
        }
        for(int i = 0; i < 8; i ++) {
            spriteLocal = "Run" + i + ".png"; 
            walkL[i] = new GreenfootImage(spriteLocal); 
            walkL[i].mirrorHorizontally();
        }
    }
    public void executeAnimR (){ 
        setImage(walkR[animCounter++ % 8 ]);
    }
    public void executeAnimL(){
        setImage(walkL[animCounter++ % 8]);
    }
    public void comer(){
        if(isTouching(bisnaguinha.class))
        {
            removeTouching(bisnaguinha.class);
            score = score + 1; 
            
        }
    }
    public void checkScore(){ 
        if(isTouching(bisnaguinhaFase1.class)){
            score = score + 1 ; 
        }
    }
    
    public void dead(){ 
     if(getY() >= 599){
            tomeiHit();
            morte = true; 
            
            if (morte) { 
                Greenfoot.setWorld(Morto);
            }
        }
    }
    
    public void atack(){ 
        // animacao do actor atacando ! 
        for(int i = 0; i < 4; i ++ ) { 
            spriteLocal = "Attack" + i + ".png"; 
            attack[i] = new GreenfootImage(spriteLocal);
        }
    } 
    public void executeAnimAttack(){ 
        setImage(attack[animCounter++ % 4]);
    }
    public void hit(){
        if(checkHit && isTouching(thales.class)){
            removeTouching(thales.class );
            hitInimigo = true; 
            checkHit = false ;
        } 
    }
    public void tomeiHit(){  
        if(hitInimigo && isTouching(thales.class)){ 
            Greenfoot.setWorld(Morto);
            removeTouching(samurai.class);
            
        }
    }
    
}    
