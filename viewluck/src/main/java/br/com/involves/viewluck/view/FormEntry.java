package br.com.involves.viewluck.view;

import android.content.Context;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import br.com.involves.viewluck.components.CreateComponents;
import br.com.involves.viewluck.components.FormBuilder;
import br.com.involves.viewluck.model.BaseField;
import br.com.involves.viewluck.components.FormType;
import br.com.involves.viewluck.model.ListField;

/**
 * Created by andersonk on 16/03/17.
 */
public class FormEntry extends LinearLayoutCompat {

    private List<View> components = new ArrayList<>();
    private FormBuilder formBuilder;
    private CreateComponents createComponents;

    public FormEntry(Context context) {
        super(context);
        setOrientation(VERTICAL);
        init();
    }

    public FormEntry(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOrientation(VERTICAL);
        init();
    }

    private void init(){
        createComponents = new CreateComponents(this);
    }

    public void addBuilder(FormBuilder formBuilder) {

        if(formBuilder != null) {

            for (BaseField field : formBuilder.getFieldList()) {

                if (field.getFormType() == FormType.MULTIPLE_CHOICE) {
                    addMultipleChoiceView(field.getLabel(), ((ListField) field).getOptions());
                } else if (field.getFormType() == FormType.SINGLE_CHOICE) {
                    addSingleChoiceView(field.getLabel(), ((ListField) field).getOptions());
                } else if (field.getFormType() == FormType.SPINNER) {
                    addSpinnerView(field.getLabel(), ((ListField) field).getOptions());
                }
            }
        }
    }

    private void addMultipleChoiceView(String label, List<String> items) {
        ViewLuckMultipleChoice multipleChoice = createComponents.createMultipleChoiceView(label, items);
        components.add(multipleChoice);
    }

    private void addSingleChoiceView(String label, List<String> items) {
        ViewLuckRadioGroup radioGroup = createComponents.createSingleChoiceView(label, items);
        components.add(radioGroup);
    }

    private void addInputTextView() {
    }

    private void addDateView() {
    }

    private void addSpinnerView(String label, List<String> items) {
        ViewLuckSpinner spinner = createComponents.createSpinnerView(label, items);
        components.add(spinner);
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