/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orionsmaze;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author Laura M
 */
public abstract class Controlador {
    private Vista ventana;
    private Modelo modelo;
    
    public void mostrarVista(){
        Singleton singleton=Singleton.getSingleton();
        this.ventana.mostrar(singleton.getStage());
    }
    
    class EventoBotonReintentar implements EventHandler<ActionEvent>{
    @Override
    public void handle(ActionEvent event){
          
    }
    }
    
    class EventoBotonContinuar implements EventHandler<ActionEvent>{
    @Override
    public void handle(ActionEvent event){
          
    }
    }
    
    class EventoBotonSalir implements EventHandler<ActionEvent>{
    @Override
    public void handle(ActionEvent event){
          
    }
}
}
