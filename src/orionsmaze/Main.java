/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orionsmaze;
import javafx.application.Application;
import javafx.stage.Stage;
/**
 *
 * @author Laura M
 */
public class Main extends Application{

@Override
    public void start(Stage stage) throws Exception {
    
        Singleton  singleton= Singleton.getSingleton();
        singleton.setStage(stage);
        
        Modelo modelo = new Modelo();
        
        ControladorMenu vista = new ControladorMenu(modelo);
        
        vista.mostrarVista();
        //Comprobado System.out.println("Hasta aqui pos bien");
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
