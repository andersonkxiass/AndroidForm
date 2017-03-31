package br.com.involves.viewluck.components;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.involves.viewluck.model.BaseField;
import br.com.involves.viewluck.model.ListField;

/**
 * Created by andersonk on 29/03/17.
 */

public class FormBuilder {

    List<BaseField> fieldList = new ArrayList<>();

    public FormBuilder() {
    }

    public void addInputTextField(String label) {
        fieldList.add(new BaseField(FormType.INPUT_TEXT, label));
    }

    public void addMultiChoiceField(String label, String[] options) {
        fieldList.add(new ListField(FormType.MULTIPLE_CHOICE, label, Arrays.asList(options)));
    }

    public void addSingleChoiceField(String label, String[] options) {
        fieldList.add(new ListField(FormType.SINGLE_CHOICE, label, Arrays.asList(options)));
    }

    public void addAttachFileField(String label) {

    }

    public void addDateField(String label) {

    }

    public void addDropListField(String label, String[] options) {
        fieldList.add(new ListField(FormType.SPINNER, label, Arrays.asList(options)));
    }

    public List<BaseField> getFieldList() {
        return fieldList;
    }

    public void setFormType(BuildType questions) {
    }
}