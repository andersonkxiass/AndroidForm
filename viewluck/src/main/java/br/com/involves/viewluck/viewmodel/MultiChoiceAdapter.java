package br.com.involves.viewluck.viewmodel;

import android.databinding.BindingAdapter;
import android.databinding.ObservableArrayList;
import android.widget.ArrayAdapter;
import android.widget.GridView;

/**
 * Created by andersonk on 30/04/17.
 */

public class MultiChoiceAdapter {

    @BindingAdapter("options")
    public static void addItems(GridView gridView, ObservableArrayList<String> objectList) {

        ArrayAdapter<String> adapter = new ArrayAdapter<>(gridView.getContext(),
                android.R.layout.simple_list_item_multiple_choice);

        gridView.setAdapter(adapter);
        adapter.addAll(objectList);
    }
}