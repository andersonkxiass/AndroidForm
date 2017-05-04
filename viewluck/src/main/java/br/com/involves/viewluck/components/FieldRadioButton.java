package br.com.involves.viewluck.components;

import java.util.List;

import br.com.involves.viewluck.model.FieldOption;

/**
 * Created by andersonk on 03/05/17.
 */

public class FieldRadioButton extends FieldView<List<String>> {

    private FieldOption checked;

    public FieldRadioButton() {
        setEnabled(true);
        setVisibility(true);
        setFieldType(FieldType.SINGLE_CHOICE);
    }

    public FieldRadioButton(boolean enabled, boolean required, boolean visibility, List<String> value) {
        super(enabled, required, visibility, value);
        this.setFieldType(FieldType.SINGLE_CHOICE);
    }

    public FieldOption getChecked() {
        return checked;
    }

    public void setChecked(FieldOption checked) {
        this.checked = checked;
    }
}