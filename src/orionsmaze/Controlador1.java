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
public class Controlador1 {
    private VistaNivel1 ventana;
    private Modelo modelo;
    
    
    public Controlador1(Modelo modelo){
        this.ventana=new VistaNivel1();
        this.modelo=modelo;
        this.ventana.getScene().setOnKeyPressed(new ToPressKeyEvent());
        this.ventana.getScene().setOnKeyReleased(new ToReleaseKeyEvent());
    }
    
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
            if (ventana.getKeyPresses().contains("RIGHT")){
                ventana.getBg().moveLeft();//bg se mueve invertido
                //Hacer aqui que los objetos se muevan
            }
            if (ventana.getKeyPresses().contains("LEFT")){
                ventana.getBg().moveRight();//bg se mueve invertido
                //Hacer aqui que los objetos se muevan
            }
            if (ventana.getKeyPresses().contains("UP")){
                ventana.getPlayer().jump();
            }
    }
}
    
    class ToReleaseKeyEvent implements EventHandler<KeyEvent>{
    @Override
    public void handle(KeyEvent event){
        
          String code = event.getCode().toString();
                    if(!ventana.getKeyPresses().contains(code)){
                        ventana.getKeyPresses().remove(code);
                    }
    }
    
    
}
}

