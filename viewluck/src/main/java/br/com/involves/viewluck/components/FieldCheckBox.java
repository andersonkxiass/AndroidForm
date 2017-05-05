package br.com.involves.viewluck.components;

import java.util.List;

import br.com.involves.viewluck.model.FieldOption;

/**
 * Created by andersonk on 03/05/17.
 */

public class FieldCheckBox extends FieldView<List<FieldOption>> {

    public FieldCheckBox() {
        setEnabled(true);
        setRequired(false);
        setVisibility(true);
        setFieldType(FieldType.MULTIPLE_CHOICE);
    }

    public FieldCheckBox(boolean enabled, boolean required, boolean visibility, List<FieldOption> value) {
        super(enabled, required, visibility, value);
        this.setFieldType(FieldType.MULTIPLE_CHOICE);
    }
}