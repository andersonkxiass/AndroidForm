package br.com.involves.viewluck.viewmodel;

import android.databinding.BaseObservable;

import java.util.ArrayList;
import java.util.List;

import br.com.involves.viewluck.components.FieldView;

/**
 * Created by andersonk on 01/05/17.
 */

public class FormItemViewModel extends BaseObservable {

    private List<FieldView> formEntries = new ArrayList<>();

    public FormItemViewModel() {
    }

    public FormItemViewModel(List<FieldView> formModel) {
        this.formEntries = formModel;
    }

    public List<FieldView> getFormModel() {
        return formEntries;
    }

    public void setFormModel(List<FieldView> formModel) {
        this.formEntries = formModel;
        notifyChange();
    }
}