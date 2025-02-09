public class AttackStrategy {
    
    public static class SwingSword implements Attack {
        public void attack() {
            System.out.println("Knight attacks with a sword!");
        }
    }

    public static class CastSpell implements Attack {
        public void attack() {
            System.out.println("Wizard casts a spell!");
        }
    }

    public static class ShootArrow implements Attack {
        public void attack() {
            System.out.println("Archer shoots an arrow!");
        }
    }
}