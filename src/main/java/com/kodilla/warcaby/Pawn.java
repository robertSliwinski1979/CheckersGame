package com.kodilla.warcaby;

public class Pawn implements Figure {
    private final FigureColor color;

    @Override
    public FigureColor getColor() {
        return color;
    }

    public Pawn(FigureColor color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return (color == FigureColor.BLACK) ? "bP" : "wP";
    }
}
