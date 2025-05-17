public class AttackWithMagic implements Behaviour {
    int offset= 10;
    @Override
    public void execute(Character c1, Character c2) {
        int currentHealth = c2.getHealth();
        c2.setHealth(currentHealth-offset );
    }
    
}
