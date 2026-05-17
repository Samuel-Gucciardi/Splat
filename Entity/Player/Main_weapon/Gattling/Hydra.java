package Entity.Player.Main_weapon.Gattling;

import Entity.Player.Special_weapon.Booyah_bomb;
import Entity.Player.Sub_weapon.Robot_bomb;

/**
 * La classe pour l'hydra
 * 
 * @name : "extinteur"
 * @speed : 20
 * @ink_consuption : 15
 * @precision : 90
 * @damage : 20
 * @sub_weapon : bombe robot
 * @special_weapon : jolizator
 * 
 * @max_charge : 50
 * @charging_speed : 8
 */
public class Hydra extends Gattling{

    public Hydra() {
        super(20, "extinteur", 15, 90, 20, new Robot_bomb(), new Booyah_bomb(), 0, 50, 8);
    }
}
