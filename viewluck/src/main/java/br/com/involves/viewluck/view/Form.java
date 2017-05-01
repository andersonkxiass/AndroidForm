package br.com.involves.viewluck.view;

import android.content.Context;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import br.com.involves.viewluck.components.FormBuilder;
import br.com.involves.viewluck.model.BaseField;
import br.com.involves.viewluck.components.FormType;
import br.com.involves.viewluck.model.ListField;

/**
 * Created by andersonk on 16/03/17.
 */
public class Form extends LinearLayoutCompat {

    private List<View> components = new ArrayList<>();
    private FormBuilder formBuilder;

    public Form(Context context) {
        super(context);
        setOrientation(VERTICAL);
    }

    public Form(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOrientation(VERTICAL);
    }

    public void addBuilder(FormBuilder formBuilder) {

        for (BaseField field : formBuilder.getFieldList()) {

            if(field.getFormType() == FormType.MULTIPLE_CHOICE){
                addMultipleChoiceView(field.getLabel(), ((ListField)field).getOptions());
            }else if(field.getFormType() == FormType.SINGLE_CHOICE){
                addSingleChoiceView(field.getLabel(), ((ListField)field).getOptions());
            }else if(field.getFormType() == FormType.SPINNER){
                addSpinnerView(field.getLabel(), ((ListField)field).getOptions());
            }
        }
    }

    private void addMultipleChoiceView(String label, List<String> items) {

        ViewLuckMultipleChoice multipleChoice = new ViewLuckMultipleChoice(getContext());
        multipleChoice.setLabel(label);
        multipleChoice.populateAdapter(items);

        addView(multipleChoice);

        components.add(multipleChoice);
    }

    private void addSingleChoiceView(String label, List<String> items) {

        ViewLuckRadioGroup radioGroup = new ViewLuckRadioGroup(getContext());
        radioGroup.setLabel(label);
        radioGroup.populateItems(items);

        components.add(radioGroup);

        addView(radioGroup);
    }

    private void addInputTextView() {
    }

    private void addDateView() {
    }

    private void addSpinnerView(String label, List<String> items) {
        ViewLuckSpinner spinner = new ViewLuckSpinner(getContext());
        spinner.setLabel(label);
        spinner.populateItems(items);

        components.add(spinner);

        addView(spinner);
    }

    public List<View> getComponents() {
        return components;
    }

    public FormBuilder getFormBuilder() {
        return formBuilder;
    }

    public void setFormBuilder(FormBuilder formBuilder) {
        this.formBuilder = formBuilder;
        addBuilder(formBuilder);
    }
}