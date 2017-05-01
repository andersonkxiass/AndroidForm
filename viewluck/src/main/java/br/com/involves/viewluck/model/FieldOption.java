package br.com.involves.viewluck.model;

/**
 * Created by andersonk on 30/04/17.
 */

public class FieldOption {

    private String label;
    private boolean checked;

    public FieldOption() {
    }

    public FieldOption(String label, boolean checked) {
        this.label = label;
        this.checked = checked;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}