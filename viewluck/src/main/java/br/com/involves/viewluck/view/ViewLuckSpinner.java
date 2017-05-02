package br.com.involves.viewluck.view;

import android.content.Context;
import android.support.v7.widget.AppCompatSpinner;
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
public class ViewLuckSpinner extends LinearLayoutCompat {

    private View rootView;
    private AppCompatSpinner spinner;
    private AppCompatTextView txtLabel;
    private ArrayAdapter<String> adapter;

    public ViewLuckSpinner(Context context) {
        super(context);
        init(context);
        configureAdapter();
    }

    public ViewLuckSpinner(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
        configureAdapter();
    }

    private void configureAdapter() {

        adapter = new ArrayAdapter<>(getContext(),
                android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
    }

    private void init(Context context) {

        rootView = inflate(context, R.layout.viewluck_dropdownlist, this);
        spinner = (AppCompatSpinner) rootView.findViewById(R.id.spinner);
        txtLabel = (AppCompatTextView) rootView.findViewById(R.id.txt_label);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getContext(), "Position " + position + " Clicked!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void setLabel(String label) {
        txtLabel.setText(label);
    }

    public void populateItems(List<String> options) {
        adapter.addAll(options);
    }
}