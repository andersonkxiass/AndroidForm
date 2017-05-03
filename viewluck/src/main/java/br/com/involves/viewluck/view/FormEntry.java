package br.com.involves.viewluck.view;

import android.content.Context;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import br.com.involves.viewluck.components.CreateComponents;
import br.com.involves.viewluck.components.FieldCheckBox;
import br.com.involves.viewluck.components.FieldRadioButton;
import br.com.involves.viewluck.components.FieldSpinner;
import br.com.involves.viewluck.components.FieldType;
import br.com.involves.viewluck.components.FieldView;
import br.com.involves.viewluck.components.FormBuilder;

/**
 * Created by andersonk on 16/03/17.
 */
public class FormEntry extends LinearLayoutCompat {

    private List<ViewLuck> components = new ArrayList<>();
    private FormBuilder formBuilder;
    private CreateComponents createComponents;
    private List<FieldView> data = new ArrayList<>();

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

    private void init() {
        createComponents = new CreateComponents(this);
    }

    public void addBuilder(FormBuilder formBuilder) {

        if (formBuilder != null) {

            for (FieldView field : formBuilder.getFormEntries()) {

                if (field.getFieldType() == FieldType.MULTIPLE_CHOICE) {

                    ViewLuckMultipleChoice multipleChoice = createComponents.createMultipleChoiceView((FieldCheckBox) field);
                    components.add(multipleChoice);

                } else if (field.getFieldType() == FieldType.SINGLE_CHOICE) {

                    ViewLuckRadioGroup radioGroup = createComponents.createSingleChoiceView((FieldRadioButton) field);
                    components.add(radioGroup);

                } else if (field.getFieldType() == FieldType.SPINNER) {

                    ViewLuckSpinner spinner = createComponents.createSpinnerView((FieldSpinner) field);
                    components.add(spinner);
                }
            }
        }
    }

    private void addInputTextView() {
    }

    private void addDateView() {
    }

    public List<ViewLuck> getComponents() {
        return components;
    }

    public FormBuilder getFormBuilder() {
        return formBuilder;
    }

    public void setFormBuilder(FormBuilder formBuilder) {
        this.formBuilder = formBuilder;
        addBuilder(formBuilder);
    }

    public FieldView getComponentDataByTagId(UUID tagId) {

        for (ViewLuck view : components) {
            boolean result = ((View) view).getTag().equals(tagId);

            if (result) {
                return (FieldView) view.getModel();
            }
        }

        return null;
    }

    public View findComponentByTagId(UUID tagId) {

        for (ViewLuck view : components) {
            boolean result = ((View) view).getTag().equals(tagId);

            if (result) {
                return (View) view;
            }
        }

        return null;
    }

    public List<FieldView> getData() {
        return data;
    }

    public void setData(List<FieldView> data) {
        this.data = data;

        for (FieldView fieldView : data) {

            View component = findComponentByTagId(fieldView.getTagId());

            if (component instanceof ViewLuckMultipleChoice) {
                ViewLuckMultipleChoice multipleChoice = (ViewLuckMultipleChoice) component;
                multipleChoice.setModel((FieldCheckBox) fieldView);

            } else if (component instanceof ViewLuckRadioGroup) {
                ViewLuckRadioGroup singleChoice = (ViewLuckRadioGroup) component;
                singleChoice.setModel((FieldRadioButton) fieldView);

            } else if (component instanceof ViewLuckSpinner) {
                ViewLuckSpinner spinner = (ViewLuckSpinner) component;
                spinner.setModel((FieldSpinner) fieldView);
            }
        }
    }
}