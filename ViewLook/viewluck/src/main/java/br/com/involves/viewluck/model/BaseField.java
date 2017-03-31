package br.com.involves.viewluck.model;

import br.com.involves.viewluck.components.FormType;

/**
 * Created by andersonk on 29/03/17.
 */

public class BaseField{

    FormType formType;
    String label;

    public BaseField(FormType formType, String label) {
        this.formType = formType;
        this.label = label;
    }

    public FormType getFormType() {
        return formType;
    }

    public void setFormType(FormType formType) {
        this.formType = formType;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}