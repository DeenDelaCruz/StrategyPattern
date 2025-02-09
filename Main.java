public class Main{
    public static void main(String[] args) {
        
        Character knight = new Character(new AttackStrategy.SwingSword(), new DefenseStrategy.Shield());
        
        System.out.println("Knight:");
        knight.attack();
        knight.defend();

        knight.setDefenseStrategy(new DefenseStrategy.Dodge());
        knight.defend();

        knight.setDefenseStrategy(new DefenseStrategy.CreateMagic());       
        knight.defend();
        
        Character wizard = new Character(new AttackStrategy.CastSpell(), new DefenseStrategy.CreateMagic());
        Character archer = new Character(new AttackStrategy.ShootArrow(), new DefenseStrategy.Dodge());

        System.out.println("\nWizard:");
        wizard.attack();
        wizard.defend();
        
        System.out.println("\nArcher:");
        archer.attack();
        archer.defend();

    }
}