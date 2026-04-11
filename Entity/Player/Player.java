package Entity.Player;

import Entity.Entity;

public abstract class Player extends Entity {
    private int ink;
    private int ink_filling_speed;

    //CONSTRUCTEUR
    public Player(int pv, int speed, int aim, String name, int ink, int ink_filling_speed) {
        super(pv, speed, aim, name);
        this.ink = ink;
        this.ink_filling_speed = ink_filling_speed;
    }

    //GETTERS & SETTERS
    public int getInk() {return ink;}
    public void setInk(int ink) {this.ink = ink;}
    public int getInk_filling_speed() {return ink_filling_speed;}
    public void setInk_filling_speed(int ink_filling_speed) {this.ink_filling_speed = ink_filling_speed;}
    
    //FONCTIONS GLOBALES
    public void print_info(){
        super.print_info();
        System.out.println("Encre : " + ink);
        System.out.println("Levée d'encre : " + ink_filling_speed);
    }

    public void refill_ink(){
        ink += ink_filling_speed;
    }
}
