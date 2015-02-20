

package codigo;

import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 * @author Dani
 */
public class Nave {
    Image imagenNave = null;
    //posicion x-y de la nave
    private int x = 0;
    private int y = 0;
    private int anchoMaximo;
    
    public Nave (int ancho){
        this.anchoMaximo = ancho;
        try {
            imagenNave = ImageIO.read(getClass().getResource("/imagenes/nave.png"));
        } catch (IOException ex) {
            
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if(x<0){
        x=0;
        }
        if(x>anchoMaximo-imagenNave.getWidth(null)){
        x=anchoMaximo-imagenNave.getWidth(null);
        }
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
