package com.kodilla.warcaby;

import java.util.ArrayList;
import java.util.List;

public class BoardRow {
    private List<Figure> cols = new ArrayList<>();

    public List<Figure> getCols() {
        return cols;
    }

    @Override
    public String toString() {
        String s = "|";
        for (Figure figure : cols)  s+= figure.toString()+"|";
        return s;
    }

    public BoardRow() {
        for (int i=0;i<8;i++){
            cols.add(new None());
        }

    }
}
