/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orionsmaze;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;

/**
 *
 * @author Laura M
 */
public class Controlador1 extends Controlador{
    private VistaNivel1 ventana;
    private Modelo modelo;
    
    
    public Controlador1(Modelo modelo){
        this.movY=true;
        this.movX=true;
        this.ventana=new VistaNivel1();
        this.modelo=modelo;
        this.ventana.getScene().setOnKeyPressed(new ToPressKeyEvent());
        this.ventana.getScene().setOnKeyReleased(new ToReleaseKeyEvent());
    }
    
    @Override
    public void mostrarVista(){
        Singleton singleton=Singleton.getSingleton();
        this.ventana.mostrar(singleton.getStage());
        
    }
    
    
    
    class ToPressKeyEvent implements EventHandler<KeyEvent>{
    @Override
    public void handle(KeyEvent event){

          String code = event.getCode().toString();
            if(!ventana.getKeyPresses().contains(code)){
                        ventana.getKeyPresses().add(code);
            }

            /*Solo se mueve hacia la derecha si no colisiona con ningún objeto en esa dirección*/
            if (ventana.getKeyPresses().contains("RIGHT")&&(!colision(ventana.getPlayer(), ventana.getObjects()).equals("RIGHT"))){
                System.out.println(colision(ventana.getPlayer(), ventana.getObjects()));
                ventana.getBg().moveLeft();//bg se mueve invertido
                ventana.getBgInverted().moveLeft();
                ventana.getFloor().moveLeft();
                for(StaticObject objecto:ventana.getObjects()){
                    objecto.moveLeft();
                }
            }
            /*Solo se mueve hacia la izquierda si no colisiona con ningún objeto en esa dirección*/
            if ((ventana.getKeyPresses().contains("LEFT"))&&(!colision(ventana.getPlayer(), ventana.getObjects()).equals("LEFT"))){
                if(ventana.getBg().xPos!=0){
                ventana.getBg().moveRight();//bg se mueve invertido
                ventana.getBgInverted().moveRight();
                ventana.getFloor().moveRight();
                for(StaticObject objecto:ventana.getObjects()){
                    objecto.moveRight();
                }   
              }
            }
            /*Solo se mueve hacia arriba si no colisiona con ningún objeto en esa dirección*/
            if ((ventana.getKeyPresses().contains("UP"))&&(!colision(ventana.getPlayer(), ventana.getObjects()).equals("UP"))){
                ventana.getPlayer().jump();
            }
            
    }
}
    
    class ToReleaseKeyEvent implements EventHandler<KeyEvent>{
    @Override
    public void handle(KeyEvent event){
        
          String code = event.getCode().toString();
                    if(ventana.getKeyPresses().contains(code)){
                        ventana.getKeyPresses().remove(code);
                    }
        }
    }
    
    
}

