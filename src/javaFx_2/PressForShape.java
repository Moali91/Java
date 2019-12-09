package javaFx_2;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;



public class PressForShape extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        final GridPane grid = new GridPane();
        Scene scene = new Scene(grid,700,500);
        Label label = new Label("Press C for Circle and R for Rectangle!, and Q to quit");

        label.setFont(Font.font("Arial", 16));
        grid.add(label,0,0,2,1);

        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                // OR we can use if statement, but i have chosen switch statement, just to practice
                switch (event.getText()){
                    case "R":
                        Rectangle r1 = new Rectangle(100,100, Color.color(Math.random(),Math.random(),Math.random()));
                        grid.add(r1,1,1);
                        break;
                    case "C":
                        Circle c1 = new Circle(100,Color.color(Math.random(),Math.random(),Math.random()));
                        grid.add(c1,2,2);
                        break;
                    case "Q":
                        grid.getChildren().clear();
                        grid.add(label,0,0,2,1);
                        break;
                }
            }
        });

        primaryStage.setTitle("Press for shape");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
