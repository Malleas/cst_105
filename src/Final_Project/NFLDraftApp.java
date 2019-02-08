package Final_Project;/**
 * All work is created by Matt Sievers on 02-06-2019 for use in CST-105
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Button;
import javafx.scene.shape.Rectangle;
import javafx.scene.control.TextField;



public class NFLDraftApp extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    BorderPane borderPane = new BorderPane();
    PlayerRoster roster = new PlayerRoster();



    GridPane bottomPane = new GridPane();
    bottomPane.setHgap(10);
    Button addPlayerBtn = new Button("Add Player");
    TextField addPlayerTextField = new TextField();
    Text addPlayerHelpText = new Text("Add Player By Using PlayerId");
    addPlayerHelpText.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 14));
    addPlayerHelpText.setFill(Color.RED);
    bottomPane.add(addPlayerBtn, 0, 0);
    bottomPane.add(addPlayerTextField, 1, 0);
    bottomPane.add(addPlayerHelpText, 2, 0);
    Pane pane = new HBox(10);
    pane.getChildren().add(bottomPane);
    ((HBox) pane).setAlignment(Pos.CENTER);


    GridPane centerPane = new GridPane();
    centerPane.setHgap(10);
    centerPane.setAlignment(Pos.CENTER);
    centerPane.setPadding(new Insets(20));
    StackPane offensivePlayersStackPane = new StackPane();
    StackPane defensivePlayersStackPane = new StackPane();
    Rectangle offensiveBox = new Rectangle(500, 500);
    offensiveBox.setFill(Color.LIGHTGRAY);
    offensiveBox.setStroke(Color.BLUE);
    Rectangle defensiveBox = new Rectangle(500, 500);
    defensiveBox.setFill(Color.LIGHTGRAY);
    defensiveBox.setStroke(Color.BLUE);
    Text offensivePlayers = new Text("Offensive Players");
    offensivePlayers.setFont(Font.font("Times New Roman", FontWeight.BOLD, 22));
    offensivePlayers.setFill(Color.BLACK);
    Text defensivePlayers = new Text("Defensive Players");
    defensivePlayers.setFont(Font.font("Times New Roman", FontWeight.BOLD, 22));
    defensivePlayers.setFill(Color.BLACK);
    Pane oPlayerHbox = new HBox(10);
    Pane dPlayerHbox = new HBox(10);
    oPlayerHbox.getChildren().add(offensivePlayers);
    ((HBox) oPlayerHbox).setAlignment(Pos.TOP_CENTER);
    dPlayerHbox.getChildren().add(defensivePlayers);
    ((HBox) dPlayerHbox).setAlignment(Pos.TOP_CENTER);
    offensivePlayersStackPane.getChildren().addAll(offensiveBox, oPlayerHbox);
    defensivePlayersStackPane.getChildren().addAll(defensiveBox, dPlayerHbox);
    centerPane.add(offensivePlayersStackPane, 0, 0);
    centerPane.add(defensivePlayersStackPane, 1, 0);

    GridPane leftPane = new GridPane();
    ImageView nflLogo = new ImageView("Final_Project/NFL Logo.jpg");
    Button rosterBtn = new Button("Roster");
    leftPane.setAlignment(Pos.TOP_LEFT);
    leftPane.setVgap(30);
    leftPane.setPadding(new Insets(20));
    leftPane.add(nflLogo, 0,0);
    leftPane.add(rosterBtn, 0, 5);
    rosterBtn.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        StackPane playerRoster = new StackPane();
        playerRoster.setPadding(new Insets(20));
        Rectangle rosterBox = new Rectangle(500, 500);
        rosterBox.setFill(Color.LIGHTGRAY);
        rosterBox.setStroke(Color.BLUE);
        Pane rosterHbox = new HBox(10);
        Text rosterText = new Text("Roster");
        rosterText.setFont(Font.font("Times New Roman", FontWeight.BOLD, 22));
        rosterText.setFill(Color.BLACK);
        rosterHbox.getChildren().add(rosterText);
        playerRoster.getChildren().addAll(rosterBox, rosterHbox);
        ((HBox) rosterHbox).setAlignment(Pos.TOP_CENTER);

        GridPane rosterLeftPane = new GridPane();
        ImageView nflLogo = new ImageView("Final_Project/NFL Logo.jpg");
        rosterLeftPane.setAlignment(Pos.TOP_LEFT);
        rosterLeftPane.setVgap(30);
        rosterLeftPane.setPadding(new Insets(20));
        rosterLeftPane.add(nflLogo, 0,0);


        BorderPane roster = new BorderPane();
        roster.setLeft(rosterLeftPane);
        roster.setCenter(playerRoster);


        Scene secondScene = new Scene(roster);
        Stage newWindow = new Stage();
        newWindow.setTitle("Second Stage");
        newWindow.setScene(secondScene);
        newWindow.show();
      }
    });

    borderPane.setBottom(pane);
    borderPane.setLeft(leftPane);
    borderPane.setCenter(centerPane);



    Scene scene = new Scene(borderPane);
    primaryStage.setTitle("ShowGridPane");
    primaryStage.setScene(scene);
    primaryStage.show();
  }



}

