package Entity.Player.Sub_weapon;

import Entity.Ennemy.Ennemy;

abstract public class Sub_weapon {
    private String name;
    private int ink_cost;

    //CONSTRUCTEUR
    public Sub_weapon(String name, int ink_cost) {
        this.name = name;
        this.ink_cost = ink_cost;
    }

    //GETTERS & SETTERS
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getInk_cost() {return ink_cost;}
    public void setInk_cost(int ink_cost) {this.ink_cost = ink_cost;}

    //FONCTIONS GLOBALES
    /**
     * Lance l'attaque de l'arme secondaire sur les ennemis
     * @param ennemies : la liste d'ennemis attaqués
     * @param target : l'index de l'ennemi ciblé
     */
    abstract public void attack(Ennemy[] ennemies, int target);
}
