package br.com.involves.viewluck.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;
import android.support.v7.widget.RecyclerView;

import br.com.involves.viewluck.components.FieldRadioButton;

/**
 * Created by andersonk on 07/05/17.
 */

public class SingleChoiceVM extends BaseObservable {

    private final ObservableField<String> fieldLabel = new ObservableField<>();
    private final ObservableField<FieldRadioButton> fieldModel = new ObservableField<>();
    private RecyclerView.LayoutManager layoutManager;

    public SingleChoiceVM() {
    }

    public ObservableField<String> getFieldLabel() {
        return fieldLabel;
    }

    public void setFieldLabel(String fieldLabel) {
        this.fieldLabel.set(fieldLabel);
    }

    public FieldRadioButton getFieldModel() {
        return fieldModel.get();
    }

    public void setFieldModel(FieldRadioButton fieldModel) {
        this.fieldModel.set(fieldModel);
    }

    public RecyclerView.LayoutManager getLayoutManager() {
        return layoutManager;
    }

    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        this.layoutManager = layoutManager;
    }
}
