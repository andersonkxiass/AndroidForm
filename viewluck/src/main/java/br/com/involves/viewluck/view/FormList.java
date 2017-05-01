package br.com.involves.viewluck.view;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.involves.viewluck.R;
import br.com.involves.viewluck.components.BuildType;
import br.com.involves.viewluck.components.FormBuilder;
import br.com.involves.viewluck.databinding.FormItemBinding;
import br.com.involves.viewluck.model.FormModel;

/**
 * Created by andersonk on 22/03/17.
 */

public class FormList extends RecyclerView.Adapter<FormViewHolder> {

    private FormBuilder formBuilder;
    //fieldsAnswer

    public FormList(FormBuilder formBuilder) {
        this.formBuilder = formBuilder;
    }

    @Override
    public FormViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        FormItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.form_item, parent, false);

        return new FormViewHolder(binding, formBuilder);
    }

    @Override
    public void onBindViewHolder(FormViewHolder holder, int position) {
        FormModel formModel = formBuilder.getFormModels().get(position);
        holder.bindDataModel(formModel);
    }

    @Override
    public int getItemCount() {

        if(formBuilder.getBuildType() == BuildType.SINGLE){
            return 1;
        }

        //TODO add handle list question for template form context
        return 20;
    }
}