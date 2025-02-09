public class Character {
    private Attack attackStrategy;
    private Defense defenseStrategy;
    
    public Character(Attack attackStrategy, Defense defenseStrategy) {
        this.attackStrategy = attackStrategy;
        this.defenseStrategy = defenseStrategy;
    }
    
    public void attack() {
        attackStrategy.attack();
    }
    
    public void defend() {
        defenseStrategy.defend();
    }

    public void setDefenseStrategy(Defense newDefenseStrategy) {
        this.defenseStrategy = newDefenseStrategy;
    }
}