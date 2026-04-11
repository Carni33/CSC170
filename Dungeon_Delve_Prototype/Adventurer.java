import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Adventurer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Adventurer extends Actor
{
    /**
     * Act - do whatever the Adventurer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        playerMove();
        //Collision check if player actor would move into a wall
        if (isTouching(Wall.class)) {
            move(-1);
        }
        else if (isTouching(Door.class)) {
            move(-1);
        }
    
    }
    
    public void playerMove() {
       if (Greenfoot.isKeyDown("w")) {
            setRotation(270);
            move(1);
        }
        else if (Greenfoot.isKeyDown("a")) {
            setRotation(180);
            move(1);
        }
        else if (Greenfoot.isKeyDown("s")) {
            setRotation(90);
            move(1);
        }
        else if (Greenfoot.isKeyDown("d")) {
            setRotation(0);
            move(1);
        } 
    }
}
