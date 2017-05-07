package br.com.involves.viewluck.view.viewholder;

import android.support.v7.widget.RecyclerView;

import java.util.List;

import br.com.involves.viewluck.components.CreateComponents;
import br.com.involves.viewluck.components.FieldCheckBox;
import br.com.involves.viewluck.components.FieldRadioButton;
import br.com.involves.viewluck.components.FieldSpinner;
import br.com.involves.viewluck.components.FieldType;
import br.com.involves.viewluck.components.FieldView;
import br.com.involves.viewluck.components.FormBuilder;
import br.com.involves.viewluck.databinding.FormItemBinding;
import br.com.involves.viewluck.viewmodel.FormItemViewModel;

/**
 * Created by andersonk on 29/03/17.
 */

public class FormViewHolder extends RecyclerView.ViewHolder {

    private FormItemBinding binding;

    public FormViewHolder(FormItemBinding itemView, FormBuilder formBuilder) {
        super(itemView.getRoot());
        this.binding = itemView;

        attachChildViews(itemView, formBuilder);
    }

    private void attachChildViews(FormItemBinding itemView, FormBuilder formBuilder) {

        CreateComponents createComponents = new CreateComponents(itemView.form);

        if (formBuilder != null) {

            for (FieldView field : formBuilder.getFormEntries()) {

                if (field.getFieldType() == FieldType.MULTIPLE_CHOICE) {
                    createComponents.createMultipleChoiceView((FieldCheckBox) field);
                } else if (field.getFieldType() == FieldType.SINGLE_CHOICE) {
                    createComponents.createSingleChoiceView((FieldRadioButton) field);
                } else if (field.getFieldType() == FieldType.SPINNER) {
                    createComponents.createSpinnerView((FieldSpinner) field);
                }
            }
        }
    }

    public void bindDataModel(List<FieldView> formEntries) {

        if (binding.getVm() == null) {
            FormItemViewModel viewModel = new FormItemViewModel(formEntries);
            binding.setVm(viewModel);
        } else {
            binding.getVm().setFormModel(formEntries);
        }
    }
}