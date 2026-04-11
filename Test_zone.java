import splatutil.util;

public class Test_zone {
    
    public static void main(String[] args){
        System.out.println("Début de la zone de test");
        int rng = 10;
        int tentative = 0;
        while(rng != 0){
            rng = util.randint(0, 100);
            tentative++;
            System.out.println(rng);
        }
        System.out.println(tentative);
    }
}
