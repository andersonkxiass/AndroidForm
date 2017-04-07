package br.com.involves.viewluck.view;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import br.com.involves.viewluck.R;
import br.com.involves.viewluck.components.FormBuilder;

/**
 * Created by andersonk on 29/03/17.
 */

public class FormViewHolder extends RecyclerView.ViewHolder{

    private Form form;

    public FormViewHolder(View itemView, FormBuilder formBuilder) {
        super(itemView);
        form = new Form(itemView.getContext());
        form.addBuilder(formBuilder);
        ((LinearLayout)itemView.findViewById(R.id.form)).addView(form);
    }
}