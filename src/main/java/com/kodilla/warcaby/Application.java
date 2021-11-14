package com.kodilla.warcaby;


import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import static com.kodilla.warcaby.FigureColor.*;

public class Application  {
    public static void main(String[] args) {
        Board board = new Board();

        board.setFigure(2, 2, new Pawn(BLACK));
        board.setFigure(4, 3, new Pawn(WHITE));
        board.setFigure(7, 7, new Queen(BLACK));
        System.out.println(board);
        board.move(7,7,6,6);
        System.out.println(board);

        //board.start(Stage primaryStage);

    }

//    @Override
//    public void start(Stage primaryStage) throws Exception {
//                GridPane grid = new GridPane();
//
//        for (int row = 0; row < 8; row++) {
//            for (int col = 0; col < 8; col++) {
//                Rectangle rec = new Rectangle();
//                rec.setWidth(100);
//                rec.setHeight(100);
//                if((row+col)%2 == 0)rec.setFill(Color.BLACK);
//                else rec.setFill(Color.WHITESMOKE);
//
//                GridPane.setRowIndex(rec, row);
//                GridPane.setColumnIndex(rec, col);
//                grid.getChildren().addAll(rec);
//            }
//        }
//
//        Scene scene = new Scene(grid, 800, 800);
//
//        primaryStage.setTitle("Checker's Game");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
}
