package br.com.involves.viewluck.viewmodel;

import android.databinding.BaseObservable;

import java.util.List;

import br.com.involves.viewluck.components.FieldView;
import br.com.involves.viewluck.components.FormBuilder;

/**
 * Created by andersonk on 01/05/17.
 */

public class FormItemViewModel extends BaseObservable {

    private List<FieldView> formEntries;
    private FormBuilder formBuilder;

    public FormItemViewModel(FormBuilder formBuilder) {
        this.formBuilder = formBuilder;
    }

    public FormItemViewModel(List<FieldView> formModel, FormBuilder formBuilder) {
        this.formEntries = formModel;
        this.formBuilder = formBuilder;
    }

    public List<FieldView> getFormModel() {
        return formEntries;
    }

    public void setFormModel(List<FieldView> formModel) {
        this.formEntries = formModel;
        //notifyChange();
    }

    public FormBuilder getFormBuilder() {
        return formBuilder;
    }

    public void setFormBuilder(FormBuilder formBuilder) {
        this.formBuilder = formBuilder;
    }
}