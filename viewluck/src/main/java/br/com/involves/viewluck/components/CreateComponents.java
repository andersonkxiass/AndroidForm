package br.com.involves.viewluck.components;

import br.com.involves.viewluck.view.FormEntry;
import br.com.involves.viewluck.view.ViewLuckMultipleChoice;
import br.com.involves.viewluck.view.ViewLuckRadioGroup;
import br.com.involves.viewluck.view.ViewLuckSpinner;

/**
 * Created by andersonk on 01/05/17.
 */

public class CreateComponents {

    private FormEntry rootView;

    public CreateComponents(FormEntry rootView) {
        this.rootView = rootView;
    }

    public ViewLuckMultipleChoice createMultipleChoiceView(FieldCheckBox fieldCheckBox) {

        ViewLuckMultipleChoice multipleChoice = new ViewLuckMultipleChoice(rootView.getContext());
        multipleChoice.setTag(fieldCheckBox.getTagId());
        multipleChoice.setModel(fieldCheckBox);
        rootView.addView(multipleChoice);

        return multipleChoice;
    }

    public ViewLuckRadioGroup createSingleChoiceView(FieldRadioButton fieldRadioButton) {

        ViewLuckRadioGroup radioGroup = new ViewLuckRadioGroup(rootView.getContext());
        radioGroup.setTag(fieldRadioButton.getTagId());
        radioGroup.setModel(fieldRadioButton);
        rootView.addView(radioGroup);

        return radioGroup;
    }

    public ViewLuckSpinner createSpinnerView(FieldSpinner fieldSpinner) {
        ViewLuckSpinner spinner = new ViewLuckSpinner(rootView.getContext());
        spinner.setTag(fieldSpinner.getTagId());
        spinner.setModel(fieldSpinner);
        rootView.addView(spinner);

        return spinner;
    }

    public void createInputTextView() {
    }

    public void createDateView() {
    }
}