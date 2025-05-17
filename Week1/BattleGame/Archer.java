public class Archer extends Character {
    public Archer() {
        this.health = 100;
        this.behaviour = new AttackWithArrow();
    }
}
