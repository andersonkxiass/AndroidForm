package br.com.involves.viewluck.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;

/**
 * Created by andersonk on 30/04/17.
 */

public abstract class BaseViewModel <T, M> extends BaseObservable{

    protected M model;

    public abstract void setFieldValue(T content);
    public abstract void setFieldLabel(String fieldLabel);
    public abstract ObservableField getFieldLabel();
    public abstract T getFieldValue();
}