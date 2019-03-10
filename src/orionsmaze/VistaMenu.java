/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orionsmaze;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/**
 *
 * @author Laura M
 **/
 
public class VistaMenu extends Vista{
    
    private StackPane stackGrid;
    private Label title;
    private Button play;
    private Button options;
    private Button highScores;
    private Button exit;
    private ImageView image;
    private VBox internalVBox;
    private GridPane grid;
    
    public VistaMenu(){
        
        //Contiene todos los elementos
        stackGrid = new StackPane();
        stackGrid.setPadding(new Insets(25, 25, 25, 25));
        stackGrid.setAlignment(Pos.CENTER);
        
        
        internalVBox = new VBox(20); //Contiene los botones
        internalVBox.setAlignment(Pos.CENTER);
        
        //GridPane que contiene el titulo y los botones
        grid = new GridPane();
        grid.setVgap(50);
        grid.setAlignment(Pos.CENTER);
        
        
        
        bg = new Background(0,0, 1800, 860, new Image("Images/fondoN1.jpg"));
        image = new ImageView(bg.getSprite());
        
        title = new Label("Orion's Maze");
        
        play = new Button("Play");
        play.setMaxWidth(100);
        
        options = new Button("Options");
        options.setMaxWidth(100);
        
        highScores = new Button("High Scores");
        highScores.setMaxWidth(100);
        
        exit = new Button("Exit");
        exit.setMaxWidth(100);
    
        internalVBox.getChildren().add(play);
        internalVBox.getChildren().add(options);
        internalVBox.getChildren().add(highScores);
        internalVBox.getChildren().add(exit);
        
        //Añade los elementos al GridPane
        grid.add(title, 0, 1);
        grid.add(internalVBox, 0, 2);
        grid.setHalignment(title, HPos.CENTER); //Centra el titulo en su casilla
        
        stackGrid.getChildren().add(image);
        stackGrid.getChildren().add(grid);
        
        scene = new Scene(stackGrid, 650, 406);
    }

    @Override
    public void handle(long now) {
        
    }

    public Scene getScene() {
        return scene;
    }

    public StackPane getStackGrid() {
        return stackGrid;
    }

    public Label getTitle() {
        return title;
    }

    public Button getPlay() {
        return play;
    }

    public Button getOptions() {
        return options;
    }

    public Button getHighScores() {
        return highScores;
    }

    public Button getExit() {
        return exit;
    }

    public ImageView getImage() {
        return image;
    }

    public VBox getInternalVBox() {
        return internalVBox;
    }

    public GridPane getGrid() {
        return grid;
    }
    
    
    
    public void show(Stage stage) {
        stage.setTitle("Orion's Maze");
        stage.setScene(scene);
        stage.show();
    }
}
