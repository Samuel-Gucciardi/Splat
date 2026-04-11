package splatutil;
import java.util.Random;

public class util {
   //Génère un nombre aléatoire entre min et max compris
   public static int randint(int min, int max){
    Random rand = new Random();

    int randomNum = rand.nextInt((max - min) + 1) + min;
    return randomNum;
   } 

   //Par défaut on retourne un nombre entre 0 et 100
   public static int randint(){
      return randint(0, 100);
   }
}
