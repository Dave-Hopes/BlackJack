import java.util.ArrayList;
import java.util.Scanner;




public class Main {
    public static void main(){
        ArrayList<Integer> card = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Player PlayerSide = new Player();
        Bot BotSide = new Bot();

        card.add(PlayerSide.cards());
        card.add(PlayerSide.cards());
        
        while(PlayerSide.buyIn < 5){
            System.out.println("entrer une somme de pari, le minimum est 5€\n");
            PlayerSide.buyIn = scanner.nextDouble();
        }
        System.out.printf("here are your cards %s\n", card.toString());
        System.out.print("youre next move? \n");

        while(PlayerSide.somme(card) <= 21){

            String choice;
            choice = scanner.next();

            if (choice.equals("hit")) {
                card.add(PlayerSide.cards());
                System.out.printf("here are your cards %s\n", card.toString());
                System.out.printf("here are your total %d\n", PlayerSide.somme(card));

            }else if(choice.equals("split")){
                ArrayList<Integer> Split = new ArrayList<>();
                Split.add(card.get(1));
                // remove a value in original list and fill the split with a second value, reminder to transfer all this in the player class
            }
            else{
                BotSide.aiCards();
                BotSide.plays();
            }
        }
        //returning the status of the player
        




        

        scanner.close();
    }
}
