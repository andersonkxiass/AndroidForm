package br.com.involves.viewluck.viewmodel;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

/**
 * Created by andersonk on 07/05/17.
 */

public class SingleChoiceAction {

    public void onItemClicked(RecyclerView recyclerView, int position, View v) {
        Toast.makeText(v.getContext(), "position = " + position, Toast.LENGTH_SHORT).show();
    }
}