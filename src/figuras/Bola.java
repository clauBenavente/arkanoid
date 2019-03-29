/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import logic.GameLogic;
import figuras.base.Sprite;

/**
 *
 * @author Clau
 */
public class Bola extends Sprite{
    public Bola(GameLogic logic) {
        super(new String[]{
            "assets/img/ball.png",
            
        });
        // cambiar y terminar
        setX(330);
        setY(560);
    }
    public void disparo(){
        setY(getY() - 30);
    }
}
