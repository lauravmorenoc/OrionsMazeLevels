/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orionsmaze;
import javafx.scene.image.Image;
/**
 *
 * @author Laura M
 */
public class StaticObject extends Movable{
    private int[] rangoX;
    private int[] rangoY;
    
    public StaticObject (int xPos, int yPos, Image sprite) {
        super(xPos, yPos, sprite);
        rangoX=new int[2];
        rangoY=new int[2];
    }

    public int[] getRangoX() {
        return rangoX;
    }

    public void setRangoX(int[] rangoX) {
        this.rangoX = rangoX;
    }

    public int[] getRangoY() {
        return rangoY;
    }

    public void setRangoY(int[] rangoY) {
        this.rangoY = rangoY;
    }
    
    
}
