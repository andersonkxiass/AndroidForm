package br.com.involves.viewluck.components;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andersonk on 03/05/17.
 */

public class FieldCheckBox extends FieldView<List<String>> {

    private List<Integer> checkedPositions = new ArrayList<>();

    public FieldCheckBox() {
        setEnabled(true);
        setVisibility(true);
        setFieldType(FieldType.MULTIPLE_CHOICE);
    }

    public FieldCheckBox(boolean enabled, boolean visibility, List<String> value) {
        super(enabled, visibility, value);
        this.setFieldType(FieldType.MULTIPLE_CHOICE);
    }
}