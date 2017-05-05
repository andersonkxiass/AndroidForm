package br.com.involves.viewluck.components;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import br.com.involves.viewluck.model.FieldOption;

/**
 * Created by andersonk on 29/03/17.
 */
public class FormBuilder {

    private List<FieldView> formEntries = new ArrayList<>();
    private BuildType buildType = BuildType.SINGLE;
    private List<Object> objectList = new ArrayList<>();

    public FormBuilder() {
    }

    public void addMultiChoiceField(String label, String[] options) {

        FieldCheckBox fieldCheckBox = new FieldCheckBox();
        fieldCheckBox.setTagId(UUID.randomUUID());
        fieldCheckBox.setLabel(label);

        List<FieldOption> fieldOptions = new ArrayList<>();

        for( String opt : options){
            fieldOptions.add(new FieldOption(opt, false));
        }

        fieldCheckBox.setValue(fieldOptions);

        formEntries.add(fieldCheckBox);
    }

    public void addSingleChoiceField(String label, String[] options) {

        FieldRadioButton fieldRadioButton = new FieldRadioButton();
        fieldRadioButton.setTagId(UUID.randomUUID());
        fieldRadioButton.setLabel(label);
        fieldRadioButton.setValue(Arrays.asList(options));

        formEntries.add(fieldRadioButton);
    }

    public void addDropListField(String label, String[] options) {

        FieldSpinner fieldSpinner = new FieldSpinner();
        fieldSpinner.setTagId(UUID.randomUUID());
        fieldSpinner.setLabel(label);
        fieldSpinner.setValue(Arrays.asList(options));

        formEntries.add(fieldSpinner);
    }

    public void addAttachFileField(String label) {
    }

    public void addDateField(String label) {
    }

    public void addInputTextField(String label) {
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

    public int formLength() {

        if (buildType == BuildType.SINGLE) {
            return 1;
        } else {
            return objectList.size();
        }
    }

    public List<FieldView> getFormEntries() {
        return formEntries;
    }

    public void setFormEntries(List<FieldView> formEntries) {
        this.formEntries = formEntries;
    }
}