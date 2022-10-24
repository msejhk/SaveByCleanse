package model;

public class RaceDwarf extends CharacterModel {

    private int health = 100;
    private int attackPower = 3;
    private int level = 1;
    private int requiredExpToLevelUp = 7;


    public RaceDwarf(String name) {
        super(name);
    }
}
