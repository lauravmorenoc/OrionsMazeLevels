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
 * @author Gloria
 */
public class ControladorMenu extends Controlador {
    private VistaMenu menu;
    private Modelo modelo;
    
    public ControladorMenu(Modelo modelo){
        this.modelo = modelo;
        this.menu = new VistaMenu();
    }
   
    
    @Override
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        this.menu.show(singleton.getStage());
        this.menu.getPlay().setOnAction(new PlayButtonEvent());
    }
    
    class PlayButtonEvent implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            Controlador1 controlador1 = new Controlador1(modelo);
            controlador1.mostrarVista();
        }
        
    }
}
