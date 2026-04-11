package Entity.Player.Main_weapon.Shooter;

import Entity.Ennemy.Ennemy;
import Entity.Player.Player;
import Entity.Player.Main_weapon.Weapon;

public abstract class Shooter extends Weapon{
    private int damage;
    private int nbr_shot;

    //CONSTRUCTEUR
    public Shooter(int speed, String name, int ink_consuption, int precision, int damage) {
        super(speed, name, ink_consuption, precision);
        this.damage = damage;
    }

    //GETTER & SETTER
    public int getDamage() {return damage;}
    public void setDamage(int damage) {this.damage = damage;}
    public int getNbr_shot() {return nbr_shot;}
    public void setNbr_shot(int nbr_shot) {this.nbr_shot = nbr_shot;}

    //FONCTIONS GLOBALES
    public void attack(Player player, Ennemy[] ennemies, int target) {
        Ennemy cible = ennemies[target];
        //On itère pour chaque balle tirées par tour
        for(int i = 0 ; i < nbr_shot ; i++){
            //On test si la balle touche l'ennemi ou non
            if(!is_hit(player.getAim())){
                //Si non rien ne se passe
                System.out.println("Miss");
                continue;
            }
            else{
                //Si oui on inflige les dégâts
                cible.setPv(cible.getPv() - damage);
            }
        }
        //On retire l'encre du joueur
        player.setInk(player.getInk() - this.getInk_consuption());
    }
}
