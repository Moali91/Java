package javaFx_2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class FlagChanger extends Application {
    private Boolean showSwiss = false;
    private Boolean showJapan = false;
    private Boolean showGer = false;

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



        StackPane stakePane = new StackPane();

        Rectangle swissRed = new Rectangle(200,200,Color.RED);
        Rectangle swissHori= new Rectangle(120,36,Color.WHITE);
        Rectangle swissVert = new Rectangle(36,120,Color.WHITE);

        StackPane swissFlag = new StackPane();
        swissFlag.getChildren().addAll(swissRed,swissHori,swissVert);


        Circle japanCircle = new Circle(50,Color.RED);
        Rectangle japanRect = new Rectangle(200,200,Color.WHITE);

        StackPane japanFlag = new StackPane();
        japanFlag.getChildren().addAll(japanRect,japanCircle);


        Rectangle gerBlack = new Rectangle(225,50,Color.rgb(0,0,0));
        Rectangle gerRed = new Rectangle(225,50,Color.rgb(255,0,0));
        Rectangle gerYellow = new Rectangle(225,50,Color.rgb(255,204,0));

        final StackPane stackGer = new StackPane();
        VBox germanFlag = new VBox();
        germanFlag.getChildren().addAll(gerBlack,gerRed,gerYellow);
        germanFlag.setAlignment(Pos.CENTER);
        stackGer.getChildren().addAll(germanFlag);

        Button gerBu = new Button("Germany");


        VBox vBox = new VBox();
        vBox.setPadding(new Insets(15,12,15,12));
        vBox.setSpacing(8);
        vBox.getChildren().addAll(swissBu,japanBu, gerBu);


        borderPane.setLeft(vBox);
        borderPane.setCenter(stakePane);



        gerBu.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                borderPane.setCenter(stackGer);
                showSwiss = false;
                showJapan = false;
                if(!showGer){
                    germanFlag.setVisible(true);
                    showGer = true;
                } else {
                    germanFlag.setVisible(false);
                    showGer = false;
                }
            }
        });



        japanBu.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                borderPane.setCenter(japanFlag);
                showSwiss = false;
                showGer = false;
                if(!showJapan){
                    japanFlag.setVisible(true);
                    showJapan = true;
                } else {
                    japanFlag.setVisible(false);
                    showJapan = false;
                }
            }
        });

        swissBu.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                borderPane.setCenter(swissFlag);
                showJapan = false;
                showGer = false;
                if(!showSwiss){
                    swissFlag.setVisible(true);
                    showSwiss = true;
                } else {
                    swissFlag.setVisible(false);
                    showSwiss = false;
                }
            }
            });




        Scene scene = new Scene(borderPane,500,500);
        primaryStage.setTitle("Flag Changer");
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(new Image(FlagChanger.class.getResourceAsStream("flag.png")));
        primaryStage.show();
    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}
