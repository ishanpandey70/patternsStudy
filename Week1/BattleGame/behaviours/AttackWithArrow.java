package behaviours;
import characters.Character;

public class AttackWithArrow extends ObservableBehaviour {
    private int offset= 15;
     public AttackWithArrow() {
        super("Attack With Arrow");
    }
    @Override
    public void execute(Character c1, Character c2) {
        int currentHealth = c2.getHealth();
        c2.setHealth(currentHealth-offset );
        this.notifyObservers();
    }
 
}
