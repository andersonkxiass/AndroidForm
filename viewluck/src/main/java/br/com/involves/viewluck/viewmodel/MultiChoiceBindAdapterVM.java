package br.com.involves.viewluck.viewmodel;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;

import br.com.involves.viewluck.components.FieldCheckBox;
import br.com.involves.viewluck.view.adapter.MultiChoiceAdapter;

/**
 * Created by andersonk on 30/04/17.
 */

public class MultiChoiceBindAdapterVM {

    @BindingAdapter("options")
    public static void addItems(RecyclerView recyclerView, FieldCheckBox fieldCheckBox) {

        MultiChoiceAdapter adapter = new MultiChoiceAdapter(fieldCheckBox);
        recyclerView.setAdapter(adapter);
    }
}