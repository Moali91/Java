package javaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class SwissFlag extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        StackPane stackPane = new StackPane();
        final Scene scene = new Scene(stackPane, 300, 300);

        Rectangle r1 = new Rectangle(200, 225, Color.RED);
        Rectangle r2Vert = new Rectangle(40,150,Color.WHITE);
        Rectangle r2Hor = new Rectangle(150,40, Color.WHITE);
        stackPane.getChildren().addAll(r1,r2Vert,r2Hor);
        stackPane.isResizable();


        primaryStage.setTitle("Welcome to Switzerland");
        primaryStage.setScene(scene);
        primaryStage.show();





    }
}
