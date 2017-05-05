package br.com.involves.viewluck.view;

import android.content.Context;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;

import br.com.involves.viewluck.R;
import br.com.involves.viewluck.components.FormBuilder;
import br.com.involves.viewluck.view.adapter.FormAdapter;

/**
 * Created by andersonk on 29/03/17.
 */
public class FormLuck extends LinearLayoutCompat {
    private RecyclerView recyclerView;
    private FormAdapter fomAdapter;

    public FormLuck(Context context) {
        super(context);
        init(context);
    }

    public FormLuck(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context) {

        View rootView = inflate(context, R.layout.form, this);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.formList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    public void buildWith(FormBuilder builder) {
        fomAdapter = new FormAdapter(builder);
        recyclerView.setAdapter(fomAdapter);
    }
}