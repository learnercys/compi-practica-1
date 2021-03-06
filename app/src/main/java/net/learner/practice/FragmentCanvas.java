package net.learner.practice;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author learnercys on 16/08/15.

 */
public class FragmentCanvas extends Fragment implements View.OnClickListener {

    Button backBtn;
    CustomCanvasView customCanvasView;
    TableLayout errorList;
    View view;

    public FragmentCanvas() {

    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_canvas, container, false);

        // get compilation button
        backBtn = (Button) view.findViewById(R.id.back);

        // set listener to compilation button
        backBtn.setOnClickListener(this);

        // get the canvas
        customCanvasView = (CustomCanvasView) view.findViewById(R.id.customCanvas);

        // get the table
        errorList = (TableLayout) view.findViewById(R.id.errorList);

        // send view to pager adapter
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back:
                ((MainActivity)getActivity()).onBackButton();
                break;
        }
    }

    public void setErrors(ArrayList<HashMap<String,String>> errors) {

        customCanvasView.setVisibility(View.GONE);
        errorList.setVisibility(View.VISIBLE);

        errorList.removeAllViews();

        // table header
        TableRow header = new TableRow(getActivity());

        // title
        TextView titleElement = new TextView(getActivity());
        titleElement.setText("Elemento");
        header.addView(titleElement );

        // line
        TextView lineElement = new TextView(getActivity());
        lineElement.setText("Linea");
        header.addView(lineElement);

        // column
        TextView columnElement = new TextView(getActivity());
        columnElement.setText("Columna");
        header.addView(columnElement);

        errorList.addView(header);



        for( HashMap<String,String> error: errors) {
            System.out.println("new error: " + error.get("text"));

            // table error
            TableRow errorRow = new TableRow(getActivity());

            // title error
            TextView titleError = new TextView(getActivity());
            titleError.setText(error.get("text"));
            errorRow.addView(titleError);

            // line error
            TextView lineError= new TextView(getActivity());
            lineError.setText(error.get("line"));
            errorRow.addView(lineError);

            // column error
            TextView columnError = new TextView(getActivity());
            columnError.setText(error.get("column"));
            errorRow.addView(columnError);

            errorList.addView(errorRow);

        }

    }

    /**
     * hide the table and sow the canvas
     * @param shapes the shapes to draw
     */
    public void setShape(ArrayList<Shape> shapes) {
        customCanvasView.setVisibility(View.VISIBLE);
        errorList.setVisibility(View.GONE);

        for (Shape shape: shapes) {
            customCanvasView.setShape(shape);
            customCanvasView.invalidate();
        }
    }
}
