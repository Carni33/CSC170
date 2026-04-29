import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Dungeon here.
 * 
 * @author (Nickolas Nicholson) 
 * @version (Prototype 2 (4/17/2026)
 */
public class Dungeon extends World
{
    public Score score = new Score();
    public boolean playerTurn = true;
    GreenfootSound dungeonSound = new GreenfootSound("DungeonSound.mp3");
    GreenfootSound doorSound = new GreenfootSound("DoorSound.mp3");
    GreenfootSound winSound = new GreenfootSound("WinSound.mp3");
    GreenfootSound loseSound = new GreenfootSound("LoseSound.mp3");
    
    /**
     * Constructor for objects of class Dungeon.
     * 
     */
    public Dungeon()
    {    
        super(13, 13, 60);
        setBackground("Dungeon_Floor.jpg");
        prepare();
        addObject(score, 1, 0);
        setPaintOrder(Win.class, Lose.class, Score.class, Wall.class);
    }

    public void started() {
        dungeonSound.setVolume(20);
        dungeonSound.playLoop();
    }
    
    public void prepare() {
        Adventurer adventurer = new Adventurer();
        addObject(adventurer, 6, 1);
        adventurer.setRotation(90);
    

        Button b1= new Button();
        addObject(b1, 10, 2);
        
        Button b2 = new Button();
        addObject(b2, 2, 10);

        Coin c1 = new Coin();
        addObject(c1, 2, 2);
        
        Coin c2 = new Coin();
        addObject(c2, 6, 6);
        
        Coin c3 = new Coin();
        addObject(c3, 10, 10);
        
        
        Door door = new Door();
        addObject(door, 6, 0);
        

        Monster m1 = new Monster();
        addObject(m1, 3, 6);
        
        Monster m2 = new Monster();
        addObject(m2, 9, 6);
        
        Monster m3 = new Monster();
        addObject(m3, 6, 9);

        for (int i = 0; i < 13; i++) {
            if (i != 6) {
                addObject(new Wall(), i, 0);
            }
            
            addObject(new Wall(), i, 12);
            
            if (i > 0 && i < 12) {
                addObject(new Wall(), 0, i);
                addObject(new Wall(), 12, i);
            }
            
        }
        
        addObject(new Wall(), 3, 2);
        addObject(new Wall(), 3, 3);
        addObject(new Wall(), 2, 3);
        
        addObject(new Wall(), 9, 2);
        addObject(new Wall(), 9, 3);
        addObject(new Wall(), 10, 3);
        
        addObject(new Wall(), 2, 9);
        addObject(new Wall(), 3, 9);
        addObject(new Wall(), 3, 10);
        
        addObject(new Wall(), 9, 9);
        addObject(new Wall(), 9, 10);
        addObject(new Wall(), 10, 9); 
        
    }
    
    public void act() {
        if (!playerTurn) {
            List<Monster> monsters = getObjects(Monster.class);
            for (Monster m : monsters) {
                m.enemyMove();
                Greenfoot.delay(7);
            }
            
            playerTurn = true;
        }
    }
    
    public void checkDoor() {
        if (getObjects(Button.class).isEmpty()) {
            removeObjects(getObjects(Door.class));
            doorSound.setVolume(35);
            doorSound.play();
        }
    }
    
    public void loseGame() {
        dungeonSound.stop();
        addObject(new Lose(), getWidth() / 2, getHeight() / 2);
        loseSound.setVolume(20);
        loseSound.play();
        removeObjects(getObjects(Adventurer.class));
        Greenfoot.stop();
    }
    
    public void winGame() {
        dungeonSound.stop();
        addObject(new Win(), getWidth() / 2, getHeight() / 2);
        winSound.setVolume(30);
        winSound.play();
        removeObjects(getObjects(Adventurer.class));
        Greenfoot.stop();
    }
}
