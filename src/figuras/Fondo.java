/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import figuras.base.Dibujable;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import logic.GameLogic;

/**
 * El fondo
 */
public class Fondo implements Dibujable {
    BufferedImage fondo;

    public Fondo(String filename) {
        try {
            fondo = ImageIO.read(new File(filename));
        } catch (IOException ex) {
            throw new IllegalArgumentException("No se pudo cargar imagen de fondo " + filename);
        } 
    }

    @Override
    public void dibujar(Graphics g) {
        g.drawImage(fondo, 0, 0, null);
    }   
    
}
