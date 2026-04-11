package Entity.Ennemy;

public class Salmon extends Ennemy{
    private int egg;
    private int golden_egg;

    //CONSTRUCTEUR
    public Salmon(int pv, int speed, int aim, String name, String[] loot, int egg, int golden_egg) {
        super(pv, speed, aim, name, loot);
        this.egg = egg;
        this.golden_egg = golden_egg;
    }

    //GETTERS & SETTERS
    public int getEgg() {return egg;}
    public void setEgg(int egg) {this.egg = egg;}
    public int getGolden_egg() {return golden_egg;}
    public void setGolden_egg(int golden_egg) {this.golden_egg = golden_egg;}

    //FONCTIONS GLOBALES
    public void print_info(){
        super.print_info();
        System.out.println("Oeufs : " + egg);
        System.out.println("Oeufs dorés : " + golden_egg);
    }
}
