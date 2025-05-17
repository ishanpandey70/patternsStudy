public abstract class Character {
    int health;
    Behaviour behaviour;
    
    public int getHealth(){
        return this.health;
    }
    public void setHealth(int newHealth){
        this.health = newHealth;
    }
    public Behaviour getBehaviour(){
        return this.behaviour;
    }

}
