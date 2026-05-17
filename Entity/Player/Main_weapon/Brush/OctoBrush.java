package Entity.Player.Main_weapon.Brush;

import Entity.Player.Special_weapon.Rain;
import Entity.Player.Sub_weapon.Beackon;

/**
 * @Overview : Pour le pinceau brosse
 * 
 * @speed = 80
 * @name = "pinceau brosse"
 * @ink_consuption = 40
 * @precision = 100
 * @sub_weapon : balise de supersaut
 * @special_weapon : pluie d'encre
 * 
 * @width = 2
 * @slide_speed = 40
 */
public class OctoBrush extends Brush{
    
    public OctoBrush(){
        super(80, "Épinceau brosse", 40, 100, 35, new Beackon(), new Rain(), 2, 40);
    }
}
