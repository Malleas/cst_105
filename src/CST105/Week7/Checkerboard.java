package CST105.Week7;/**
 * All work is created by Matt Sievers on 02-04-2019 for use in CST-105
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.*;

public class Checkerboard extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {

    Pane pane = new FlowPane();
    Pane row1 = new FlowPane();
    Pane row2 = new FlowPane();
    Pane row3 = new FlowPane();
    Pane row4 = new FlowPane();
    Pane row5 = new FlowPane();
    Pane row6 = new FlowPane();
    Pane row7 = new FlowPane();
    Pane row8 = new FlowPane();
    ((FlowPane) row1).setOrientation(Orientation.HORIZONTAL);
    ((FlowPane) row1).setPrefWrapLength(250);
    ((FlowPane) row1).setAlignment(Pos.CENTER);
    ((FlowPane) row1).setHgap(0);
    ((FlowPane) row1).setVgap(0);
    ((FlowPane) row2).setOrientation(Orientation.HORIZONTAL);
    ((FlowPane) row2).setPrefWrapLength(250);
    ((FlowPane) row2).setAlignment(Pos.CENTER);
    ((FlowPane) row2).setHgap(0);
    ((FlowPane) row2).setVgap(0);
    ((FlowPane) row3).setOrientation(Orientation.HORIZONTAL);
    ((FlowPane) row3).setPrefWrapLength(250);
    ((FlowPane) row3).setAlignment(Pos.CENTER);
    ((FlowPane) row3).setHgap(0);
    ((FlowPane) row3).setVgap(0);
    ((FlowPane) row4).setOrientation(Orientation.HORIZONTAL);
    ((FlowPane) row4).setPrefWrapLength(250);
    ((FlowPane) row4).setAlignment(Pos.CENTER);
    ((FlowPane) row4).setHgap(0);
    ((FlowPane) row4).setVgap(0);
    ((FlowPane) row5).setOrientation(Orientation.HORIZONTAL);
    ((FlowPane) row5).setPrefWrapLength(250);
    ((FlowPane) row5).setAlignment(Pos.CENTER);
    ((FlowPane) row5).setHgap(0);
    ((FlowPane) row5).setVgap(0);
    ((FlowPane) row6).setOrientation(Orientation.HORIZONTAL);
    ((FlowPane) row6).setPrefWrapLength(250);
    ((FlowPane) row6).setAlignment(Pos.CENTER);
    ((FlowPane) row6).setHgap(0);
    ((FlowPane) row6).setVgap(0);
    ((FlowPane) row7).setOrientation(Orientation.HORIZONTAL);
    ((FlowPane) row7).setPrefWrapLength(250);
    ((FlowPane) row7).setAlignment(Pos.CENTER);
    ((FlowPane) row7).setHgap(0);
    ((FlowPane) row7).setVgap(0);
    ((FlowPane) row8).setOrientation(Orientation.HORIZONTAL);
    ((FlowPane) row8).setPrefWrapLength(250);
    ((FlowPane) row8).setAlignment(Pos.CENTER);
    ((FlowPane) row8).setHgap(0);
    ((FlowPane) row8).setVgap(0);


    pane.setPadding(new Insets(5));
    int horizontal = 25;
    int vertical = 25;
    for (int j = 0; j < 4; j++) {
      javafx.scene.shape.Rectangle blackRectangle = new javafx.scene.shape.Rectangle(horizontal, vertical);
      blackRectangle.setFill(javafx.scene.paint.Color.BLACK);
      javafx.scene.shape.Rectangle whiteRectangle = new javafx.scene.shape.Rectangle(horizontal, vertical);
      whiteRectangle.setFill(javafx.scene.paint.Color.WHITE);
      row1.getChildren().addAll(whiteRectangle, blackRectangle);
    }

    for (int j = 0; j < 4; j++) {
      javafx.scene.shape.Rectangle blackRectangle = new javafx.scene.shape.Rectangle(horizontal, vertical);
      blackRectangle.setFill(javafx.scene.paint.Color.BLACK);
      javafx.scene.shape.Rectangle whiteRectangle = new javafx.scene.shape.Rectangle(horizontal, vertical);
      whiteRectangle.setFill(javafx.scene.paint.Color.WHITE);
      row2.getChildren().addAll(blackRectangle, whiteRectangle);
    }
    for (int j = 0; j < 4; j++) {
      javafx.scene.shape.Rectangle blackRectangle = new javafx.scene.shape.Rectangle(horizontal, vertical);
      blackRectangle.setFill(javafx.scene.paint.Color.BLACK);
      javafx.scene.shape.Rectangle whiteRectangle = new javafx.scene.shape.Rectangle(horizontal, vertical);
      whiteRectangle.setFill(javafx.scene.paint.Color.WHITE);
      row3.getChildren().addAll(whiteRectangle, blackRectangle);
    }

    for (int j = 0; j < 4; j++) {
      javafx.scene.shape.Rectangle blackRectangle = new javafx.scene.shape.Rectangle(horizontal, vertical);
      blackRectangle.setFill(javafx.scene.paint.Color.BLACK);
      javafx.scene.shape.Rectangle whiteRectangle = new javafx.scene.shape.Rectangle(horizontal, vertical);
      whiteRectangle.setFill(javafx.scene.paint.Color.WHITE);
      row4.getChildren().addAll(blackRectangle, whiteRectangle);
    }
    for (int j = 0; j < 4; j++) {
      javafx.scene.shape.Rectangle blackRectangle = new javafx.scene.shape.Rectangle(horizontal, vertical);
      blackRectangle.setFill(javafx.scene.paint.Color.BLACK);
      javafx.scene.shape.Rectangle whiteRectangle = new javafx.scene.shape.Rectangle(horizontal, vertical);
      whiteRectangle.setFill(javafx.scene.paint.Color.WHITE);
      row5.getChildren().addAll(whiteRectangle, blackRectangle);
    }

    for (int j = 0; j < 4; j++) {
      javafx.scene.shape.Rectangle blackRectangle = new javafx.scene.shape.Rectangle(horizontal, vertical);
      blackRectangle.setFill(javafx.scene.paint.Color.BLACK);
      javafx.scene.shape.Rectangle whiteRectangle = new javafx.scene.shape.Rectangle(horizontal, vertical);
      whiteRectangle.setFill(javafx.scene.paint.Color.WHITE);
      row6.getChildren().addAll(blackRectangle, whiteRectangle);
    }
    for (int j = 0; j < 4; j++) {
      javafx.scene.shape.Rectangle blackRectangle = new javafx.scene.shape.Rectangle(horizontal, vertical);
      blackRectangle.setFill(javafx.scene.paint.Color.BLACK);
      javafx.scene.shape.Rectangle whiteRectangle = new javafx.scene.shape.Rectangle(horizontal, vertical);
      whiteRectangle.setFill(javafx.scene.paint.Color.WHITE);
      row7.getChildren().addAll(whiteRectangle, blackRectangle);
    }

    for (int j = 0; j < 4; j++) {
      javafx.scene.shape.Rectangle blackRectangle = new javafx.scene.shape.Rectangle(horizontal, vertical);
      blackRectangle.setFill(javafx.scene.paint.Color.BLACK);
      javafx.scene.shape.Rectangle whiteRectangle = new Rectangle(horizontal, vertical);
      whiteRectangle.setFill(Color.WHITE);
      row8.getChildren().addAll(blackRectangle, whiteRectangle);
    }
    pane.getChildren().addAll(row1, row2, row3, row4, row5, row6, row7, row8);
    ((FlowPane) pane).setOrientation(Orientation.HORIZONTAL);
    ((FlowPane) pane).setPrefWrapLength(250);
    ((FlowPane) pane).setAlignment(Pos.CENTER);
    ((FlowPane) pane).setHgap(0);
    ((FlowPane) pane).setVgap(0);
    Scene scene = new Scene(pane);
    primaryStage.setTitle("ShowGridPane");
    primaryStage.setScene(scene);
    primaryStage.show();
  }


}

