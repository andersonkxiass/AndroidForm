package br.com.involves.viewluck.components;

import java.util.List;

import br.com.involves.viewluck.view.Form;
import br.com.involves.viewluck.view.ViewLuckMultipleChoice;
import br.com.involves.viewluck.view.ViewLuckRadioGroup;
import br.com.involves.viewluck.view.ViewLuckSpinner;

/**
 * Created by andersonk on 01/05/17.
 */

public class CreateComponents {

    private Form rootView;

    public CreateComponents(Form rootView) {
        this.rootView = rootView;
    }

    public ViewLuckMultipleChoice createMultipleChoiceView(String label, List<String> items) {

        ViewLuckMultipleChoice multipleChoice = new ViewLuckMultipleChoice(rootView.getContext());
        multipleChoice.setLabel(label);
        multipleChoice.populateAdapter(items);

        rootView.addView(multipleChoice);

        return multipleChoice;
    }

    public ViewLuckRadioGroup createSingleChoiceView(String label, List<String> items) {

        ViewLuckRadioGroup radioGroup = new ViewLuckRadioGroup(rootView.getContext());
        radioGroup.setLabel(label);
        radioGroup.populateItems(items);

        rootView.addView(radioGroup);

        return radioGroup;
    }

    public void createInputTextView() {
    }

    public void createDateView() {
    }

    public ViewLuckSpinner createSpinnerView(String label, List<String> items) {
        ViewLuckSpinner spinner = new ViewLuckSpinner(rootView.getContext());
        spinner.setLabel(label);
        spinner.populateItems(items);

        rootView.addView(spinner);

        return spinner;
    }
}