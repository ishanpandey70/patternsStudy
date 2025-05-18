import characters.Character;
import characters.Mage;
import characters.Warrior;
import observer.Logger;

public class Game {
    public static void main(String[] args) {
    Character player1 = new Warrior();
    Character player2 = new Mage();
    Logger log = new Logger();
    
    player1.getBehaviour().registerObserver(log);
    player2.getBehaviour().registerObserver(log);

    while (player1.getHealth()>0 && player2.getHealth()>0) {
        System.out.println("Player 1 's turn");
        player1.getBehaviour().execute(player1, player2);
        if (player2.getHealth()>0) {
        System.out.println("Player 2 's turn");
        player2.getBehaviour().execute(player2, player1);
        }
    }
    System.out.println("Game Over");
    System.out.println("Player 1 Health: " + player1.getHealth());
    System.out.println("Player 2 Health: " + player2.getHealth());
    if (player1.getHealth() <= 0) {
        System.out.println("Player 2 wins!");
    } else {
        System.out.println("Player 1 wins!");
    }
}
}