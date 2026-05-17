package Entity.Player.Main_weapon.Shooter;

import Entity.Player.Special_weapon.Booyah_bomb;
import Entity.Player.Sub_weapon.Suction_bomb;

/**
INFOS :
    @nom = "Liquidateur Pro griffé"
    @damage = 45
    @nbr_shot = 2
    @precision = 90
    @speed = 50
    @ink_consuption = 35

    @Sub_weapon : bombe gluante
    @Special_weapon : booyah bomb
*/
public class Forge extends Shooter{

    //CONSTRUCTEUR
    public Forge() {
        super("Liquidateur Pro", 50, 35, 90, 45, 2, new Suction_bomb(), new Booyah_bomb()); //Il reste à implémenter la bombe gluante et la booyah
    }
}
