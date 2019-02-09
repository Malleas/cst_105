package Final_Project;/**
 * All work is created by Matt Sievers on 02-06-2019 for use in CST-105
 */

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.text.FontWeight;


public class NFLDraftApp extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    BorderPane borderPane = new BorderPane();
    PlayerRoster roster = new PlayerRoster();
    NFL_Player_Manager manager = new NFL_Player_Manager();
    manager.createPlayers(3, OffensivePlayer.class);
    manager.createPlayers(3, DefensivePlayer.class);


    GridPane centerPane = new GridPane();
    ObservableList<NFL_Player> playerList = FXCollections.observableArrayList(manager.getPlayers());
    ListView<NFL_Player> playerListView = new ListView<>();
    playerListView.setItems(playerList);
    ListView<NFL_Player> rosterListView = new ListView<>();
    centerPane.setHgap(25);
    centerPane.setVgap(10);
    centerPane.setPadding(new Insets(20));
    centerPane.setAlignment(Pos.CENTER);
    Pane playerListTitleBox = new HBox(10);
    Text playerTitle = new Text("Player List");
    playerTitle.setFont(Font.font("Times New Roman", FontWeight.BOLD, 22));
    playerTitle.setFill(Color.BLUE);
    ((HBox) playerListTitleBox).setAlignment(Pos.CENTER);
    playerListTitleBox.getChildren().add(playerTitle);
    Pane rosterListTitleBox = new HBox(10);
    Text rosterTitle = new Text("Roster");
    rosterTitle.setFont(Font.font("Times New Roman", FontWeight.BOLD, 22));
    rosterTitle.setFill(Color.BLUE);
    ((HBox) rosterListTitleBox).setAlignment(Pos.CENTER);
    rosterListTitleBox.getChildren().add(rosterTitle);
    Pane addPlayerHelpBox = new HBox(10);
    Text addPlayerHelpText = new Text("Add a player by double clicking on a player in the Player List");
    addPlayerHelpText.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 14));
    addPlayerHelpText.setFill(Color.RED);
    addPlayerHelpBox.getChildren().add(addPlayerHelpText);
    ((HBox) addPlayerHelpBox).setAlignment(Pos.CENTER);
    Pane removePlayerHelpBox = new HBox(10);
    Text removePlayerHelpText = new Text("Remove a player by double clicking on a player in the Roster");
    removePlayerHelpText.setFont(Font.font("Times New Roman", FontPosture.ITALIC, 14));
    removePlayerHelpText.setFill(Color.RED);
    removePlayerHelpBox.getChildren().add(removePlayerHelpText);
    ((HBox) removePlayerHelpBox).setAlignment(Pos.CENTER);
    centerPane.add(playerListTitleBox, 0, 0);
    centerPane.add(playerListView, 0, 1);
    centerPane.add(addPlayerHelpBox, 0, 2);
    centerPane.add(rosterListTitleBox, 1, 0);
    centerPane.add(rosterListView, 1, 1);
    centerPane.add(removePlayerHelpBox, 1, 2);

    playerListView.setOnMouseClicked(new EventHandler<MouseEvent>() {

      @Override
      public void handle(MouseEvent click) {

        if (click.getClickCount() == 2) {
          NFL_Player currentItemSelected = playerListView.getSelectionModel()
                  .getSelectedItem();
          ObservableList<NFL_Player> rosterList = FXCollections.observableArrayList(currentItemSelected);
          rosterListView.setItems(rosterList);
          playerListView.getItems().remove(currentItemSelected);

        }
      }
    });
    rosterListView.setOnMouseClicked(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent click) {
        if (click.getClickCount() == 2) {
          NFL_Player currentlItemSelected = rosterListView.getSelectionModel().getSelectedItem();
          playerListView.getItems().add(currentlItemSelected);
          rosterListView.getItems().remove(currentlItemSelected);
        }
      }
    });

    GridPane leftPane = new GridPane();
    ImageView nflLogo = new ImageView("Final_Project/NFL Logo.jpg");
    leftPane.setAlignment(Pos.TOP_LEFT);
    leftPane.setVgap(30);
    leftPane.setPadding(new Insets(20));
    leftPane.add(nflLogo, 0, 0);


    borderPane.setLeft(leftPane);
    borderPane.setCenter(centerPane);


    Scene scene = new Scene(borderPane);
    primaryStage.setTitle("ShowGridPane");
    primaryStage.setScene(scene);
    primaryStage.show();
  }


}

