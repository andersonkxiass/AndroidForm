package br.com.involves.viewluck.view.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import br.com.involves.viewluck.R;
import br.com.involves.viewluck.components.FieldView;
import br.com.involves.viewluck.components.FormBuilder;
import br.com.involves.viewluck.databinding.FormItemBinding;
import br.com.involves.viewluck.view.FormViewHolder;
import br.com.involves.viewluck.viewmodel.FormItemViewModel;

/**
 * Created by andersonk on 22/03/17.
 */

public class FormAdapter extends RecyclerView.Adapter<FormViewHolder> {

    private FormBuilder formBuilder;

    public FormAdapter(FormBuilder formBuilder) {
        this.formBuilder = formBuilder;
    }

    @Override
    public FormViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        FormItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.form_item, parent, false);

        binding.setVm(new FormItemViewModel());

        return new FormViewHolder(binding, formBuilder);
    }

    @Override
    public void onBindViewHolder(FormViewHolder holder, int position) {
        List<FieldView> entries = formBuilder.getFormEntries();
        //holder.bindDataModel(entries);
    }

    @Override
    public int getItemCount() {
        return formBuilder.formLength();
    }
}