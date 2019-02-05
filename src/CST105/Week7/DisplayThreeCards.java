package CST105.Week7;/**
 * All work is created by Matt Sievers on 02-04-2019 for use in CST-105
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Collections;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;

public class DisplayThreeCards extends Application {

  private ArrayList<String> cardFiles;


  public static void main(String[] args) {
    Application.launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    createCards();
    System.out.println(cardFiles.get(0));
    System.out.println(cardFiles.get(1));
    System.out.println(cardFiles.get(2));
    Pane pane = new HBox(10);
    pane.setPadding(new Insets(5, 5, 5, 5));
    ImageView card1 = new ImageView(cardFiles.get(0));
    pane.getChildren().add(card1);
    ImageView card2 = new ImageView(cardFiles.get(1));
    pane.getChildren().add(card2);
    ImageView card3 = new ImageView(cardFiles.get(2));
    pane.getChildren().add(card3);
    Scene scene = new Scene(pane);
    primaryStage.setTitle("Top 3 cards");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public void createCards() {
    int[] cardArray = new int[52];
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < cardArray.length; i++) {
      cardArray[i] = i;
      list.add(i);
    }
    Collections.shuffle(list);
    int firstCard = list.get(0);
    int secondCard = list.get(1);
    int thirdCard = list.get(2);
    String firstFile = ("CST105/Week7/DeckOfCardsFiles/" + firstCard + ".png");
    String secondFile = ("CST105/Week7/DeckOfCardsFiles/" + secondCard + ".png");
    String thirdFile = ("CST105/Week7/DeckOfCardsFiles/" + thirdCard + ".png");
    ArrayList<String> fileList = new ArrayList<>();
    fileList.add(firstFile);
    fileList.add(secondFile);
    fileList.add(thirdFile);
    this.cardFiles = fileList;
  }


}
