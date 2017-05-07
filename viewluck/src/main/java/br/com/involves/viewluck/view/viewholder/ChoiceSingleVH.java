package br.com.involves.viewluck.view.viewholder;

import android.support.v7.widget.RecyclerView;

import br.com.involves.viewluck.databinding.ViewluckSelectionRowSingleBinding;

/**
 * Created by andersonk on 07/05/17.
 */

public class ChoiceSingleVH extends RecyclerView.ViewHolder {

    ViewluckSelectionRowSingleBinding binding;

    public ChoiceSingleVH(ViewluckSelectionRowSingleBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
}