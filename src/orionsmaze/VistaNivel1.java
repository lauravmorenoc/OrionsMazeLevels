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
 * @author Laura M
 */
public class VistaNivel1 extends Vista{

    public VistaNivel1(){
        this.bg=new Background(0, 0, new Image("fondoN1.jpg"));
    }
    
    public void handle(long now){
      //  StaticObject plataforma=new StaticObject();
        if(frames % 3 == 0){
            pencil.clearRect(0, 0, 2000, 2000);
            pencil.drawImage(bg.getSprite(), bg.getxPos(), bg.getyPos());
            for(StaticObject object:this.objetos){
                if(object.getRangoX()[1]>=0)
                pencil.drawImage(object.getSprite(), object.getxPos(), object.getyPos());
            }
            //Hacer lo mismo para todos los objetos que van en el nivel

        }
        frames++;
        if(frames == 5) frames = 0;
    }
    
    
    
    
}
