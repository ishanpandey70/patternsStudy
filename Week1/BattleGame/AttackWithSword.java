public class AttackWithSword extends ObservableBehaviour {
    int offset= 15;
     public AttackWithSword() {
        super("Attack With Sword");
    }
    @Override
    public void execute(Character c1, Character c2) {
        int currentHealth = c2.getHealth();
        c2.setHealth(currentHealth-offset );
        this.notifyObservers();
    }
    
}
