package Entity.Player;

public class Inkling extends Player{
    private float octaling_multiplier;

    //CONSTRUCTEUR
    public Inkling(int pv, int speed, int aim, String name, int ink, int ink_filling_speed, float octaling_multiplier) {
        super(pv, speed, aim, name, ink, ink_filling_speed);
        this.octaling_multiplier = octaling_multiplier;
    }

    //GETTER & SETTER
    public float getOctaling_multiplier() {return octaling_multiplier;}
    public void setOctaling_multiplier(float octaling_multiplier) {this.octaling_multiplier = octaling_multiplier;}

    //FONCTIONS GLOBALES
    public void print_info(){
        super.print_info();
        System.out.println("Octaling multiplicateur : " + octaling_multiplier);
    }
}
