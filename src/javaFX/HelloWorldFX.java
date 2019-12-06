package javaFX;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorldFX extends Application {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub

        final StackPane stackpane = new StackPane();
        Label label = new Label("Hello world java ");
        stackpane.getChildren().add(label);
        primaryStage.setScene(new Scene(stackpane, 250, 75));
        primaryStage.setTitle("First gui");
        primaryStage.show();
    }

}
