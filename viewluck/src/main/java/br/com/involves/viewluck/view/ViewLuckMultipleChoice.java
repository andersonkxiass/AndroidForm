package br.com.involves.viewluck.view;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;

import java.util.List;

import br.com.involves.viewluck.R;

/**
 * Created by andersonk on 28/03/17.
 */
public class ViewLuckMultipleChoice extends LinearLayoutCompat {

    private View rootView;
    private GridView gridView;
    private AppCompatTextView txtLabel;
    private ArrayAdapter<String> adapter;

    public ViewLuckMultipleChoice(Context context) {
        super(context);
        init(context);
        configureAdapter();
    }

    public ViewLuckMultipleChoice(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
        configureAdapter();
    }

    private void configureAdapter() {

        adapter = new ArrayAdapter<>(getContext(),
                android.R.layout.simple_list_item_multiple_choice);

        gridView.setAdapter(adapter);
    }

    private void init(Context context) {

        rootView = inflate(context, R.layout.viewluck_checkbox, this);
        gridView = (GridView) rootView.findViewById(R.id.gd_multiple_choice);
        txtLabel = (AppCompatTextView) rootView.findViewById(R.id.txt_label);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), "Position " + position + " Clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void setLabel(String label) {
        txtLabel.setText(label);
    }

    public void populateAdapter(List<String> options) {
        adapter.addAll(options);
    }
}