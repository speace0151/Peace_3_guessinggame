package peace_3_challenge1p1;
 
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

import javafx.stage.Stage;
 
public class Peace_3_challenge1p1 extends Application {
 
    public static void main(String[] args) {
        launch(args);
    }
 
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        Canvas canvas = new Canvas(300, 250);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        drawOcean(gc,0,100,1000,1000);
        drawSettingSun(gc,100,10,100);
        drawHouse(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    
    
    
    private void drawHouse(GraphicsContext gc) {
        gc.fillText("Drawing", 42, 42);
    }
    
    
    
    
    
    private void drawSettingSun(GraphicsContext gc,int x, int y, int d ){
      gc.setFill(Color.ORANGE);
      gc.fillOval(x,y,d,d);
    }
private void drawOcean(GraphicsContext gc,int x, int y, int w,int h){
    gc.setFill(Color.BLUE);
    gc.fillRoundRect(x,y,w,h,10,10);
}

}
