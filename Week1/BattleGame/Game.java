public class Game {
    public static void main(String[] args) {
    Character player1 = new Warrior();
    Character player2 = new Mage();
    while (player1.getHealth()>0 && player2.getHealth()>0) {
        player1.getBehaviour().execute(player1, player2);
        if (player2.getHealth()>0) {
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