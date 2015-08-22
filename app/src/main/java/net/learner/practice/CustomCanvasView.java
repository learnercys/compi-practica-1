package net.learner.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
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
    }

    protected void onDraw(Canvas canvas) {
        //mDrawable.draw(canvas);
        if ( shape != null )  {
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
                    drawLine(canvas);
                    return;

                case "polygon":
                    drawPolygon(canvas);
                    return;
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

    public void drawLine ( Canvas canvas) {
        ArrayList<Integer> values = shape.getValues();

        float
                x1 = values.get(0),
                y1 = values.get(1),
                x2 = values.get(2),
                y2 = values.get(3);


        Paint paint = new Paint();
        paint.setColor(getColor(shape.getColor()));
        canvas.drawLine(x1, y1, x2, y2, paint);
    }

    public void drawPolygon( Canvas canvas) {

        ArrayList<Integer> values = shape.getValues();

        int
                x = values.get(0),
                y = values.get(1),
                height = values.get(2),
                width = values.get(3),
                sides = values.get(4),
                radius = height < width ? height / 2 : width / 2;

        Paint paint = new Paint();
        paint.setColor(getColor(shape.getColor()));

        Path path = new Path();

        float
                // find centers
                xCenter = (x + height) / 2,
                yCenter = (y + width) / 2,
                fx = 0,
                fy = 0,

                // find angle between points
                angle = 360 / sides,

                cAngle = 0;

        for (int side =1; side <= sides; side++) {

            float
                    cx,
                    cy;

            if (cAngle == 0) {
                fx = cx = xCenter + radius; fy = cy = yCenter;
                path.moveTo(cx, cy);
            } else {
                cx = (float)(xCenter + radius * Math.cos(cAngle / 57.2957795));
                cy = (float)(yCenter - radius * Math.sin(cAngle / 57.2957795));
                path.lineTo(cx, cy);
            }
            System.out.println("cx: " + cx);
            System.out.println("cy: " + cy);
            cAngle += angle;
        }

        // to finish in the started
        path.lineTo(fx,fy);

        canvas.drawPath(path, paint);
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
