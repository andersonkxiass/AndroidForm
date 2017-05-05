package br.com.involves.viewluck.view.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import br.com.involves.viewluck.R;
import br.com.involves.viewluck.components.FieldCheckBox;
import br.com.involves.viewluck.databinding.ViewluckSelectionRowMultiBinding;
import br.com.involves.viewluck.model.FieldOption;
import br.com.involves.viewluck.view.viewholder.ChoiceMultiVH;

/**
 * Created by andersonk on 05/05/17.
 */

public class MultiChoiceAdapter extends RecyclerView.Adapter<ChoiceMultiVH> {

    FieldCheckBox checkBox;

    public MultiChoiceAdapter(FieldCheckBox fieldCheckBox) {
        this.checkBox = fieldCheckBox;
    }

    @Override
    public ChoiceMultiVH onCreateViewHolder(ViewGroup parent, int viewType) {

        ViewluckSelectionRowMultiBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.viewluck_selection_row_multi, parent, false);

        return new ChoiceMultiVH(binding);
    }

    @Override
    public void onBindViewHolder(ChoiceMultiVH holder, int position) {

        FieldOption fieldOption = checkBox.getValue().get(position);
        holder.setModel(fieldOption);
    }

    @Override
    public int getItemCount() {
        return checkBox.getValue().size();
    }
}