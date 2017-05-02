package br.com.involves.viewluck.components;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.involves.viewluck.model.BaseField;
import br.com.involves.viewluck.model.FormModel;
import br.com.involves.viewluck.model.FormModelMulti;
import br.com.involves.viewluck.model.FormModelSimple;
import br.com.involves.viewluck.model.ListField;

/**
 * Created by andersonk on 29/03/17.
 */

public class FormBuilder {

    private List<FormModel> formModels = new ArrayList<>();
    private List<BaseField> fieldList = new ArrayList<>();
    private BuildType buildType = BuildType.SINGLE;
    private List<Object> objectList = new ArrayList<>();

    public FormBuilder() {
    }

    public void addInputTextField(String label) {
        fieldList.add(new BaseField(FormType.INPUT_TEXT, label));
        formModels.add(new FormModelSimple());
    }

    public void addMultiChoiceField(String label, String[] options) {
        fieldList.add(new ListField(FormType.MULTIPLE_CHOICE, label, Arrays.asList(options)));
        formModels.add(new FormModelMulti());
    }

    public void addSingleChoiceField(String label, String[] options) {
        fieldList.add(new ListField(FormType.SINGLE_CHOICE, label, Arrays.asList(options)));
        formModels.add(new FormModelSimple());
    }

    public void addAttachFileField(String label) {

    }

    public void addDateField(String label) {

    }

    public void addDropListField(String label, String[] options) {
        fieldList.add(new ListField(FormType.SPINNER, label, Arrays.asList(options)));
        formModels.add(new FormModelSimple());
    }

    public List<FormModel> getFormModels() {
        return formModels;
    }

    public List<BaseField> getFieldList() {
        return fieldList;
    }

    public void setFormType(BuildType buildType) {
        this.buildType = buildType;
    }

    public BuildType getBuildType() {
        return buildType;
    }

    public void forObjectList(List<Object> objectList) {
        this.objectList = objectList;
    }

    public List<Object> getObjectList() {
        return objectList;
    }
}