/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orionsmaze;

import javafx.scene.image.Image;

/**
 *
 * @author Gloria
 */
public class Player extends Movable {
    private Image right = new Image("Images/right0.png");
    private Image left = new Image("Images/left0.png");
    private Image front = new Image("Images/down1.png");
    private int headWidth;
    
    public Player(int xPos, int yPosCabeza, int xPosFinal, int yPosFinal,int headWidth, Image sprite) {
        super(xPos, yPosCabeza, xPosFinal, yPosFinal, sprite);
        right = new Image("Images/right0.png");
        left = new Image("Images/left0.png");
        front = new Image("Images/down1.png");    
        this.headWidth=headWidth;
    }

    
    @Override
    public void moveLeft(){
        sprite = left;
    }
    
    @Override
    public void moveRight(){
        sprite = right;
    }
    
    public void reset(){
        sprite = front;
    }

    public Image getRight() {
        return right;
    }

    public void setRight(Image right) {
        this.right = right;
    }

    public Image getLeft() {
        return left;
    }

    public void setLeft(Image left) {
        this.left = left;
    }

    public Image getFront() {
        return front;
    }

    public void setFront(Image front) {
        this.front = front;
    }

    public int getHeadHeight() {
        return headWidth;
    }

    public void setHeadWidth(int yPosCuerpo) {
        this.headWidth = yPosCuerpo;
    }
    
 
    

}
