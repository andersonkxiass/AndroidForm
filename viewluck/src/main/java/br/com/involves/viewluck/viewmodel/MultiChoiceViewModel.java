package br.com.involves.viewluck.viewmodel;

import android.databinding.BindingAdapter;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableField;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.List;

/**
 * Created by andersonk on 30/04/17.
 */

public class MultiChoiceViewModel extends BaseViewModel<List<String>> {

    private ObservableArrayList<String> objectList = new ObservableArrayList<>();
    private List<String> answer;
    private final ObservableField<String> fieldLabel = new ObservableField<>("");

    @Override
    public void setFieldValue(List<String> content) {
        this.objectList.addAll(content);
    }

    @Override
    public void setFieldLabel(String fieldLabel) {
        this.fieldLabel.set(fieldLabel);
    }

    @Override
    public ObservableField getFieldLabel() {
        return fieldLabel;
    }

    @Override
    public ObservableArrayList<String> getFieldValue() {
        return objectList;
    }

    @Override
    public List<String> getAnswer() {
        return answer;
    }

    @BindingAdapter("options")
    public static void addItems(GridView gridView, ObservableArrayList<String> objectList) {

        ArrayAdapter<String> adapter = new ArrayAdapter<>(gridView.getContext(),
                android.R.layout.simple_list_item_multiple_choice);

        gridView.setAdapter(adapter);
        adapter.addAll(objectList);
    }
}