public class AttackWithArrow implements Behaviour {
    int offset= 15;
    @Override
    public void execute(Character c1, Character c2) {
        int currentHealth = c2.getHealth();
        c2.setHealth(currentHealth-offset );
    }
    
}
