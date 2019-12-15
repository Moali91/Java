package arrayLists;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class BankAccountGUI extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane border = new BorderPane();
        Scene scene = new Scene(border,500,500);

        VBox leftBox = new VBox();

        Label balance = new Label("Initial Balance");
        TextField initialBalance = new TextField();
        Label amount = new Label("Amount");
        TextField amountText = new TextField();
        Text text = new Text();
        leftBox.setPadding(new Insets(15,12,15,12));
        leftBox.setSpacing(8);
        leftBox.getChildren().addAll(balance,initialBalance,amount,amountText);


        HBox hBox = new HBox();
        hBox.setPadding(new Insets(15,12,15,12));
        hBox.setSpacing(8);
        TextArea textArea = new TextArea();
        textArea.setMinSize(50,50);
        border.setLeft(leftBox);

        hBox.getChildren().add(textArea);
        border.setBottom(hBox);


        primaryStage.setScene(scene);
        primaryStage.setTitle("Bank Account");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
