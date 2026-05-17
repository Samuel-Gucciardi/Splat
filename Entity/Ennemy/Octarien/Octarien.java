package Entity.Ennemy.Octarien;

import Entity.Ennemy.Ennemy;

public class Octarien extends Ennemy{
    private String parchemin;
    private int salmonoide;

    //CONSTRUCTEUR
    public Octarien(int pv, int speed, int aim, String name, String[] loot, String parchemin, int salmonoide) {
        super(pv, speed, aim, name, loot);
        this.parchemin = parchemin;
        this.salmonoide = salmonoide;
    }

    //GETTERS & SETTERS
    public String getParchemin() {return parchemin;}
    public void setParchemin(String parchemin) {this.parchemin = parchemin;}
    public int getSalmonoide() {return salmonoide;}
    public void setSalmonoide(int salmonoide) {this.salmonoide = salmonoide;}

    //FONCTIONS GLOBALES
    public void print_info(){
        super.print_info();
        System.out.println("Parchemin + " + parchemin + "\n");
        System.out.println("Salmonoïdes + " + salmonoide);
    }
}
