public class AttackWithMagic  extends ObservableBehaviour  {
   
    int offset= 10;
      public AttackWithMagic() {
        super("Attack With Magic");
    }
    @Override
    public void execute(Character c1, Character c2) {
        int currentHealth = c2.getHealth();
        c2.setHealth(currentHealth-offset );
        this.notifyObservers();
    }
    
}
