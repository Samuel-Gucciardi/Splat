package Entity.Ennemy;

import Entity.Entity;

public abstract class Ennemy extends Entity{
    private String[] loot;

    //CONSTRUCTEUR
    public Ennemy(int pv, int speed, int aim, String name, String[] loot) {
        super(pv, speed, aim, name);
        this.loot = loot;
    }

    //GETTER & SETTER
    public String[] getLoot() {return loot;}
    public void setLoot(String[] loot) {this.loot = loot;}

    //FONCTIONS GLOBALES
    public void print_info(){
        super.print_info();
        System.out.println("Loots : " + loot);
    }
}
