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
public abstract class Movable extends Thread {
    protected int xPos;
    protected int yPos;
    protected int width;
    protected int height;
    protected Image sprite;

    public Movable(int xPos, int yPos, int width, int Height, Image sprite) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.sprite = sprite;
        this.width=width;
        this.height=width;
    }

    

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }
    
    public void moveRight(){//Esto nunca se cumple para el player
        this.xPos += 15;
    }
    
    public void moveLeft(){//Esto nunca se cumple para el player
            this.xPos -= 15;
    }
    
    public void jump(){
        /*
        int guardaPosy=367;
        int movY=0;
        for(int n=0; n<92345; n++){
            if(this.yPos!=guardaPosy-5){
            if(n%5==0){
                this.yPos--;
                movY++;
            }
        } else if(this.yPos!=guardaPosy){
            if(n%5==0){
                this.yPos++;
                movY--;
                if(movY==0){
               //     n=92345;
                }
            }
        }
      }*/
    }

    public Image getSprite() {
        return sprite;
    }

    public void setSprite(Image sprite) {
        this.sprite = sprite;
    }

    public int getWidth() {
        return width;
    }

    public void setxPosFinal(int xPosFinal) {
        this.width = xPosFinal;
    }

    public int getHeight() {
        return height;
    }

    public void setyPosFinal(int yPosFinal) {
        this.height = yPosFinal;
    }


    
    
}

