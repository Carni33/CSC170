import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Adventurer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Adventurer extends Actor
{
    GreenfootSound buttonSound = new GreenfootSound("ButtonSound.mp3");
    GreenfootSound coinSound = new GreenfootSound("CoinSound.mp3");
    /**
     * Act - do whatever the Adventurer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        Dungeon dungeon = (Dungeon)getWorld();
        Score score = getWorld().getObjects(Score.class).get(0);
        if (dungeon.playerTurn) {
            if (playerMove()) {
            
                //Collision check if player actor would move into a wall or door
                if (isTouching(Wall.class) || isTouching(Door.class)) {
                    move(-1);
                }
                
                //Check if player actor is on same space as a monster actor
                else if (isTouching(Monster.class)) {
                    Greenfoot.delay(10);
                    ((Dungeon)getWorld()).loseGame();
                }
                
                //Check if player actor is on the same space as a coin
                else if (isTouching(Coin.class)) {
                    collectCoin();
                    score.addScore(1);
                }
                //Check if player actor is on the same space as a button
                else if (isTouching(Button.class)) {
                    activateButton();
                    dungeon.checkDoor();
                }
                
                if (getX() == 6 && getY() == 0) {
                    Greenfoot.delay(10);
                    ((Dungeon)getWorld()).winGame();
                }
                
                dungeon.playerTurn = false;
            }
        
        }
    }
    
    public boolean playerMove() {
       String key = Greenfoot.getKey();
       if (key == null) {
            return false;
       }
        
       if (Greenfoot.isKeyDown("w")) {
           setRotation(270);
       }
       else if (Greenfoot.isKeyDown("a")) {
           setRotation(180);
       }
       else if (Greenfoot.isKeyDown("s")) {
       setRotation(90);
       }
       else if (Greenfoot.isKeyDown("d")) {
           setRotation(0);
       }
       else {
           return false;
       }
       
       move(1);
       return true;
    }
    
    public void collectCoin() {
        coinSound.setVolume(20);
        removeTouching(Coin.class);
        coinSound.play();
    }
    
    public void activateButton() {
        buttonSound.setVolume(35);
        removeTouching(Button.class);
        buttonSound.play();
    }
}
