package br.com.involves.viewluck.components;

import java.util.UUID;

/**
 * Created by andersonk on 03/05/17.
 */

public abstract class FieldView<T> {

    private UUID tagId;
    private boolean enabled;
    private boolean visibility;
    private T value;
    private String label;
    private FieldType fieldType;

    public FieldView() {
    }

    public FieldView(boolean enabled, boolean visibility, T value) {
        this.enabled = enabled;
        this.visibility = visibility;
        this.value = value;
    }

    public UUID getTagId() {
        return tagId;
    }

    public void setTagId(UUID tagId) {
        this.tagId = tagId;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isVisibility() {
        return visibility;
    }

    public void setVisibility(boolean visibility) {
        this.visibility = visibility;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public FieldType getFieldType() {
        return fieldType;
    }

    public void setFieldType(FieldType fieldType) {
        this.fieldType = fieldType;
    }
}