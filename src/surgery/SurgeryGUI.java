package surgery;

import arrayLists.BankAccount;
import arrayLists.Customer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SurgeryGUI extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Surgery surg = new Surgery("My Surgery");
        surg.init();

        BorderPane border = new BorderPane();
        Scene scene = new Scene(border,500,500);

        VBox leftBox = new VBox();


        Label nameLabel = new Label("Firstname");
        TextField nameText = new TextField();
        Label lastnameLabel = new Label("Lastname");
        TextField lastnameText = new TextField();

        Button checkButton = new Button("Check Vaccinations!");

        leftBox.setPadding(new Insets(16,12,15,12));
        leftBox.setSpacing(7);
        leftBox.getChildren().addAll(nameLabel,nameText,lastnameLabel,lastnameText,checkButton);


        Text title = new Text("Welcome to the Surgery");
        HBox topBox = new HBox();
        topBox.setPadding(new Insets(15,12,15,12));
        topBox.setSpacing(8);
        topBox.setStyle("-fx-background-color: #336699");
        topBox.getChildren().add(title);

        border.setLeft(leftBox);
        border.setTop(topBox);


        checkButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                StackPane stackPane = new StackPane();
                String str = "";
                if(!surg.isPatient(nameText.getText(),lastnameText.getText())){
                    str = "Invalid patient";
                }else if(surg.checkVacc(nameText.getText(),lastnameText.getText())==true){
                    str ="All vaccinations are up-to-date";
                }else {
                    str ="At least one vaccination is expired!";
                }
                Text text = new Text(str);
                stackPane.getChildren().clear();
                stackPane.getChildren().add(text);
                border.setCenter(stackPane);
            }
        });

        primaryStage.setScene(scene);
        primaryStage.setTitle("Surgery");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}

