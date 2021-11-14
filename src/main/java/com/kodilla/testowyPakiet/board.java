package com.kodilla.testowyPakiet;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class board extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 300, 300, Color.BLACK);

        Rectangle r = new Rectangle(25, 25, 250, 250);
        r.setFill(Color.BLUE);

        root.getChildren().add(r);
        primaryStage.setTitle("BlackJack");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
//    public static void main(String[] args) {
//        GridPane pane = new GridPane();
//
//        // Create 64 rectangles and add to pane
//        int count = 0;
//        double s = 100; // side of rectangle
//        for (int i = 0; i < 8; i++) {
//            count++;
//            for (int j = 0; j < 8; j++) {
//                Rectangle r = new Rectangle(s, s, s, s);
//                if (count % 2 == 0)
//                    r.setFill(Color.WHITE);
//                pane.add(r, j, i);
//                count++;
//            }
//        }
//
//        // Create a scene and place it in the stage
//        Scene scene = new Scene(pane);
//
//        primaryStage.setTitle("java2s.com");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//
//    }


