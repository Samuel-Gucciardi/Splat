package Entity.Player;

public class Octaling extends Player{
    private float salmon_mult;

    //CONSTRUCTEUR
    public Octaling(int pv, int speed, int aim, String name, int ink, int ink_filling_speed, float salmon_mult) {
        super(pv, speed, aim, name, ink, ink_filling_speed);
        this.salmon_mult = salmon_mult;
    }

    //GETTER & SETTER
    public float getSalmon_mult() {return salmon_mult;}
    public void setSalmon_mult(float salmon_mult) {this.salmon_mult = salmon_mult;}

    //FONCTIONS GLOBALES
    public void print_info(){
        super.print_info();
        System.out.println("Saumon mutliplicateur : " + salmon_mult);
    }
}
