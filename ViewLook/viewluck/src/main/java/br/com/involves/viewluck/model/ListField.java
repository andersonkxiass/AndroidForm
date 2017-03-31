package br.com.involves.viewluck.model;

import java.util.ArrayList;
import java.util.List;

import br.com.involves.viewluck.components.FormType;

/**
 * Created by andersonk on 29/03/17.
 */

public class ListField extends BaseField{

    List<String> options = new ArrayList<>();

    public ListField(FormType formType, String label) {
        super(formType, label);
    }

    public ListField(FormType formType, String label, List<String> options) {
        super(formType, label);
        this.options = options;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }
}