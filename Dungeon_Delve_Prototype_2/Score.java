import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    private int score = 0;
    
    public Score() {
        updateScore();
    }
    
    public void addScore(int amount) {
        this.score += amount;
        updateScore();
    }
    
    private void updateScore() {
        setImage(new GreenfootImage("Score: " + score, 24, Color.BLACK, Color.WHITE));
    }
}
