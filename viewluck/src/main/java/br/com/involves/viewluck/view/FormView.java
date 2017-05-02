package br.com.involves.viewluck.view;

import android.content.Context;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;

import java.util.List;

import br.com.involves.viewluck.R;
import br.com.involves.viewluck.components.BuildType;
import br.com.involves.viewluck.components.FormBuilder;

/**
 * Created by andersonk on 29/03/17.
 */

public class FormView extends LinearLayoutCompat {
    private RecyclerView recyclerView;
    private FormAdapter fomAdapter;

    public FormView(Context context) {
        super(context);
        init(context);
    }

    public FormView(Context context, AttributeSet attrs) {
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

        if(builder.getBuildType() == BuildType.MULTI) {

            if(builder.getObjectList() != null) {
                fomAdapter.addObjectList(builder.getObjectList());
            }
        }
    }

    public List<Object> getAnswers(){
        return null;
    }
}