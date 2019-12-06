package javaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MyName extends Application {
    @Override



    public void start(Stage primaryStage) throws Exception {

        StackPane stackPane = new StackPane();
        Scene scene = new Scene(stackPane, 300, 300);
        Image image = new Image(getClass().getResourceAsStream("lion.jpg"));
       //Image im = new Image("lion.jpg",50,50, false ,false);
        Label label = new Label("Hi my name is Mohammed");
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(50);
        imageView.setFitWidth(50);
        label.setGraphic(imageView);
        stackPane.getChildren().addAll(label);
        primaryStage.setTitle("Samurai");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
