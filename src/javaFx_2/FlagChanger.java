package javaFx_2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class FlagChanger extends Application {
    Boolean flagIsSet = false;

    @Override
    public void start(Stage primaryStage) throws Exception {


        BorderPane borderPane = new BorderPane();

        Text title = new Text("Flags with Layout panes");
        title.setFill(Color.WHITE);
        HBox topHbox = new HBox();
        topHbox.getChildren().add(title);
        topHbox.setPadding(new Insets(15,12,15,12));
        topHbox.setSpacing(10);
        topHbox.setStyle("-fx-background-color: #336699");

        borderPane.setTop(topHbox);

        Button swissBu = new Button("Switzerland");
        Button japanBu = new Button("Japan");


        VBox vBox = new VBox();
        vBox.setPadding(new Insets(15,12,15,12));
        vBox.setSpacing(8);
        vBox.getChildren().addAll(swissBu,japanBu);

        borderPane.setLeft(vBox);

        StackPane stakePane = new StackPane();

        Rectangle swissFlag1 = new Rectangle(200,200,Color.RED);
        Rectangle swissFlag2 = new Rectangle(120,36,Color.WHITE);
        Rectangle swissFlag3 = new Rectangle(36,120,Color.WHITE);

        Circle japanFlag1 = new Circle(50,Color.RED);
        Rectangle japanFlag2 = new Rectangle(200,200,Color.WHITE);

        japanBu.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stakePane.getChildren().addAll(japanFlag2,japanFlag1);
                flagIsSet = true;
            }
        });

        swissBu.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(flagIsSet){
                }
                else {
                    stakePane.getChildren().addAll(swissFlag1, swissFlag2, swissFlag3);
                    flagIsSet = true;
                }
            }
        });





        borderPane.setCenter(stakePane);


        Scene scene = new Scene(borderPane,500,500);
        primaryStage.setTitle("Flag Changer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}
