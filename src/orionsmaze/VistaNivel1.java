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
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;
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
        super();
        this.bg=new Background(0, 0, 1800, 860, new Image("Images/fondoN1.jpg"));
        this.bgInverted=new Background(0, 0, 1800, 860, new Image("Images/fondoN1invertido.jpg"));
        this.player = new Player(300, 331, 29, 38, 20, new Image("Images/down1.png"));
        this.floor= new StaticObject(0, 370, 650, 200, new Image("Images/alienfloor1_normal.jpg"));
        
        StaticObject plataforma0=new StaticObject(495, 355, 50, 10, new Image("Images/alienfloor2_diffuse.jpg")); //Los terminos x, y deben ser el x, y
        this.objects.add(plataforma0);                                        //del jugador + o - multiplos de quince para que las colisiones se registren 
        
        
    }
    
    
    
    @Override
    public void handle(long now){
        
        if(frames % 2 == 0){
            pencil.clearRect(0, 0, 2000, 2000);
            
            for(int n=0; n<8; n++){
            pencil.drawImage(floor.getSprite(), floor.getxPos()+(649*(n-1)), floor.getyPos(), floor.getWidth(), floor.getHeight());

            if(n%2==0){
            pencil.drawImage(bg.getSprite(), bg.getxPos()+(1799*n), bg.getyPos(), bg.getWidth(), bg.getHeight());
            } else pencil.drawImage(bgInverted.getSprite(), bgInverted.getxPos()+(1919*n), bgInverted.getyPos(), bgInverted.getWidth(), bgInverted.getHeight());
            }
            
            
            for(StaticObject object:this.objects){
                if(object.getxPos()+object.getWidth()>=0)
                pencil.fillRect(object.getxPos(), object.getyPos(), object.getWidth(), object.getHeight());
                pencil.drawImage(object.getSprite(), object.getxPos(), object.getyPos(), object.getWidth(), object.getHeight());
            }
            
            //Aqui dibuja el rectangulo de la cabeza
            pencil.fillRect(player.getxPos(), player.getyPos(), player.getWidth(), player.getHeadHeight());
            //Aquí dibuja el rectangulo del cuerpo
            pencil.fillRect(player.getxPos(), player.getyPos()+player.getHeadHeight(), player.getWidth(), player.getHeight()-player.getHeadHeight());
            
            pencil.drawImage(player.getSprite(), player.getxPos(), player.getyPos());
            
            
        }
        frames++;
        if(frames == 5) frames = 0;
    }
    
    
    
    
}
