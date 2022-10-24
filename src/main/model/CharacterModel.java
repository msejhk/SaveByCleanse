package model;

public class CharacterModel implements Character {
    private int health = 100;
    private int attackPower = 1;
    private int level = 1;
    //private int defense = 1;
    private int requiredExpToLevelUp = 10;
    private int currentEXP = 0;
    private String characterName;


    //creates a character model with the entered name.
    public CharacterModel(String name){
        characterName = name;
    }

    @Override
    public int attack(int currentATK, int enemyHP) {
        if (currentATK > 0){
            enemyHP = enemyHP - currentATK;
            System.out.println("Did " + currentATK + " damage to the enemy!");
            return enemyHP;
        } else {
            System.out.println("Dealt no damage!");
            return 0;
        }
    }

    @Override
    public void rest() {
        System.out.println("resting...");
        health += 20;
    }

    @Override
    public int getHP() {
        return this.health;
    }

    public String getName(){
        return this.characterName;
    }

    public void levelUP(){
        if (currentEXP == requiredExpToLevelUp){
            level++;
            requiredExpToLevelUp = requiredExpToLevelUp + 10;
            currentEXP = 0;
        } else {
            System.out.println("not enough EXP");
        }
    }

    public int getLevel(){
        return level;
    }

    public int getRequiredExpToLevelUp(){
        return requiredExpToLevelUp;
    }

    public int getCurrentEXP(){
        return currentEXP;
    }


}
