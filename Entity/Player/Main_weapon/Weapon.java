package Entity.Player.Main_weapon;

import Entity.Ennemy.Ennemy;
import Entity.Player.Player;
import splatutil.util;

public abstract class Weapon {
    private int speed;
    private String name;
    private int ink_consuption;
    private int precision;

    //CONSTRUCTEUR
    public Weapon(int speed, String name, int ink_consuption, int precision) {
        this.speed = speed;
        this.name = name;
        this.ink_consuption = ink_consuption;
        this.precision = precision;
    }

    //GETTERS & SETTER
    public int getSpeed() {return speed;}
    public void setSpeed(int speed) {this.speed = speed;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getInk_consuption() {return ink_consuption;}
    public void setInk_consuption(int ink_consuption) {this.ink_consuption = ink_consuption;}
    public int getPrecision() {return precision;}
    public void setPrecision(int precision) {this.precision = precision;}

    //FONCTIONS GLOBALES
    public void print_info(){
        System.out.println("Vitesse : " + speed + "\n");
        System.out.println("Nom : " + name + "\n");
        System.out.println("Consomation d'encre : " + ink_consuption + "\n");
        System.out.println("Précision : " + precision + "\n");
    }

    /** 
     * Lancer l'attaque du joueur propriétaire de l'arme sur les ennemies
     * @param player : le joueur qui déclenche l'attaque
     * @param ennemies : l'ensemble des ennemis sur le terrain
     * @param target : l'index de l'ennemi ciblé par l'attaque
     */
    public abstract void attack(Player player, Ennemy[] ennemies, int target);


    /**
     * Pour savoir si une balle touche ou non l'ennemi
     * @param player_aim : la précision du joueur qui lance l'attaque
     * @return
     */
    public boolean is_hit(int player_aim){
        int rng = util.randint();
        return rng < player_aim + precision;
    }
}
