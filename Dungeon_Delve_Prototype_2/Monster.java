import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monster extends Actor
{
    /**
     * Act - do whatever the Monster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void enemyMove() {
        int moveDirection = Greenfoot.getRandomNumber(4) + 1;
        
        if (moveDirection == 1) {
            setRotation(270);
            move(1);
        }
        
        else if (moveDirection == 2) {
            setRotation(180);
            move(1);
        }
        
        else if (moveDirection == 3) {
            setRotation(90);
            move(1);
        }
        
        else if (moveDirection == 4) {
            setRotation(0);
            move(1);
        }
        
        if (isTouching(Wall.class) || isTouching(Door.class) || isTouching(Monster.class)) {
            move(-1);
        }
        
        if (isTouching(Adventurer.class)) {
            ((Dungeon)getWorld()).loseGame();
        }
    }
}
