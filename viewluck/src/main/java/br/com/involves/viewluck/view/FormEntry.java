package br.com.involves.viewluck.view;

import android.content.Context;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import br.com.involves.viewluck.components.FieldCheckBox;
import br.com.involves.viewluck.components.FieldRadioButton;
import br.com.involves.viewluck.components.FieldSpinner;
import br.com.involves.viewluck.components.FieldView;
import br.com.involves.viewluck.model.ViewLuck;

/**
 * Created by andersonk on 16/03/17.
 */
public class FormEntry extends LinearLayoutCompat {

    private List<ViewLuck> components = new ArrayList<>();
    private List<FieldView> data = new ArrayList<>();

    public FormEntry(Context context) {
        super(context);
        setOrientation(VERTICAL);
    }

    public FormEntry(Context context, AttributeSet attrs) {
        super(context, attrs);
        setOrientation(VERTICAL);
    }

    public void addChildView(ViewLuck child){
        addView((View)child);
        components.add(child);
    }

    public List<ViewLuck> getComponents() {
        return components;
    }

    public FieldView getDataFromComponentByTagId(UUID tagId) {

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

        //updating view data and state
        for (FieldView fieldView : data) {

            View component = findComponentByTagId(fieldView.getTagId());

            if (component instanceof ViewLuckMultipleChoice) {
                ViewLuckMultipleChoice multipleChoice = (ViewLuckMultipleChoice) component;
                multipleChoice.updateModel((FieldCheckBox) fieldView);

            } else if (component instanceof ViewLuckRadioGroup) {
                ViewLuckRadioGroup singleChoice = (ViewLuckRadioGroup) component;
                singleChoice.updateModel((FieldRadioButton) fieldView);

            } else if (component instanceof ViewLuckSpinner) {
                ViewLuckSpinner spinner = (ViewLuckSpinner) component;
                spinner.updateModel((FieldSpinner) fieldView);
            }
        }
    }
}