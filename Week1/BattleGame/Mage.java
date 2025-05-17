public class Mage extends Character {
    public Mage() {
        this.health = 100;
        this.behaviour = new AttackWithMagic() ;
    }
    
}
