package br.com.involves.viewluck.view;

import android.content.Context;
import android.support.v7.widget.AppCompatEditText;

/**
 * Created by andersonk on 16/03/17.
 */

public abstract class ViewLuckEditText extends AppCompatEditText implements ViewLuck {
    public ViewLuckEditText(Context context) {
        super(context);
    }
}