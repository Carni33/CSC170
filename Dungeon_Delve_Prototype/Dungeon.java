import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dungeon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dungeon extends World
{

    /**
     * Constructor for objects of class Dungeon.
     * 
     */
    public Dungeon()
    {    
        super(13, 13, 60);
        setBackground("Dungeon_Floor.jpg");

        prepare();
    }

    //Populate the world to showcase the prototype of the actors and world
    public void populate() {
        Adventurer a1 = new Adventurer();
        addObject(a1, 6, 3);

        Button b1= new Button();
        addObject(b1, 2, 6);

        Coin c1 = new Coin();
        addObject(c1, 4, 6);

        Door d1 = new Door();
        addObject(d1, 6, 6);

        Monster m1 = new Monster();
        addObject(m1, 8, 6);

        Wall w1 = new Wall();
        addObject(w1, 10, 6);

        Wall w2 = new Wall();
        addObject(w2, 0, 0);

        Wall w3 = new Wall();
        addObject(w3, 1, 0);

        Wall w4 = new Wall();
        addObject(w4, 2, 0);

        Wall w5 = new Wall();
        addObject(w5, 3, 0);

        Wall w6 = new Wall();
        addObject(w6, 4, 0);

        Wall w7 = new Wall();
        addObject(w7, 5, 0);

        Wall w8 = new Wall();
        addObject(w8, 6, 0);

        Wall w9 = new Wall();
        addObject(w9, 7, 0);

        Wall w10 = new Wall();
        addObject(w10, 8, 0);

        Wall w11 = new Wall();
        addObject(w11, 9, 0);

        Wall w12 = new Wall();
        addObject(w12, 10, 0);

        Wall w13 = new Wall();
        addObject(w13, 11, 0);

        Wall w14 = new Wall();
        addObject(w14, 12, 0);

        Wall w15 = new Wall();
        addObject(w15, 13, 0);

        Wall w16 = new Wall();
        addObject(w16, 6, 0);

        Wall w17 = new Wall();
        addObject(w17, 13, 1);

        Wall w18 = new Wall();
        addObject(w18, 13, 2);

        Wall w19 = new Wall();
        addObject(w19, 13, 3);

        Wall w20 = new Wall();
        addObject(w20, 13, 3);

        Wall w21 = new Wall();
        addObject(w21, 13, 4);

        Wall w22 = new Wall();
        addObject(w22, 13, 5);

        Wall w23 = new Wall();
        addObject(w23, 13, 6);

        Wall w24 = new Wall();
        addObject(w24, 13, 7);

        Wall w25 = new Wall();
        addObject(w25, 13, 8);

        Wall w26 = new Wall();
        addObject(w26, 13, 9);

        Wall w27 = new Wall();
        addObject(w27, 13, 10);

        Wall w28 = new Wall();
        addObject(w28, 13, 11);

        Wall w29 = new Wall();
        addObject(w29, 13, 12);

        Wall w30 = new Wall();
        addObject(w30, 13, 13);

        Wall w31 = new Wall();
        addObject(w31, 12, 13);

        Wall w32 = new Wall();
        addObject(w32, 11, 13);

        Wall w33 = new Wall();
        addObject(w33, 10, 13);

        Wall w34 = new Wall();
        addObject(w34, 9, 13);

        Wall w35 = new Wall();
        addObject(w35, 8, 13);

        Wall w36 = new Wall();
        addObject(w36, 7, 13);

        Wall w37 = new Wall();
        addObject(w37, 6, 13);

        Wall w38 = new Wall();
        addObject(w38, 5, 13);

        Wall w39 = new Wall();
        addObject(w39, 4, 13);

        Wall w40 = new Wall();
        addObject(w40, 3, 13);

        Wall w41 = new Wall();
        addObject(w41, 2, 13);

        Wall w42 = new Wall();
        addObject(w42, 1, 13);

        Wall w43 = new Wall();
        addObject(w43, 0, 13);

        Wall w44 = new Wall();
        addObject(w44, 0, 12);

        Wall w45 = new Wall();
        addObject(w45, 0, 11);

        Wall w46 = new Wall();
        addObject(w46, 0, 10);

        Wall w47 = new Wall();
        addObject(w47, 0, 9);

        Wall w48 = new Wall();
        addObject(w48, 0, 8);

        Wall w49 = new Wall();
        addObject(w49, 0, 7);

        Wall w50 = new Wall();
        addObject(w50, 0, 6);

        Wall w51 = new Wall();
        addObject(w51, 0, 5);

        Wall w52 = new Wall();
        addObject(w52, 0, 4);

        Wall w53 = new Wall();
        addObject(w53, 0, 3);

        Wall w54 = new Wall();
        addObject(w54, 0, 2);

        Wall w55 = new Wall();
        addObject(w55, 0, 1);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        populate();
    }
}
