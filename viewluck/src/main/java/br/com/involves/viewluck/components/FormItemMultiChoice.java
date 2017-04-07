package br.com.involves.viewluck.components;

import android.support.v4.util.SimpleArrayMap;

/**
 * Created by andersonk on 21/03/17.
 */

public abstract class FormItemMultiChoice<T> extends FormViewType {

    private SimpleArrayMap<String, Boolean> options = new SimpleArrayMap<>();
    T model;

    public void addOption(String optionName) {
        options.put(optionName, false);
    }

    public void addOption(String optionName, boolean checked) {
        options.put(optionName, checked);
    }

    public void addOptions(String[] options) {
        for (String option : options)
            this.options.put(option, false);
    }

    public String getOptionList(){
        return null;
    }


}