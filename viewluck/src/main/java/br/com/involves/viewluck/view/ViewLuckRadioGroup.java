package br.com.involves.viewluck.view;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

import br.com.involves.viewluck.R;
import br.com.involves.viewluck.components.FieldRadioButton;
import br.com.involves.viewluck.databinding.ViewluckRadiogroupBinding;
import br.com.involves.viewluck.model.ViewLuck;
import br.com.involves.viewluck.viewmodel.SingleChoiceAction;
import br.com.involves.viewluck.viewmodel.SingleChoiceBindAdapterVM;
import br.com.involves.viewluck.viewmodel.SingleChoiceVM;

/**
 * Created by andersonk on 16/03/17.
 */

public class ViewLuckRadioGroup extends LinearLayoutCompat implements ViewLuck<FieldRadioButton> {

    private FieldRadioButton model;
    private ViewluckRadiogroupBinding binding;

    public ViewLuckRadioGroup(Context context) {
        super(context);
        init(context);
    }

    public ViewLuckRadioGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {
        binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.viewluck_radiogroup, this, true);
    }

    @Override
    public void setModel(FieldRadioButton model) {
        this.model = model;


        RecyclerViewWithClick recyclerViewWithClick = null;

        recyclerViewWithClick.setOnItemClickListener(new RecyclerViewWithClick.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerViewWithClick recyclerView, int position, View v) {

            }
        });

        recyclerViewWithClick.setOnItemLongClickListener(new RecyclerViewWithClick.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClicked(RecyclerViewWithClick recyclerView, int position, View v) {
                return false;
            }
        });

        SingleChoiceVM singleChoiceVM = new SingleChoiceVM();
        SingleChoiceAction singleChoiceAction = new SingleChoiceAction();
        SingleChoiceBindAdapterVM singleChoiceBindAdapterVM = new SingleChoiceBindAdapterVM();

        singleChoiceVM.setFieldLabel(model.getLabel());
        singleChoiceVM.setFieldModel(model);
        singleChoiceVM.setLayoutManager(new GridLayoutManager(getContext(), 2));

        binding.setVm(singleChoiceVM);
        binding.setAction(singleChoiceAction);
        binding.setAdapter(singleChoiceBindAdapterVM);
    }

    @Override
    public FieldRadioButton getModel() {
        return model;
    }

    public void updateModel(FieldRadioButton model) {
    }
}