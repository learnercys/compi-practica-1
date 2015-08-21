package net.learner.practice;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
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
        // TODO hide the canvas and show the table
    }

    public void setShape(ArrayList<Shape> shapes) {
        // TODO hide the table and sow the canvas
    }
}
