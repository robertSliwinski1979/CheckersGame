package com.kodilla.warcaby;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class Board extends Application{
    private List<BoardRow> rows = new ArrayList<>();
    private final Image whitePawn = new Image("file:resources/whitePawn.png");
    //private final Image blackPawn = new Image("file:resources/blackPawn.png");
    //private final FlowPane cards = new FlowPane(Orientation.HORIZONTAL);

    public static void main(String[] args) {
        launch(args);
    }

    public Board(){
        for (int i =0;i<8;i++){
            rows.add(new BoardRow());
        }
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        BackgroundSize backgroundSize = new BackgroundSize(1600, 900, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(whitePawn, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);


        GridPane grid = new GridPane();


        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                Rectangle rec = new Rectangle();
                rec.setWidth(100);
                rec.setHeight(100);
                if((row+col)%2 == 0)rec.setFill(Color.BLUE);
                else rec.setFill(Color.WHITESMOKE);

                GridPane.setRowIndex(rec, row);
                GridPane.setColumnIndex(rec, col);
                grid.getChildren().addAll(rec);
            }
        }
        FileInputStream input = new FileInputStream("C:\\Users\\Robert\\IdeaProjects\\Warcaby\\src\\main\\resources\\blackPawn.png");
        Image image = new Image(input);
        Image image1 = new Image(input);

        ImageView blackPawn = new ImageView(image);
        ImageView blackPawn1 = new ImageView(image1);

        blackPawn.setFitHeight(80);
        blackPawn.setFitWidth(80);
        blackPawn1.setFitHeight(80);
        blackPawn1.setFitWidth(80);


        Group g = new Group();
        //blackPawn1.setTranslateX(0);
       // blackPawn1.setTranslateY(0);
        //blackPawn.setTranslateX(100);
        //blackPawn.setTranslateY(100);
        blackPawn.setX(100);
        blackPawn.setY(100);
        blackPawn1.setY(0);
        blackPawn1.setX(0);
        g.getChildren().addAll(blackPawn,blackPawn1);


//        blackPawn.setLayoutX(500);
//        blackPawn.setLayoutY(10);
//        blackPawn.setX(1);
//        blackPawn.setY(5);
        grid.getChildren().add(blackPawn);
        //HBox hbox = new HBox(blackPawn);


//        ImageView blackPawn = new ImageView(new Image("file:resources/blackPawn.png"));
//        blackPawn.setFitWidth(80);
//        blackPawn.setFitHeight(80);
//        grid.add(blackPawn,5,5);

       // grid.getChildren().add(blackPawn);
//        grid.setAlignment(Pos.CENTER);
//        grid.setPadding(new Insets(11, 11, 11, 11));
//        grid.setHgap(5);
//        grid.setVgap(5);
//        grid.setBackground(background);

        ImageView img = new ImageView(whitePawn);
        //ImageView img2 = new ImageView(blackPawn);



//        cards.getChildren().add(img);
//        cards.getChildren().add(img2);
//
//        grid.add(cards, 4, 4, 4, 4);//0031

        Scene scene = new Scene(grid, 800, 800); //800 800

        primaryStage.setTitle("Checker's Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public Figure getFigure(int col, int row){
        return rows.get(row).getCols().get(col);
    }
    public void move (int col1, int row1, int col2, int row2){
        Figure figure = getFigure(col1,row1);
        setFigure(col2,row2,figure);
        setFigure(col1,row1, new None());
    }

    public void setFigure (int col, int row, Figure figure){
        rows.get(row).getCols().set(col, figure);
    }

    @Override
    public String toString(){
        String s = "|-----------------------|\n";
        for(BoardRow row : rows)	s += row.toString()+"\n";
        s += "|-----------------------|\n";
        return s;
    }
}
