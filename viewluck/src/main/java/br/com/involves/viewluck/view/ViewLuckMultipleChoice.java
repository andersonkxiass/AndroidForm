package br.com.involves.viewluck.view;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;

import br.com.involves.viewluck.R;
import br.com.involves.viewluck.components.FieldCheckBox;
import br.com.involves.viewluck.databinding.ViewluckCheckboxBinding;
import br.com.involves.viewluck.viewmodel.MultiChoiceActions;
import br.com.involves.viewluck.viewmodel.MultiChoiceAdapter;
import br.com.involves.viewluck.viewmodel.MultiChoiceViewModel;

/**
 * Created by andersonk on 28/03/17.
 */
public class ViewLuckMultipleChoice extends LinearLayoutCompat implements ViewLuck<FieldCheckBox> {

    private MultiChoiceViewModel viewModel;
    private FieldCheckBox model;

    public ViewLuckMultipleChoice(Context context) {
        super(context);
        init(context);
    }

    public ViewLuckMultipleChoice(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {

        viewModel = new MultiChoiceViewModel();
        MultiChoiceActions actions = new MultiChoiceActions();
        MultiChoiceAdapter adapter = new MultiChoiceAdapter();

        ViewluckCheckboxBinding binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.viewluck_checkbox, this, true);
        binding.setVm(viewModel);
        binding.setActions(actions);
        binding.setAdapter(adapter);
    }

    @Override
    public FieldCheckBox getModel() {
        return model;
    }

    @Override
    public void setModel(FieldCheckBox model) {
        this.model = model;

        viewModel.setFieldLabel(model.getLabel());
        viewModel.setFieldValue(model.getValue());
    }
}