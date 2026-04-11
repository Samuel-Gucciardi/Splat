package Entity;

public abstract class Entity {
    private int pv;
    private int speed;
    private int aim;
    private String name;

    //CONSTRUCTEUR
    public Entity(int pv, int speed, int aim, String name) {
        this.pv = pv;
        this.speed = speed;
        this.aim = aim;
        this.name = name;
    }

    //GETTERS & SETTERS
    public int getPv() {return pv;}
    public void setPv(int pv) {this.pv = pv;}
    public int getSpeed() {return speed;}
    public void setSpeed(int speed) {this.speed = speed;}
    public int getAim() {return aim;}
    public void setAim(int aim) {this.aim = aim;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    
    //FONCTIONS GLOBALES
    /*
    Pour afficher les infos
    */
    public void print_info(){
        System.out.print("Nom : " + name + "\n");
        System.out.print("PV : " + pv + "\n");
        System.out.print("Vitesse : " + speed + "\n");
        System.out.print("Précision : " + aim + "\n");
    }

    /*
    Retourne True si l'entitée est en vie
    */
   public boolean is_alive(){
    return pv <= 0;
   }
}
