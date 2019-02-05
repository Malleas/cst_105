package CST105.Week7;/**
 * All work is created by Matt Sievers on 02-04-2019 for use in CST-105
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Random;

public class ColorAndFont extends Application {

  private ArrayList<Double> colorList;

  public static void main(String[] args) {
    launch(args);
  }


  @Override
  public void start(Stage primaryStage) {
    randomColor();
    Color color1 = new Color(colorList.get(0), colorList.get(1), colorList.get(2), colorList.get(3));
    Color color2 = new Color(colorList.get(4), colorList.get(5), colorList.get(6), colorList.get(7));
    Color color3 = new Color(colorList.get(8), colorList.get(9), colorList.get(10), colorList.get(11));
    Color color4 = new Color(colorList.get(12), colorList.get(13), colorList.get(14), colorList.get(15));
    Color color5 = new Color(colorList.get(16), colorList.get(17), colorList.get(18), colorList.get(19));
    Color color6 = new Color(colorList.get(20), colorList.get(21), colorList.get(22), colorList.get(23));
    Pane pane = new HBox(10);
    pane.setPadding(new Insets(75, 75, 75, 75));
    Text text1 = new Text("CST105");
    text1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
    text1.setFill(color1);
    text1.setRotate(90);
    Text text2 = new Text("CST105");
    text2.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
    text2.setFill(color2);
    text2.setRotate(90);
    Text text3 = new Text("CST105");
    text3.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
    text3.setFill(color3);
    text3.setRotate(90);
    Text text4 = new Text("CST105");
    text4.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
    text4.setFill(color4);
    text4.setRotate(90);
    Text text5 = new Text("CST105");
    text5.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
    text5.setFill(color5);
    text5.setRotate(90);
    Text text6 = new Text("CST105");
    text6.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
    text6.setFill(color6);
    text6.setRotate(90);
    pane.getChildren().addAll(text1,text2, text3, text4, text5, text6);
    Scene scene = new Scene(pane, 600, 200);
    primaryStage.setTitle("Color and Font");
    primaryStage.setScene(scene);
    primaryStage.show();

  }

  public void randomColor() {
    ArrayList<Double> list = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i < 6; i++){
      double r = random.nextDouble();
      double g = random.nextDouble();
      double b = random.nextDouble();
      double opacity = random.nextDouble();
      list.add(r);
      list.add(g);
      list.add(b);
      list.add(opacity);
    }
    this.colorList = list;
  }
}
