package br.com.involves.viewluck.viewmodel;

import android.view.View;
import android.widget.Toast;

import java.util.List;

import br.com.involves.viewluck.model.FieldOption;

/**
 * Created by andersonk on 30/04/17.
 */

public class MultiChoiceActions {

    public void onItemClick(View view, int position, List<FieldOption> objectList) {

        boolean currentValue = objectList.get(position).isChecked();
        objectList.get(position).setChecked(!currentValue);

        Toast.makeText(view.getContext(), "!currentValue " + (!currentValue) , Toast.LENGTH_SHORT).show();
    }
}