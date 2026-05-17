package Entity.Player.Main_weapon.Gattling;

import Entity.Ennemy.Ennemy;
import Entity.Player.Player;
import Entity.Player.Main_weapon.Weapon;
import Entity.Player.Special_weapon.Special_weapon;
import Entity.Player.Sub_weapon.Sub_weapon;

/**
 * @Overview : la classe pour les badigeonneurs
 * 
 * @specfield charging_level : le niveau de charge auquel l'arme est actuellement
 * @specfield charging_speed : la quantité de charge que le badigeonneur va gagner en chargant
 * @specfield max_charge : la quantité maximale de charge du badigeonneur
 * 
 * NOTE : chaque badigeonneur consomme 5 balles par utilisation de attack()
 */
abstract public class Gattling extends Weapon{
    private int charging_level;
    private int max_charge;
    private int charging_speed;

    //Constructeur
    public Gattling(int speed, String name, int ink_consuption, int precision, int damage, Sub_weapon sub_weapon, Special_weapon special_weapon, int charging_level, int max_charge, int charging_speed) {
        super(speed, name, ink_consuption, precision, damage, sub_weapon, special_weapon);
        this.charging_level = charging_level;
        this.max_charge = max_charge;
        this.charging_speed = charging_speed;
    }

    //Getters & Setters
    public int getCharging_level() {return charging_level;}
    public void setCharging_level(int charging_level) {this.charging_level = charging_level;}
    public int getMax_charge() {return max_charge;}
    public void setMax_charge(int max_charge) {this.max_charge = max_charge;}
    public int getCharging_speed() {return charging_speed;}
    public void setCharging_speed(int charging_speed) {this.charging_speed = charging_speed;}

    //Fonctions globales
    @Override
    public void attack(Player player, Ennemy[] ennemies, int target){
        int nbr_shot = 5;
        while(nbr_shot > 0 && charging_level >= 0){
            deal_damage(player, ennemies[target]);
            nbr_shot--;
            charging_level--;
        }
    }

    /**
     * Charge le nombre de tir qui peuvent être tiré
     */
    public void charge_shot(){
        if(charging_level + charging_speed > max_charge){
            charging_level = max_charge;
        }
        else{
            charging_level += charging_speed;
        }
    }
}
