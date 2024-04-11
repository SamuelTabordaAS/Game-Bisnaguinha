import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class thales here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class thales extends Actor
{
    public int gravidade = 4; 
    int movimentar = Greenfoot.getRandomNumber(900); 
    boolean podeMove = false ; 
    boolean movR = false; 
    boolean movL = false; 
    /**
     * Act - do whatever the thales wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        moviment();
        fallI();
        checkT();
        remover();
    }
    public void moviment(){ 
        if(movimentar < 450) { 
            movL = true; 
        }else {
            movR = true; 
        }
       if(podeMove){ 
                if(movL){
                    move(5);
                     
                    }
                else if (movR) {
                    move(-5);
                    
                } 
            }

        }
    
    public void fallI()
    {
         setLocation(getX(), getY()+ gravidade);
         
    }
    public void checkT(){
        if(isTouching(Ground.class)){
             setLocation(getX(), getY()-1);
             gravidade = 0 ;
             podeMove = true; 
         }else if(!isTouching(Ground.class)){
             gravidade++;
            }
         }
    public void remover(){
        if(getX() < 1 || getX() > 898){ 
            getWorld().removeObject(this); 
    }
    }  
}

