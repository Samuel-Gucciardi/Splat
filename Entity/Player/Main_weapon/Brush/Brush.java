package Entity.Player.Main_weapon.Brush;

import Entity.Ennemy.Ennemy;
import Entity.Player.Player;
import Entity.Player.Main_weapon.Weapon;
import Entity.Player.Special_weapon.Special_weapon;
import Entity.Player.Sub_weapon.Sub_weapon;

/**
 * @Overview : La classe abstraite pour les pinceaux
 * 
 * @Width : Le nombre d'ennemi que l'arme attaque à la fois
 * @Slide_speed : La vitesse du pinceau
 * 
 * NOTE : si le nombre d'ennemi touché est impair, le centre de l'attaque sera l'ennemi au centre à droite (0, T, 0) => (A, A, 0)
 */
abstract public class Brush extends Weapon{
    private int width;
    private int slide_speed;

    //Constructeur
    public Brush(int speed, String name, int ink_consuption, int precision, int damage, Sub_weapon sub_weapon, Special_weapon special_weapon, int width, int slide_speed) {
        super(speed, name, ink_consuption, precision, damage, sub_weapon, special_weapon);
        this.width = width;
        this.slide_speed = slide_speed;
    }

    //Fonctions globales
    @Override
    public void attack(Player player, Ennemy[] ennemies, int target){
        //Si le nombre de cible est pair
        if(this.width % 2 == 0){
            //Pour les ennemis à gauche de target
            for(int i = 0 ; i <= width/2 ; i++){
                if(0 <= i && i < ennemies.length){ //Si on ne sort pas des limites du tableau d'ennemis
                    deal_damage(player, ennemies[target - i]);
                }
            }
            //Pour les ennemis à droite de target
            for(int i = 1 ; i < width/2 ; i++){
                if(0 <= i && i < ennemies.length){
                    deal_damage(player, ennemies[target + i]);
                }
            }
        }

        //Si le nombre de cible est impair
        else{
            ennemies[target].setPv(ennemies[target].getPv() - this.getDamage());
            for(int i = 1 ; i <= this.width/2 ; i++){
                if(0 < i && i < ennemies.length){
                    deal_damage(player, ennemies[target + i]);
                    deal_damage(player, ennemies[target - i]);
                }
            }
        }
        
    }

    /**
     * Augmente la vitesse du joueur
     * @param player : le joueur qui déclenche l'attaque
     */
    public void slide(Player player){
        this.setSpeed(this.getSpeed() + slide_speed);
    }
}
