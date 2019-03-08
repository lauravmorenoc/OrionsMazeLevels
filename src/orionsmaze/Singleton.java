/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orionsmaze;

import javafx.stage.Stage;

/**
 *
 * @author Laura M
 */
public class Singleton {
    public static Singleton singleton=null;
    private Stage stage; //Ya que esta es una variable global para toda la aplicacion, para no estarla pasando por referencia
    
    public static Singleton getSingleton(){ //no tengo que crear un objeto de esta clase para poder invocar este método
        if(singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }
    
    public Stage getStage(){
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
