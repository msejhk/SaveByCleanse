package model;

import java.util.LinkedList;

public class CharacterModel implements Character {
    private int health = 100;
    private int attackPower = 1;
    private int level = 1;
    private int requiredExpToLevelUp = 10;
    private String characterName;


    //creates a character model with the entered name.
    public CharacterModel(String name){
        characterName = name;
    }

    @Override
    public void attack() {

    }

    @Override
    public void rest() {

    }

    public String getName(){
        return this.characterName;
    }
}
