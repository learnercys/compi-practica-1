package net.learner.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;

/**
 * @author learnercys on 8/20/15.
 */
public class CustomCanvasView extends View {
    private ShapeDrawable mDrawable;
    private Shape shape;
    private ArrayList<Shape> shapes;


    public CustomCanvasView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);

        /*int x = 10;
        int y = 10;
        int width = 300;
        int height = 50;

        mDrawable = new ShapeDrawable(new OvalShape());
        mDrawable.getPaint().setColor(0xff74AC23);
        mDrawable.setBounds(x, y, x + width, y + height);*/

    }

    protected void onDraw(Canvas canvas) {
        //mDrawable.draw(canvas);
        if ( shape != null )  {
            System.out.println("shape not null, drawing");
            switch (shape.getType()) {
                case "circle":
                    drawCircle();
                    break;

                case "square":
                    drawSquare();
                    break;

                case "rectangle":
                    drawRectangle();
                    break;

                case "line":
                    break;

                case "polygon":
                    break;
            }

            mDrawable.draw(canvas);
        } else {
            System.out.println("shape null");
        }
    }

    public void drawCircle (   ) {
        ArrayList<Integer> values = shape.getValues();

        int
                x = values.get(0),
                y = values.get(1),
                height = values.get(2),
                width = values.get(2);

        mDrawable = new ShapeDrawable(new OvalShape());
        mDrawable.getPaint().setColor(getColor(shape.getColor()));
        mDrawable.setBounds(x, y, x + width, y + height);

    }

    public void drawSquare() {
        ArrayList<Integer> values = shape.getValues();

        int
                x = values.get(0),
                y = values.get(1),
                sides = values.get(2);

        mDrawable = new ShapeDrawable();
        mDrawable.getPaint().setColor(getColor(shape.getColor()));
        mDrawable.setBounds(x, y, x + sides, y + sides);
    }

    public void drawRectangle() {
        ArrayList<Integer> values = shape.getValues();

        int
                x = values.get(0),
                y = values.get(1),
                height = values.get(2),
                width = values.get(3);

        mDrawable = new ShapeDrawable();
        mDrawable.getPaint().setColor(getColor(shape.getColor()));
        mDrawable.setBounds(x, y, x + height, y + width);
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    private int getColor(String color) {
        System.out.println("color: " + color);
        switch (color) {
            case "azul": return Color.BLUE;
            case "rojo": return Color.RED;
            case "verde": return Color.GREEN;
            case "amarillo": return Color.YELLOW;
            case "naranja": return Color.rgb(255,165,0);
            case "morado": return Color.rgb(128,0,128);
            case "cafe": return Color.rgb(165,42,42);
            case "negro": return Color.BLACK;
            default: return Color.rgb(255,222,173);
        }
    }


}
