package br.com.involves.viewluck.view.viewholder;

import android.support.v7.widget.RecyclerView;

import br.com.involves.viewluck.databinding.ViewluckSelectionRowMultiBinding;
import br.com.involves.viewluck.model.FieldOption;
import br.com.involves.viewluck.viewmodel.SelectionViewMultiVM;

/**
 * Created by andersonk on 05/05/17.
 */

public  class ChoiceMultiVH extends RecyclerView.ViewHolder{

    private ViewluckSelectionRowMultiBinding binding;

    public ChoiceMultiVH(ViewluckSelectionRowMultiBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
        this.binding.executePendingBindings();
    }

    public void setModel(FieldOption model) {

        if(binding.getVm() == null){
            binding.setVm(new SelectionViewMultiVM(model));
        }else{
            binding.getVm().setModel(model);
        }
    }
}