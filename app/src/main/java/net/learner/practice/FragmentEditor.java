package net.learner.practice;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * @author learnercys on 16/08/15.
 */
public class FragmentEditor extends Fragment implements View.OnClickListener {

    Button compileBtn;
    EditText toCompile;
    View view;

    public FragmentEditor() {

    }

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_editor, container, false);

        // get compilation button
        compileBtn = (Button) view.findViewById(R.id.compile);

        // set listener to compilation button
        compileBtn.setOnClickListener(this);

        // get text area
        toCompile = (EditText) view.findViewById(R.id.toCompile);

        // send view to pager adapter
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.compile:
                //fragmentEvents.onClickButton("compile");
                ((MainActivity)getActivity()).onCompileButton(toCompile.getText().toString());
                break;

            default:
                // I have no idea what the hell happen here.
        }
    }
}
