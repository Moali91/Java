package javaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class HelloWorldBobby extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane stackPane = new BorderPane();
        final Scene scene = new Scene(stackPane,100,100);
        Label label = new Label("Hello Bobby");
        stackPane.setCenter(label);
        //stackPane.getChildren().add(label);

        primaryStage.setTitle("HallO Bobb");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
