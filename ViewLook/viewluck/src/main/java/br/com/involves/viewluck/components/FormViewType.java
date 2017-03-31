package br.com.involves.viewluck.components;

/**
 * Created by andersonk on 21/03/17.
 */

public abstract class FormViewType<T> {

    private T model;

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }
}