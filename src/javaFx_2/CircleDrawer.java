package javaFx_2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CircleDrawer extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane borderPane = new BorderPane();

        Text title = new Text("Circle Drawer");
        title.setFont(Font.font("Impact",20));
        title.setFill(Color.WHITE);

        HBox topHbox = new HBox();
        topHbox.getChildren().add(title);
        topHbox.setPadding(new Insets(15,12,15,12));
        topHbox.setSpacing(10);
        topHbox.setStyle("-fx-background-color: #336699");

        borderPane.setTop(topHbox);

        Label text1 = new Label("Red");
        Label text2 = new Label("Green");
        Label text3 = new Label("Blue");
        Label text4 = new Label("Radius");


        TextField rgb1 = new TextField();
        TextField rgb2 = new TextField();
        TextField rgb3 = new TextField();
        TextField radius = new TextField();

        Button draw = new Button("Draw!");
        Button random = new Button("Random");
        Button delete = new Button("Delete");



        VBox vBox = new VBox();
        vBox.setPadding(new Insets(15,12,15,12));
        vBox.setSpacing(8);
        vBox.getChildren().addAll(text1,rgb1,text2,rgb2,text3,rgb3,text4,radius,draw,random,delete);

        StackPane showStack = new StackPane();
        borderPane.setLeft(vBox);

        draw.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    int r1 = Integer.parseInt(rgb1.getText());
                    int r2 = Integer.parseInt(rgb2.getText());
                    int r3 = Integer.parseInt(rgb3.getText());
                    int rad = Integer.parseInt(radius.getText());
                    if(r1 <= 255 && r2 <=255 && r3 <=255) {
                        Circle c1 = new Circle(rad, Color.rgb(r1, r2, r3));
                        showStack.getChildren().clear();
                        showStack.getChildren().addAll(c1);
                        borderPane.setCenter(showStack);
                    } else{
                        Text error = new Text("Colors can't be bigger then 255");
                        showStack.getChildren().clear();
                        showStack.getChildren().add(error);
                        borderPane.setCenter(showStack);
                    }
                } catch (NumberFormatException e){
                    Text error = new Text("Letters are not allowed, plese enter only positive numbers");
                    showStack.getChildren().clear();
                    showStack.getChildren().add(error);
                    borderPane.setCenter(showStack);
                } catch (IllegalArgumentException e){
                    Text error = new Text("Please enter only positive numbers");
                    showStack.getChildren().clear();
                    showStack.getChildren().add(error);
                    borderPane.setCenter(showStack);
                }

            }
        });

        random.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Circle c2 = new Circle(50,Color.color(Math.random(),Math.random(),Math.random()));
                showStack.getChildren().clear();
                showStack.getChildren().addAll(c2);
                borderPane.setCenter(showStack);
            }
        });

        delete.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showStack.getChildren().clear();
            }
        });



        Scene scene = new Scene(borderPane,500,500);
        primaryStage.setTitle("Circle Drawer");
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(new Image(FlagChanger.class.getResourceAsStream("circle.png")));
        primaryStage.show();

    }
}
