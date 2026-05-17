package Entity.Player.Main_weapon.Shooter;

import Entity.Ennemy.Ennemy;
import Entity.Player.Player;
import Entity.Player.Main_weapon.Weapon;
import Entity.Player.Special_weapon.Special_weapon;
import Entity.Player.Sub_weapon.Sub_weapon;

/**
 * @overview : la classe qui contient toutes les informations sur un shooter ainsi qu'un pré-constructeur pour arme
 * Les différentes classes qui l'implémenteront, sauf cas exceptionnel, utiliseront simplement son constructeur avec des valeurs prédéfinies
 * @specfield damage : le nombre de dégâts infligé par balle
 * @specfield nbr shot : le nombre de tir par attaque
 */
public abstract class Shooter extends Weapon{
    private int nbr_shot;

    //CONSTRUCTEUR
    public Shooter(String name, int speed, int ink_consuption, int precision, int damage, int nbr_shot, Sub_weapon sub_weapon, Special_weapon special_weapon) {
        super(speed, name, ink_consuption, precision, damage, sub_weapon, special_weapon);
        this.nbr_shot = nbr_shot;
    }

    //GETTER & SETTER
    public int getNbr_shot() {return nbr_shot;}
    public void setNbr_shot(int nbr_shot) {this.nbr_shot = nbr_shot;}

    //FONCTIONS GLOBALES
    @Override
    public void attack(Player player, Ennemy[] ennemies, int target) {
        Ennemy cible = ennemies[target];
        //On itère pour chaque balle tirées par tour
        for(int i = 0 ; i < nbr_shot ; i++){
            //On test si la balle touche l'ennemi ou non
            this.deal_damage(player, cible);
        }
        //On retire l'encre du joueur
        player.setInk(player.getInk() - this.getInk_consuption());
    }
}
