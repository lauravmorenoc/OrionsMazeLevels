/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orionsmaze;
import java.util.ArrayList;
import java.util.HashMap;
import javafx.animation.AnimationTimer;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Laura M
 */
public abstract class Vista extends AnimationTimer{
    protected Scene scene;
    protected Background bg;
    protected Button reintentar;
    protected Button salir;
    protected Button continuar;
    protected Pane layout;
    protected Canvas canvas;
    protected GraphicsContext pencil;
    protected Image placeholder;
    protected ArrayList<String> keyPresses; 
    protected ArrayList<StaticObject> objetos;
    protected ArrayList<Enemy> enemigos;
    protected Player player;
    protected int frames;

    public Vista() {
        this.layout = new Pane();             
        this.canvas = new Canvas(800, 512); 
        layout.getChildren().add(canvas); 
        this.scene = new Scene(layout, canvas.getWidth(), canvas.getHeight());
        this.pencil = canvas.getGraphicsContext2D();
        this.layout = new Pane();
        this.canvas = new Canvas();
        this.keyPresses= null;
    }
    
    
    
    public void mostrar(Stage stage) {
      stage.setTitle("Orion's Maze");
      stage.setScene(scene);
      stage.show();
   }

    public Button getReintentar() {
        return reintentar;
    }

    public void setReintentar(Button Reintentar) {
        this.reintentar = Reintentar;
    }

    public Button getSalir() {
        return salir;
    }

    public void setSalir(Button salir) {
        this.salir = salir;
    }

    public Button getContinuar() {
        return continuar;
    }

    public void setContinuar(Button continuar) {
        this.continuar = continuar;
    }

    public Background getBg() {
        return bg;
    }

    public void setBg(Background bg) {
        this.bg = bg;
    }

    public Pane getLayout() {
        return layout;
    }

    public void setLayout(Pane layout) {
        this.layout = layout;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    public GraphicsContext getPencil() {
        return pencil;
    }

    public void setPencil(GraphicsContext pencil) {
        this.pencil = pencil;
    }

    public Image getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(Image placeholder) {
        this.placeholder = placeholder;
    }

    public ArrayList<String> getKeyPresses() {
        return keyPresses;
    }

    public void setKeyPresses(ArrayList<String> keyPresses) {
        this.keyPresses = keyPresses;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int getFrames() {
        return frames;
    }

    public void setFrames(int frames) {
        this.frames = frames;
    }

    public Scene getScene() {
        return scene;
    }
    
    
}
