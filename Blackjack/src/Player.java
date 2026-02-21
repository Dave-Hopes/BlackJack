import java.util.ArrayList;
import java.util.Random;

public class Player{
    public double buyIn;

    public int cards(){
        Random r = new Random();
        int cards = 0;
        cards = r.nextInt(11);
        
        return cards;
    }

        public int somme(ArrayList<Integer> list) {
        int somme = 0;
        for (int i: list) {
            somme += i;
        }
        return somme;
    }

    //1 split maximum
    public int split(){
        Main fromMain = new Main();
        ArrayList<Integer> Split = new ArrayList<>();
         //find a way to call the arraylist from main back to here
        return 0;
    }


}

