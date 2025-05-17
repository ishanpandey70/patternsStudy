public abstract class Character {
    int health;
    ObservableBehaviour behaviour;
    
    public int getHealth(){
        return this.health;
    }
    public void setHealth(int newHealth){
        this.health = newHealth;
    }
    public ObservableBehaviour getBehaviour(){
        return this.behaviour;
    }

}
