
import java.util.ArrayList;
import java.util.Random;


public class Bot{
    public int aiCards(){
        Random r = new Random();
        int aiCards = 0;
        aiCards = r.nextInt(11);
        
        return aiCards;
    }

    public int aiSomme(ArrayList<Integer> list) {
        int aiSomme = 0;
        for (int i: list) {
            aiSomme += i;
        }
        return aiSomme;
    }


    public int plays(){
        ArrayList<Integer> botCards = new ArrayList<>();
        botCards.add(aiCards());
        botCards.add(aiCards());
        System.out.printf("Dealer start %S\n", botCards.toString());

        while(aiSomme(botCards) < 17){
            botCards.add(aiCards());
            System.out.printf("Dealer current hand %S\n", botCards.toString());
            System.out.printf("dealer current total %s\n", aiSomme(botCards)); //if any error on bot look here
        }
        if(aiSomme(botCards) < 17){
            System.out.println("dealer 17, stand");
            return 1;
        }else if(aiSomme(botCards) == 21){
            System.out.println("dealer win\n");
            return 2;
        }
        return 0;
    }


}