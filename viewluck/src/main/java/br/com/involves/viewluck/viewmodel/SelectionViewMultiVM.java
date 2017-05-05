package br.com.involves.viewluck.viewmodel;

import android.databinding.BaseObservable;

import br.com.involves.viewluck.model.FieldOption;

/**
 * Created by andersonk on 04/05/17.
 */

public class SelectionViewMultiVM extends BaseObservable {

    private FieldOption model;

    public SelectionViewMultiVM() {
    }

    public SelectionViewMultiVM(FieldOption model) {
        this.model = model;
    }

    public FieldOption getModel() {
        return model;
    }

    public void setModel(FieldOption model) {
        this.model = model;
        notifyChange();
    }
}
