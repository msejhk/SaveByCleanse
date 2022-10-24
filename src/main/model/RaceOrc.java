package model;

public class RaceOrc extends CharacterModel {

    private int health = 150;
    private int attackPower = 2;
    private int level = 1;
    private int requiredExpToLevelUp = 10;


    public RaceOrc(String name) {
        super(name);
    }
}