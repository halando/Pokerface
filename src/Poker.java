import java.util.Random;

public class Poker {
    public void osztas(){
        
    }

    public Poker() {
        System.out.printf("%d %d %d %d %d\n",
        getPitch(),
        getPitch(),
        getPitch(),
        getPitch(),
        getPitch());
      
    }
    public int getPitch(){
        Random random = new Random();
        int randInt = random.nextInt(6)+1;
        return randInt;
    }
}
