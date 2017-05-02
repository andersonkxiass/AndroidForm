package br.com.involves.viewluck.view;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import br.com.involves.viewluck.R;
import br.com.involves.viewluck.components.BuildType;
import br.com.involves.viewluck.components.FormBuilder;
import br.com.involves.viewluck.databinding.FormItemBinding;
import br.com.involves.viewluck.model.FormModel;
import br.com.involves.viewluck.viewmodel.FormItemViewModel;

/**
 * Created by andersonk on 22/03/17.
 */

public class FormAdapter extends RecyclerView.Adapter<FormViewHolder> {

    private FormBuilder formBuilder;
    private List<Object> objectList = new ArrayList<>();

    public FormAdapter(FormBuilder formBuilder) {
        this.formBuilder = formBuilder;
    }

    public void addObjectList(List<Object> objectList) {
        this.objectList = objectList;
        notifyDataSetChanged();
    }

    @Override
    public FormViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        FormItemBinding binding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()),
                R.layout.form_item, parent, false);

        binding.setVm(new FormItemViewModel(formBuilder));

        return new FormViewHolder(binding, formBuilder);
    }

    @Override
    public void onBindViewHolder(FormViewHolder holder, int position) {
        //FormModel formModel = formBuilder.getFormModels().get(position);
        //holder.bindDataModel(formModel);
    }

    @Override
    public int getItemCount() {

        if (formBuilder.getBuildType() == BuildType.SINGLE) {
            return 1;
        } else {

            int listSize = objectList.size();

            if (listSize > 0) {
                return listSize;
            } else {
                throw new RuntimeException();
            }
        }
    }
}