package model;

public class EnemyModel implements Character{
    private int health = 200;
    private int attackPower = 1;
    private int level = 1;
    public EnemyModel(){

    }

    @Override
    public int attack(int currentATK, int enemyHP) {
        if (currentATK > 0){
            enemyHP = enemyHP - currentATK;
            System.out.println("Enemy dealt " + currentATK + " damage.");
            return enemyHP;
        } else {
            System.out.println("Enemy dealt no damage!");
            return 0;
        }
    }

    @Override
    public void rest() {

    }

    @Override
    public int getHP() {
        return this.health;
    }
}
