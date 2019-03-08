package orionsmaze;

import java.util.ArrayList;
import java.util.HashMap;
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
 * @author Laura M //Biometria hemática y una química sanguínea cada 6-8 meses
 */
public class VistaNivel1 extends Vista{

    public VistaNivel1(){
        this.bg=new Background(0, 0, new Image("Images/fondoN1.jpg"));
        this.player = new Player(300, 600, new Image("Images/down1.png"));
        System.out.println("Se inicializa el background");
        StaticObject plataforma=new StaticObject(500, 350, new Image("Images/alienfloor2_diffuse.jpg"));
        this.objetos.add(plataforma);
    }
    
    
    
    @Override
    public void handle(long now){
        
        if(frames % 2 == 0){
            pencil.clearRect(0, 0, 2000, 2000);
            pencil.drawImage(bg.getSprite(), bg.getxPos(), bg.getyPos());
            for(StaticObject object:this.objetos){
                if(object.getRangoX()[1]>=0)
                pencil.drawImage(object.getSprite(), object.getxPos(), object.getyPos());
            }
            //Hacer lo mismo para todos los objetos que van en el nivel
            pencil.drawImage(player.getSprite(), player.getxPos(), player.getyPos());

        }
        frames++;
        if(frames == 5) frames = 0;
    }
    
    
    
    
}
