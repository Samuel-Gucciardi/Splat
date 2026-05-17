package Entity.Player.Special_weapon;

import Entity.Ennemy.Ennemy;

/**
 * @Overview : la classe abstraite pour les informations sur les armes spéciales
 * due au fonctionnement un peu particulier et varié des armes spéciales, il y a peu d'attribut dans cette classe.
 * @specfield name : le nom de l'arme spéciale
 */
abstract public class Special_weapon {
    private String name;

    //CONSTRUCTEUR
    public Special_weapon(String name) {
        this.name = name;
    }

    //GETTERS & SETTERS
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    //FONCTIONS GLOBALES
    /**
     * Lance l'attaque de l'arme spéciale sur les ennemis
     * @param ennemies : la liste d'ennemis attaqués
     * @param target : l'index de l'ennemi ciblé
     */
    abstract public void attack(Ennemy[] ennemies, int target);

}
