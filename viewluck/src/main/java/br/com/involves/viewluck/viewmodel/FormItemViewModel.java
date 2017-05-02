package br.com.involves.viewluck.viewmodel;

import android.databinding.BaseObservable;

import br.com.involves.viewluck.components.FormBuilder;
import br.com.involves.viewluck.model.FormModel;

/**
 * Created by andersonk on 01/05/17.
 */

public class FormItemViewModel extends BaseObservable{

    private FormModel formModel;
    private FormBuilder formBuilder;

    public FormItemViewModel(FormBuilder formBuilder) {
        this.formBuilder = formBuilder;
    }

    public FormItemViewModel(FormModel formModel, FormBuilder formBuilder) {
        this.formModel = formModel;
        this.formBuilder = formBuilder;
    }

    public FormModel getFormModel() {
        return formModel;
    }

    public void setFormModel(FormModel formModel) {
        this.formModel = formModel;
    }

    public FormBuilder getFormBuilder() {
        return formBuilder;
    }

    public void setFormBuilder(FormBuilder formBuilder) {
        this.formBuilder = formBuilder;
    }
}
