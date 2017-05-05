package br.com.involves.viewluck.viewmodel;

import android.databinding.Bindable;
import android.databinding.ObservableField;
import android.support.v7.widget.RecyclerView;

import br.com.involves.viewluck.BR;
import br.com.involves.viewluck.components.FieldCheckBox;

/**
 * Created by andersonk on 30/04/17.
 */

public class MultiChoiceViewModel extends BaseViewModel<FieldCheckBox> {

    private final ObservableField<String> fieldLabel = new ObservableField<>();
    private final ObservableField<FieldCheckBox> fieldModel = new ObservableField<>();
    private RecyclerView.LayoutManager layoutManager;

    public MultiChoiceViewModel() {
    }

    @Override
    public void setFieldValue(FieldCheckBox content) {
        this.fieldModel.set(content);
    }

    @Override
    @Bindable
    public void setFieldLabel(String fieldLabel) {
        this.fieldLabel.set(fieldLabel);
        notifyPropertyChanged(BR.fieldLabel);
    }

    @Override
    public ObservableField getFieldLabel() {
        return fieldLabel;
    }

    public RecyclerView.LayoutManager getLayoutManager() {
        return layoutManager;
    }

    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        this.layoutManager = layoutManager;
    }

    public ObservableField<FieldCheckBox> getFieldModel() {
        return fieldModel;
    }
}