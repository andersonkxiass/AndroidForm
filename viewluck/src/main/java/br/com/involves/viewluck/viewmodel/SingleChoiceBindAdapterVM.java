package br.com.involves.viewluck.viewmodel;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;

import br.com.involves.viewluck.components.FieldRadioButton;
import br.com.involves.viewluck.view.adapter.SingleChoiceAdapter;

/**
 * Created by andersonk on 07/05/17.
 */

public class SingleChoiceBindAdapterVM {

    @BindingAdapter("options")
    public static void adapterOptions(RecyclerView recyclerView, FieldRadioButton fieldRadioButton) {

        SingleChoiceAdapter adapter = new SingleChoiceAdapter(fieldRadioButton);
        recyclerView.setAdapter(adapter);
    }
}
