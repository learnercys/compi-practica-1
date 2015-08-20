package net.learner.practice;

import java.util.ArrayList;

/**
 * @author learnercys on 8/20/15.
 */
public class Shape {

    private ArrayList<Integer> values;
    private String color;
    private String type;

    public Shape() {
        values = new ArrayList<>();
    }

    public void addValue(Integer value) {
        values.add(value);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

}
