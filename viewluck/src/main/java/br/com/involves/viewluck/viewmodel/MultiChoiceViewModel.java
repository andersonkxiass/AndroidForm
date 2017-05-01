package br.com.involves.viewluck.viewmodel;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableField;

import java.util.ArrayList;
import java.util.List;

import br.com.involves.viewluck.model.FieldOption;
import br.com.involves.viewluck.model.FormModelMulti;

/**
 * Created by andersonk on 30/04/17.
 */

public class MultiChoiceViewModel extends BaseViewModel<List<String>, FormModelMulti> {

    //private FormModelMulti model;
    private final ObservableArrayList<String> objectList = new ObservableArrayList<>();
    private final List<FieldOption> answer = new ArrayList<>();
    private final ObservableField<String> fieldLabel = new ObservableField<>("");

    public MultiChoiceViewModel() {
    }

    @Override
    public void setFieldValue(List<String> content) {

        for(String opt : content){
            answer.add(new FieldOption(opt, false));
        }

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

    public ObservableArrayList<String> getObjectList() {
        return objectList;
    }

    public List<FieldOption> getAnswer() {
        return answer;
    }

    public void setAnswer(List<FieldOption> answer){
        this.answer.addAll(answer);
    }

    public FormModelMulti getModel() {
        return model;
    }

    public void setModel(FormModelMulti model) {
        this.model = model;
    }
}