package net.learner.practice;

import java.util.ArrayList;

/**
 * @author learnercys on 8/20/15.
 */
public class Shape {

    private ArrayList<Double> values;
    private String color;
    private String type;

    public Shape() {
        values = new ArrayList<>();
    }

    public void addValue(Double value) {
        values.add(value);
    }

    public ArrayList<Double> getValues () {
        return this.values;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor () {
        return this.color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType( ) {
        return this.type;
    }

}
