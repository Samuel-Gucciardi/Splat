package Entity.Player.Main_weapon;

public abstract class Weapon {
    private int speed;
    private String name;
    private int ink_consuption;

    //CONSTRUCTEUR
    public Weapon(int speed, String name, int ink_consuption) {
        this.speed = speed;
        this.name = name;
        this.ink_consuption = ink_consuption;
    }

    //GETTERS & SETTER
    public int getSpeed() {return speed;}
    public void setSpeed(int speed) {this.speed = speed;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getInk_consuption() {return ink_consuption;}
    public void setInk_consuption(int ink_consuption) {this.ink_consuption = ink_consuption;}

    //FONCTIONS GLOBALES
    public void print_info(){
        System.out.println("Vitesse : " + speed + "\n");
        System.out.println("Nom : " + name + "\n");
        System.out.println("Consomation d'encre : " + ink_consuption + "\n");
    }
}
