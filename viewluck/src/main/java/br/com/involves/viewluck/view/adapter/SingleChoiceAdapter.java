package br.com.involves.viewluck.view.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import br.com.involves.viewluck.R;
import br.com.involves.viewluck.components.FieldRadioButton;
import br.com.involves.viewluck.databinding.ViewluckSelectionRowSingleBinding;
import br.com.involves.viewluck.view.viewholder.ChoiceSingleVH;

/**
 * Created by andersonk on 07/05/17.
 */

public class SingleChoiceAdapter extends RecyclerView.Adapter<ChoiceSingleVH> {

    private FieldRadioButton radioButton;

    public SingleChoiceAdapter(FieldRadioButton radioButton) {
        this.radioButton = radioButton;
    }

    public void updateModel(FieldRadioButton radioButton) {
        this.radioButton = radioButton;
        notifyDataSetChanged();
    }

    @Override
    public ChoiceSingleVH onCreateViewHolder(ViewGroup parent, int viewType) {

        ViewluckSelectionRowSingleBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.viewluck_selection_row_single, parent, false);

        return new ChoiceSingleVH(binding);
    }

    @Override
    public void onBindViewHolder(ChoiceSingleVH holder, int position) {

    }

    @Override
    public int getItemCount() {
        return radioButton.getValue().size();
    }
}
