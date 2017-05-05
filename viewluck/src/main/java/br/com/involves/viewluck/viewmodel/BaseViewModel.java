package br.com.involves.viewluck.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;

import java.util.List;

import br.com.involves.viewluck.components.FieldView;
import br.com.involves.viewluck.model.FieldOption;

/**
 * Created by andersonk on 30/04/17.
 */

public abstract class BaseViewModel <M extends FieldView> extends BaseObservable{

    protected M model;
    public abstract void setFieldValue(M content);
    public abstract void setFieldLabel(String fieldLabel);
    public abstract ObservableField getFieldLabel();
}