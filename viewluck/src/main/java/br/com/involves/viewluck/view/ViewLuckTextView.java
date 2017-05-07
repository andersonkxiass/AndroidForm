package br.com.involves.viewluck.view;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;

import br.com.involves.viewluck.model.ViewLuck;

/**
 * Created by andersonk on 16/03/17.
 */
public abstract class ViewLuckTextView extends AppCompatTextView implements ViewLuck {

    public ViewLuckTextView(Context context) {
        super(context);
    }
}