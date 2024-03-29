package DesignPatterns.StructuralPattern.AdapterPattern.Adapter;

import DesignPatterns.StructuralPattern.AdapterPattern.Round.RoundPeg;
import DesignPatterns.StructuralPattern.AdapterPattern.Square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {


    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg){
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;

        result =(Math.sqrt(Math.pow((peg.getWidth() / 2),2)* 2));

        return  result;
    }
}
