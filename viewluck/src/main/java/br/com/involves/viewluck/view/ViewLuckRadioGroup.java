package br.com.involves.viewluck.view;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.v7.widget.AppCompatRadioButton;
import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioGroup;

import java.util.List;

import br.com.involves.viewluck.R;
import br.com.involves.viewluck.components.FieldRadioButton;

/**
 * Created by andersonk on 16/03/17.
 */

public class ViewLuckRadioGroup extends LinearLayoutCompat implements ViewLuck<FieldRadioButton> {

    private View rootView;
    private AppCompatTextView txtLabel;
    private RadioGroup radioGroup;
    private FieldRadioButton model;

    public ViewLuckRadioGroup(Context context) {
        super(context);
        init(context);
    }

    public ViewLuckRadioGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        rootView = inflate(context, R.layout.viewluck_radiogroup, this);
        txtLabel = (AppCompatTextView) rootView.findViewById(R.id.txt_label);
        radioGroup = (RadioGroup)rootView.findViewById(R.id.radio_group);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                //Toast.makeText(getContext(), "Position " + checkedId + " Clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setLabel(String label) {
        txtLabel.setText(label);
    }

    private void populateItems(List<String> options) {

        int index = 0;

        radioGroup.removeAllViews();

        for(String option : options){
            AppCompatRadioButton radioButton = new AppCompatRadioButton(getContext());
            radioButton.setText(option);
            radioButton.setId(index);
            radioGroup.addView(radioButton);
            index++;
        }
    }

    @Override
    public void setModel(FieldRadioButton model) {
        this.model = model;

        setLabel(model.getLabel());
        populateItems(model.getValue());
    }

    @Override
    public FieldRadioButton getModel() {
        return model;
    }
}