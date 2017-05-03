package br.com.involves.viewluck.view;

import android.support.v7.widget.RecyclerView;

import java.util.List;

import br.com.involves.viewluck.components.FieldView;
import br.com.involves.viewluck.components.FormBuilder;
import br.com.involves.viewluck.databinding.FormItemBinding;
import br.com.involves.viewluck.viewmodel.FormItemViewModel;

/**
 * Created by andersonk on 29/03/17.
 */

public class FormViewHolder extends RecyclerView.ViewHolder{

    private FormItemBinding binding;
    private FormBuilder formBuilder;

    public FormViewHolder(FormItemBinding itemView, FormBuilder formBuilder) {
        super(itemView.getRoot());
        this.binding = itemView;
        this.formBuilder = formBuilder;
    }

    public void bindDataModel(List<FieldView> formEntries) {

        if(binding.getVm() == null){
            FormItemViewModel viewModel = new FormItemViewModel(formEntries, formBuilder);
            binding.setVm(viewModel);
        }else{
            binding.getVm().setFormModel(formEntries);
        }
    }
}