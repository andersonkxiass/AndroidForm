package br.com.involves.viewluck.view;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.involves.viewluck.R;
import br.com.involves.viewluck.components.FormBuilder;

/**
 * Created by andersonk on 22/03/17.
 */

public class FormList extends RecyclerView.Adapter<FormViewHolder> {

    private FormBuilder formBuilder;

    public FormList(FormBuilder formBuilder) {
        this.formBuilder = formBuilder;
    }

    @Override
    public FormViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View viewGroupCompat = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.form_item, parent, false);

        return new FormViewHolder(viewGroupCompat, formBuilder);
    }

    @Override
    public void onBindViewHolder(FormViewHolder holder, int position) {
        //TODO fazer bind das views com os objetos do questionario
    }

    @Override
    public int getItemCount() {
        return formBuilder.getFieldList().size();
    }
}