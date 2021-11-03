package com.kodilla.warcaby;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import static com.kodilla.warcaby.CheckersApp.TILE_SIZE;

public class Piece extends StackPane {

    private PieceColour type;

    public PieceColour getColour(){
        return type;
    }

    public Piece (PieceColour type, int x, int y){
        this.type = type;

        relocate(x*TILE_SIZE,y*TILE_SIZE);

        Ellipse backGround = new Ellipse(TILE_SIZE*0.31,TILE_SIZE*0.25);
        backGround.setFill(type==PieceColour.RED ? Color.RED: Color.GREEN);

        backGround.setStroke(Color.BLACK);
        backGround.setStrokeWidth(TILE_SIZE*0.03);

        backGround.setTranslateX((TILE_SIZE-TILE_SIZE*0.31*2)/2);
        backGround.setTranslateY((TILE_SIZE-TILE_SIZE*0.25*2)/2);

        getChildren().addAll(backGround);

    }
}
