package Entity.Player;

import Entity.Entity;
import Entity.Player.Main_weapon.Weapon;

public abstract class Player extends Entity {
    private int ink;
    private int ink_filling_speed;
    private int healing_speed;
    private Weapon weapon;

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
    public int getHealing_speed() {return healing_speed;}
    public void setHealing_speed(int healing_speed) {this.healing_speed = healing_speed;}
    
    //FONCTIONS GLOBALES
    public void print_info(){
        super.print_info();
        System.out.println("Encre : " + ink);
        System.out.println("Levée d'encre : " + ink_filling_speed);
    }

    //Pour recharger l'encre et les pv
    public void refill_ink(){
        ink += ink_filling_speed;
        this.setPv(this.getPv() + healing_speed);
    }

    //Pour utiliser la bombe secondaire
    public void send_sub_bomb(){
        
    }

    //Pour utiliser l'arme spéciale
}
