package Entity.Player.Main_weapon;

import Entity.Ennemy.Ennemy;
import Entity.Player.Player;
import Entity.Player.Special_weapon.Special_weapon;
import Entity.Player.Sub_weapon.Sub_weapon;
import splatutil.util;

/**
 * @Overview : La classe abstraite qui définie toutes les propriétés partagées par toutes les armes
 * 
 * @specfield speed : la vitesse de l'arme (qui défini les tours de l'arme)
 * @specfield name : le nom de l'arme
 * @specfield ink_consuption : la consommation d'encre de l'arme
 * @specfield precision : la précision des attaques de l'arme (probabilité en % de touché la cible adverse)
 * @specfield sub_weapon : l'arme secondaire de l'arme
 * @specfield special_weapon : l'arme spéciale de l'arme
 */
public abstract class Weapon {
    private int speed;
    private String name;
    private int ink_consuption;
    private int precision;
    private int damage;

    private Sub_weapon sub_weapon;
    private Special_weapon special_weapon;

    //CONSTRUCTEUR
    public Weapon(int speed, String name, int ink_consuption, int precision, int damage, Sub_weapon sub_weapon, Special_weapon special_weapon) {
        this.speed = speed;
        this.name = name;
        this.ink_consuption = ink_consuption;
        this.precision = precision;
        this.damage = damage;
        this.sub_weapon = sub_weapon;
        this.special_weapon = special_weapon;
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
    public int getDamage() {return damage;}
    public void setDamage(int damage) {this.damage = damage;}

    public Sub_weapon getSub_weapon() {return sub_weapon;}
    public void setSub_weapon(Sub_weapon sub_weapon) {this.sub_weapon = sub_weapon;}
    public Special_weapon getSpecial_weapon() {return special_weapon;}
    public void setSpecial_weapon(Special_weapon special_weapon) {this.special_weapon = special_weapon;}

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
    private boolean is_hit(int player_aim){
        int rng = util.randint();
        return rng < player_aim + precision;
    }

    /**
     * Inflige les dégâts à un ennemi cibel
     * @param player : le joueur qui effectue l'attaque
     * @param cible : la cible ennemi
     */
    public void deal_damage(Player player, Ennemy cible){
        if(is_hit(player.getAim())){
            cible.setPv(cible.getPv() - this.getDamage());
        }
    }
}
