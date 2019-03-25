
package figuras;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


public abstract class Sprite implements Dibujable {
    
    BufferedImage image;
    int x;
    int y;
    int incrX;
    int incrY;
    int width;
    int height;

    public Sprite(String filename) {
        try {
            image = ImageIO.read(new File(filename));
        } catch (IOException ex) {
            throw new IllegalArgumentException("No se pudo cargar fichero %s%n" +filename);
        }
        width = image.getWidth();
        height = image.getHeight(); 
    }
    
    public void dibujar(Graphics g) {
        g.drawImage(image, x, y, width, height, null);
    }
    
    
    
    
    
    
    
    
    
    
    
}
