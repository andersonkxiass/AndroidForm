package br.com.involves.viewluck.components;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andersonk on 21/03/17.
 */

public class FormContainer {

    private List<FormViewType> formViewTypeList = new ArrayList<>();

    public FormContainer() {}

    public void addItemView(FormViewType itemView){
        formViewTypeList.add(itemView);
    }

    public List<FormViewType> getFormViewTypeList() {
        return formViewTypeList;
    }
}