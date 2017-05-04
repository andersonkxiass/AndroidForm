package br.com.involves.viewluck.components;

import java.util.List;

import br.com.involves.viewluck.model.FieldOption;

/**
 * Created by andersonk on 03/05/17.
 */

public class FieldSpinner extends FieldView<List<String>> {

    private FieldOption checked;

    public FieldSpinner() {
        setEnabled(true);
        setVisibility(true);
        setFieldType(FieldType.SPINNER);
    }

    public FieldSpinner(boolean enabled, boolean required, boolean visibility, List<String> value) {
        super(enabled, required, visibility, value);
        this.setFieldType(FieldType.SPINNER);
    }

    public FieldOption getChecked() {
        return checked;
    }

    public void setChecked(FieldOption checked) {
        this.checked = checked;
    }
}